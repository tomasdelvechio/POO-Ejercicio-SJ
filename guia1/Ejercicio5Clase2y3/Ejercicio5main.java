package Ejercicio5Clase2y3;

import java.util.LinkedList;

public class Ejercicio5main {
	public static void main(String[] args) {
			AdministradorDeTareas adm = new AdministradorDeTareas();  	
				adm.crearTarea("Tarea1", "Hace cosas 1", Prioridad.ALTA, "07-09-2022", Estado.INCOMPLETA, "05-09-2022");
		        adm.crearTarea("Tarea2", "Hace cosas 2", Prioridad.MEDIA, "11-09-2022", Estado.INCOMPLETA, "08-09-2022");
		        adm.crearTarea("Tarea3", "Hace cosas 3", Prioridad.BAJA, "30-10-2022", Estado.INCOMPLETA, "05-09-2022");
		        adm.crearTarea("Tarea4", "Hace cosas 4", Prioridad.BAJA, "13-09-2022", Estado.INCOMPLETA, "10-09-2022");
	
		        LinkedList<Tarea> listaTareas = new LinkedList<Tarea>();
	
		        listaTareas = adm.getListaDeNoVencidas();
	
		        for (Tarea tarea : listaTareas) {
		            System.out.println(tarea.getDescripcion());
		        }
	
		        System.out.println("");
		        System.out.println("");
		        //adm.marcarTareaRealizada("Tarea1");
		        //adm.marcarTareaRealizada("Tarea4");
	
		        for (Tarea tarea : listaTareas) {
		            System.out.println(tarea.getDescripcion() + ", Prioridad: " + tarea.getPrioridad());
		        }
	
	
		        System.out.println("");
		        System.out.println("COLABORADOR");
		        System.out.println("");
		        Colaborador colabo = new Colaborador("Perro", listaTareas);
		        colabo.hacerTareas();
		        for (Tarea tarea : listaTareas) {
		            System.out.println(tarea.getDescripcion() + ", Prioridad: " + tarea.getPrioridad());
		        }
		        System.out.println("");
		        System.out.println("Tareas realizadas");
		        LinkedList<Tarea> listaTareasRealizadas = new LinkedList<Tarea>();
		        listaTareasRealizadas = colabo.getListaTareasRealizadas();
		        for (Tarea tarea : listaTareasRealizadas) {
		            System.out.println(tarea.getDescripcion() + ", Fecha Finalizacion: " + tarea.getFechaFinalizacion());
		        }
	}
}
