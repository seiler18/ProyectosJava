/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.servicios;

import cl.modelos.Alumno;
import cl.modelos.Materia;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Talento Digital
 */
public interface AlumnoServicio {
	public static final Map<String, Alumno> listaAlumnos = null;
    public void crearAlumno (Alumno alumno);
    public void agregarMateria (String rutAlumno, Materia nuevaMateria);
    public List<Materia> materiasPorAlumno (String rutAlumno);
    public Map<String,Alumno> listarAlumnos();
}





