package modelo;

public class Pelicula extends Articulo {
	
	private int duracion;
	private String calidad;
	
	public Pelicula(int plaxoMaximo, String nombre, String codigo, int duracion, String calidad, boolean reservado) {
		super(plaxoMaximo, nombre, codigo, reservado);
		this.duracion = duracion;
		this.calidad = calidad;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getCalidad() {
		return calidad;
	}
	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}
	@Override
	public String toString() {
		return "Pelicula [duracion=" + duracion + ", calidad=" + calidad + ", plaxoMaximo=" + plaxoMaximo + ", nombre="
				+ nombre + ", codigo=" + codigo + ", reservado=" + reservado + "]";
	}
	
	
	
}
