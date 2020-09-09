/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo1;

/**
 *
 * @author Usuario
 */
public class Vestuario extends Producto {
    String talla;
    String color;

    public Vestuario(double precio,String nombre,String codigo,String talla, String color   ) {
        super(nombre, codigo, precio);
        this.talla = talla;
        this.color = color;
    }

    public Vestuario(String nombre, String codigo, double precio) {
        super(nombre, codigo, precio);
    }
    
    
}
