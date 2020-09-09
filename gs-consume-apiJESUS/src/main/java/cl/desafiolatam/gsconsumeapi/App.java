package cl.desafiolatam.gsconsumeapi;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import cl.desafiolatam.Album;
import cl.desafiolatam.Foto;
import cl.desafiolatam.Usuario;

public class App {
	
	public static void main(String[] args) {
		//Crear método para obtener la lista de usuarios desde la API. E imprimir en pantalla los detalles
		//con este formato: "nombre - email". metodo1
					
		getAllUser().forEach(user -> System.out.println(user.getName()+"-"+user.getEmail()));
		System.out.println("\n");		
		// Crear método para obtener todos los albums, almacenar en una colección e imprimir solo los
		//pertenecientes al usuario 5 metodo2
       
		getAllAlbums().stream().filter(a -> a.getUserId() == 5)
		.forEach(m -> System.out.println(m.getId()+" - "+m.getUserId()+"-"+m.getTitle()));
		System.out.println("\n");	
		//Crear método para obtener un album de forma individual, enviando el id a través de la ruta.
		//Imprimir en pantalla el detalle de el album 77. metodo3

		Album album = getAlbum("77");
		System.out.println(
		"id: "+album.getId()+
		"\nuserId: "+album.getUserId()+
		"\ntitle: "+album.getTitle()
		);
		System.out.println("\n");	
		//Crear método para obtener todas las fotos, e imprimir las que en el título contengan "ipsam do" y
		//ordenarlas por nombre. metodo4

		System.out.println("titulos");
		getAllPhoto().stream().filter(p -> p.getTitle().contains("ipsam do"))
		.sorted(Comparator.comparing(Foto::getTitle)).forEach(
		p -> System.out.println(p.getTitle())
		);
		System.out.println("\n");			
		//En base a los usuarios obtenidos. Se deben imprimir 2 usuarios y sus respectivos albums

		getAllUser().stream().filter(user -> user.getId() < 3).forEach(user ->
		getAllAlbums().stream().filter(Album -> album.getUserId().equals(user.getId())).forEach(alb ->
		System.out.println("id usuario: " + user.getId()+"nombre usuario:"+ user.getName() +" | album id" + alb.getId()+"- album title" + alb.getTitle())
		)
		);
		System.out.println("\n");	
		//En base al requisito 13, generar un Mapa con el usuario id como clave y como valor una
		//colección de nombres del album. Imprimir en pantalla 3 usuarios con sus albums.

		Map<Integer, Set<String>> usersAlbum = new HashMap<>();
		getAllUser().stream().forEach(user -> {
		Set<String> albums = new HashSet<>();
		getAllAlbums().stream().filter(alb -> alb.getUserId() <
		4).filter(Album -> album.getUserId()
		.equals(user.getId())).forEach(Album ->
		{albums.add(album.getTitle()); usersAlbum.put(user.getId(), albums);});
		});
		usersAlbum.forEach((k,v) -> System.out.println("album: "+k+"- titulos"+v));
		System.out.println("\n");	
		
		
		
					}
	
	
//Metodo1
	public static List<Usuario> getAllUser() {
		Client client = ClientBuilder.newClient();
		WebTarget target =
		client.target("https://jsonplaceholder.typicode.com").path("users");
		Invocation.Builder invocationBuilder =
		target.request(MediaType.APPLICATION_JSON);
		Response respuestaPublicaciones = invocationBuilder.get();
		List<Usuario> usuarios = respuestaPublicaciones.readEntity(new
		GenericType<List<Usuario>>() {});
		return usuarios;
		}
	
	//Metodo2	
		private static List<Album> getAllAlbums() {
			Client client = ClientBuilder.newClient();
			WebTarget target =
			client.target("https://jsonplaceholder.typicode.com").path("albums");
			Invocation.Builder invocationBuilder =
			target.request(MediaType.APPLICATION_JSON);
			Response respuestaPublicaciones = invocationBuilder.get();
			return respuestaPublicaciones.readEntity(new GenericType<List<Album>>()
			{});
			}
		
		//Metodo3
		private static Album getAlbum(String id) {
			Client client = ClientBuilder.newClient();
			WebTarget target =
			client.target("https://jsonplaceholder.typicode.com").path("albums").path(id);
			Invocation.Builder invocationBuilder =
			target.request(MediaType.APPLICATION_JSON);
			Response respuestaPublicaciones = invocationBuilder.get();
			return respuestaPublicaciones.readEntity(new GenericType<Album>() {});
			}

		//Metodo4
		private static List<Foto> getAllPhoto() {
			Client client = ClientBuilder.newClient();
			WebTarget target =
			client.target("https://jsonplaceholder.typicode.com").path("photos");
			Invocation.Builder invocationBuilder =
			target.request(MediaType.APPLICATION_JSON);
			Response respuestaPublicaciones = invocationBuilder.get();
			return respuestaPublicaciones.readEntity(new GenericType<List<Foto>>()
			{});
		}
	
}

