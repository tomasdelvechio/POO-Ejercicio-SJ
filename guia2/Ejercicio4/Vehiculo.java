package ar.edu.unlu.ejercicio4;

public abstract class Vehiculo {
	
	private double precioPorDia;
	private String patente;
	
	public Vehiculo(String patente) {
		this.patente = patente;
	}
	
	protected void setPrecioPorDia(double precioPorDia) {
		this.precioPorDia = precioPorDia;
	}

	protected abstract double calcularPresupuesto(int cantDias);
	
	protected void calcularPrecioPorDia() {
		this.setPrecioPorDia(3000);
	}
	
	public double getPrecioPorDia() {
		return precioPorDia;
	}

	public String getPatente() {
		return patente;
	}
	
}
