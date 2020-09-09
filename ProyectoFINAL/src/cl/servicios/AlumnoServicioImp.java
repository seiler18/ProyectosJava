/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.servicios;

import cl.modelos.Alumno;
import cl.modelos.Materia;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Talento Digital
 */
public class AlumnoServicioImp implements AlumnoServicio {

    private Map<String, Alumno> listaalumnos = new HashMap<>();

    @Override
    public void crearAlumno(Alumno alumno) {
        if (alumno != null) {
            listaalumnos.put(alumno.getRut(), alumno);
        }
    }

    @Override
    public void agregarMateria(String rutAlumno, Materia nuevaMateria) {
        if (listaalumnos.get(rutAlumno) != null) {
            Alumno alumno = listaalumnos.get(rutAlumno);
            Materia mate = null;

            if (alumno.getMateria() != null) {
                mate = alumno.getMateria().stream().filter(materia -> materia.getNombre().equals(nuevaMateria.getNombre())).findAny().orElse(null);
                if (mate != null) {
                    alumno.getMateria().add(nuevaMateria);
                    System.out.println("Materia Agregada");
            } else {
                System.out.println("Este alumnno ya contiene la materia ");
            }

        } else {
            List<Materia> materias = new ArrayList<>();
            materias.add(nuevaMateria);
            alumno.setMateria(materias);
            System.out.println("Materia Agregada");
        }
    }  
        else {

            System.out.println("Alumno no existe");
    }
    }
    
    
    @Override
    public List<Materia> materiasPorAlumno(String rutAlumno) {
        List<Materia> materias = new ArrayList<>();
        if (listaalumnos.get(rutAlumno) != null) {
            Alumno alumno = listaalumnos.get(rutAlumno);

            if (alumno.getMateria() != null) {
                System.out.println("Alumno tiene las siguientes mateias");
                materias=alumno.getMateria();
            }
        } else{ System.out.println("Alumno no existe");
            }
        
        return materias;
    }

    
    
    
    @Override
    public Map<String, Alumno> listarAlumnos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
