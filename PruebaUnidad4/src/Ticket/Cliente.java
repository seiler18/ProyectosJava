package Ticket;



import java.time.LocalDate;

public class Cliente extends Persona {

	public Cliente(String rut, String nombre, String apellido, LocalDate fechaNacimiento) {
		super(rut, nombre, apellido, fechaNacimiento);
	}
	
}
