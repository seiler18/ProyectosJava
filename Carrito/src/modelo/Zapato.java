package modelo;

public class Zapato extends Articulo {

	private String modelo;
	
	public Zapato(int talla, String marca, double precio, String nombre, String codigo) {
		super(talla, marca, precio, nombre, codigo);
		// TODO Auto-generated constructor stub
	}

	public Zapato(int talla, String marca, double precio, String nombre, String codigo, String modelo) {
		super(talla, marca, precio, nombre, codigo);
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Zapato [modelo=" + modelo + ", talla=" + talla + ", marca=" + marca + ", precio=" + precio + ", nombre="
				+ nombre + ", codigo=" + codigo + "]";
	}
}
