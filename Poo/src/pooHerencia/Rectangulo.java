/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooHerencia;

import poo.*;

/**
 *
 * @author Talento Digital
 */
public class Rectangulo {
          int lado1,lado2;
    public Rectangulo(int lado1, int lado2){
        this.lado1=lado1;
        this.lado2=lado2;
    }
    
        public void area(){
            System.out.println("el area"+(this.lado1*lado2));
        }
    }

