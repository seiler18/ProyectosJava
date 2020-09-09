package modelo;

public abstract class Articulo {
	
	protected int plaxoMaximo;
	protected String nombre;
	protected String codigo;
	protected boolean reservado;
	
	public Articulo(int plaxoMaximo, String nombre, String codigo, boolean reservado) {
		super();
		this.plaxoMaximo = plaxoMaximo;
		this.nombre = nombre;
		this.codigo = codigo;
		this.reservado = reservado;
	}
	public int getPlaxoMaximo() {
		return plaxoMaximo;
	}
	public void setPlaxoMaximo(int plaxoMaximo) {
		this.plaxoMaximo = plaxoMaximo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public boolean isReservado() {
		return reservado;
	}
	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}
	
	
	
	
}
