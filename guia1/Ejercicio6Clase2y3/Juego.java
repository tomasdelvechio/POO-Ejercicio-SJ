package Ejercicio6Clase2y3;

public class Juego {
	private Jugador jugador1;
	private Jugador jugador2;
	private Diccionario diccionario = new Diccionario();
	
	public Juego(Jugador jugador1, Jugador jugador2) {
		
		this.setJugador1(jugador1);
		this.setJugador2(jugador2);
		
	}
	
	public String ganador() {
		
		String rta = new String();
		if (this.jugador1.getPuntos() > this.jugador2.getPuntos()) {
			rta = "Gano " + jugador1.getNombre() + " con " + jugador1.getPuntos() + " puntos";
		} else if (this.jugador2.getPuntos() > this.jugador1.getPuntos()) {
			rta = "Gano " + jugador2.getNombre() + " con " + jugador2.getPuntos() + " puntos";
		} 
		
		return rta;
		
	}

	private void setJugador1(Jugador jugador1) {
		
		for (String palabra : jugador1.getListaPalabras()) {
			if (this.diccionario.validarPalabra(palabra) == false) {
				jugador1.getListaPalabras().remove(palabra);
			}
		}
		this.jugador1 = jugador1;
		
	}

	private void setJugador2(Jugador jugador2) {
		
		int indice = 0;
		for (String palabra : jugador2.getListaPalabras()) {
			if (this.diccionario.validarPalabra(palabra) == false) {
				jugador2.getListaPalabras().remove(indice);
			}
			indice++;
		}
		this.jugador2 = jugador2;
		
	}
	
}
