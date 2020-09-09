/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author Talento Digital
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
String opcion = "";
while(!opcion.equals("salir")) { //0 son iguales 1.-1 mayor y menor
 System.out.printf("Escoge una opción\n");
 System.out.printf("1 -- Acción 1\n");
 System.out.printf("2 -- Acción 1\n");
 System.out.printf("Escribe 'salir' para terminar el programa\n\n");
 System.out.printf("Ingrese una opción:");
 opcion = sc.nextLine();
 
 if(opcion.equals("1")) {
 System.out.printf("Realizando acción 1\n");
 }
 
 else if(opcion.equals("2")) {
 System.out.printf("Realizando acción 2\n");
 }
 
 else if(opcion.equals("salir")) {
 System.out.printf("Saliendo...\n");
 }
 
 else {
 System.out.printf("Opción inválida\n");
 }
}
    }
    
}
