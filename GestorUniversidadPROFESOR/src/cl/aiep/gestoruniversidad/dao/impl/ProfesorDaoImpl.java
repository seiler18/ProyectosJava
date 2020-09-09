package cl.aiep.gestoruniversidad.dao.impl;

import cl.aiep.gestoruniversidad.dao.ProfesorDao;
import cl.aiep.gestoruniversidad.model.Profesor;

public class ProfesorDaoImpl implements ProfesorDao{

	public String crearProfesor(Profesor profesor) {
		// TODO Auto-generated method stub
		return "El Profesor :" + profesor.getNombre()+" Se ha creado correctamente";
	}

}
