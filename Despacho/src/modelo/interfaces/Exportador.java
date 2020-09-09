package modelo.interfaces;

import modelo.Orden;
import servicio.util.HandlerResponse;

public interface Exportador {
	
	HandlerResponse exportar(Orden orden);

}