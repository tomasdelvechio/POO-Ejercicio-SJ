package ar.edu.unlu.parcialGTA;

public abstract class Propiedad  {

	private double precio;
	
	public Propiedad(double precio) {
		this.precio = precio;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
}
