package Ejercicio6Clase2y3;

public class Palabra {
private char letrasBonus[] = {'k','z','x','y','w','q'};
	
	public int buscarLetra(String palabra) {
		
		int contador = 0;
		for (char letra: palabra.toCharArray ()) {
			for (char letra2: letrasBonus) {
				if (letra == letra2) {
					contador ++;
				}
			}
		}
		return contador;
		
	}
	
	public int calcularPuntaje(String palabra) {
		String p = palabra;
		int valor = palabra.length();
		valor = valor + buscarLetra(p);
		return valor;
		
	}
}
