package Ejercicio6Clase2y3;

import java.util.LinkedList;

public class Jugador {
	private LinkedList<String> listaPalabras = new LinkedList<String>();
	private int puntos;
	private String nombre;
	private Palabra p = new Palabra();

	public Jugador(String nombre, LinkedList<String> listaPalabras) {
		
		this.listaPalabras = listaPalabras;
		this.nombre = nombre;
		this.setPuntos();
		
	}
	
	public LinkedList<String> getListaPalabras() {
		return listaPalabras;
	}

	private int calcularPuntajeTotal() {
		
		int puntaje = 0;
		for (String palabra :listaPalabras) {
			puntaje += p.calcularPuntaje(palabra);
		}
		
		return puntaje;
		
	}

	public int getPuntos() {
		return puntos;
	}

	private void setPuntos() {
		
		int p = calcularPuntajeTotal();
		this.puntos = p;
	}

	public String getNombre() {
		return nombre;
	}
}
