package cl.aiep.gestoruniversidad.delegate.impl;

import cl.aiep.gestoruniversidad.dao.ProfesorDao;
import cl.aiep.gestoruniversidad.dao.impl.ProfesorDaoImpl;
import cl.aiep.gestoruniversidad.delegate.ProfesorDelegate;
import cl.aiep.gestoruniversidad.model.Profesor;

public class ProfesorDelegateImpl implements ProfesorDelegate {
ProfesorDao profesorDao = null;

public ProfesorDelegateImpl() {
	super();
	// TODO Auto-generated constructor stub
	this.profesorDao = new ProfesorDaoImpl();
}

	@Override
	public String crearProfesor(Profesor profesor) {
		// TODO Auto-generated method stub
		return this.profesorDao.crearProfesor(profesor);
	}




}
