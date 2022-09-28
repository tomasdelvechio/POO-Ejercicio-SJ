package ar.edu.unlu.ejercicio4;

public class Camion extends Vehiculo{

	public Camion(String patente) {
		super(patente);
	}

	@Override
	protected double calcularPresupuesto(int cantDias) {
		
		if (cantDias > 30) {
			this.setPrecioPorDia(75000);
			return 75000 * cantDias;
		} else {
			this.setPrecioPorDia(100000);
			return 100000 * cantDias;
		}
		
	}

}
