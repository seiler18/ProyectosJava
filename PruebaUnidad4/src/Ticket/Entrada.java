package Ticket;



public class Entrada {

	protected double valor;
	protected int asiento;
	protected String rutCliente;
	protected String rutVendedor;
	protected boolean utilizada;

	public Entrada(double valor, int asiento, boolean utilizada, String rutCliente, String rutVendedor) {
		super();
		this.valor = valor;
		this.asiento = asiento;
		this.utilizada = utilizada;
		this.rutCliente = rutCliente;
		this.rutVendedor = rutVendedor;
	}
	/**
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}
	/**
	 * @return the asiento
	 */
	public int getAsiento() {
		return asiento;
	}
	/**
	 * @return the utilizada
	 */
	public boolean isUtilizada() {
		return utilizada;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}
	/**
	 * @param asiento the asiento to set
	 */
	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}
	/**
	 * @param utilizada the utilizada to set
	 */
	public void setUtilizada(boolean utilizada) {
		this.utilizada = utilizada;
	}
	/**
	 * @return the rutCliente
	 */
	public String getRutCliente() {
		return rutCliente;
	}
	/**
	 * @return the rutVendedor
	 */
	public String getRutVendedor() {
		return rutVendedor;
	}
	/**
	 * @param rutCliente the rutCliente to set
	 */
	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}
	/**
	 * @param rutVendedor the rutVendedor to set
	 */
	public void setRutVendedor(String rutVendedor) {
		this.rutVendedor = rutVendedor;
	}
	
	
}
