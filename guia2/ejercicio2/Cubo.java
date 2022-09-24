package ar.edu.unlu.ejercicio2;

public class Cubo extends FiguraGeometrica3D {

	private double arista;
	
	public Cubo(double arista) {
		this.arista = arista;
		this.calcularArea();
		this.calcularVolumen();
	}


	@Override
	protected void calcularArea() {
		this.setArea(6 * Math.pow(arista, 2));
	}



	@Override
	protected void calcularVolumen() {
		this.setVolumen(Math.pow(arista, 3));
	}

}
