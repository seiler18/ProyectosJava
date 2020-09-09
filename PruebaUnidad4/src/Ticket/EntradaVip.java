package Ticket;



public class EntradaVip extends Entrada {

	public EntradaVip(double valor, int asiento, boolean utilizada, String rutCliente, String rutVendedor) {
		super(valor, asiento, utilizada, rutCliente, rutVendedor);
		this.regaloRetirado = false;
	}

	private boolean regaloRetirado;

	/**
	 * @return the regaloRetirado
	 */
	public boolean isRegaloRetirado() {
		return regaloRetirado;
	}

	/**
	 * @param regaloRetirado the regaloRetirado to set
	 */
	public void setRegaloRetirado(boolean regaloRetirado) {
		this.regaloRetirado = regaloRetirado;
	}
	
	
}
