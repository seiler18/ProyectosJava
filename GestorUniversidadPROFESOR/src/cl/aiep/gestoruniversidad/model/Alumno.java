package cl.aiep.gestoruniversidad.model;

import java.util.ArrayList;
import java.util.List;

public class Alumno extends Persona {
private List<Carrera>listaCarrera;
private List<Alumno>listaAlumno;

 
 public Alumno(Carrera carrera) {
	 super();
	  this.listaCarrera = new ArrayList<Carrera>();
	  this.listaCarrera.add(carrera);
 }
 
 
 public void addCarrera(Carrera carrera) {
	 this.listaCarrera.add(carrera);
	 
}


public List<Carrera> getListaCarrera() {
	return listaCarrera;
}


public List<Alumno> getListaAlumno() {
	return listaAlumno;
}


public void setListaAlumno(List<Alumno> listaAlumno) {
	this.listaAlumno = listaAlumno;
}

public List<Alumno>addListaAlumno(){
	return this.listaAlumno;
	
}
 
}
