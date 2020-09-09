package cl.aiep.gestoruniversidad.dao.impl;

import java.util.ArrayList;
import java.util.List;

import cl.aiep.gestoruniversidad.dao.AlumnoDao;
import cl.aiep.gestoruniversidad.model.Alumno;
import cl.aiep.gestoruniversidad.model.Asignatura;
import cl.aiep.gestoruniversidad.model.Carrera;
import cl.aiep.gestoruniversidad.model.Curso;
import cl.aiep.gestoruniversidad.model.Profesor;

public class AlumnoDaoImpl implements AlumnoDao{

	@Override
	public String crearAlumno(Alumno alumno) {
		// TODO Auto-generated method stub
		return "El Alumno : "+ alumno.getNombre() + "se ha creado correctamente";
	}

	public List<Alumno> getListaAlumnoDummy(){
		Asignatura asignatura1 = new Asignatura();
		Asignatura asignatura2 = new Asignatura();
		Curso curso = new Curso(asignatura1);
		Carrera carrera = new Carrera(curso);
		Alumno alumno1 = new Alumno(carrera);
		Alumno alumno2 = new Alumno(carrera);
		Alumno alumno3 = new Alumno(carrera);
		Profesor profesor = new Profesor();
		List<Alumno> listaAlumno = new ArrayList<Alumno>();
		alumno1.setNombre("Pepito Lopez");
		alumno1.setEdad(19);
		alumno2.setNombre("Pepita1 Jara");
		alumno2.setEdad(20);
		alumno3.setNombre("Pototi Urbina");
		alumno3.setEdad(56);
		
		profesor.setNombre("Alexander Beck");
		try {
			profesor.setRut("1-9");
			alumno1.setRut("2-3");
			alumno2.setRut("2-2");
			alumno3.setRut("9-0");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		profesor.setEdad(78);
		
		asignatura1.setNombre("Matemáticas 1");
		asignatura1.setDescripcion("Matemáticas nivel 1 para nivelación");
		asignatura1.setOrdenCorrelacion(1);
		asignatura2.setNombre("Matemáticas 2");
		curso.addAsignatura(asignatura2);
		carrera.setNombre("Ingeniería en Piedras");
		listaAlumno.add(alumno1);
		listaAlumno.add(alumno2);
		listaAlumno.add(alumno3);
		return listaAlumno;
	}


	
	}

	

