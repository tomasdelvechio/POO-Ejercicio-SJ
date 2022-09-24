package ar.edu.unlu.ejercicio2;

public class Esfera extends FiguraGeometrica3D{

	private double radio;
	
	public Esfera(double radio) {
		this.radio = radio;
		this.calcularArea();
		this.calcularVolumen();
	}


	public double getRadio() {
		return radio;
	}

	@Override
	protected void calcularArea() {
		setArea(4*Math.PI * Math.pow(this.getRadio(), 2));
	}



	@Override
	protected void calcularVolumen() {
		this.setVolumen((4/3)*Math.PI * Math.pow(this.getRadio(), 3));
	}

}
