package figurasGeometricas;

public class Cuadrado extends Cuadrilatero implements Figura
{
    private double lado;
    private double areaCuadrado;
    private double PerimetroC;
    public Cuadrado(double lado) 
    {
        this.lado = lado;
    }
    
    public double getLado() 
    {
        return lado;
    }

    public void setLado(double lado) 
    {
        this.lado = lado;
    }

    public double getareaCuadrado() 
    {
        return areaCuadrado;
    }    
    
    
    public double getPerimetroC() {
		return PerimetroC;
	}
    
    @Override
    public void area() 
    {
        areaCuadrado = lado * lado; //lado^2
    }

	
    @Override
	public void perimetro() {
		PerimetroC = lado*4; //perimetrocuadrado
	}

	


	}    

