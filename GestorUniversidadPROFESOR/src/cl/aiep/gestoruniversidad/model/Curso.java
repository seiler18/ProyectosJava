package cl.aiep.gestoruniversidad.model;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	private String nombre;
	private List<Asignatura> listaAsignatura;
	



	public Curso(Asignatura asignatura) {
		super();
		this.listaAsignatura = new ArrayList<Asignatura>();
		this.listaAsignatura.add(asignatura);
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Asignatura> getListaAsignatura() {
		return this.listaAsignatura;
	}

	public void addAsignatura(Asignatura asignatura) {
		this.listaAsignatura.add(asignatura);
	}


}
