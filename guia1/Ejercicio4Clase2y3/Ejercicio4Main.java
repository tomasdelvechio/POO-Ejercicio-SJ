package Ejercicio4Clase2y3;

public class Ejercicio4Main {

	public static void main(String[] args) {
        System.out.println(Fechas.getFecha("29-08-2022"));
        if (Fechas.fechaMayor("08-03-2001", "30-01-1999")) {
            System.out.println("El mayor es: " + Fechas.getFecha("30-01-1999"));
        } else {
            System.out.println("El mayor es: " + Fechas.getFecha("08-03-2001"));
        }

        if (Fechas.fechaMenor("08-03-2001", "30-01-1999")) {
            System.out.println("El menor es: " + Fechas.getFecha("30-01-1999"));
        } else {
            System.out.println("El menor es: " + Fechas.getFecha("08-03-2001"));
        }

        if (Fechas.entreFechas("08-03-2001", "30-01-1999", "12-12-2000")) {
            System.out.println("Si esta entre esas fechas");
        } else {
            System.out.println("No esta entre esas fechas");
        }

        if (Fechas.entreFechas("08-03-2001", "30-01-1999", "12-12-2011")) {
            System.out.println("Si esta entre esas fechas");
        } else {
            System.out.println("No esta entre esas fechas");
        }
	}
}
