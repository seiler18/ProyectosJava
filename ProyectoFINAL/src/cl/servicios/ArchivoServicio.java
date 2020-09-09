package cl.servicios;

import java.util.List;
import java.util.Map;
import cl.modelos.Alumno;

public interface ArchivoServicio {
    
    public List<Alumno> cargarDatos(String ruta);
    public void exportarDatos(Map<String, Alumno> alumnos, String ruta );
    
     
}
