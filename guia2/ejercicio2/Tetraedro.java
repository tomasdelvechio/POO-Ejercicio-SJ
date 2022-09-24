package ar.edu.unlu.ejercicio2;

public class Tetraedro extends FiguraGeometrica3D {

	private double arista;
	
	public Tetraedro(double arista) {
		this.arista = arista;
		this.calcularArea();
		this.calcularVolumen();
	}


	@Override
	protected void calcularArea() {
		this.setArea(Math.pow(arista, 2)*Math.sqrt(3));
	}



	@Override
	protected void calcularVolumen() {
		this.setVolumen((Math.pow(arista, 3)*(Math.sqrt(2)))/12);
	}


}
