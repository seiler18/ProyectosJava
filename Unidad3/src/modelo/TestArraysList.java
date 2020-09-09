/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Talento Digital
 */
public class TestArraysList {

   
    public static void main(String[] args) {
       ArrayList <Doctor> doc= new ArrayList<Doctor>();
       doc.add(new Doctor("1111","Juan","san lucas 123",123));
       doc.add(new Doctor("2222","Ximena","san mateo 123",222));
       doc.add(new Doctor("3333","Roberto","san patricio 123",333));
       doc.add(new Doctor("4444","Ruben","san bernardo 123",444));
        
       System.out.println("For each");
       for (Doctor doc1 : doc) {
            System.out.println("Rut"+doc1.getRut());   
            System.out.println("Nombre"+doc1.getNombre());   
            System.out.println("Direccion"+doc1.getDireccion());   
            System.out.println("Clave"+doc1.getClave());   
            
            System.out.println("For tradicional");
            for (int i = 0; i < doc.size(); i++) {
                System.out.println("Rut"+doc.get(i).getRut());
                System.out.println("Nombre"+doc.get(i).getNombre());
                System.out.println("Direccion"+doc.get(i).getDireccion());
                System.out.println("Clave"+doc.get(i).getClave());
                
                System.out.println("ITERATOR");
                Iterator it=doc.iterator();
                while (it.hasNext()){
                    Doctor item= (Doctor) it.next();
                    System.out.println("Rut"+item.getRut());
                    System.out.println("Nombre"+item.getNombre());
                    System.out.println("Direccion"+item.getDireccion());
                    System.out.println("Clave"+item.getClave());
                }
               
           }
              
        }
    }
    
}
