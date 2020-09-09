/*
Ejercicio Patrones Jesus Seiler
 */
package patrones;

import java.util.Scanner;

public class Patrones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        letra1(n);
        System.out.printf("\n");
        letra2(n);
        System.out.printf("\n");
        letra3(n);
        System.out.printf("\n");
        
    }

    static void letra1(int n) {

        int i, j;

        for (i = 0; i < n; i++) {  
            System.out.printf("*.*.*.*.*.*");
        }
        System.out.printf("\n");

    }

    static void letra2(int n) {

        int i, j;

        for (i = 0; i < n; i++) { 
            System.out.printf("12341234");
        }
        System.out.printf("\n");

    }

    static void letra3(int n) {

        int i, j;

        for (i = 0; i < n; i++) {  
            System.out.printf("||*||*||*||*");
        }
        System.out.printf("\n");

    }
}


