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
public class NoImponible implements Parametros{
    private int imponible;
    private int cf;
    public int calculoAsigFamiliar(){
        int valor=0;
        if(imponible<=315841){valor=cf*12364;
               }
        else if (imponible<=461320){
            valor=cf*7587;
        }
        else if (imponible<=719502){
            valor=cf*2398;
        }
        else{
            valor=0;
        }
        return valor;
    }
    
    public int sumaNoimponible(){
        return this.calculoAsigFamiliar()+movilizacion+colacion;
    }
}
