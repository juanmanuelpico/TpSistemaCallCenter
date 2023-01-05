package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Llamada {
	private int idLlamada;
	private LocalDate fecha;
	private LocalTime hora;
	private Cliente cliente;
	private Empleado empleado;
	private int nivelDeSatisfaccion;
	
	public Llamada(int idLlamada, LocalDate fecha, LocalTime hora, Cliente cliente, Empleado empleado,
			int nivelDeSatisfaccion) throws Exception {
		this.idLlamada = idLlamada;
		this.fecha = fecha;
		this.hora = hora;
		this.cliente = cliente;
		this.empleado = empleado;
		setNivelDeSatisfaccion(nivelDeSatisfaccion);
	}

	public int getIdLlamada() {
		return idLlamada;
	}


	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	} 

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public int getNivelDeSatisfaccion() {
		return nivelDeSatisfaccion;
	}

	public void setNivelDeSatisfaccion(int nivelDeSatisfaccion) throws Exception {
		if(!esNivelDeSatisfaccionValido(nivelDeSatisfaccion))
			throw new Exception("Error: nivel de satisfaccion invalido");
		this.nivelDeSatisfaccion = nivelDeSatisfaccion;
	}

	@Override
	public String toString() {
		return "\n\nLlamada [idLlamada=" + idLlamada + ", fecha=" + fecha + ", hora=" + hora + ", cliente=" + cliente
				+ ", empleado=" + empleado + ", nivelDeSatisfaccion=" + nivelDeSatisfaccion + "]";
	}


	public boolean esNivelDeSatisfaccionValido(int nivelDeSatisfaccion) {
		return (nivelDeSatisfaccion > 0 ) && (nivelDeSatisfaccion < 6);
	}
	
	
	
	

}
