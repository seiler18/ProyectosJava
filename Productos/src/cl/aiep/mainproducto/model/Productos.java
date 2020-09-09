package cl.aiep.mainproducto.model;

public class Productos {
	
	String id;
	String descripcion;
	String marca;
	String categoria;
	

	public Productos() {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public String toString() {
		return "Productos [id=" + id + ", descripcion=" + descripcion + ", marca=" + marca + ", categoria=" + categoria
				+ "]";
	}
}
