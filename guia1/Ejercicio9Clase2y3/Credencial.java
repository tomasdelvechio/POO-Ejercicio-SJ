package Ejercicio9Clase2y3;

public class Credencial {
	static private int numeroCredencial;
	private TipoSuscripcion tipoSuscripcion;
	
	public Credencial(TipoSuscripcion tipoSuscripcion ) {
		numeroCredencial ++;
		this.tipoSuscripcion = tipoSuscripcion;
	}

	public static int getNumeroCredencial() {
		return numeroCredencial;
	}

	public static void setNumeroCredencial(int numeroCredencial) {
		Credencial.numeroCredencial = numeroCredencial;
	}

	public TipoSuscripcion getTipoSuscripcion() {
		return tipoSuscripcion;
	}

	public void setTipoSuscripcion(TipoSuscripcion tipoSuscripcion) {
		this.tipoSuscripcion = tipoSuscripcion;
	}
}
