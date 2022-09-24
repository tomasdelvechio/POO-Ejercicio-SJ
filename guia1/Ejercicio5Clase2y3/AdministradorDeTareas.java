package Ejercicio5Clase2y3;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.LinkedList;

public class AdministradorDeTareas {
	Tarea tarea ;
	LinkedList<Tarea> listaDeTareas = new LinkedList<Tarea>();
	LinkedList<Colaborador> colaboradores = new LinkedList<Colaborador>();
	
	public void crearTarea(String titulo, String descripcion, Prioridad prioridad,String fechaLimite, Estado estado, String recordatorio) {
        tarea = new Tarea(titulo ,descripcion, prioridad, fechaLimite, estado, recordatorio);
        listaDeTareas.add(tarea);
    }
	
	public void marcarTareaRealizada(String titulo) {
		buscarTarea(titulo).setEstado(Estado.COMPLETA);
	}
	
	public Tarea buscarTarea(String titulo) {
		Tarea tareaBusqueda = new Tarea();
		for (int i = 0; i<listaDeTareas.size();i++) {
			tareaBusqueda = listaDeTareas.get(i);
			if(titulo.equals(tareaBusqueda.getTitulo())) {
				break;
			}
		}
		return tareaBusqueda;
	}
	
	public LinkedList<Tarea> getListaDeNoVencidas(){
		LinkedList<Tarea> prioridadAlta = new LinkedList<Tarea>();
		LinkedList<Tarea> prioridadMedia = new LinkedList<Tarea>();
		LinkedList<Tarea> prioridadBaja = new LinkedList<Tarea>();
		obtenerPrioridad(prioridadBaja,prioridadMedia,prioridadAlta);
		ordenarListas(prioridadBaja,prioridadMedia,prioridadAlta);
		return unificarListas(prioridadBaja,prioridadMedia,prioridadAlta);
	}

	private LinkedList<Tarea> unificarListas(LinkedList<Tarea> prioridadBaja, LinkedList<Tarea> prioridadMedia,
			LinkedList<Tarea> prioridadAlta) {
		prioridadAlta.addAll(prioridadMedia);
		prioridadAlta.addAll(prioridadBaja);
		return prioridadAlta;
	}

	private void ordenarListas(LinkedList<Tarea> prioridadBaja, LinkedList<Tarea> prioridadMedia,
			LinkedList<Tarea> prioridadAlta) {
		prioridadBaja.sort(Comparator.comparing(Tarea::getFechaLimite).reversed());
		prioridadMedia.sort(Comparator.comparing(Tarea::getFechaLimite).reversed());
		prioridadAlta.sort(Comparator.comparing(Tarea::getFechaLimite).reversed());
		
	}

	private void obtenerPrioridad(LinkedList<Tarea> prioridadBaja, LinkedList<Tarea> prioridadMedia, LinkedList<Tarea> prioridadAlta) {
		for (int i = 0; i<listaDeTareas.size();i++) {
			if ((listaDeTareas.get(i).estaTerminada() == false) && (listaDeTareas.get(i).estaVencida() == false)) {
				if(Prioridad.ALTA.equals(listaDeTareas.get(i).getPrioridad())) {
					prioridadAlta.add(listaDeTareas.get(i));
				} else if(Prioridad.MEDIA.equals(listaDeTareas.get(i).getPrioridad())) {
					prioridadMedia.add(listaDeTareas.get(i));
				} else if (Prioridad.BAJA.equals(listaDeTareas.get(i).getPrioridad())){
					prioridadBaja.add(listaDeTareas.get(i));
				}
			}
		}
	}
}
