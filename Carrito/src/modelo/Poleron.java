package modelo;

public class Poleron extends Articulo {

	private String color;
		
	public Poleron(int talla, String marca, double precio, String nombre, String codigo) {
		super(talla, marca, precio, nombre, codigo);
		// TODO Auto-generated constructor stub
	}
	
	public Poleron(int talla, String marca, double precio, String nombre, String codigo, String color) {
		super(talla, marca, precio, nombre, codigo);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Poleron [color=" + color + ", talla=" + talla + ", marca=" + marca + ", precio=" + precio + ", nombre="
				+ nombre + ", codigo=" + codigo + "]";
	}

}
