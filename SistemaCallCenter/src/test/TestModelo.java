package test;

import java.time.LocalDate;
import java.time.LocalTime;

import modelo.SistemaCallCenter;
import modelo.Cliente;
import modelo.Empleado;

public class TestModelo {

	public static void main(String[] args) {
		SistemaCallCenter sistema = new SistemaCallCenter();
		
		System.out.println("\n -------- TEST 1 --------\n");
		
		try {
			sistema.agregarCliente("Luis", "Perez", 11111111, LocalDate.of(2020, 1, 1), true);
			sistema.agregarCliente("Lucas", "Pereyra", 22222222, LocalDate.of(2020, 2, 1), false);
			sistema.agregarEmpleado("Pedro", "Gomez", 33333333, LocalDate.of(2020, 2, 11), 10000);
			sistema.agregarEmpleado("Pablo", "Lopez", 44444444, LocalDate.of(2020, 3, 15), 9000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println(sistema.getLstPersona());
	
		System.out.println("\n -------- TEST 2 --------\n");
		
		try {
			sistema.agregarLlamada(LocalDate.of(2022, 11, 16), LocalTime.of(10, 10), ((Cliente)sistema.traerPersona(11111111)), ((Empleado)sistema.traerPersona(33333333)), 5);
		    sistema.agregarLlamada(LocalDate.of(2022, 11, 07), LocalTime.of(10, 10), ((Cliente)sistema.traerPersona(11111111)), ((Empleado)sistema.traerPersona(33333333)), 5);
		    sistema.agregarLlamada(LocalDate.of(2022, 11, 07), LocalTime.of(10, 15), ((Cliente)sistema.traerPersona(22222222)), ((Empleado)sistema.traerPersona(33333333)), 5);
		    sistema.agregarLlamada(LocalDate.of(2022, 11, 07), LocalTime.of(10, 20), ((Cliente)sistema.traerPersona(11111111)), ((Empleado)sistema.traerPersona(44444444)), 3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println(sistema.getLstLlamada());
		
		System.out.println("\n -------- TEST 3 --------\n");
		
		System.out.println(sistema.traerClientes(true));
		
		System.out.println("\n -------- TEST 4 --------\n");
		
		System.out.println(sistema.traerPersonasAntiguedad(2));		
		
		System.out.println("\n -------- TEST 5 --------\n");
		
		System.out.println(sistema.traerLlamadas(LocalDate.of(2022, 11, 7), LocalTime.of(10, 10) , LocalTime.of(10, 18)));
		
		
		System.out.println("\n -------- TEST 6 --------\n");
		try {
			sistema.agregarCliente("Marcos", "Rios", 22222222, LocalDate.of(2020, 2, 1), true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println("\n -------- TEST 7 --------\n");
		try {
			sistema.agregarEmpleado("Miguel", "Martinez", 44444444, LocalDate.of(2020, 2, 1), 9500);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println("\n -------- TEST 8 --------\n");
		try {
			sistema.agregarLlamada(LocalDate.of(2022, 11, 07), LocalTime.of(10, 30), ((Cliente)sistema.traerPersona(11111111)), ((Empleado)sistema.traerPersona(33333333)), 7);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}

}
