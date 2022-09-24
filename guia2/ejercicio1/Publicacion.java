package ar.edu.unlu.ejercicio1;

public class Publicacion {
	
	private String titulo;
	private String numeroContacto;
	private String editor;
	private boolean prestado;
	
	public Publicacion(String titulo,String numeroContacto,String editor){
		this.titulo= titulo;
		this.numeroContacto = numeroContacto;
		this.editor = editor;
		this.prestado = false;
	}

	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNumeroContacto() {
		return numeroContacto;
	}

	public void setNumeroContacto(String numeroContacto) {
		this.numeroContacto = numeroContacto;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}
	
	public Errores prestar() {
		if (!this.prestado) {
			this.prestado = true;
			return Errores.OK;
		}else return Errores.ERROR;
	}
	
	public Errores devolverPrestamo() {
		if(this.prestado) {
			this.prestado = false;
			return Errores.OK;
		} else return Errores.ERROR;
	}
	
}
