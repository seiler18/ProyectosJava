/*
Arreglos
 */
package arreglos;


public class Arreglos {


    public static void main(String[] args) {
        
        int mes[]=new int [12]; //arreglo dinamico , uno ingresa valores
        //int mes[]={1,2,3,4,5,6,7,8,9,10,11,12}; //arreglo statico, el rango
        //esta predeterminado por los valoresingresados
        for (int i = 0; i < 12; i++) {
            System.out.println("i=["+i+"]="+mes[i]);
            
        }
    }
    
}
