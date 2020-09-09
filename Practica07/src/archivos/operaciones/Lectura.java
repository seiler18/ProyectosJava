package archivos.operaciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import archivos.clases.Alumno;

public class Lectura {
	public void leer(String nombreArchivo) {
		String cadenaLeida = "";
		FileReader fr;
		try {
			fr = new FileReader(nombreArchivo);
			BufferedReader archivoLectura = new BufferedReader(fr);
			Alumno alumno = new Alumno();
			System.out.println("Los alumnos son:");
			cadenaLeida = archivoLectura.readLine();
			while (cadenaLeida != null) {
				StringTokenizer st = new StringTokenizer(cadenaLeida, ",");
				alumno.setIdAlumno(Integer.parseInt(st.nextToken()));
				alumno.setNombre(st.nextToken());
				alumno.setLicenciatura(st.nextToken());
				System.out.println(alumno.toString());
				cadenaLeida = archivoLectura.readLine();
			}
			archivoLectura.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo encontrar el archivo");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("No se pudo leer del archivo");
			e.printStackTrace();
		}
	}
}