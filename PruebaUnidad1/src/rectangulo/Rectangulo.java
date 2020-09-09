package rectangulo;

/*
 Ejercicio Rectangulo Jesus Seiler
 */


import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author IchBi
 */
public class Rectangulo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int alto = leer.nextInt();
        int largo = leer.nextInt();
        float x = leer.nextFloat();

        int areaR = alto * largo;
        int perimetroR = 2 * (alto + largo);

        System.out.println(areaR);
        System.out.println(perimetroR);

        if (x > alto || x > largo) {
            System.out.println("no se puede calcular la nueva área y perímetro");

        } else {

            float area2 = (alto - (2 * x)) * (largo - (2 * x));
            float perimetro2 = 2 * ((alto - (2 * x)) + (largo - (2 * x)));
            DecimalFormat decimales = new DecimalFormat("#.000000");
            System.out.println("" + decimales.format(area2)); //6digitosdecimales
            System.out.println("" + decimales.format(perimetro2)); //6digitosdecimales
        }

    }

}
