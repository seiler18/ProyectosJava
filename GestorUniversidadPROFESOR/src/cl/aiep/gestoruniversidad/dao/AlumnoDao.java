package cl.aiep.gestoruniversidad.dao;

import java.util.List;

import cl.aiep.gestoruniversidad.model.Alumno;

public interface AlumnoDao {
	public String crearAlumno (Alumno alumno);
	public List<Alumno>getListaAlumnoDummy();
	
}
