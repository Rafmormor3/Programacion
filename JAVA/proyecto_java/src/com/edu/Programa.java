package com.edu;

import com.edu.Persona;

public class Programa {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Rafa", "Morales", "48120019V", 20, true);
		
		System.out.println(p1);
		p1.setApellido("Morales Moreno");
		p1.setNombre("Rafael");
		p1.saludar();
		
		Estudiante est1 = new Estudiante(p1.getNombre(), p1.getApellido(), "48120019V", 20, true, "DAW",1);
		System.out.println();
		System.out.println("\n"+est1);
		est1.hacerExamen();
		
		Profesor pf1 = new Profesor("Antonio","Sanchez","12345678B", 40,true);
		System.out.println();
		System.out.println("\n"+pf1);
		pf1.calificar();
		
		Ordenanza ord1 = new Ordenanza("Manoli","Cobo", null, 0, false, "Modulo 2");
		System.out.println();
		System.out.println("\n"+ord1);
		ord1.gestionarModulo();
		
		Director d1 = new Director("Manuel", "Gomez", null, 0, false,"1234A");
		System.out.println();
		System.out.println("\n"+d1);
		d1.dirigirCentro();
	}

}
