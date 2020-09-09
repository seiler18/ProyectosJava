/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo1;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Vegetal extends Producto {
    Date fechaCaducidad;
    Date fechaEnvasado;

    public Vegetal(double precio, String nombre, String codigo, Date fechaCaducidad, Date fechaEnvasado) {
        super(nombre, codigo, precio);
        this.fechaCaducidad = fechaCaducidad;
        this.fechaEnvasado = fechaEnvasado;
    }

    public Vegetal(String nombre, String codigo, double precio) {
        super(nombre, codigo, precio);
    }

  
}
