package figuras;

public class Circulo extends Figura {
	private double radio;

	public Circulo (double radio) {
		this.radio= radio;
	
	}
	public Circulo() {
		// TODO Auto-generated constructor stub
	}
	
	public double calcularPerimeto(double radio) {
		return (2*3.14*radio);
	}
	public double calcularArea(double radio) {
		return (3.14*radio*radio);
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	}
