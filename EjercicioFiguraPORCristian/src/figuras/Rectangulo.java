package figuras;

public class Rectangulo  extends Cuadrilatero {
	
private double base;
private double altura;

public Rectangulo (double base, double altura) {
	this.base= base;
	this.altura= altura;
}
public Rectangulo() {
	// TODO Auto-generated constructor stub
}
public double calcularPerimeto(double base, double altura) {
	return (base*2+altura*2);
}
public double calcularArea(double base, double altura) {
	return (base*altura);
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
}