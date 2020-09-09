package cl.aiep.archivosejemplos;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;

import cl.aiep.archivosejemplos.model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		leerArchivoSecuencial("C://archivos/", "Productos.txt");
		leerArchivoSecuencial2("C://archivos/", "Productos.txt");

		String registro = new String("987654321;Refrigerador no frost;Mademsa;Línea Blanca");

		agregarLineaArchivoSecuencial("C://archivos/", "Productos.txt", registro);
		leerArchivoAleatoreo("C://archivos/", "Productos.dat");
		leerArchivoAleatoreoObjeto("C://archivos/", "Productos.dat");

	}

	public static void leerArchivoSecuencial(String path, String nombreArchivo) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File(path + nombreArchivo);
			if (!archivo.exists()) {
				archivo.createNewFile();
			}
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			System.out.println("Encoding: " + fr.getEncoding());
			// Lectura del fichero
			String linea;
			while ((linea = br.readLine()) != null)
				System.out.println(linea);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public static void leerArchivoSecuencial2(String path, String nombreArchivo) {
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			fis = new FileInputStream(path + nombreArchivo);
			isr = new InputStreamReader(fis, "utf-8");
			br = new BufferedReader(isr);

			// Lectura del fichero
			String linea;
			while ((linea = br.readLine()) != null)
				System.out.println(linea);
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
	}

	public static void agregarLineaArchivoSecuencial(String path, String nombreArchivo, String nuevoRegistro) {
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

	public static void leerArchivoAleatoreo(String path, String nombreArchivo) {
		RandomAccessFile fichero = null;
		try {
			int n = 0;
			File f = new File(path + nombreArchivo);
			if (!f.exists()) {
				f.createNewFile();
			}
			fichero = new RandomAccessFile(f, "r");
			fichero.seek(0); // nos situamos al principio
			System.out.println("Largo archivo: " + fichero.length());
			if (fichero.length() > 0) {
				while (true) {
					n = fichero.readInt(); // se lee un entero del fichero
					System.out.println(n); // se muestra en pantalla
				}
			} else {
				System.out.println("El archivo esta vacío!!");
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException eofe) {
			eofe.printStackTrace();
			System.out.println("Ha llegado al final del fichero");
		} catch (IOException ioe) {
			// TODO: handle exception
			ioe.printStackTrace();
		} finally {
			try {
				if (fichero != null) {
					fichero.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void leerArchivoAleatoreoObjeto(String path, String nombreArchivo) {
		// RandomAccessFile fichero = null;

//		File f = new File(path + nombreArchivo);
//		fichero = new RandomAccessFile(f, "w");
		ObjectInputStream ois = null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(path + nombreArchivo);
			fis.skip(0);
			ois = new ObjectInputStream(fis);
			Object aux = ois.readObject();

			// Mientras haya objetos
			while (aux != null) {
				if (aux instanceof Producto)
					System.out.println(aux); // Se escribe en pantalla el objeto
				aux = ois.readObject();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
