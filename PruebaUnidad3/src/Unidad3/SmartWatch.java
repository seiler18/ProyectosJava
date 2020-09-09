/*
 Ejercicio SmartWatch Jesus Seiler
 */
package Unidad3;

import java.util.ArrayList;

public class SmartWatch {

    public static void main(String[] args) {

        ArrayList<Integer> pasosDados = new ArrayList<Integer>();

        for (int i = 0; i < args.length; i++) {

            pasosDados.add(Integer.parseInt(args[i]));

        }

        System.out.println(clearSteps(pasosDados));
    }

    static ArrayList<Integer> clearSteps(ArrayList<Integer> pasosDados) {

        ArrayList<Integer> pasosEliminados = new ArrayList<Integer>();

        for (int i : pasosDados) {

            if (i >= 200 && i < 100000) {

                pasosEliminados.add(i);
            }
        }
        if (pasosDados.size() > 0) {
            System.out.println("Promedio pasos Dados :\n"+promedio(pasosDados));
        }

        return pasosDados;

    }

    static Integer promedio(ArrayList<Integer> numeros) {

        int suma = 0;

        for (int i : numeros) {
            suma += i;
        }

        return suma / numeros.size();
    }

}
