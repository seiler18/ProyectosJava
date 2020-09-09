/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo1;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ProyectoPOO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre de vendedor:");
        String nombreVendedor = sc.nextLine();

        Vendedor vendedorActual = new Vendedor(nombreVendedor);
        System.out.println("Bienvenido" + vendedorActual.getNombre());
        ArrayList<Producto> productos = new ArrayList<Producto>();

        productos.add(new Vegetal(1000, "Papa", "vgl1", new Date(), new Date()));
        productos.add(new Vegetal(800, "Tomate", "vgl2", new Date(), new Date()));

        productos.add(new Vestuario(10000, "Camisa", "vst1", "M", "Blanco"));
        productos.add(new Vestuario(15000, "Pantalon", "vst2", "M", "Cafe"));

        
        
        
        
        
        
        
        
        ArrayList<Venta> ventas = new ArrayList<Venta>();
        double gananciaSesion = 0;
        boolean cerrarSesion = false;

        while (cerrarSesion == false) {
            // Mensajes del menu
            System.out.println("Su total de ventas es: " + gananciaSesion);
            System.out.println("Presione 1 y enter para crear una venta, presione solamente enter para salir");
            String opcionElegida = sc.nextLine();
            // Leemos la opcion que desea el usuario y si es 1, creamos una venta
            if (opcionElegida.equals("1")) {

                Venta ventaFinal = CrearVenta(productos);

                ventaFinal.setVendedor(vendedorActual.getNombre());
                ventas.add(ventaFinal);
                gananciaSesion = gananciaSesion + ventaFinal.getGanancia();
            } else if (opcionElegida.isEmpty()) {
                // Si la opcion esta en blanco, vamos a salir del while
                cerrarSesion = true;
            }

        }

    }

    private static Venta CrearVenta(ArrayList<Producto> productos) {
        Scanner sc = new Scanner(System.in);
        boolean faltanProductos = true;
        String codigoProducto;

        Venta ventaActual = new Venta();
        while (faltanProductos == true) {

            // Un mensaje para avisarle al usuario que ya puede ingresar codigos
            System.out.println("Ingrese un codigo y enter o solo presione enter para salir de la venta:");
            // Preguntamos por codigos de productos para agregar a la venta
            codigoProducto = sc.nextLine();
            if (codigoProducto.isEmpty()) {

                faltanProductos = false;
            } else {
                boolean productoExiste = false;
                for (Producto producto : productos) {

                    if (producto.getCodigo().equals(codigoProducto)) {
                        productoExiste = true;

                        ventaActual.setGanancia(ventaActual.getGanancia() + producto.getPrecio());
                        //Se utiliza break; para detener el for()
                        break;
                    }
                }
                if (productoExiste) {
                    //Enviamos el mensaje cuando encontremos el producto y sumamos
                    System.out.println("Producto agregado");

                    System.out.println("Total de la venta: $" + ventaActual.getGanancia());
                }
                return ventaActual;
            }

        }
        //Finalmente vamos a devolver ventaActual cuando termine de ejecutarse el metodo
        //recuerda que esta variable es una instancia de Venta
        return ventaActual;
    }

    private static ArrayList<Producto> menuProductos() {
        ArrayList<Producto> listaProducto = new ArrayList<>();
        boolean salir = false;
        while (salir == false) {
            System.out.println("- - - Menú de creación de productos - - -");
            System.out.println("1. Crear Producto Vegetal");
            System.out.println("2. Crear Producto de Vestuario");
            System.out.println("3. Salir");
            System.out.println("- - -");
// Un scanner para leer la opción
            Scanner sc = new Scanner(System.in);
            int opcionElegida = Integer.parseInt(sc.nextLine());
        }
        return listaProducto;
    }

}
