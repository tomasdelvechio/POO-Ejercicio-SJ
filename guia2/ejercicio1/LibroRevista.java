package ar.edu.unlu.ejercicio1;

public abstract class LibroRevista extends Publicacion{
	private int numeroDePaginas;
	private int cantEjemplaresDisponibles;
	private int cantTotalDePrestamos;
	
	public LibroRevista(String titulo, String numeroContacto, String editor,int numeroDePaginas) {
		super(titulo, numeroContacto, editor);
		this.numeroDePaginas = numeroDePaginas;
	}
	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}
	
	public Errores prestar() {
		if (this.cantEjemplaresDisponibles> 1) {
			this.cantEjemplaresDisponibles --;
			this.cantTotalDePrestamos++;
			return Errores.OK;
		} else {
			return Errores.ERROR;
		}
	}
	
	public Errores devolverPrestamo() {
		this.cantEjemplaresDisponibles ++;
		return Errores.OK;
	}
	
	public int cantEjemplaresDisponibles() {
		return cantEjemplaresDisponibles;
	}



	public int cantTotalDePrestamos() {
		return cantTotalDePrestamos;
	}
	
}
