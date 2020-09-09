package cl.aiep.mainproducto;

import java.util.ArrayList;
import java.util.List;

import cl.aiep.mainproducto.model.Productos;
import cl.aiep.mainproducto.services.ProductoServices;
import cl.aiep.mainproducto.services.impl.ProductoServiceImplements;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Productos> listaProducto = new ArrayList<Productos>();
		ProductoServices productoServices = new ProductoServiceImplements();
		listaProducto = productoServices.leerArchivoSecuencial2();

	}

}
