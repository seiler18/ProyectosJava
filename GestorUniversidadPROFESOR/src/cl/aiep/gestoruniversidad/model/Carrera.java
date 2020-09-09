package cl.aiep.gestoruniversidad.model;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
	private String nombre;
	private List<Curso> listaCurso;

	public Carrera(Curso curso) {
		super();
		this.listaCurso = new ArrayList<Curso>();
		this.listaCurso.add(curso);
	}

	public void addCurso(Curso curso) {
		this.listaCurso.add(curso);
	}

	public List<Curso> getListaCurso() {
		return this.listaCurso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
