package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class SistemaCallCenter {
	private List<Persona> lstPersona;
	private List<Llamada> lstLlamada;
	
	public SistemaCallCenter() {
		this.lstPersona = new ArrayList<Persona>();
		this.lstLlamada =  new ArrayList<Llamada>();
	}

	public List<Persona> getLstPersona() {
		return lstPersona;
	}

	public List<Llamada> getLstLlamada() {
		return lstLlamada;
	}
	
//	CU 1
	public Persona traerPersona(long dni) {
		Persona persona = null;
		int i = 0;
		while(persona == null && i < lstPersona.size()) {
			if(lstPersona.get(i).getDni() == dni) {
				persona = lstPersona.get(i);
			}
			i++;
		}
		return persona;
	}
	
	public int calcularIdPersona() {
		int id = 1;
		if(!lstPersona.isEmpty()) {
			id = lstPersona.get(lstPersona.size()-1).getId() + 1;
		}
		return id;
	}
//	CU 2
	
	public boolean agregarCliente( String nombre, String apellido, long dni, LocalDate fechaDeAlta, boolean activo) throws Exception {
		if(traerPersona(dni) != null)
			throw new Exception("Error: ya existe una persona con el numero dni "+ dni);
		return lstPersona.add(new Cliente(calcularIdPersona(), nombre, apellido, dni, fechaDeAlta, activo));
	}
//	CU 3
	public boolean agregarEmpleado(  String nombre, String apellido, long dni, LocalDate fechaDeAlta, int sueldoBase) throws Exception {
		if(traerPersona(dni) != null)
			throw new Exception("Error: ya existe una persona con el numero dni "+ dni);
		return lstPersona.add(new Empleado(calcularIdPersona(), nombre, apellido, dni, fechaDeAlta, sueldoBase));
	}
	
	public int calcularIdLlamada() {
		int id = 1;
		if(!lstLlamada.isEmpty()) {
			id = lstLlamada.get(lstLlamada.size()-1).getIdLlamada() + 1;
		}
		return id;
	}
	
//	CU 5
	public boolean agregarLlamada(LocalDate fecha, LocalTime hora, Cliente cliente, Empleado empleado,
			int nivelDeSatisfaccion) throws Exception {
		return lstLlamada.add(new Llamada(calcularIdLlamada(), fecha, hora, cliente, empleado, nivelDeSatisfaccion));
	}
	
//	CU 6
	
	public List<Cliente> traerClientes(boolean estadoCliente){
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		for(Persona persona : lstPersona) {
			if(persona instanceof Cliente) {
				Cliente cliente = (Cliente)persona;
				if(cliente.isActivo() == estadoCliente)
					clientes.add(cliente);
			}
		}
		return clientes;
	}
//	CU 8
	
	public List<Persona> traerPersonasAntiguedad(int mayorIgual){
		List<Persona> personas = new ArrayList<Persona>();
		for(Persona persona : lstPersona) {
			if(persona.antiguedadEnAnios() >= mayorIgual) {
				personas.add(persona);
			}
		}
		
		return personas;
	}
	
//	CU 9
	
	public List<Llamada> traerLlamadas(LocalDate fecha, LocalTime horaDesde, LocalTime horaHasta){
		List<Llamada> llamadas = new ArrayList<Llamada>();
		for(Llamada llamada : lstLlamada) {
			if(llamada.getFecha().equals(fecha) && ((llamada.getHora().equals(horaDesde) || 
					llamada.getHora().equals(horaHasta) || (llamada.getHora().isBefore(horaHasta) && llamada.getHora().isAfter(horaDesde))))) {
				llamadas.add(llamada);
			}
		}
		return llamadas;
	}
	
	
	 
	
	
	
	
	
	
	
}
