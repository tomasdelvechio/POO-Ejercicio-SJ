package ar.edu.unlu.ejercicio3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Empleado {
	private String telefono;
	private String cuit;
	private String nombre;
	private String apellido;
	private LocalDate cumple;
	private double salario;
	
	public Empleado(String telefono, String cuit, String nombre, String apellido, String cumple) {
		this.telefono = telefono;
		this.cuit = cuit;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cumple =  LocalDate.parse(cumple, DateTimeFormatter.ofPattern("dd-MM-yyyy") );
	}

	protected abstract double calcularPremioCumple();
	protected abstract void calcularSalario();
	protected String getTelefono() {
		return telefono;
	}

	public String getCuit() {
		return cuit;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public LocalDate getCumple() {
		return cumple;
	}

	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	

	
	
}
