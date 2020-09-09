/*

 */
package arreglos;

import java.util.Scanner;


public class arreglosdosdimensiones {

 
    public static void main(String[] args) {
        int arreglo [][]=new int [3][3];
        Scanner leer=new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++)
        for (int j = 0; j < arreglo.length; j++) {
           arreglo [i][j]=leer.nextInt();   
            }
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                System.out.print("["+i+","+j+"]");
            }
                System.out.println("");
            }
        System.out.println("");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                System.out.print("\t"+"["+i+","+j+"]");
                
            }
      
            
        }
        }
    
}