package ar.edu.unlu.ejercicio3;

public class Pasante extends Empleado {

	public Pasante(String telefono, String cuit, String nombre, String apellido, String cumple) {
		super(telefono, cuit, nombre, apellido, cumple);
	}
	protected double calcularPremioCumple() {
		return 0;
	}
	protected void calcularSalario() {
		this.setSalario(0);
	}
	
}
