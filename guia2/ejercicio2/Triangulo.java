package ar.edu.unlu.ejercicio2;

public class Triangulo extends FiguraGeometrica2D {

	private double base;
	private double altura;

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
		this.calcularArea();
	}

	@Override
	protected void calcularArea() {
		this.setArea((this.getBase() * this.getAltura())/2);
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}


}
