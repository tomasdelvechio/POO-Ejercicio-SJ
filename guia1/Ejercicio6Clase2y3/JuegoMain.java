package Ejercicio6Clase2y3;

import java.util.LinkedList;

public class JuegoMain {

	public static void main(String[] args) {
		LinkedList <String> lj1 = new LinkedList<String>();
		LinkedList <String> lj2 = new LinkedList<String>();
		
		lj1.add("saxo");
		lj1.add("zorro");
		lj1.add("oso");
		
		lj2.add("saxo");
		lj2.add("oso");
		lj2.add("pelota");
		lj2.add("pelota");
		
		Jugador j1 = new Jugador("Seba", lj1);
		
		Jugador j2 = new Jugador("Matias", lj2);
		
		Juego juego = new Juego(j1, j2);
		
		System.out.println(juego.ganador());

		System.out.println(j1.getListaPalabras().toString());

		System.out.println(j2.getListaPalabras().toString());
	}

}
