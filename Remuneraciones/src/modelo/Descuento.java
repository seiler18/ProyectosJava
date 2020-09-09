/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class Descuento implements IParametrosAFP {
    
    private int imponible;
    
    public Descuento (int imponible){
        this.imponible =imponible;
    }
    
        public Descuento(){
        
    }
        public int getImponible(){
            return imponible;
        }
        
        public void setImponible (int imponible){
            this.imponible=imponible;
        }
        
        public int afp(){
            return (int) afphabitat*imponible;
        }
        
              public int fonasa(){
            return (int) fonasa*imponible;
        }
              public int sumaDescuento(){
                  return this.afp()+this.fonasa();
              }
}
                    
       




                    

