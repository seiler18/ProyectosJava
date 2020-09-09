/*
+-Numeros Ejercicios
 */
package Unidad3;

/**
 *
 * @author Talento Digital
 */

import java.util.ArrayList;

public class NegativosPositivos {

	public static void main(String[] args) {
		
		solucion1(args);


	}
	
	public static void solucion1(String[] args) {
		ArrayList<Integer> positivos = new ArrayList<Integer>();
		ArrayList<Integer> negativos = new ArrayList<Integer>();
		ArrayList<Integer> ceros = new ArrayList<Integer>();
		
		for(int i=0;i<args.length;i++) {
			int num = Integer.parseInt(args[i]);
			
			if(num==0){
				ceros.add(num);
			}
			else if(num > 0) {
				positivos.add(num);
			}
			else if(num < 0) {
				negativos.add(num);
			}
		}
		System.out.println(positivos.size());
		System.out.println(negativos.size());
		System.out.println(ceros.size());
		
	}
	
	public static void solucion2(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int positivo = 0;
		int negativo = 0;
		int ceros = 0;
		
		for(int i=0; i<args.length;i++) {
			numeros.add(Integer.parseInt(args[i]));
		}
		
		for(int i=0;i<args.length;i++) {
			if(numeros.get(i) == 0) {
				ceros++;
			}
			else if(numeros.get(i)<0) {
				negativo++;
				
			}
			else {
				positivo++;
			}
		}
		
		System.out.println(positivo);
		System.out.println(negativo);
		System.out.println(ceros);
		
	}
	
	public static void solucion3(String[] args) {
		
		int positivo = 0;
		int negativo = 0;
		int ceros = 0;
		
		for(int i=0; i<args.length;i++) {
			int num = Integer.parseInt(args[i]);
			if(num == 0) {
				ceros++;
			}
			else if(num<0) {
				negativo++;
				
			}
			else {
				positivo++;
			}
		}
		
		System.out.println(positivo);
		System.out.println(negativo);
		System.out.println(ceros);
		
	}

}

