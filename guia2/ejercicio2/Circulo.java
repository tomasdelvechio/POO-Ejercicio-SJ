package ar.edu.unlu.ejercicio2;

public class Circulo  extends FiguraGeometrica2D{

	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
		this.calcularArea();
	}


	public double getRadio() {
		return radio;
	}

	@Override
	protected void calcularArea() {
		setArea(Math.PI * this.getRadio()*2);
	}





}
