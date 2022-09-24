package Ejercicio6Clase2y3;;

public class Diccionario {
	private String palabrasDisponibles[] = {"oso", "zorro", "saxo"};

	public Boolean validarPalabra(String palabra) {
		
		Boolean rta = false;
		for (String palabrasAptas : palabrasDisponibles) {
			if (palabra.equals(palabrasAptas) == true) {
				rta = true;
			}
		}
		return rta;
		
	}
}
