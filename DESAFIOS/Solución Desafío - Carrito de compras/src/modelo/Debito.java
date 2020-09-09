package modelo;

import main.Ejecutable;
import modelo.interfaces.MedioPago;
import servicio.Escaner;

public class Debito implements MedioPago{

	@Override
	public boolean pagar(double valor) {
		String codigo = Escaner.leerRespuestaStringConMensaje("�Est� seguro que desea pagar con d�bito el total de $"+valor+"?");
    	if(codigo.equals("Y")) {
			return true;
		}
    	return false;
	}
}
