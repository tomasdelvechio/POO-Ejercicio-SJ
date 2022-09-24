package ar.edu.unlu.ejercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tesis extends Publicacion {
	
	private LocalDate fechaPublicacion;
	
	public Tesis(String titulo, String numeroContacto, String editor, String fechaDePublicacion) {
		super(titulo, numeroContacto, editor);
		this.setFechaPublicacion(this.getFechaPublicacion(fechaDePublicacion));
	}

	public LocalDate getFechaPublicacion(String fechaPublicacion) {
        return LocalDate.parse(fechaPublicacion, DateTimeFormatter.ofPattern("dd-MM-yyyy") );
	}

	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	
	
	
}
