package modelo;

import modelo.interfaces.MedioPago;
import servicio.Escaner;

public class Credito implements MedioPago{

	@Override
	public boolean pagar(double valor) {
		
		int cicloPago = 1;
		String codigo;
    	while(cicloPago == 1) {
    		codigo = Escaner.leerRespuestaStringConMensaje("¿Está seguro que desea pagar con credito el total de $"+valor+"?");
    		if(codigo.equals("Y")) {
	    		Integer cuotas = Escaner.leerNumeroConMensaje(24, 0, "¿Con cuantas cuotas desea pagar ? (0-24)");
		    	codigo = Escaner.leerRespuestaStringConMensaje("¿Está seguro que desea pagar con "+cuotas+" cuotas?");
		    	if(codigo.equals("Y")) {
		    		return true;
				}
    		}else {
    			cicloPago = 0;
    		}
    	}
    	return false;
	}
}
