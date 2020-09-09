package cl.aiep.gestoruniversidad.delegate.impl;

import java.util.List;

import cl.aiep.gestoruniversidad.dao.AlumnoDao;
import cl.aiep.gestoruniversidad.dao.impl.AlumnoDaoImpl;
import cl.aiep.gestoruniversidad.delegate.AlumnoDelegate;
import cl.aiep.gestoruniversidad.model.Alumno;

public class AlumnoDelegateImpl implements AlumnoDelegate {
AlumnoDao alumnoDao=null;

public AlumnoDelegateImpl() {
	super();
	// TODO Auto-generated constructor stub
	this.alumnoDao = new AlumnoDaoImpl();
}

	@Override
	public String crearAlumno(Alumno alumno) {
		// TODO Auto-generated method stub
		return this.alumnoDao.crearAlumno(alumno);
	}

	

	@Override
	public List<Alumno> getListaAlumnoDummy() {
		// TODO Auto-generated method stub
		return this.alumnoDao.getListaAlumnoDummy();
	}

	@Override
	public List<Alumno> consultaAlumno() {
		// TODO Auto-generated method stub
		return this.alumnoDao.getListaAlumnoDummy();
	}





}
