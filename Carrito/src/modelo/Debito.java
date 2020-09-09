package modelo;

import main.Ejecutable;
import modelo.interfaces.MedioPago;
import servicio.Escaner;

public class Debito implements MedioPago{

	@Override
	public boolean pagar(double valor) {
		String codigo = Escaner.leerRespuestaStringConMensaje("Esta seguro que desea pagar con debito el total de $CLP"+valor+"?");
    	if(codigo.equals("Y")) {
			return true;
		}
    	return false;
	}
}
