package ar.edu.unlu.parcialGTA;

import java.util.LinkedList;

public abstract class Ciudadano {
	
	private double efectivo;
	LinkedList<Propiedad> propiedades = new LinkedList<Propiedad>();
	
	public Ciudadano() {
		this.efectivo = 0;
	}

	protected double pagar(double monto){
		this.efectivo -= monto;
		return monto;
	}
	
	protected void cobrarDinero(double monto) {
		this.efectivo += monto;
	}
	
	public double getEfectivo() {
		return this.efectivo;
	}
	
	protected LinkedList<Propiedad> getPropiedades(){
		return this.propiedades;
	}
	
	protected void agregarPropiedad(Propiedad propiedad) {
		propiedades.add(propiedad);
	}
	
	protected  abstract double calcularCapital();
	
	
	
}
