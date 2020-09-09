package cl.aiep.mainproducto.services.impl;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import cl.aiep.mainproducto.model.Productos;
import cl.aiep.mainproducto.services.ProductoServices;

public class ProductoServiceImplements implements ProductoServices {

	public static void agregarLineaArchivo(String path, String nombreArchivo, String nuevoRegistro) {
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter(path + nombreArchivo, true);
			pw = new PrintWriter(fichero);
			pw.println(nuevoRegistro);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Nuevamente aprovechamos el finally para
				// asegurarnos que se cierra el fichero.
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public List<Productos> leerArchivoSecuencial2() {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		String path1 = "C://EjemploProducto/";
		String nombre1 = "/Producto.txt";
		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			List<Productos> listaProducto = new ArrayList<Productos>();
			fis = new FileInputStream(path1 + nombre1);
			isr = new InputStreamReader(fis, "utf-8");
			br = new BufferedReader(isr);

			// Lectura del fichero
			String linea;
			while ((linea = br.readLine()) != null) {
				Productos producto = new Productos();
				producto.setId(linea.split(";")[0]);
				producto.setDescripcion(linea.split(";")[1]);
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

}
