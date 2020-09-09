/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Talento Digital
 */
public class Persona {

    private String rut;
    private String nombre;
    private String direccion;
    
    
   public void mostrar(){
       System.out.println("Rut"+rut);
       System.out.println("Nombre"+nombre);
       System.out.println("Direccion"+direccion);
   }
}

