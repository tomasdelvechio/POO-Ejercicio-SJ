package Ejercicio10Clase2y3;

public class Compra {

	private double precioOriginal;
	private double precioCompra;
	
	public Compra(double precioOriginal) {
		
		this.precioOriginal = precioOriginal * 1.005;
		this.setPrecioCompra(precioOriginal);
		
	}
	
	public void setPrecioCompra(double precioOriginal) {
		this.precioCompra = precioOriginal;
	}
	
	public double getPrecioCompra() {
		return precioOriginal;
	}

	public double getPrecioOriginal() {
		return precioOriginal;
	}
	
	

}