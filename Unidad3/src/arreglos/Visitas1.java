/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author Talento Digital
 */
public class Visitas1 {
  int v1;
  int v2;
  int v3;
  int v4;
  int vpromedio;
  int promedio;

  public void LeerVisitas(){
      Scanner leer=new Scanner(System.in);
      System.out.println("Ingrese los Datos de Visitas");
      v1 =leer.nextInt();
      v2 =leer.nextInt();
      v3 =leer.nextInt();
      v4 =leer.nextInt();
      
  }
  
  public void promedio(){ 
      vpromedio =4;
      promedio = ((v1+v2+v3+v4)/vpromedio);
  }

public void Resultado(){
    System.out.println(promedio);
}
}
