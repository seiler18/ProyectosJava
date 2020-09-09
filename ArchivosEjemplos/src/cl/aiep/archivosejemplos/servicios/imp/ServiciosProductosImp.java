package cl.aiep.archivosejemplos.servicios.imp;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import cl.aiep.achivosejemplos.servicios.ServiciosProductos;
import cl.aiep.archivosejemplos.model.Producto;

public class ServiciosProductosImp implements ServiciosProductos{

	@Override
	public List<Producto> leerArchivoProducto() {

		String path = "C://archivos/";
		String nombreArchivo = "Productos.txt";
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			List<Producto> listaProducto = new ArrayList<Producto>();
			fis = new FileInputStream(path + nombreArchivo);
			isr = new InputStreamReader(fis, "utf-8");
			br = new BufferedReader(isr);

			// Lectura del fichero
			String linea;
			while ((linea = br.readLine()) != null) {
				Producto producto = new Producto();
				producto.setId(linea.split(";")[0]);
				producto.setDescripcion(linea.split(";")[1]);
				producto.setMarca(linea.split(";")[2]);
				producto.setCategoria(linea.split(";")[3]);
				listaProducto.add(producto);
			}
			return listaProducto;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
			try {
				if (null != br) {
					br.close();
				}

				if (null != isr) {
					isr.close();
				}

				if (null != fis) {
					fis.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public List<Producto> leerArchivoProducto(String idProducto) {
		
		List<Producto> listaProducto = new ArrayList<Producto>();
		Producto p = new Producto();
		
		listaProducto = leerArchivoProducto();

	    System.out.println("El producto con id " + idProducto + " es: "); 
	    
		for(int i=1;i<listaProducto.size();i++) {
			p = listaProducto.get(i);
			if (p.getId().equals(idProducto)) {
				System.out.println("ID: " + p.getId());
				System.out.println("Descripción: " + p.getDescripcion());
				System.out.println("Marca: " + p.getMarca());
				System.out.println("Categoría: " + p.getCategoria() + "\n");
			}
		}
		
		return null;
	}

	@Override
	public List<Producto> agregarArchivoProducto(Producto Producto) {
		
		
		
		return null;
	}

}
