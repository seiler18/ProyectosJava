/*
 Ejercicio SoloPares
 Jesus Seiler
 */
package solopares;

import java.util.Scanner;

/**
 *
 * @author IchBi
 */
public class SoloPares {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        System.out.println("Ingrese el numero");
        Scanner leer = new Scanner(System.in);
        int i = 0;
        int suma=0;
        int contadorpares;
        contadorpares = leer.nextInt();
        if (i<=0) {System.out.println(i);
            
        }
 

        while (i <= contadorpares) { 
            i+=2  ;   
            
 if(i%2 == 0) { // es par
         
         System.out.println(i);
                    }
    }

    }
}
