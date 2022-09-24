package Ejercicio2Clase1y2;

public class EcuacionCuadratica {
	private double a;
	private double b;
	private double c;
	
	public EcuacionCuadratica (double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}
	
	private double getDiscriminante() {
		double discriminante = 0;
		discriminante = (Math.pow(this.getB(), 2)) - 4 * this.getA() * this.getC();
		return discriminante; 
	}
	
	public String getRaices() {

        String rta = new String();
        if (this.getDiscriminante() == 0) {
            rta = Double.toString((- this.getB() + (Math.sqrt(this.getDiscriminante()))) / (2 * this.getA()));
        } else  if (this.getDiscriminante() > 0) {
            rta = Double.toString((- this.getB() + (Math.sqrt(this.getDiscriminante()))) / (2 * this.getA()));
            rta = rta + " y " + Double.toString((- this.getB() - (Math.sqrt(this.getDiscriminante()))) / (2 * this.getA()));
        } else {
            rta = null;
        }

        return rta;

    }
	
	public double calcularY(double x) {
		double y = Math.pow(x, 2) * this.getA() + x * this.getB() + this.getC();;
		return y;
	}
	
}	
