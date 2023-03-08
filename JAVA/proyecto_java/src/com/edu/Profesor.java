package com.edu;

public class Profesor extends Persona {

	public Profesor(String nombre, String apellido, String dni, int edad, boolean mayorEdad) {
		super(nombre, apellido, dni, edad, mayorEdad);
	}
	
	public void calificar() {
		System.out.printf("El profesor %s %s puede calificar.",
				getNombre(), getApellido());
	}
	
	

}
