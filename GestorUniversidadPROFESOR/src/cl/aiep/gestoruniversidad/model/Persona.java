package cl.aiep.gestoruniversidad.model;

public class Persona {
private String rut;
private String nombre;
private int edad;

public String getRut() {
	return rut;
}
public void setRut(String rut) throws Exception {
	this.rut = rut;
	if (!validaRut()) {
		throw new Exception ("El rut no es valid...");
		
	}
	
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}

private boolean validaRut() {
	
	
	return true;
}
	
}
