package cl.aiep.gestoruniversidad.model;

import java.util.List;

public class Asignatura {
private String nombre;
private String descripcion;
private int ordenCorrelacion;
private Profesor profesor;
private List<Profesor>listaProfesor;

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public int getOrdenCorrelacion() {
	return ordenCorrelacion;
}
public void setOrdenCorrelacion(int ordenCorrelacion) {
	this.ordenCorrelacion = ordenCorrelacion;
}

public Profesor getProfesor() {
	return profesor;
}
public void setProfesor(Profesor profesor) {
	this.profesor = profesor;
	
}
public List<Profesor> addListaProfesor(){
		return this.listaProfesor;
}

public Asignatura() {
	super();

}
public List<Profesor> getListaProfesor() {
	return listaProfesor;
}


}

