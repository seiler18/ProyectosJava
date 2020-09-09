package Ticket;



import java.time.LocalDate;

public class Vendedor extends Persona {

    private int entradasNormalesVendidas;
    private int entradasVipVendidas;

    public Vendedor(String rut, String nombre, String apellido, LocalDate fechaNacimiento) {
        super(rut, nombre, apellido, fechaNacimiento);
        this.entradasNormalesVendidas = 0;
        this.entradasVipVendidas = 0;
    }

    public int getEntradasNormalesVendidas() {
        return entradasNormalesVendidas;
    }

    public int getEntradasVipVendidas() {
        return entradasVipVendidas;
    }

    public void setEntradasNormalesVendidas(int entradasNormalesVendidas) {
        this.entradasNormalesVendidas = entradasNormalesVendidas;
    }

    public void setEntradasVipVendidas(int entradasVipVendidas) {
        this.entradasVipVendidas = entradasVipVendidas;
    }

}
