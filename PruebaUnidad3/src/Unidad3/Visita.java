/*
Ejercicio Visita Jesus Seiler
 */
package Unidad3;


import java.util.ArrayList;

public class Visita {

	public static void main(String[] args) {
		
		ArrayList <Integer> nums = new ArrayList <Integer>();

		for(int i=0;i<args.length;i++) {
			nums.add(Integer.parseInt(args[i]));
		}
		
		if(nums.size() > 0)
			System.out.println(promedio(nums));
		
		
	}
	 static Integer promedio(ArrayList<Integer> numeros) {
		 
		 int suma=0;
		 
		 for( int i : numeros) {
			 suma += i;
		 }
		 
		 return suma/numeros.size();
	 }

}

