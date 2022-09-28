package ar.edu.unlu.ejercicio4;

import java.time.LocalDate;
import java.util.LinkedList;

public class Agencia {
	
	private LinkedList<Vehiculo> autosAlquilados = new LinkedList<Vehiculo>();
	private LinkedList<Vehiculo> autosDisponibles = new LinkedList<Vehiculo>();

	public Agencia() {
	}
	
	public Vehiculo getAuto(String patente) {
		for (Vehiculo v : autosDisponibles) {
			if (patente == v.getPatente()) {
				return v;
			}
		}
		return null;
	}
	
	public Errores registrarVehiculo(Vehiculo vehiculo) {
		boolean flag = false;
		for (Vehiculo v : autosDisponibles) {
			if (vehiculo.getPatente() == v.getPatente()) {
				flag = true;
			}
		}
		if (flag == false) {
			autosDisponibles.add(vehiculo);
			return Errores.OK;
		} else {
			return Errores.PATENTE_REPETIDA;
		}
	}
	
	
	public Vehiculo registrarAlquiler(String patente) {
		
		Vehiculo vehiculo = this.getAuto(patente);
		if (autosDisponibles.remove(vehiculo) != false) {
			autosAlquilados.add(vehiculo);
			return vehiculo;
		}
		return null;
	}
	
	public double solicitarPresupuesto(int cantDias, Vehiculo vehiculo) {
		if (vehiculo != null) {
			return vehiculo.calcularPresupuesto(cantDias);
		} else {
			return 0;
		}
	}

}
