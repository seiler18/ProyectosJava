package modelo;

public abstract class Articulo {
	
	protected int talla;
	protected String marca;
	protected double precio;
	protected String nombre;
	protected String codigo;
	
	public Articulo(int talla, String marca, double precio, String nombre, String codigo) {
		super();
		this.talla = talla;
		this.marca = marca;
		this.precio = precio;
		this.nombre = nombre;
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTalla() {
		return talla;
	}
	public void setTalla(int talla) {
		this.talla = talla;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
}
