package ar.edu.unlu.ejercicio4;

public class Flete extends Vehiculo{
	
	private double pat;

	public Flete(String patente, double pat) {
		super(patente);
		this.pat = pat;
		this.calcularPrecioPorDia();
	}

	@Override
	protected double calcularPresupuesto(int cantDias) {
		return this.getPrecioPorDia() * cantDias;
	}

	@Override
	protected void calcularPrecioPorDia() {
		this.setPrecioPorDia(600 * this.pat + 3000);
	}

}
