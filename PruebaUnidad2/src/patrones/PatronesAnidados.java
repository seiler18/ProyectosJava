/*
 Ejercicio Patrones Jesus Seiler
 */
package patrones;


import java.util.Scanner;

public class PatronesAnidados {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();

		letra1(n);
		System.out.printf("\n");
		letra2(n);
		System.out.printf("\n");
		letra3(n);
		System.out.printf("\n");
		figura(n);
		
	}
	
	static void letra1(int n) {
		
		int i,j;
		
		for(i=0;i<n;i++) {  //inicio
			System.out.printf("*");
		}
		System.out.printf("\n");

		// parte media
		for(j=0; j<n-2;j++) {
			System.out.printf("*"); // primero de la fila
			for(i=0;i<n-2;i++) {
				System.out.printf(" ");
			}
			System.out.printf("*"); //último de la fila
			System.out.printf("\n");	
		}
		if(n>1) {

			for(i=0;i<n;i++) {  //fin
				System.out.printf("*");
			}
			System.out.printf("\n");
		}

	}

	static void letra2(int n) {
		int i, j;
		
		
		for(i=0;i<n;i++) {
			System.out.printf("*");
		}
		System.out.printf("\n");
		
		for(i=0;i<n-2;i++) {
			
			for(j = 0; j<n ; j++) {
				
				if( i+2 + j == n) {
					
					System.out.printf("*");
				}
				else {
					System.out.printf(" ");
					
				}
				
			}
			System.out.printf("\n");
		}
		
		if(n>1) {

			for(i=0;i<n;i++) {  //fin
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		
	}
	static void letra3(int n) {
		
		int i, j;
		
		for(i=0;i<n;i++) {
			
			for(j = 0; j<n ; j++) {
				
				if( i == j || i+j == n-1) {
					
					System.out.printf("x");
				}
				else {
					System.out.printf(" ");
					
				}
			}
			System.out.printf("\n");
		}
		
	}
	static void figura(int n) {
		
		int i,j;
		
		for(i=0;i<n-1;i++) {  //inicio
			System.out.printf("*");
		}
		System.out.printf(" \n");

		// parte media
		for(j=0; j<n-2;j++) {
			System.out.printf(" "); // primero de la fila
			for(i=0;i<n-2;i++) {
				System.out.printf("*");
			}
			System.out.printf(" "); //último de la fila
			System.out.printf("\n");	
		}
		if(n>1) {
			System.out.printf(" ");
			for(i=1;i<n;i++) {  //fin
				System.out.printf("*");
			}
			System.out.printf("\n");
		}

	}
}

