package archivos.principal;
import archivos.clases.Alumno;
import archivos.operaciones.Escritura;
import archivos.operaciones.Lectura;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Alumno alumno;
		 alumno = leerAlumno();
		 guardarAlumno(alumno);
		 cargarAlumnos();

		 }
	
	 public static Alumno leerAlumno() {
		 Alumno alumno = new Alumno();
		 alumno.setNombre("Nombre del Alumno");
		 alumno.setIdAlumno(1);
		 alumno.setLicenciatura("Licenciatura del Alumno");
		 return alumno;
		 }
		 public static void guardarAlumno(Alumno alumno) {
		 Escritura escribir = new Escritura();
		 escribir.escribir("datosAlumnos.txt", alumno);
		 }
		 public static void cargarAlumnos() {
		 Lectura leer = new Lectura();
		 leer.leer("datosAlumnos.txt");
		 }
		}
