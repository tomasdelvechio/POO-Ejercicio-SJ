package ar.edu.unlu.ejercicio3;

import java.time.LocalDate;
import java.util.LinkedList;

public class EmpleadoPorComisionConSalarioFijo extends EmpleadoPorComision {

	private double salarioFijo;
	
	public EmpleadoPorComisionConSalarioFijo(String telefono, String cuit, String nombre, String apellido,String cumple, double comision, LinkedList<Venta> ventas, double salario) {
		super(telefono, cuit, nombre, apellido, cumple, comision, ventas);
		this.salarioFijo = salario;
		calcularSalario();
	}
	
	@Override
	protected double calcularPremioCumple() {
		if(LocalDate.now().getMonth().equals(this.getCumple().getMonth())) {
			return (calcularTotalVentas()*0.05)+3000;
		} else return 0;
	}

	@Override
	protected void calcularSalario() {
		double premio = calcularPremioCumple();
		this.setSalario(((this.calcularTotalVentas() * this.getComision())+premio)+this.salarioFijo);
	}

	
	

}
