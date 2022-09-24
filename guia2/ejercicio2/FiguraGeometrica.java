package ar.edu.unlu.ejercicio2;

public abstract class FiguraGeometrica {
	
	private double area;
	
	protected abstract void calcularArea();
	
	public double getArea() {
		return this.area;
	}
	
	protected void setArea(double area) {
		this.area = area;
	}
	
}
