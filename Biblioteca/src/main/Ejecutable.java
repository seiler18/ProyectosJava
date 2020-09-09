//Ejercicio Jesus Unidad 5

package main;

import java.util.List;

import dao.XlsHandler;
import modelo.Articulo;
import modelo.Usuario;
import servicio.SessionHandler;
import servicio.Singleton;
import utilidades.Escaner;

public class Ejecutable {

    public static XlsHandler hdlr = new XlsHandler();

    public static void main(String[] args) {
        cargarDatos();
        int valor = 100;

        while (SessionHandler.getUsuarioActivo() == null) {
            String nombre = Escaner.leerStringConMensaje("Ingrese su nombre de usuario.");
            String clave = Escaner.leerStringConMensaje("Ingrese su clave.");
            SessionHandler.setUsuarioActivo(buscarUsuario(nombre, clave));
        }
        System.out.println("Bienvenido a la Biblioteca " + SessionHandler.getUsuarioActivo().getNombre());
        while (valor > 0 && SessionHandler.getUsuarioActivo() != null) {
            valor = Escaner.leerNumeroConMensaje(2, 0,
                    "\nQue desea hacer?\n1- Reservar un articulo\n2- Buscar articulo\n0- Salir");
            if (valor == 1) {
                Integer indice = null;
                while (indice == null) {
                    indice = buscarIndiceArticuloPorCodigo(Escaner.leerStringConMensaje("Ingrese el codigo del articulo."));
                    if (indice == null) {
                        System.out.println("No encontrado, intente nuevamente.");
                    }
                }
                generarReserva(indice);

            } else if (valor == 2) {
                buscarArticulos(Escaner.leerStringConMensaje("Ingrese un nombre para buscar en la lista."));
            } else if (valor == 0) {
                System.out.println("Hasta pronto " + SessionHandler.getUsuarioActivo().getNombre() + ".");
            }
        }

    }

    private static void cargarDatos() {
        Singleton.setArticulos(hdlr.leerArticulos());
        Singleton.setUsuarios(hdlr.leerUsuarios());
    }

    private static void buscarArticulos(String nombre) {
        System.out.println("Buscando articulos con " + nombre + " en su nombre");

        for (Articulo articulo : Singleton.getArticulos()) {
            if (articulo.getNombre().contains(nombre)) {
                System.out.println(articulo);
            }
        }
        System.out.println("Buqueda finalizada.");
    }

    private static void generarReserva(Integer indice) {
        if (!Singleton.getArticulos().get(indice).isReservado()) {
            Singleton.getArticulos().get(indice).setReservado(true);
            Singleton.guardarCambios();
            System.out.println("Reserva realizada.");

        } else {

            System.out.println("El articulo no se encuentra disponible.");
        }

    }

    private static Integer buscarIndiceArticuloPorCodigo(String codigoArticulo) {
        List<Articulo> cloneList = Singleton.getArticulos();
        for (int i = 0; i < cloneList.size(); i++) {
            if (cloneList.get(i).getCodigo().equals(codigoArticulo)) {
                return i;
            }
        }
        return null;
    }

    private static Usuario buscarUsuario(String nombre, String clave) {
        List<Usuario> cloneList = Singleton.getUsuarios();
        for (int i = 0; i < cloneList.size(); i++) {
            if (cloneList.get(i).getClave().equals(clave) && cloneList.get(i).getNombre().equals(nombre)) {
                return cloneList.get(i);
            }
        }
        return null;
    }

}
