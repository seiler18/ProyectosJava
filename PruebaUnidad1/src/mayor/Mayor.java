/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayor;

import java.util.Scanner;

/**
 *
 * @author Talento Digital
 */
public class Mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese primer numero");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese segundo numero");
        int numero2 = sc.nextInt();
        
        if (numero1 > numero2) {
            System.out.println(numero1);
        } 
        
        else {
            System.out.println(numero2);
        }
    }

}
