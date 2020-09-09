package calculadoraESPECIAL;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//------------------------------------------------------------------------------------
//EJERCICIO CALCULADORA
		int funcion;
		int num1;
		int num2;
		int resInt;
		boolean salir = false;

		double num3;
		double num4;
		double resDob = 0;
//CALCULO VELOCIDAD
		double ResVelocidad;
		double distancia;
		double tiempo;

//CALCULO PITAGORAS
		double hipotenusa;
		double cateto1;
		double cateto2;
//Si desea hacer algo mas
		String haceralgo;
//-------------------------------------------------------------------------------------		

		Scanner operacion1 = new Scanner(System.in);

		while (!salir) {
			System.out.println("Seleccione la operacion a elegir");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Calcular Velocidad");
			System.out.println("6. Calcular Hipotenusa");
			System.out.println("7. Salir");

			System.out.println("Elige una Opción");
			funcion = operacion1.nextInt();

			Scanner operacion = new Scanner(System.in);
			switch (funcion) {
			case 1:
				System.out.println("Introduce el primer número");
				num1 = operacion.nextInt();
				System.out.println("Introduce el segundo número");
				num2 = operacion.nextInt();
				resInt = num1 + num2;
				System.out.println("El resultado de la suma es: " + resInt);
				System.out.println("Desea hacer algo mas? Y/N? Y = Volver al menu N = Salir");
				Scanner haceralgo1 = new Scanner(System.in);
				haceralgo = haceralgo1.nextLine();
				if (haceralgo.equals("Y")) {
					salir = false; // Vuelve al bucle del menu

				} else if (haceralgo.equals("N")) {
					System.out.println("Gracias por usar el programa");
					salir = true; // sale del bucle del menu
				}
				break;

			case 2:
				System.out.println("Introduce el primer número");
				num1 = operacion.nextInt();
				System.out.println("Introduce el segundo número");
				num2 = operacion.nextInt();
				resInt = num1 - num2;
				System.out.println("El resultado de la resta es: " + resInt);
				System.out.println("Desea hacer algo mas? Y/N? Y = Volver al menu N = Salir");
				Scanner haceralgo2 = new Scanner(System.in);
				haceralgo = haceralgo2.nextLine();
				if (haceralgo.equals("Y")) {
					salir = false; // Vuelve al bucle del menu

				} else if (haceralgo.equals("N")) {
					System.out.println("Gracias por usar el programa");
					salir = true; // sale del bucle del menu
				}
				break;

			case 3:
				System.out.println("Introduce el primer número");
				num3 = operacion.nextDouble();
				System.out.println("Introduce el segundo número");
				num4 = operacion.nextDouble();
				resDob = num3 * num4;
				System.out.println("El resultado de la multiplicación es: " + resDob);
				System.out.println("Desea hacer algo mas? Y/N? Y = Volver al menu N = Salir");
				Scanner haceralgo3 = new Scanner(System.in);
				haceralgo = haceralgo3.nextLine();
				if (haceralgo.equals("Y")) {
					salir = false; // Vuelve al bucle del menu

				} else if (haceralgo.equals("N")) {
					System.out.println("Gracias por usar el programa");
					salir = true; // sale del bucle del menu
				}
				break;

			case 4:
				System.out.println("Introduce el primer número");
				num3 = operacion.nextDouble();
				System.out.println("Introduce el segundo número");
				num4 = operacion.nextDouble();

				try {
					// Instrucciones cuando no hay una excepción
					resDob = num3 / num4;

				} catch (ArithmeticException ex) {
					// Instrucciones cuando se produce una excepcion
					resDob = 0; // Si hay una excepcion el valor de la division sera 0
					System.out.println("Error arrojado :" + ex.getMessage());

				} finally {

					// Instruciones que se ejecutan, tanto si hay como sino hay excepciones
					System.out.println("El resultado de la division es :" + resDob);
				}
				
				System.out.println("Desea hacer algo mas? Y/N? Y = Volver al menu N = Salir");
				Scanner haceralgo4 = new Scanner(System.in);
				haceralgo = haceralgo4.nextLine();
				if (haceralgo.equals("Y")) {
					salir = false; // Vuelve al bucle del menu

				} else if (haceralgo.equals("N")) {
					System.out.println("Gracias por usar el programa");
					salir = true; // sale del bucle del menu
				}
				break;

			case 5:
				System.out.println("Introduce el valor de la distancia");
				distancia = operacion.nextDouble();
				System.out.println("Introduce el valor del tiempo ");
				tiempo = operacion.nextDouble();
				ResVelocidad = distancia / tiempo;
				System.out.println("La velocidad calculada es :" + ResVelocidad);
				System.out.println("Desea hacer algo mas? Y/N? Y = Volver al menu N = Salir");
				Scanner haceralgo5 = new Scanner(System.in);
				haceralgo = haceralgo5.nextLine();
				if (haceralgo.equals("Y")) {
					salir = false; // Vuelve al bucle del menu

				} else if (haceralgo.equals("N")) {
					System.out.println("Gracias por usar el programa");
					salir = true; // sale del bucle del menu
				}
				break;

			case 6:
				System.out.println("Introduce valor del Cateto 1");
				cateto1 = operacion.nextDouble();
				System.out.println("Introduce valor del Cateto 2");
				cateto2 = operacion.nextDouble();
				hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
				System.out.println("El valor de la hipotenusa es " + hipotenusa);
				System.out.println("Desea hacer algo mas? Y/N? Y = Volver al menu N = Salir");
				Scanner haceralgo6 = new Scanner(System.in);
				haceralgo = haceralgo6.nextLine();
				if (haceralgo.equals("Y")) {
					salir = false; // Vuelve al bucle del menu

				} else if (haceralgo.equals("N")) {
					System.out.println("Gracias por usar el programa");
					salir = true; // sale del bucle del menu
				}
				break;

			case 7:
				salir = true;
				System.out.println("Gracias por usar el programa");
				break;

			default:
				System.out.println("Debes ingresar un Número de 1 a 7");
			}

		}
	}
}
