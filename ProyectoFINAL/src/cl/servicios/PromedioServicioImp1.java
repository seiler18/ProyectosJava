/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.servicios;

import java.util.List;

/**
 *
 * @author Admin
 */
public class PromedioServicioImp1 implements PromedioServicio{
    
    public Double calcularPromedio(List<Double> notas){
        
        if (notas != null) {
            double scale = Math.pow(10,1);
            return Math.round(notas.stream().mapToDouble(n->n).average().getAsDouble()*scale)/scale;
            
        }else{
        
        return 0.0;
        }
    }

    @Override
    public Double calcularpromedio(List<Double> notas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
