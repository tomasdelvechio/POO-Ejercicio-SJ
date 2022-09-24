package Ejercicio9Clase2y3;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.LinkedList;

public class Club {
	private LinkedList<Socio> socios = new LinkedList<Socio>();
	private LinkedList<Actividad> actividadesBasica = new LinkedList<Actividad>();
	private LinkedList<Actividad> actividadesIntermedia = new LinkedList<Actividad>();
	private LinkedList<Actividad> actividadesDestacada = new LinkedList<Actividad>();
	private String nombre;
	
	public Club(String nombre) {
		this.nombre = nombre;
	}

	public void inscribirSocio(String nombre,String apellido,String direccion,String email, TipoSuscripcion tipoSuscripcion) {
		Credencial credencial = new Credencial(tipoSuscripcion);
		Socio socio = new Socio( nombre, apellido, direccion, email,  tipoSuscripcion);
		socio.setCredencial(credencial);
		socio.setFechaInscripcion(LocalDate.now());
		socios.add(socio);
	}
	
	public void generarActividad(String nombre, TipoSuscripcion tipoSuscripcion, String descripcion) {
		Actividad actividad = new Actividad(nombre,tipoSuscripcion,descripcion);
		if(TipoSuscripcion.BASICA.equals(tipoSuscripcion)) {
			actividadesBasica.add(actividad);
		} else if(TipoSuscripcion.INTERMEDIA.equals(tipoSuscripcion)) {
			actividadesIntermedia.add(actividad);
		} else {
			actividadesDestacada.add(actividad);			
		}
	}
	
	 public void liquidarCuota(int numeroCredencial) {
		Socio socio = buscarSocio(numeroCredencial);
		socio.setPago(true);
	}

	private Socio buscarSocio(int numeroCredencial) {
		Socio socioBuscado = null ;
		for (Socio socio : socios) {
			socio.getCredencial();
			if(Credencial.getNumeroCredencial() == numeroCredencial) {
				socioBuscado = socio;
				break;
			}
		}
		return socioBuscado;
	}

	public String getNombre() {
		return nombre;
	}
	
	
	public LinkedList<Socio> reporteMensualSociosNuevos(){
		
		LinkedList<Socio> ultimoMes = new LinkedList<Socio>();
		
		for (Socio socio : socios) {
			if(socio.getFechaInscripcion().getMonth().equals(LocalDate.now().getMonth())) {
				ultimoMes.add(socio);
			}
		}
		
		return ultimoMes;
		
	}
	
	public LinkedList<Actividad> getListadoActividades(){
		LinkedList<Actividad> listadoActividades = new LinkedList<Actividad>();
		listadoActividades.addAll(actividadesBasica);
		listadoActividades.addAll(actividadesIntermedia);
		listadoActividades.addAll(actividadesDestacada);
		return listadoActividades;	
	}
	
	
	
	public LinkedList<Socio> getListaSocios(){
        socios.sort(Comparator.comparing(Socio :: getTipoSuscripcion).reversed());
        return socios;
    }
	
}
