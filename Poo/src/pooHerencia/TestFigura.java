
package pooHerencia;

import poo.*;


public class TestFigura {

   
    public static void main(String[] args) {
        System.out.println("******Figura******");
        Figura f=new Figura (2,2);
        f.area();
        System.out.println("********TRIANGULO********");
        Triangulo t= new Triangulo(3,4);
        t.area();
        System.out.println("*****RECTANGULO******");
        Rectangulo r=new Rectangulo(5,3);
        r.area();
        System.out.println("******CUADRADO*****");
        Cuadrado c=new Cuadrado(5);
        c.area();
    }
    
}
