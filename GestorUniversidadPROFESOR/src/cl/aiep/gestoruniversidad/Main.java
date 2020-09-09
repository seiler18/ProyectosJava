package cl.aiep.gestoruniversidad;

import java.util.ArrayList;
import java.util.List;

import cl.aiep.gestoruniversidad.delegate.AlumnoDelegate;
import cl.aiep.gestoruniversidad.delegate.ProfesorDelegate;
import cl.aiep.gestoruniversidad.delegate.impl.AlumnoDelegateImpl;
import cl.aiep.gestoruniversidad.delegate.impl.ProfesorDelegateImpl;
import cl.aiep.gestoruniversidad.model.Alumno;
import cl.aiep.gestoruniversidad.model.Asignatura;
import cl.aiep.gestoruniversidad.model.Carrera;
import cl.aiep.gestoruniversidad.model.Curso;
import cl.aiep.gestoruniversidad.model.Profesor;
import cl.aiep.gestoruniversidad.model.Semestre;

public class Main {

	public static void main(String[] args) throws Exception {

		// TODO Auto-generated method stub

		//Ejercicio con el metodo getListaAlumnoDummy() QUE LOGRE HACER AL FINAL
		//implementando el metodo en AlumnoDaoImpl
	
		System.out.println("---------Alumnos Creados por DAO por Alexander Beck---------------------------------------------");
		
		AlumnoDelegate alumnoDelegate = new AlumnoDelegateImpl();
		List<Alumno> listaAlumnos=new ArrayList<Alumno>();
		listaAlumnos = alumnoDelegate.consultaAlumno();
		System.out.println("Rut                     Nombre");
		
		System.out.println("_______________________________________________");
		for (Alumno alumno : listaAlumnos) {
			System.out.println(addEspaciosString(alumno.getRut(),16) + (addEspaciosString(alumno.getNombre(),23)) + alumno.getEdad());
		}

			
		
		
		// --------------------------------------------------------------------------
		//EJERCICIO QUE YA HICE ANTES
		Profesor profesor = new Profesor();
		Profesor profesor1 = new Profesor();
		Profesor profesor2 = new Profesor();
		try {
			profesor = crearProfesor(" Alexander Beck", "23500000", 30);
			profesor1 = crearProfesor(" Gabriel Godoy", "24500000", 25);
			profesor2 = crearProfesor(" Albert Einstein", "260000", 45);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println("\n---------Profesores Creados por DAO---------------------------------------------");
		ProfesorDelegate profesorDelegate = new ProfesorDelegateImpl();
		System.out.println(profesorDelegate.crearProfesor(profesor) + "\n" + profesorDelegate.crearProfesor(profesor1) + "\n" + 
		profesorDelegate.crearProfesor(profesor2));
		
		System.out.println("---------Profesores Creados Objeto & get---------------------------------------------");
		System.out.println(
				profesor.getNombre() + " Edad:" + " " + profesor.getEdad() + " RUT: " + "" + profesor.getRut());
		System.out.println(
				profesor1.getNombre() + " Edad:" + " " + profesor1.getEdad() + " RUT: " + "" + profesor1.getRut());
		System.out.println(
				profesor2.getNombre() + " Edad:" + " " + profesor2.getEdad() + " RUT: " + "" + profesor2.getRut());

		// ----------------------------------------------------------------------------
		Asignatura asignatura = new Asignatura();
		Asignatura asignatura1 = new Asignatura();
		Asignatura asignatura2 = new Asignatura();
		asignatura = crearAsignatura("Calculo I", "Integrales y Derivadas", 20, profesor);
		asignatura1 = crearAsignatura("Calculo II", "Integrales dobles", 20, profesor1);
		asignatura2 = crearAsignatura("Calculo III", "Integrales tripes", 20, profesor2);
		System.out.println("---------Asignaturas Creadas Objeto & get---------------------------------------------");
		System.out.println(asignatura.getNombre() + " " + asignatura1.getNombre() + " " + asignatura2.getNombre()
				+ "\n---------Descripciones de las Asignaturas-------------------------------------------"
				+ "\nDescripcion Calculo I: " + asignatura.getDescripcion() + "\nDescripcion Calculo II: "
				+ asignatura1.getDescripcion() + "\nDescripcion Calculo III: " + asignatura2.getDescripcion()
				+ "\nOrden correlacion : " + "" + asignatura.getOrdenCorrelacion()
				+ "\nProfesor que dicta la asignatura Calculo I : " + asignatura.getProfesor().getNombre()
				+ "\nProfesor que dicta la asignatura Calculo II : " + asignatura1.getProfesor().getNombre()
				+ "\nProfesor que dicta la asignatura Calculo III : " + asignatura2.getProfesor().getNombre());

		// ----------------------------------------------------------------------------
		Curso curso = new Curso(asignatura);
		curso = crearCurso(asignatura, "Matematicas");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Nombre del Curso: " + curso.getNombre() + "\nEl cual tiene las asignaturas : "
				+ asignatura.getNombre() + " " + asignatura1.getNombre() + " " + asignatura2.getNombre());
		// ----------------------------------------------------------------------------
		Carrera carrera = new Carrera(curso);
		carrera = crearCarrera(curso, "Ingeniero Civil");
		System.out.println("Nombre de la carrera : " + carrera.getNombre());
		// ----------------------------------------------------------------------------
		Semestre semestre = new Semestre();
		Semestre semestre1 = new Semestre();
		semestre.setDescripcion("3 Semestre");// Semestre alumno
		semestre1.setDescripcion("4 Semestre");// Semestre alumno2
		// ----------------------------------------------------------------------------
		
		System.out.println("---------Alumnos Creados por DAO---------------------------------------------");
		Alumno alumno = new Alumno(carrera);
		Alumno alumno2 = new Alumno(carrera);
		alumno = crearAlumno(carrera, "Jesus Seiler ", "264396638", 22); // Puedo obtener la carrera que estudia si
																			// llamo a .getCarrera
		alumno2 = crearAlumno(carrera, "Pedrito Enrique ", "26323723", 24);// Puedo obtener la carrera que estudia si
																			// llamo a .getCarrera
		AlumnoDelegate alumnoDelegate1 = new AlumnoDelegateImpl();
		System.out.println(alumnoDelegate1.crearAlumno(alumno) + "\n" + alumnoDelegate1.crearAlumno(alumno2));// Esto es
																											// para																								// datos

		System.out.println("-------Alumnos Creados---------------------------------------------------------------");
		System.out.println(alumno.getNombre() + " Edad:" + " " + alumno.getEdad() + " RUT: " + "" + alumno.getRut());
		System.out.println("Semestre que cursa : " + semestre.getDescripcion());
		System.out.println(alumno2.getNombre() + " Edad:" + " " + alumno2.getEdad() + " RUT: " + "" + alumno2.getRut());
		System.out.println("Semestre que cursa : " + semestre1.getDescripcion());

		// ----------------------------------------------------------------------------
		System.out.println(
				"-------Listando Alumnos (LISTA)---------------------------------------------------------------");
		List<Alumno> listaAlumno = new ArrayList<Alumno>();
		listaAlumno.add(alumno);
		listaAlumno.add(alumno2);
		for (int i = 0; i < listaAlumno.size(); i++) {
			Alumno a = listaAlumno.get(i);
			System.out.println(a.getNombre() + " " + a.getRut());

		}

		System.out.println(
				"-------Listando Profesores (LISTA)---------------------------------------------------------------");
		List<Profesor> listaProfesor = new ArrayList<Profesor>();
		List<Asignatura> listaAsignatura = new ArrayList<Asignatura>();
		listaAsignatura.add(asignatura);
		listaAsignatura.add(asignatura1);
		listaAsignatura.add(asignatura2);
		listaProfesor.add(profesor);
		listaProfesor.add(profesor1);
		listaProfesor.add(profesor2);
		for (int b = 0; b < listaProfesor.size(); b++) {
			Profesor c = listaProfesor.get(b);
			Asignatura e = listaAsignatura.get(b);
			System.out.println(c.getNombre() + " " + c.getRut() + " " + e.getNombre());
		}
	}
		
// DESARROLLO DE METODOS----------------------------------------------------------------------------
	public static Profesor crearProfesor(String nombre, String rut, int edad) throws Exception {
		Profesor profesor = new Profesor();
		profesor.setNombre(nombre);
		profesor.setRut(rut);
		profesor.setEdad(edad);
		return profesor;
	} // METODO CREAR PROFESOR

	public static Alumno crearAlumno(Carrera carrera, String nombre, String rut, int edad) throws Exception {
		Alumno alumno = new Alumno(carrera);
		alumno.setNombre(nombre);
		alumno.setRut(rut);
		alumno.setEdad(edad);
		return alumno;
	}// METODO CREAR ALUMNO

	public static Asignatura crearAsignatura(String nombre, String descripcion, int ordenCorrelacion,
			Profesor profesor) {
		Asignatura asignatura = new Asignatura();
		asignatura.setNombre(nombre);
		asignatura.setDescripcion(descripcion);
		asignatura.setOrdenCorrelacion(ordenCorrelacion);
		asignatura.setProfesor(profesor);
		return asignatura;

	}// METODO CREAR ASIGNATURA

	public static Curso crearCurso(Asignatura asignatura, String nombre) {
		Curso curso = new Curso(asignatura);
		curso.addAsignatura(asignatura);
		curso.setNombre(nombre);
		return curso;
	}// METODO CREAR CURSO

	public static Carrera crearCarrera(Curso curso, String nombre) {
		Carrera carrera = new Carrera(curso);
		carrera.setNombre(nombre);
		carrera.addCurso(curso);
		return carrera;
	}// METODO CREAR CARRERA

	
	public static String addEspaciosString(String s, int largo) {
		String salida = s;
		if(largo >= s.length()) {
			for(int i = 0;i<=largo - s.length();i++) {
				salida = salida + " ";
			}
			return salida;
		}else {
			return "El largo del dato excede el máximo";
			// METODO AÑADIR ESPACIOS
	
	}
	}
}

