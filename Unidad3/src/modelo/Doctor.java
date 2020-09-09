/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Talento Digital
 */
public class Doctor {
private String rut;
private String nombre;
private String direccion;
private int clave;

    public Doctor(String rut, String nombre, String direccion, int clave) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.clave = clave;
    }

    public Doctor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public void mostrar (String rut, String nombre){
    int v=3;
    System.out.println("rut"+rut);
    System.out.println(v);
}
//getter and setter para tomar o asignar valores
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }
   
   
   
}
