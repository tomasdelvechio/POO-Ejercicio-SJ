package ar.edu.unlu.ejercicio4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Alquiler {

	private double presupuesto;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String patente;
	
	public Alquiler(String fechaInicio, String fechaFin, String patente, double presupuesto) {
		this.fechaInicio = LocalDate.parse(fechaInicio, DateTimeFormatter.ofPattern("dd-MM-yyyy") );
		this.fechaFin = LocalDate.parse(fechaFin, DateTimeFormatter.ofPattern("dd-MM-yyyy") );
		this.patente = patente;
		this.presupuesto = presupuesto;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public String getPatente() {
		return patente;
	}

}
