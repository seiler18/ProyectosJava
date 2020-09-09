package servicio;

import java.util.List;

import modelo.Articulo;
import modelo.Usuario;

public class SessionHandler {

	private static Usuario usuarioActivo = null;

	public static Usuario getUsuarioActivo() {
		return usuarioActivo;
	}

	public static void setUsuarioActivo(Usuario usuarioActivo) {
		SessionHandler.usuarioActivo = usuarioActivo;
	}
	

}
