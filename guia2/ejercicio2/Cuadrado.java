package ar.edu.unlu.ejercicio2;

public class Cuadrado extends FiguraGeometrica2D {

	private double lado;

	public Cuadrado(double lado) {
		this.lado = lado;
		this.calcularArea();
	}

	@Override
	protected void calcularArea() {
		this.setArea(this.getLado() * this.getLado());
	}

	public double getLado() {
		return this.lado;
	}

}
