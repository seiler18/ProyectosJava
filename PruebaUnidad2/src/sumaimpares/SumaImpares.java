/*
 Ejercicio SumaImpares
 Jesus Seiler
 */
package sumaimpares;

import java.util.Scanner;

public class SumaImpares {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i2 = leer.nextInt();
        int i=0;
        int suma=0;
       
        for ( i = 1; i <= i2; i ++) {
            if (i % 2 == 1) //es impar
            {
                suma+=i;
            }
            
                       
        }
        System.out.println(suma);
    }
}
