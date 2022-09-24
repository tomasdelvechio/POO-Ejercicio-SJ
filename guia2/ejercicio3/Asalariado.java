package ar.edu.unlu.ejercicio3;

import java.time.LocalDate;

public class Asalariado extends Empleado{
	
	private double sueldoMensual;
	
	public Asalariado(String telefono, String cuit, String nombre, String apellido, String cumple, double sueldoMensual) {
		super(telefono, cuit, nombre, apellido, cumple);
		this.sueldoMensual = sueldoMensual;
		calcularSalario();
	}

	@Override
	protected double calcularPremioCumple() {
		if(LocalDate.now().getMonth().equals(this.getCumple().getMonth())) {
			return 3000;
		} else return 0;
	}

	@Override
	protected void calcularSalario() {
		double monto = this.sueldoMensual;
		monto += calcularPremioCumple();
		this.setSalario(monto);
	}

}
