/*
 Ejercicio Fechas Jesus Seiler 
 */
package fechas;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Fechas {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la primera fecha como DD/MM/AAAA ");
        String a = leer.nextLine();

        System.out.println("Ingrese la segunda fecha como DD/MM/AAAA");
        String b = leer.nextLine();
        compararfechas(a, b);
    }

    public static void compararfechas(String a, String b) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date fecha2 = formato.parse(a, new ParsePosition(0));
        java.util.Date fecha3 = formato.parse(b, new ParsePosition(0));

        if (fecha2.equals(fecha3)) {
            System.out.println("Tienen la misma edad");
        } else if (fecha2.before(fecha3)) {
            System.out.println("Persona 2 es mayor");
        } else {
            System.out.println("Persona 1 es mayor");
        }
    }
}

