package ar.edu.unlu.ejercicio4;

public class AutoVIP extends Auto{

	public AutoVIP(String patente, int cantAsientos) {
		super(patente, cantAsientos);
		this.calcularPrecioPorDia();
	}
	
	@Override
	protected void calcularPrecioPorDia() {
		this.setPrecioPorDia(500 * this.getCantAsientos() + 3000);
	}

}
