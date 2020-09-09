package figurasGeometricas;

public class Triangulo implements Figura
{
    private double base;
    private double altura;
    private double areaTriangulo;
    private double PerimetroT;
    private double lado1,lado2,lado3;
    
    public Triangulo(double base, double altura) 
    {
        this.base = base;
        this.altura = altura;
        
    }
   
    public Triangulo(double lado1, double lado2, double lado3) 
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        
    }
    
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
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

    public double getareaTriangulo() 
    {
        return areaTriangulo;
    }

	public double getPerimetroT() {
		return PerimetroT;
	}

	public void setPerimetroT(double perimetroT) {
		PerimetroT = perimetroT;
	}    
   


	   @Override
	    public void area() 
	    {
	        areaTriangulo = base * altura / 2; //toma base y altura y divide entre 2
	    }

		@Override
		public void perimetro() {
			PerimetroT = lado1+lado2+lado3; //ingresar datos para los lados
    
		}
}
