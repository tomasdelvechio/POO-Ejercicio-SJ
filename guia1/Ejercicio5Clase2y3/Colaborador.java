package Ejercicio5Clase2y3;

import java.time.LocalDate;
import java.util.LinkedList;

public class Colaborador {
	String nombre;
	private LinkedList<Tarea> listaTareasRealizadas = new LinkedList<Tarea>();
	private LinkedList<Tarea> listaTareasARealizar;
	private AdministradorDeTareas adm = new AdministradorDeTareas();
	
	
	public Colaborador(String nombre , LinkedList<Tarea> listaTareasARealizar ) {
		this.nombre = nombre;
		this.listaTareasARealizar = listaTareasARealizar;
	}
	
	public void hacerTareas() {
        for (Tarea tarea : listaTareasARealizar) {
            adm.marcarTareaRealizada(tarea.getTitulo());
            listaTareasRealizadas.add(tarea);
            tarea.setFechaFinalizacion(LocalDate.now());
        }

    }
	

	public LinkedList<Tarea> getListaTareasRealizadas() {
        return this.listaTareasRealizadas;
    }

	
	
}
