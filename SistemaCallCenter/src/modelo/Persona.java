package modelo;

import java.time.LocalDate;

public abstract class Persona {
	protected int id;
	protected String nombre;
	protected String apellido;
	protected long dni;
	protected LocalDate fechaDeAlta;
	
	public Persona(int id, String nombre, String apellido, long dni, LocalDate fechaDeAlta) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaDeAlta = fechaDeAlta;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public LocalDate getFechaDeAlta() {
		return fechaDeAlta;
	}

	public void setFechaDeAlta(LocalDate fechaDeAlta) {
		this.fechaDeAlta = fechaDeAlta;
	} 

	@Override
	public String toString() {
		
		return "[id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", fechaDeAlta="
				+ fechaDeAlta ;
	}
	
	public abstract int antiguedadEnAnios();

}
