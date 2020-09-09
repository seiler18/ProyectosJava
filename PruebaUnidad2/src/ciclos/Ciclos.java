/*
 Ciclos y metodos
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author Talento Digital
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.printf("Ingresa un número del 1 al 10: ");
int num = sc.nextInt();
while(num <1 || num > 10) 

{
 System.out.printf("El número no está entre 1 y 10\n");
 System.out.printf("Ingresa un número del 1 al 10: ");
 num = sc.nextInt();
}

System.out.printf("El número ingresado fue: %d \n",num);
   
    }
    
}
