package cl.desafiolatam.UMLEjemplo.model;

import cl.desafiolatam.UMLEjemplo.services.CajaCambio;

public abstract class Vehiculo implements CajaCambio {

protected int Llantas;
protected String Color;
protected int anio;
protected String Marca;
private Aleron aleron;
private Motor motor;
private Ruedas ruedas;
	
public abstract void encender() ;
//Abstract porque no ejecuta nada
	
public abstract void avanzar();
//Abstract porque no ejecuta nada
	
public abstract void detener() ;
//Abstract porque no ejecuta nada
	
public abstract void apagar() ;
// Abstract porque no ejecuta nada

public int getLlantas() {
	return Llantas;
}



public void setLlantas(int llantas) {
	Llantas = llantas;
}



public String getColor() {
	return Color;
}



public void setColor(String color) {
	Color = color;
}



public int getAnio() {
	return anio;
}



public void setAnio(int anio) {
	this.anio = anio;
}



public String getMarca() {
	return Marca;
}



public void setMarca(String marca) {
	Marca = marca;
}
public Vehiculo( Motor motor, Ruedas ruedas) {
	super();
	
	this.motor = motor;
	this.ruedas = ruedas;
}

public Aleron getAleron() {
	return aleron;
}

public void setAleron(Aleron aleron) {
	this.aleron = aleron;
}

public Motor getMotor() {
	return motor;
}

public void setMotor(Motor motor) {
	this.motor = motor;
}

public Ruedas getRuedas() {
	return ruedas;
}

public void setRuedas(Ruedas ruedas) {
	this.ruedas = ruedas;
}
	
	
}

