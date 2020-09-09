/*
ArraysList<String> MisCadenas = new ArraysList();
 */
package arreglos;

import modelo.Doctor;


public class ArraysList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Doctor d=new Doctor();
       
        System.out.println("rut"+d.getRut());
        d.setRut("1-9");
        System.out.println("RUT"+d.getRut());
        d.setRut("2-7");
        System.out.println("RUT"+d.getRut());
        System.out.println("Nombre"+d.getNombre());
        System.out.println("Direccion"+d.getDireccion());
        System.out.println("Clave"+d.getClave());
    }
    
}
