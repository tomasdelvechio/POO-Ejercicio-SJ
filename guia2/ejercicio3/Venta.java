package ar.edu.unlu.ejercicio3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Venta {
	private String articulo;
	private LocalDate fechaVenta;
	private double precio;
	
	
	public Venta(String articulo, String fechaVenta, double precio) {
		this.setArticulo(articulo);
		this.setFechaVenta(LocalDate.parse(fechaVenta, DateTimeFormatter.ofPattern("dd-MM-yyyy") ));
		this.precio = precio;
	}
	
	public String getArticulo() {
		return articulo;
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}

	public LocalDate getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

}
