/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

/**
 *
 * @author Talento Digital
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado E1 = new Empleado ("Rafa");
        Directivo D1 = new Directivo ("Mario");
        Operario OP1 = new Operario ("Alfonso");
        Oficial OF1 = new Oficial ("Luis");
        Tecnico T1 = new Tecnico ("Pablo");
        System.out.println(E1);
        System.out.println(D1);
        System.out.println(OP1);
        System.out.println(OF1);
        System.out.println(T1);
    }
    
}
