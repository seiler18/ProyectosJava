package modelo;

import java.util.Date;
import java.util.List;

public class Orden {
	
	private String direccion;
	private String nombreCliente;
	private List<Articulo> articulos;
	private double montoTotal;
	private Date fechaCompra;
	public Orden(String direccion, String nombreCliente, List<Articulo> articulos, double montoTotal,
			Date fechaCompra) {
		super();
		this.direccion = direccion;
		this.nombreCliente = nombreCliente;
		this.articulos = articulos;
		this.montoTotal = montoTotal;
		this.fechaCompra = fechaCompra;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public List<Articulo> getArticulos() {
		return articulos;
	}
	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}
	public double getMontoTotal() {
		return montoTotal;
	}
	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}
	public Date getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	
}
