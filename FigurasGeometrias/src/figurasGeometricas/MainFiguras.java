package figurasGeometricas;

public class MainFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //FIGURAS GEOMETRICAS CUADRADO - CIRCULO - RECTANGULO - TRIANGULO 
		//CUADRILATERO ES ABSTRACT SE USA PARA EXTENDER A RECTANGULO Y CUADRADO
		
        Cuadrado cuadrado = new Cuadrado(20);
        cuadrado.area();
        cuadrado.perimetro();
        System.out.println("\n¡rea del cuadrado de lado 20: " + cuadrado.getareaCuadrado());
        System.out.println("Perimetro del Cuadrado : " + cuadrado.getPerimetroC());

        Circulo circulo = new Circulo(450);
        circulo.area();
        circulo.perimetro();
        System.out.println("\n¡rea del cÌrculo de radio 450: " + circulo.getAreaRadio());
        System.out.println("Perimetro del cÌrculo : " + circulo.getPerimetroCirculo());
        
        Rectangulo rectangulo = new Rectangulo(120, 40);
        rectangulo.area();
        rectangulo.perimetro();
        System.out.println("\n¡rea del rect·ngulo de base 120 y altura 40: "+rectangulo.getAreaRectangulo());
        System.out.println("Perimetro del Rectangulo : "+rectangulo.getPerimetroR());
        
        
        Triangulo triangulo = new Triangulo(20, 30);
        Triangulo triangulo2 = new Triangulo (80,20,100);
        triangulo.area();
        triangulo2.perimetro();
      
        System.out.println("\n¡rea del tri·ngulo de base 20 y altura 30: " + triangulo.getareaTriangulo()); 
        System.out.println("Perimetro del Triangulo lados : 80,20,100 " + triangulo2.getPerimetroT());
    }    
}
	


