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
public class Tecnico extends Empleado{

    public Tecnico() {
    }

    public Tecnico(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Tecnico{" + nombre + '}';
    }


}