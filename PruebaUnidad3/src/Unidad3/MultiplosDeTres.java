/*
ejercicio multiplo3 jesus
 */
package Unidad3;

import java.util.ArrayList;

/**
 *
 * @author Talento Digital
 */
public class MultiplosDeTres {

	public static void main(String[] args) {
		
		ArrayList <Integer> filtrarDatos = new ArrayList<Integer>();
		
		for(int i = 0;i<args.length;i++) {
			filtrarDatos.add(Integer.parseInt(args[i]));
		}
		System.out.println(suma(filtrarDatos));
		System.out.println(promedio(filtrarDatos));
		
	}
	
	static Integer suma(ArrayList<Integer> filtrarDatos) {
		
		Integer sum = 0;
		for(int temp : filtrarDatos) {
			if (temp%3 == 0) {
				sum += temp;	
			}
		}
		return sum;
	}
	
	static Integer promedio(ArrayList<Integer> a) {
		Integer sumar = 0;
		Integer veces = 0;
		for(int temp : a) {
			if (temp%3 == 0) {
				sumar += temp;	
				veces ++;
			}
		}
		if(veces == 0) return 0;
		
		return sumar/veces;  //retorna promedio ejercicio #4
		
	}

}
