package cl.desafiolatam.gsconsumeapi;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import cl.desafiolatam.Publicacion;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("INICIO!");
		List<Publicacion> listaPublicaciones = null;
		// Obtener publicaciones
		listaPublicaciones = getPublicaciones();

//		System.out.println(listaPublicaciones.get(0));
//
//		listaPublicaciones.forEach(System.out::println);
//		listaPublicaciones.forEach(x -> System.out.println(x));

		guardaPublicacion();

		modificaPublicacion();
		
		eliminaPublicacion();
	}

	public static List<Publicacion> getPublicaciones() {
		System.out.println("OBTENER PUBLICACIONES");

		Client client = ClientBuilder.newClient();

		WebTarget target = client.target("https://jsonplaceholder.typicode.com").path("posts");

		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);

		Response respuestaPublicaciones = invocationBuilder.get();

		System.out.println(respuestaPublicaciones.getStatus());
		 System.out.println("Server: " +
		respuestaPublicaciones.getHeaders().get("Server"));

		List<Publicacion> listaPublicaciones = respuestaPublicaciones.readEntity(new GenericType<List<Publicacion>>() {
		});

		return listaPublicaciones;
	}

	public static void guardaPublicacion() {
		System.out.println("GUARDA PUBLICACION");
		// Guardar una publicación
		Publicacion publicacion = new Publicacion();
		publicacion.setTitle("LoTR");
		publicacion.setBody("A ring");
		publicacion.setUserId(1);
		publicacion.setId(101);
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://jsonplaceholder.typicode.com").path("posts");
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response publicacionRespuesta = invocationBuilder.post(Entity.entity(publicacion, MediaType.APPLICATION_JSON));
		System.out.println(publicacionRespuesta);
	}

	public static void modificaPublicacion() {
		System.out.println("MODIFICA PUBLICACION");
		Publicacion publicacion = new Publicacion();
		publicacion.setTitle("LoTR");
		publicacion.setBody("Three movies");
		publicacion.setUserId(1);
		publicacion.setId(101);
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://jsonplaceholder.typicode.com").path("posts").path("1");
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response publicacionRespuesta = invocationBuilder.put(Entity.entity(publicacion, MediaType.APPLICATION_JSON));
		System.out.println(publicacionRespuesta);
	}

	public static void eliminaPublicacion() {
		System.out.println("ELIMINA PUBLICACION");
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://jsonplaceholder.typicode.com").path("posts").path("101");
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response publicacionRespuesta = invocationBuilder.delete();
		System.out.println(publicacionRespuesta);
	}
}
