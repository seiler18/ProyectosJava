package cl.aiep.gestoruniversidad.delegate;



import java.util.List;

import cl.aiep.gestoruniversidad.model.Alumno;

public interface AlumnoDelegate {
public String crearAlumno (Alumno alumno);

public List<Alumno>getListaAlumnoDummy();

public List<Alumno> consultaAlumno();




}
