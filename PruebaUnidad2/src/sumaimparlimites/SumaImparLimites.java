/*
 Ejercicio SumarImparLimites 
 Jesus Seiler
 */
package sumaimparlimites;

import java.util.Scanner;

public class SumaImparLimites {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int imin, imax; //numero minimo y numero maximo
        System.out.println("Ingrese limite inferior");
        imin = leer.nextInt();
        System.out.println("Ingrese limite superior");
        imax = leer.nextInt();

        int i=0;
        int suma=0;
       
        for ( i = imin; i <= imax; i ++) {
            if (i % 2 == 1) //es impar
            {
                suma+=i;
            }
            
                       
        }
        System.out.println(suma);
    }
}
