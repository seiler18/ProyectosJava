package modelo;

public class Pantalon extends Articulo {

	private String color;
	private int cantidadBolsillos;
	
	public Pantalon(int talla, String marca, double precio, String nombre, String codigo) {
		super(talla, marca, precio, nombre, codigo);
		// TODO Auto-generated constructor stub
	}

	public Pantalon(int talla, String marca, double precio, String nombre, String codigo, String color,
			int cantidadBolsillos) {
		super(talla, marca, precio, nombre, codigo);
		this.color = color;
		this.cantidadBolsillos = cantidadBolsillos;
	}

	public int getCantidadBolsillos() {
		return cantidadBolsillos;
	}

	public void setCantidadBolsillos(int cantidadBolsillos) {
		this.cantidadBolsillos = cantidadBolsillos;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Pantalon [color=" + color + ", cantidadBolsillos=" + cantidadBolsillos + ", talla=" + talla + ", marca="
				+ marca + ", precio=" + precio + ", nombre=" + nombre + ", codigo=" + codigo + "]";
	}
	
	
}
