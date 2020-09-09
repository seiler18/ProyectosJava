/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.vistas;

import java.util.Scanner;

import cl.modelos.Alumno;

/**
 *
 * @author Talento Digital
 */
public abstract class MenuTemplate {

    /**
     * @param args the command line arguments
     * @return 
     * @return 
     */
  
    static Scanner scanear = new Scanner(System.in);
    
    public abstract void cargarDatos();
    public abstract void exportarDatos();
    public abstract Alumno crearAlumno() ;
    public abstract void agregarMateria();
    public abstract void agregarNotaPasoUno();
    public abstract void listarAlumnos();
    public abstract void terminarPrograma();
    public static void iniciarMenu() {
    	
    }

}
