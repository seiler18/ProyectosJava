package cl.aiep.ejemplovehiculo.model;

public abstract class Vehiculo {
	protected int llantas;
	protected String color;
	protected int anio;
	protected String marca;
	private Aleron aleron;
	private Motor motor;
	private Rueda rueda;
	
	public Vehiculo(Motor motor, Rueda rueda) {
		super();
		this.setMotor(motor);
		this.rueda = rueda;
	}

	protected Rueda getRueda() {
		return rueda;
	}

	protected void setRueda(Rueda rueda) {
		this.rueda = rueda;
	}

	abstract public void encender();

	abstract public void apagar();

	abstract public void avanzar();

	abstract public void detener();

	public void setAleron(Aleron aleron) {
		this.aleron = aleron;
	}

	public Aleron getAleron() {
		return this.aleron;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

}
