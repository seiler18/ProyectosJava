/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Arrays;

/**
 *
 * @author Talento Digital
 */
public class arregloarrrayfill {

    
    public static void main(String[] args) {
       int miarreglo[]=new int[5];
       int miarreglo1[]={7,56,9,10};
        System.out.println("arreglo no ordenado");
       Arrays.fill(miarreglo1,7); //reemplaza un valor que se asigna al intervalo miarrreglo
        for (int i = 0; i < miarreglo.length; i++) {
            System.out.println("\t"+miarreglo[i]);
            
        }
        Arrays.sort(miarreglo1);
        System.out.println("arreglo ordenado usando sort");
        for (int i = 0; i < miarreglo1.length; i++) {
            System.out.println(miarreglo1);
            
        }
    }
    
}
