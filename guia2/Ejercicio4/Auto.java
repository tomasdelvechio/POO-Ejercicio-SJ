package ar.edu.unlu.ejercicio4;

public class Auto extends Vehiculo{
	
	private int cantAsientos;

	public Auto(String patente, int cantAsientos) {
		super(patente);
		this.cantAsientos = cantAsientos;
		this.calcularPrecioPorDia();
	}

	@Override
	protected double calcularPresupuesto(int cantDias) {
		return this.getPrecioPorDia() * cantDias;
	}
	
	@Override
	protected void calcularPrecioPorDia() {
		this.setPrecioPorDia(300 * this.cantAsientos + 3000);
	}

	public int getCantAsientos() {
		return cantAsientos;
	}

}
