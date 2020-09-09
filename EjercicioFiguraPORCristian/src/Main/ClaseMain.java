package Main;

import java.util.InputMismatchException;
import java.util.Scanner;
import figuras.Cuadrado;
import figuras.Rectangulo;
import figuras.Triangulo;
import figuras.Circulo;

public class ClaseMain {
	static Scanner scan = new Scanner(System.in);
	
	static Circulo c = new Circulo();
	static Cuadrado cu = new Cuadrado();
	static Rectangulo r = new Rectangulo();
	static Triangulo t = new Triangulo();
	
	static double radio;
	static double lado1;
	static double lado2;
	static double base;
	static double altura;
	
	public static void main(String[] args) {
	System.out.println("Calcular Areas y Perimetros");
    boolean salir = false;
    boolean continuar = false;
    int opcion;
    while(!salir) {
    	System.out.println("1.- Circulo");
    	System.out.println("2.- Cuadrado");
    	System.out.println("3.- Rectangulo");
    	System.out.println("4.- Triangulo");
    	System.out.println("5.- Salir");
    	try {
    		System.out.println("Elige una  Opción");
    		opcion= scan.nextInt();
    		switch(opcion) {
    		case 1:
    			System.out.println("Escribe el radio: ");
    			radio = scan.nextDouble();
    			System.out.println("El perimetro es: "+c.calcularPerimeto(radio) );
    			System.out.println("El Area es: "+c.calcularArea(radio));
    			break;
    		case 2:
    			System.out.println("Escribe cuanto mide su lado: ");
    			base = scan.nextDouble();
    			altura = scan.nextDouble();
    			System.out.println("El perimetro es: "+cu.calcularPerimeto(base, altura));
    			System.out.println("El Area es: "+cu.calcularArea(base, altura));
    			break;
    		case 3:
    			System.out.println("Escribe cuanto mide su ancho: ");
    			base = scan.nextDouble();
    			System.out.println("Escribe cuanto mide su largo: ");
    			altura = scan.nextDouble();
    			System.out.println("El perimetro es: "+r.calcularPerimeto(base, altura));
    			System.out.println("El Area es: "+r.calcularArea(base, altura));
    			break;
    		case 4:
    			System.out.println("Escribe cuanto mide su base: ");
    			base = scan.nextDouble();
    			System.out.println("Escribe cuanto mide su altura: ");
    			altura = scan.nextDouble();
    			System.out.println("Escribe cuanto mide su lado1: ");
    			lado1 = scan.nextDouble();
    			System.out.println("Escribe cuanto mide su lado2: ");
    			lado2 = scan.nextDouble();
    			System.out.println("El perimetro es: "+t.calcularPerimeto(base, lado1, lado2));
    			System.out.println("El Area es: "+t.calcularArea(base, altura));
    			break;
    		case 5:    	
    			salir= true;
    			System.out.println("Estas Saliendo del programa Bro, Mucha Suerte");
    			break;
    		default:
    			System.out.println("debes ingresar un número de 1 a 5");
    		}		
    	}catch(InputMismatchException ex) {
    		System.out.println("Solo debes ingresar Números");
			scan.next();
    		}
    	
    }
    
	
	}

}
