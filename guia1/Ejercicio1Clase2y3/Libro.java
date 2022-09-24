package Ejercicio1Clase2y3;

import java.util.LinkedList;

public class Libro extends LibroRevista{
	
	private int isbn;
	LinkedList<String> autores = new LinkedList<String>();
	
	public Libro(String titulo, String numeroContacto, String editor, int numeroDePaginas, int isbn,LinkedList<String>autores) {
		super(titulo, numeroContacto, editor, numeroDePaginas);
		
	}
	
	public String getDescripcion(String titulo, String autor) {
        return "El libro " + this.getTitulo() + " tiene " + this.getNumeroDePaginas() + " paginas, quedan " + this.cantEjemplaresDisponibles() + " disponibles y se prestaron " + (cantTotalDePrestamos() - cantEjemplaresDisponibles());
    }
	
	public int getIsbn() {
		return isbn;
	}

}
