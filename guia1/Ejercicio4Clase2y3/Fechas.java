package Ejercicio4Clase2y3;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Fechas {
	
	
	
	public static LocalDate getFecha(String fecha) {

        LocalDate fechaDada = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy") );
        return fechaDada;

    }

    public static Boolean fechaMayor(String fecha1, String fecha2) {

        return getFecha(fecha1).isAfter(getFecha(fecha2));

    }

    public static Boolean fechaMenor(String fecha1, String fecha2) {

        return getFecha(fecha1).isBefore(getFecha(fecha2));

    }


    public static Boolean entreFechas(String fecha1, String fecha2, String fechaMedio) {

        Boolean respuesta;
        if (fechaMayor(fecha1, fecha2)) {
            if ((fechaMayor(fechaMedio, fecha2) == true) && (fechaMenor(fechaMedio, fecha1) == true)) {
                respuesta = true;
            } else {
                respuesta = false;
            }
        } else {
            if ((fechaMayor(fechaMedio, fecha1) == true) && (fechaMenor(fechaMedio, fecha2) == true)) {
                respuesta = true;
            } else {
                respuesta = false;
            }
        }

        return respuesta;

    }
}
