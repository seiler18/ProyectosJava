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
public class PromedioUsuarios {

    
    public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 int i = 0;
 int suma = 0;
 while (i < n){
 i+=1;
 suma += i;
 }
 System.out.printf("%d\n",suma);
 
 }
}
    
    

