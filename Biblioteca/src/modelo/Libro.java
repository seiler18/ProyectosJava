package modelo;

public class Libro extends Articulo {

	private int paginas;
	private String imprenta;
	
	public Libro(int plaxoMaximo, String nombre, String codigo, int paginas, String imprenta, boolean reservado) {
		super(plaxoMaximo, nombre, codigo, reservado);
		this.paginas = paginas;
		this.imprenta = imprenta;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public String getImprenta() {
		return imprenta;
	}
	public void setImprenta(String imprenta) {
		this.imprenta = imprenta;
	}
	@Override
	public String toString() {
		return "Libro [paginas=" + paginas + ", imprenta=" + imprenta + ", plaxoMaximo=" + plaxoMaximo + ", nombre="
				+ nombre + ", codigo=" + codigo + ", reservado=" + reservado + "]";
	}
	
	
}
