/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Talento Digital
 */
public class Imponible implements Parametros{
    private String rut ;
    private String nombre;
    private int dt;
    private int sb;
    private int he;
    private int cf;

   

    public Imponible(String rut, String nombre, int dt, int sb, int he, int cf) {
    
        this.dt = dt;
        this.sb = sb;
        this.he = he;
        this.cf = cf;
        
        
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public int getSb() {
        return sb;
    }

    public void setSb(int sb) {
        this.sb = sb;
    }

    public int getHe() {
        return he;
    }

    public void setHe(int he) {
        this.he = he;
    }

    public int getCf() {
        return cf;
    }

    public void setCf(int cf) {
        this.cf = cf;
    }
      
    public int calculoDT(){
        return (sb/30)*dt;
    }
    public int gratificacion()
    {
        return (int)(imm*factorimm)/12;
    }
    
    public int calculoHE(){
    
        return(int)(sb*factorhe)*he;
        
    }
    
    public int sumaImponible(){
        
        return this.calculoDT()+
            this.gratificacion()+
                this.calculoHE();
            }
    }


