/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package likesenfotos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Likes {

	public static void main(String[] args) {
		String nombre = "fotosylikes.txt";
		if(args.length != 0) {
			nombre = args[0];
		}
		

		ArrayList<String> likes = leerArchivo(nombre);
		
		List<String> fotosUnicas = nombreFotos(likes);
		ArrayList<Integer> cantidad = cantidadLikes(fotosUnicas, likes);
	
		
		//Mostrar likes de cada foto
		mostrarLikesDeCadaFoto(fotosUnicas,cantidad);
		
		
		//Mostrar cantidad
		max(cantidad,fotosUnicas);
		
		//Mostrar cantidad
		min(cantidad,fotosUnicas);
				
		//Promedio de likes
		promedio(cantidad);
		
	}
	
	static void mostrarLikesDeCadaFoto(List<String> listaFotos, ArrayList<Integer> cantidad) {
		
		for (int i = 0; i < listaFotos.size(); i++) {
			System.out.printf("%s: %s likes\n",listaFotos.get(i),cantidad.get(i));
		}
		
	}
	
	static void max(ArrayList<Integer> cant, List<String> elementosUnicos) {
		//buscar cuál es el valor máximo
		int maximo = Collections.max(cant);
		ArrayList<String> masLikes = new ArrayList<String>();
		
		//buscar cuántos elementos hay con el valor máximo
		for(int i = 0;i<cant.size();i++) {
			if(cant.get(i)== maximo) {
				masLikes.add(elementosUnicos.get(i));
				
			}
		}
		
		//si es un solo elemento, mostrar cuál es
		if(masLikes.size() == 1) {
			System.out.printf("La foto con más likes es: %s con %d likes\n",masLikes.get(0),maximo);
		}
		
		//si son más de 1 elemento, mostrarlos todos
		else {
			System.out.printf("Las fotos con más likes son: %s con %d likes\n", String.join(", ", masLikes),maximo);
		}
		
		
	}
	
	static void min(ArrayList<Integer> cant, List<String> elementosUnicos) {
		//buscar cuál es el valor máximo
		int minimo = Collections.min(cant);
		ArrayList<String> menosLikes = new ArrayList<String>();
		
		//buscar cuántos elementos hay con el valor máximo
		for(int i = 0;i<cant.size();i++) {
			if(cant.get(i)== minimo) {
				menosLikes.add(elementosUnicos.get(i));
				
			}
		}
		
		//si es un solo elemento, mostrar cuál es
		if(menosLikes.size() == 1) {
			System.out.printf("La foto con menos likes es: %s con %d likes\n",menosLikes.get(0),minimo);
		}
		
		//si son más de 1 elemento, mostrarlos todos
		else {
			System.out.printf("Las fotos con menos likes son: %s con %d likes\n", String.join(", ", menosLikes),minimo);
		}
		
		
	}
	static void promedio(ArrayList<Integer> cant) {
		int suma = cant.stream().reduce(0, (a,b)->a+b );
			
		System.out.printf("El promedio de like por foto es: %d\n", suma/cant.size());
		
		
		
	}
	
	
	//Recibe los nombres de las fotos, y los datos del archivo con la lista de todos los likes
	static ArrayList<Integer> cantidadLikes(List<String> elementosUnicos, ArrayList<String> fotos) {
		
		ArrayList<Integer> cant = new ArrayList<Integer>();
		//para cada elemento único, buscar cuál es su frecuencia
		for(int i = 0; i< elementosUnicos.size();i++) {

			cant.add(Collections.frequency(fotos, elementosUnicos.get(i)));		
		}
		//retorna un ArrayList con la frecuencia de la cantidad de los likes para cada una de las fotos,
		//en el mismo orden que el arreglo original
		return cant;
	}
	
	//retorna la lista de fotos (sin repeticiones)
	static List<String> nombreFotos(ArrayList<String> fotos){
		
		return fotos.stream().distinct().sorted().collect(Collectors.toList());
	}
	
	
	
	//Lee el archivo y almacena todos los likes en un arreglo
	static ArrayList<String> leerArchivo(String nombreArchivo){
		
		FileReader fr = null;
		BufferedReader br = null;
		String data = "";	
		ArrayList<String> fotos = new ArrayList<String>();
		try {
			fr = new FileReader(nombreArchivo);
			br=new BufferedReader(fr);
			
			//se lee una linea
			data = br.readLine();
			while (data != null) {					
				//cada linea puede tener variaciones de cantidad de likes
				//se separa con el espacio y para cada elemento, se agrega al arreglod de likes
				String[] dataSplit = data.split(" ");
				for(int i =0;i<dataSplit.length;i++) {
					fotos.add(dataSplit[i]);
				}
					
				data = br.readLine();
			}
			br.close();
			fr.close();
		}
		catch (Exception e){
			
			System.out.println("Excepcion leyendo fichero "+ nombreArchivo + ": " + e);
		}
		return fotos;
	}
}

