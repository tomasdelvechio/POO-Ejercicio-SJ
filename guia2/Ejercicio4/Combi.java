package ar.edu.unlu.ejercicio4;

public class Combi extends Vehiculo{

	public Combi(String patente) {
		super(patente);
		this.calcularPrecioPorDia();
	}

	@Override
	protected double calcularPresupuesto(int cantDias) {
		return this.getPrecioPorDia() * cantDias;
	}

	@Override
	protected void calcularPrecioPorDia() {
		this.setPrecioPorDia(4500);
	}
	
	

}
