package archivos.operaciones;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import archivos.clases.Alumno;

public class Escritura {

	public void escribir(String nombreArchivo, Alumno alumno) {
		System.out.println("Escribiendo información en el archivo");
		try {
			FileWriter fw = new FileWriter(nombreArchivo);
			// FileWriter fw = new FileWriter (nombreArchivo,true);
			BufferedWriter archivoEscritura = new BufferedWriter(fw);
			String almacenar = alumno.toString();
			archivoEscritura.write(almacenar);
			archivoEscritura.flush();
			archivoEscritura.close();
		} catch (IOException e) {
			System.out.println("Error al escribir en el archivo");
			e.printStackTrace();
		}
	}
}
