package ar.edu.unlu.ejercicio1;

public class Revista extends LibroRevista {

	private String autor;
	private String issn;
	
	public Revista(String titulo, String numeroContacto, String editor, int numeroDePaginas, String autor,String issn) {
		super(titulo, numeroContacto, editor, numeroDePaginas);
		this.setAutor(autor);
		this.setIssn(issn);
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIssn() {
		return issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}
	
	public String getDescripcion(String titulo, String autor) {
        return "El libro " + this.getTitulo() + " tiene " + this.getNumeroDePaginas() + " paginas, quedan " + this.cantEjemplaresDisponibles() + " disponibles y se prestaron " + (cantTotalDePrestamos() - cantEjemplaresDisponibles());
    }
	
}
