/*
Ejercicio Solospares2
Jesus Seiler
 */
package solopares;

import java.util.Scanner;

/**
 *
 * @author IchBi
 */
public class SoloPares2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese el numero");
        Scanner leer = new Scanner(System.in);
        int i = 0;
        int contadorpares;
        contadorpares = leer.nextInt();

 

        while (i <= contadorpares) { 
            i+=2  ;   
                          System.out.println(i);
                    }
        System.out.println(i+2);
    }

    }
