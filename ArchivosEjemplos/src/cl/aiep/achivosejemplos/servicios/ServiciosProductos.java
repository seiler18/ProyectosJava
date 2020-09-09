package cl.aiep.achivosejemplos.servicios;

import java.util.List;

import cl.aiep.archivosejemplos.model.Producto;

public interface ServiciosProductos {

	public List<Producto> leerArchivoProducto();
	public List<Producto> leerArchivoProducto(String idProducto);
	public List<Producto> agregarArchivoProducto(Producto Producto);
	
}
