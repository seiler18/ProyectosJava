/*
 Ejercicio Jesus Unidad 6
 */
package Colecciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Persona {
    public String nombre;
    public String correo;
    public String ciudad;
    public Integer Monto;
    

    

    public Persona(String nombre, String correo, String ciudad, Integer Monto) {
        this.nombre = nombre;
        this.correo = correo;
        this.ciudad = ciudad;
        this.Monto = Monto;
    }

    private Persona() {

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getMonto() {
        return Monto;
    }

    public void setMonto(Integer Monto) {
        this.Monto = Monto;
    }
    
    public static void main(String[] args) throws IOException {
    List<Persona> personas= new Persona().loadCSV();
    personas.stream().filter(person->person.getNombre().equals("Giselle Marshall\n")).forEach(p-> 
            System.out.println("nombre: \n"+p.getNombre()+
                    "\ncorreo : \n"+p.getCorreo()+
                    "\nciudad: \n"+p.getCiudad()+
                    "\nmonto: \n"+p.getMonto()));
    
    personas.stream().filter(person->person.getCorreo().equals("imperdiet.non@enim.org")).forEach(p-> 
            System.out.println("nombre:  "+p.getNombre()+
                    "\ncorreo:  "+p.getCorreo()+
                    "\nciudad:  "+p.getCiudad()+
                    "\nmonto:  "+p.getMonto()));
    
        System.out.println(personas.stream().filter(n->n.getCorreo().contains("elite")).count());
        
        personas.stream().map(p->p.getMonto()*3).filter(m->m>29000).forEach(System.out::println);  //MONTOS > 29000
       
        
        System.out.println(personas.stream().mapToInt(Persona::getMonto).sum()/personas.size());   //PROMEDIO
        
        Persona persona = personas.stream().min(Comparator.comparing(Persona::getMonto)).get();
        System.out.println("nombre:  "+persona.getNombre()+
                    "\ncorreo:  "+persona.getCorreo()+
                    "\nciudad:  "+persona.getCiudad()+
                    "\nmonto:  "+persona.getMonto());
    }
    
    
    private java.util.List<Persona> loadCSV() throws IOException {
 BufferedReader br = new BufferedReader(new FileReader("datos.csv"));
 return br.lines().map(line -> line.split(","))
 .map(values -> new Persona(values[0], values[1], values[2],
Integer.parseInt(values[3])))
 .collect(Collectors.toList());   
}
    
    
}

