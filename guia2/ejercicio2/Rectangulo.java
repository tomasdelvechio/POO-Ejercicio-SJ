package ar.edu.unlu.ejercicio2;

public class Rectangulo extends FiguraGeometrica2D{
	
	private double base;
	private double altura;

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
		this.calcularArea();
	}

	@Override
	protected void calcularArea() {
		this.setArea(this.getBase() * this.getAltura());
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

}
