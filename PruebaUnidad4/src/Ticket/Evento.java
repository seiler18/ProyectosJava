package Ticket;



import java.util.ArrayList;

public class Evento {

	private String nombre;
	private int edadMinima;
	private boolean enCurso;
	private ArrayList<Entrada> entradas = new ArrayList<Entrada>();
	
	public Evento(String nombre, int edadMinima) {
		super();
		this.nombre = nombre;
		this.edadMinima = edadMinima;
		this.entradas = new ArrayList<>();
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return the edadMinima
	 */
	public int getEdadMinima() {
		return edadMinima;
	}
	/**
	 * @return the enCurso
	 */
	public boolean isEnCurso() {
		return enCurso;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @param edadMinima the edadMinima to set
	 */
	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}
	/**
	 * @param enCurso the enCurso to set
	 */
	public void setEnCurso(boolean enCurso) {
		this.enCurso = enCurso;
	}
	
	public void agregarEntrada(Entrada entrada) {
		this.entradas.add(entrada);
	}
	
	public void usarEntrada(int indice) {
		this.entradas.get(indice).setUtilizada(true);
	}
	/**
	 * @return the entradas
	 */
	public ArrayList<Entrada> getEntradas() {
		return entradas;
	}
	/**
	 * @param entradas the entradas to set
	 */
	public void setEntradas(ArrayList<Entrada> entradas) {
		this.entradas = entradas;
	}
	
	
}
