package ar.edu.unlu.ejercicio4;

import java.util.LinkedList;

public class Cliente {
	
	private LinkedList<Alquiler> alquileres = new LinkedList<Alquiler>();
	private int id;

	public Cliente(int id) {
		this.id = id;
	}
	
	public double solicitarPresupuesto(int cantDias, Vehiculo vehiculo) {
		if (vehiculo != null) {
			return vehiculo.calcularPresupuesto(cantDias);
		} else {
			return 0;
		}
	}
	
	public Errores alquilarVehiculo(int cantDias, Vehiculo vehiculo, String fechaInicio, String fechaFin) {
		if (vehiculo != null) {
			Alquiler alquiler = new Alquiler(fechaInicio, fechaFin, vehiculo.getPatente(), this.solicitarPresupuesto(cantDias, vehiculo));
			alquileres.add(alquiler);
			return Errores.OK;
		} else {
			return Errores.ERROR;
		}
	}

	public int getId() {
		return id;
	}
	
	public double montoTotalAlquilados() {
		double total = 0;
		for (Alquiler a : alquileres) {
			total += a.getPresupuesto();
		}
		return total;
	}

}
