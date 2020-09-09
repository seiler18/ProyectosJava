package figuras;

public class Triangulo extends Figura {
	private double base;
	private double altura;
	private double lado1;
	private double lado2;

	public Triangulo (double base, double altura, double lado1, double lado2 ) {
		this.base= base;
		this.altura= altura;
		this.lado1=lado1;
		this.lado2=lado2;
	}
	public Triangulo() {
		// TODO Auto-generated constructor stub
	}
	public double calcularPerimeto(double base, double lado1, double lado2) {
		return (base+lado1+lado2);
	}
	public double calcularArea(double base, double altura) {
		return (base*altura*0.5);
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
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
	}
