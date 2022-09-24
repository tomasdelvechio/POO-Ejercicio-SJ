package ar.edu.unlu.ejercicio3;

import java.time.LocalDate;
import java.util.LinkedList;

public class EmpleadoPorComision extends Empleado {

	private double comision ;
	private LinkedList<Venta> ventas ;
	
	public EmpleadoPorComision(String telefono, String cuit, String nombre, String apellido, String cumple, double comision, LinkedList<Venta>ventas) {
		super(telefono, cuit, nombre, apellido, cumple);
		this.comision = comision;
		this.ventas = ventas;
		calcularSalario();
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public LinkedList<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(LinkedList<Venta> ventas) {
		this.ventas = ventas;
	}

	@Override
	protected double calcularPremioCumple() {
		if(LocalDate.now().getMonth().equals(this.getCumple().getMonth())) {
			return (calcularTotalVentas()*0.05)+2000;
		} else return 0;
	}

	@Override
	protected void calcularSalario() {
		double premio = calcularPremioCumple();
		this.setSalario((this.calcularTotalVentas() * this.getComision())+premio);
	}

	protected double calcularTotalVentas(){
		double montoTotal = 0;
		for(Venta v : ventas) {
			montoTotal += v.getPrecio();
		}
		return montoTotal;
	}
	
	
}
