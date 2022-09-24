package Ejercicio9Clase2y3;

public class Actividad {
	private String nombre;
	private TipoSuscripcion tipoSuscripcion;
	private String descripcion;
	
	public Actividad(String nombre, TipoSuscripcion tipoSuscripcion, String descripcion) {
		super();
		this.nombre = nombre;
		this.tipoSuscripcion = tipoSuscripcion;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoSuscripcion getTipoSuscripcion() {
		return tipoSuscripcion;
	}

	public void setTipoSuscripcion(TipoSuscripcion tipoSuscripcion) {
		this.tipoSuscripcion = tipoSuscripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
}
