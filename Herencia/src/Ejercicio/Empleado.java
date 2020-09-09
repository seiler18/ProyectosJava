/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

/**
 *
 * @author Talento Digital
 */
public class Empleado {

    public String nombre;
    private String cargo;

    public Empleado() {
    }

    public Empleado(String nombre) {
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   //

    public String getCargo() {
        return cargo;
    }

    public String setCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" + nombre + ", cargo=" + cargo + '}';
    }

  


        
       
    }
     

