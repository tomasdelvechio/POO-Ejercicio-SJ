package ar.edu.unlu.ejercicio2;

public abstract class FiguraGeometrica3D extends FiguraGeometrica {
	
	private double volumen;
	
	protected abstract void calcularArea();
	protected abstract void calcularVolumen();
	
	
	public double getVolumen() {
		return this.volumen;
	}
	
	protected void setVolumen(double volumen) {
		this.volumen = volumen;
	}

}
