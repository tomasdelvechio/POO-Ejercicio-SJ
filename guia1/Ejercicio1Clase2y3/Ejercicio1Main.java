package Ejercicio1Clase2y3;

import ar.edu.unlu.ejercicio1.Libro;

public class Ejercicio1Main {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro("SpiderMan", "J.K", 1, 1, 100,100);
		Libro libro2 = new Libro("Señor De Los Anillos", "J", 2, 10, 120,100);
		
		System.out.println(libro1.getDescripcion());
		System.out.println(libro1.prestarLibro());
		System.out.println(libro2.getDescripcion());
		System.out.println(libro2.prestarLibro());
		System.out.println(libro2.getDescripcion());
		masPaginas(libro1,libro2);
	}
	
	public static void masPaginas(Libro libro1,Libro libro2) {
		if (libro1.getNumeroDePaginas() > libro2.getNumeroDePaginas()) {
			System.out.println(libro1.getTitulo()+ " tiene mas paginas que "+libro2.getTitulo());
		} else if(libro2.getNumeroDePaginas() > libro1.getNumeroDePaginas()) {
			System.out.println(libro2.getTitulo()+ " tiene mas paginas que "+libro1.getTitulo());
		} else {
			System.out.println(libro1.getTitulo()+" y "+libro2.getTitulo() + " tienen las misma cantidad de pagina");
		}
	}

}
