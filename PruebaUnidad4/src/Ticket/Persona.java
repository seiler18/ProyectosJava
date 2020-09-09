package Ticket;



import java.time.LocalDate;
import java.time.Period;

public class Persona {

    protected String rut;
    protected String nombre;
    protected String apellido;
    protected LocalDate fechaNacimiento;

    public Persona(String rut, String nombre, String apellido, LocalDate fechaNacimiento) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int calcularEdad() {
        return Period.between(LocalDate.of(
                this.fechaNacimiento.getYear(), 
                this.fechaNacimiento.getMonth(), 
                this.fechaNacimiento.getDayOfMonth()), 
                LocalDate.now()
        ).getYears();
    }

}
