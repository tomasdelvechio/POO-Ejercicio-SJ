package ar.edu.unlu.ejercicio2;

public class Paralelopipedo extends FiguraGeometrica3D{

	private double arista1;
	private double arista2;
	private double arista3;
	
	public Paralelopipedo(double arista1, double arista2, double arista3) {
		this.arista1 = arista1;
		this.arista2 = arista2;
		this.arista3 = arista3;
		this.calcularArea();
		this.calcularVolumen();
	}


	@Override
	protected void calcularArea() {
		setArea(2 * (arista1 * arista2 + arista1 * arista3 + arista2* arista3));
	}



	@Override
	protected void calcularVolumen() {
		this.setVolumen(arista1 * arista2 * arista3);
	}

}
