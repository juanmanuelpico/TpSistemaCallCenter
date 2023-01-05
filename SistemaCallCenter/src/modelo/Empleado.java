package modelo;

import java.time.LocalDate;
import java.time.Period;

public class Empleado extends Persona{
	private int sueldoBase;

	public Empleado(int id, String nombre, String apellido, long dni, LocalDate fechaDeAlta, int sueldoBase) {
		super(id, nombre, apellido, dni, fechaDeAlta);
		this.sueldoBase = sueldoBase;
	}

	public int getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	@Override
	public String toString() {
		return "Empleado "+super.toString()+", sueldoBase=" + sueldoBase + "]\n";
	}

	@Override
	public int antiguedadEnAnios() {
		return Period.between(fechaDeAlta, LocalDate.of(2023, 1, 1)).getYears();
	}
	
	
}
