/*
Ejercicio Fibonaci Jesus Seiler

 */
package seriefibonaci;

import java.util.Scanner;


public class SerieFibonaci {

    
        public static void main(String[] args) {
        System.out.println("Ingrese el numero");
        Scanner leer = new Scanner(System.in);
        int a=0,b=1,c,n;
        n=leer.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println(a);
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println(a);
        }
    }



