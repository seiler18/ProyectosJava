/*
 Ejercicio Resistencia Jesus Seiler
 */
package resistencia;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Resistencia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Permite ingresar el valor
        System.out.println("Ingrese Resistencia 1 ");
        double resistencia1 = sc.nextDouble();
        System.out.println("Ingrese Resistencia 2 ");
        double resistencia2 = sc.nextDouble();
        System.out.println("Ingrese Resistencia 3");
        double resistencia3 = sc.nextDouble();

        if (resistencia1 > 0 && resistencia2 > 0 && resistencia3 > 0) {
            //Continua operación 

            double RT = (1 / resistencia1) + (1 / resistencia2) + (1 / resistencia3);
            double x = (1 / RT);

            DecimalFormat decimales = new DecimalFormat("#.0");
            System.out.println("La Resistencia Total es " + decimales.format(x));

        } else {  
            System.out.println("Una de las resistencias es igual o menor a 0");

        }
    }
}
