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
public class Cuadrado {
        int lado1;
                
public Cuadrado (int lado1){
        this.lado1=lado1;
        
    }
    
        public void area(){
            System.out.println("el area"+(Math.pow(lado1,2)));
        }
    }  

