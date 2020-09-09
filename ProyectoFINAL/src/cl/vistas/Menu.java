/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.vistas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


import cl.modelos.Alumno;
import cl.modelos.Materia;
import cl.modelos.MateriaEnum;
import cl.servicios.AlumnoServicio;
import cl.servicios.ArchivoServicio;

/**
 *
 * @author Talento Digital
 */
public abstract class Menu extends MenuTemplate {
	public static AlumnoServicio alumnoServicio;
	public static ArchivoServicio archivoServicio;
	public static int Scanner;
	static boolean salir = false;

	public static void main(String[] args) {
		System.out.println("Sistema Gestion de Alumnos");
		boolean salir = false;
		String haceralgo;
		int opcion;
		while (!salir) {
			System.out.println("1. Crear Alumnos");
			System.out.println("2. Listar Alumnos");
			System.out.println("3. Agregar Materias");
			System.out.println("4. Agregar Notas");
			System.out.println("5. Cargar Datos");
			System.out.println("6. Exportar Datos");
			System.out.println("7. Salir");

			try {
				System.out.println("Elige una  Opción");
				opcion = scanear.nextInt();
				
				switch (opcion) {
				case 1:
					Alumno alumno = new Alumno();
					Alumno alumno2 = new Alumno();
					alumno = crearAlumno("17.423.112-4","samuelcito123", "Samuel", "Enrique", "Padre Alberto Hurtado" );
					alumno2 = crearAlumno("18.546.232-1","pepeson23", "Pepe", "Jose", "Padre Alberto Hurtado" );
					System.out.println("Los Alumnos : "+ alumno.getNombre() + " " +alumno2.getNombre() + " han sido creados");
					System.out.println("Desea hacer algo mas? Y/N? Y = Volver al menu N = Salir");
					Scanner haceralgo1 = new Scanner(System.in);
					haceralgo = haceralgo1.nextLine();
					if (haceralgo.equals("Y")) {
						salir = false; // Vuelve al bucle del menu

					} else if (haceralgo.equals("N")) {
						System.out.println("Gracias por usar el programa");
						salir = true; // sale del bucle del menu
					}
					break;
				case 2:

					break;
				case 3:

					break;
				case 4:
					List<Double>notasMateria =  new ArrayList<Double>();
					System.out.println("Por favor ingrese la nota que quiere cargar");
					notasMateria.add((double) Scanner);
					opcion = scanear.nextInt();
					notasMateria.add((double) Scanner);
					opcion = scanear.nextInt();
					notasMateria.add((double) Scanner);
					opcion = scanear.nextInt();
					
					for (int b = 0; b < notasMateria.size(); b++) {
						Double c = notasMateria.get(b);
						
						System.out.println("Las notas son " + c.toString());
					}
					break;
				case 5:

					break;

				case 6:

					break;

				case 7:
					salir = true;
					System.out.println("Has salido del programa......");
					break;

				default:
					System.out.println("debes ingresar un número de 1 a 7");
				}
			} catch (InputMismatchException ex) {
				System.out.println("Solo debes ingresar Números");
				scanear.next();
			}

		}

	}

	public void cargarDatos() {
	}

	public void exportarDatos() {

	}

	public static Alumno crearAlumno(String rut, String clave, String nombre,String apellido,String direccion)  {
		Alumno alumno = new Alumno();
		alumno.setRut(rut);
		alumno.setClave(clave);
		alumno.setNombre(nombre);
		alumno.setApellido(apellido);
		alumno.setDireccion(direccion);
		return alumno;
		

	}

	public void agregarMateria() {
		
		Materia materia = new Materia();
		
		
		
	}

	public static List<Double> agregarNotaPasoUno(MateriaEnum nombre, List<Double>notas) {
		List<Double>notasMateria =  new ArrayList<Double>();
		notasMateria.add((double) Scanner);
		return notasMateria;
	
		
		
	}

	public void listarAlumnos() {

	}

	public void terminarPrograma() {

	}




}
