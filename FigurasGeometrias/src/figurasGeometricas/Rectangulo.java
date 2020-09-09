package figurasGeometricas;

public class Rectangulo extends Cuadrilatero implements Figura
{
    private double base;
    private double altura;
    private double areaRectangulo;
    private double PerimetroR;

    public Rectangulo(double base, double altura) 
    {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() 
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura() 
    {
        return altura;
    }

    public void setAltura(double altura) 
    {
        this.altura = altura;
    }

    public double getAreaRectangulo() 
    {
        return areaRectangulo;
    }
    
	public double getPerimetroR() {
		return PerimetroR;
	}

 

    @Override
    public void area() 
    {
        areaRectangulo = base * altura; //area del rectangulo
    }


	public void perimetro()
	{
		PerimetroR = base + altura; //perimetro  del rectangulo
	}
}
