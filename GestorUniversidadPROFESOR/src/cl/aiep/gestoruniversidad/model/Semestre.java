package cl.aiep.gestoruniversidad.model;

import java.util.ArrayList;
import java.util.List;

public class Semestre {
private String descripcion;
private List<Asignatura> listaAsignatura;


public Semestre() {
	super();
	// TODO Auto-generated constructor stub
	this.listaAsignatura = new ArrayList<Asignatura>();
}


public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public List<Asignatura> getListaAsignatura() {
	return listaAsignatura;
}

public void addAsignatura(Asignatura asignatura) {
	this.listaAsignatura.add(asignatura);
	
	
}










}
