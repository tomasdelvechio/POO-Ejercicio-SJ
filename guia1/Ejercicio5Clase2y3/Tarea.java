package Ejercicio5Clase2y3;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Tarea {
	private String titulo;
	// Una tarea es una descripción
	private String descripcion;
	// que además contiene una prioridad y un estado
	private Prioridad prioridad;
	private Estado estado;
	// puede tener una fecha límite
	private LocalDate fechaLimite;
	private LocalDate recordatorio;
	private LocalDate fechaFinalizacion;
	
	
//  Además, una tarea puede tener una fecha límite
	public Tarea(String titulo, String descripcion, Prioridad prioridad, String fechaLimite, Estado estado, String fechaRecordatorio) {

        this.titulo = titulo;
        this.descripcion = descripcion;
        this.setPrioridad(prioridad);
        this.setFechaLimite(fechaLimite);
        this.estado = estado;
        this.setFechaRecordatorio(fechaRecordatorio);

    }
//---------------------------------------------------

public Tarea() {
		// TODO Auto-generated constructor stub
	}

	// Si la tarea sobrepasa esta fecha y su estado es incompleta, vamos a decir que la tarea esta vencida.
// A una tarea queremos poder preguntarle si se encuentra vencida o no,
	public Boolean estaVencida() {
		Boolean vencida = false;
		LocalDate hoy = LocalDate.now();
		if (this.fechaLimite.isBefore(hoy) && !estaTerminada()) {
			vencida = true;
		}
		return vencida;
	}
//---------------------------------------------------

// A una tarea, le podemos modificar su descripción
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Prioridad getPrioridad() {
		return prioridad;
	}

//--------------------------------------------------
	
// cambiarle la prioridad
	public void setPrioridad(Prioridad prioridad) {
		this.prioridad= prioridad;
	}
//--------------------------------------------------
	

// avisar que esta terminada
// como así también le podemos consultar si está completa o no.
	public Boolean estaTerminada(){
		Boolean terminada = false;
		if (this.estado == Estado.COMPLETA) {
			terminada = true;
		}
		return terminada;
	}
//-------------------------------------------------
	
// Además, podemos querer mostrar la tarea, en cuyo caso muestra la descripción. 
	public String getDescripcion() {
		String s = this.descripcion;
		//Pero, si la tarea está terminada, el mensaje debería iniciar con el string "(Vencida)...".
		if (estaTerminada() || estaVencida()){
			s = "Vencida, " + this.descripcion;
		} else {
			this.setPrioridad(Prioridad.ALTA);
			s = "Por vencer, " + this.descripcion;
		}
		//si esa fecha de recordatorio es mayor o igual a la fecha actual entonces las tareas se van a 
		//imprimir con el prefijo “(por vencer)”
		return s;
	}
	
	/*private boolean porvencer() {
		Boolean vencida = false;
		if ((recordatorio.isAfter(this.fechaLimite)) || (recordatorio.equals(this.fechaLimite) == true)) {
			vencida = true;
		}
		return vencida;
	}*/

// Ahora se les puede establecer una fecha de recordatorio a las tareas
	public LocalDate getRecordatorio() {
		return recordatorio;
	}

	public void setRecordatorio(LocalDate recordatorio) {
		this.recordatorio = recordatorio;
	}

	public String getTitulo() {
		return this.titulo;
	}
	public LocalDate getFechaLimite() {
		return this.fechaLimite;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public LocalDate getFechaFinalizacion() {
		return this.fechaFinalizacion;
	}

	public void setFechaFinalizacion(LocalDate fechaDeFinalizacion) {
		this.fechaFinalizacion = fechaDeFinalizacion;
	}
	private void setFechaRecordatorio(String fechaRecordatorio) {

        this.recordatorio = LocalDate.parse(fechaRecordatorio, DateTimeFormatter.ofPattern("dd-MM-yyyy") );

    }

    private void setFechaLimite(String fechaLimite2) {

        this.fechaLimite = LocalDate.parse(fechaLimite2, DateTimeFormatter.ofPattern("dd-MM-yyyy") );

    }
}



