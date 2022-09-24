package ar.edu.unlu.ejercicio3;

import java.time.LocalDate;

public class EmpleadoPorHora extends Empleado {

	private double salarioPorHora;
	private int horasMensualesEstipuladas;
	
	public EmpleadoPorHora(String telefono, String cuit, String nombre, String apellido, String cumple, double salarioPorHora, int HorasMensaualesEstipuladas) {
		super(telefono, cuit, nombre, apellido, cumple);
		this.horasMensualesEstipuladas = HorasMensaualesEstipuladas;
		this.salarioPorHora = salarioPorHora;
		calcularSalario();
	}

	public double getSalarioPorHora() {
		return salarioPorHora;
	}

	public int getHorasMensualesEstipuladas() {
		return horasMensualesEstipuladas;
	}

	@Override
	protected double calcularPremioCumple() {
		if(LocalDate.now().getMonth().equals(this.getCumple().getMonth())) {
			return 2000;
		} else return 0;
	}

	@Override
	protected void calcularSalario() {
		double premio = calcularPremioCumple();
		double salario = this.getSalarioPorHora() *  this.getHorasMensualesEstipuladas();
		if(this.getHorasMensualesEstipuladas() > 40) {
			this.setSalario((salario*1.2)+premio);
		} else this.setSalario(salario+premio);
	}
	
}
