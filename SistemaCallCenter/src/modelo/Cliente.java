package modelo;

import java.time.LocalDate;
import java.time.Period; 

public class Cliente extends Persona{
	private boolean activo;

	public Cliente(int id, String nombre, String apellido, long dni, LocalDate fechaDeAlta, boolean activo) {
		super(id, nombre, apellido, dni, fechaDeAlta);
		this.activo = activo;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Cliente "+  super.toString()+", activo=" + activo + "]\n";
	}

	@Override
	public int antiguedadEnAnios() {
		int retorno = 0;
		if(activo)
			retorno = Period.between(fechaDeAlta, LocalDate.of(2022, 12, 2)).getYears();
	
		return retorno;
	}
	
	
	

}
