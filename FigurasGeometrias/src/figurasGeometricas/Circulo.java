package figurasGeometricas;

public class Circulo implements Figura {
    private double radio;  //LO NECESARIO PARA CALCULAR EL CIRCULO
    private double areaRadio; //LO NECESARIO PARA CALCULAR EL CIRCULO
    private static final double pi = 3.1415; //LO NECESARIO PARA CALCULAR EL CIRCULO
   private double PerimetroCirculo ;
    public Circulo(double radio) 
    {
        this.radio = radio;
    }

    public double getRadio() 
    {
        return radio;
    }

    public void setRadio(double radio) 
    {
        this.radio = radio;
    }

    public double getAreaRadio() 
    {
        return areaRadio;
    }

	public double getPerimetroCirculo() {
		return PerimetroCirculo;
	}

	public void setPerimetroCirculo(double perimetroCirculo) {
		PerimetroCirculo = perimetroCirculo;
	}
    
    
    
    @Override
    public void area() 
    {
        areaRadio = pi * radio * radio;
    }

	@Override
	public void perimetro() {
		
		PerimetroCirculo = 2 * (3.1415) * radio;
	}    
    
    
}