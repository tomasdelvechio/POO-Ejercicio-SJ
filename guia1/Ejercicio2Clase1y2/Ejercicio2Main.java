package Ejercicio2Clase1y2;

public class Ejercicio2Main {

	public static void main(String[] args) {
		
        EcuacionCuadratica funcion = new EcuacionCuadratica(1, 0, 0);
        String raices = new String();
        raices = funcion.getRaices();

        if (raices != null) {
            System.out.println("Las raices son: " + raices);
        } else {
            System.out.println("La funcion no tiene raices");
        }

        System.out.println("El valor de y es: " + funcion.calcularY(4));

	}
}
