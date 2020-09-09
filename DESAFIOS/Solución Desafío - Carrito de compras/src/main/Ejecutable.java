package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import modelo.Articulo;
import modelo.Credito;
import modelo.Debito;
import modelo.Orden;
import modelo.Pantalon;
import modelo.Poleron;
import modelo.Zapato;
import modelo.interfaces.MedioPago;
import servicio.Escaner;
import servicio.XmlHandler;
import servicio.util.HandlerResponse;

public class Ejecutable {
	
	public static List<Articulo> artDisponibles = new ArrayList<>();
	public static List<Articulo> artParaComprar = new ArrayList<>();
	public static XmlHandler hdlr = new XmlHandler();

	public static void main(String[] args) {
		generarArticulos();
	    int valor = 4;
	    String codigo = null;
	    while(valor > 0) {
	    	valor = Escaner.leerNumeroConMensaje(3,0,"¿Qué desea hacer?\n1- Agregar un articulo al carrito\n2- Ver productos disponibles\n3- Pagar\n0- Salir");
	    	if(valor == 1) {
	    		codigo = Escaner.leerStringConMensaje("Ingrese el código del articulo que desea agregar");
	    		if(null != codigo) {
	    			for(Articulo articulo : artDisponibles) {
	    				System.out.println(articulo.getCodigo());
	    				if(codigo.equals(articulo.getCodigo())) {
	    					codigo = Escaner.leerRespuestaStringConMensaje("¿Está seguro de agregar "+articulo.getNombre()+" al carrito por $"+articulo.getPrecio()+" ?");
	    					if(codigo.equals("Y")) {
	    						artParaComprar.add(articulo);
	    					    System.out.println(articulo.getNombre()+" agregado correctamente.");
	    			    		valor = 4;
	    					}else {
	    					    System.out.println("No se agregó el producto");
	    					}
	    					break;
	    				}
	    			}
	    		}
	    	}else if(valor == 2) {
	    		imprimirProductos();
	    	}else if(valor == 3) {
			    MedioPago mp = null;
			    double valorTotal = 0;
				for(Articulo articulo : Ejecutable.artParaComprar) {
					valorTotal += articulo.getPrecio();
				}
			    boolean pagado = false;
			    boolean cancelado = false;
			    while(!pagado && !cancelado) {
				    valor = Escaner.leerNumeroConMensaje(3, 1, "¿Cuál es su medio de pago?\n1- Credito\n2- Debito\n3- Cancelar");
			    	if(valor==1) {
				    	mp = new Credito();
				    	pagado = mp.pagar(valorTotal);
				    }else if(valor==2){
				    	mp = new Debito();
				    	pagado = mp.pagar(valorTotal);
				    }else {
				    	cancelado = true;
				    }
			    }
			    if(pagado) {
			    	String direccion = Escaner.leerStringConMensaje("¿Cuál es la dirección de despacho?");
			    	String nombreCliente = Escaner.leerStringConMensaje("¿Cuál es el nombre de quien recibe el producto?");
			    	
			    	HandlerResponse resp = hdlr.exportar(new Orden(direccion,nombreCliente,artParaComprar,valorTotal,new Date()));
			    	if(resp.getResultado()) {
			    		artParaComprar = new ArrayList<>();
			    	}
		    		System.out.println(resp.getMensaje());
			    }
	    	}else if(valor == 0) {
			    System.out.println("Hasta pronto.");
	    	}
	    	codigo = null;
	    }
	    
	    
	}
	
	private static void generarArticulos() {
		artDisponibles.add(new Pantalon(30, "Variant", 15000, "Variant Caqui Corto", "1000", "Caqui", 2));
		artDisponibles.add(new Pantalon(30, "Variant", 19000, "Variant Negro Largo", "1001", "Negro", 2));
		artDisponibles.add(new Poleron(29, "Variant", 9000, "Variant Rojo", "2002", "Rojo"));
		artDisponibles.add(new Zapato(34, "Mega", 25000, "Mega CZ50", "3003", "CZ50"));
		artDisponibles.add(new Zapato(40, "Mega", 20000, "Mega CX50", "3004", "CX50"));
	}
	
	private static void imprimirProductos() {
		System.out.println("------------------------------------------------");
		for(Articulo articulo : artDisponibles) {
			System.out.print("- ");
			System.out.print(articulo.toString());
			System.out.println(" ");
		}
		System.out.println("------------------------------------------------");
	}

}
