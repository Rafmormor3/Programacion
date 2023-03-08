package com.edu;

public class Director extends Profesor {
	
	private String codigoDireccion;

	public Director(String nombre, String apellido, String dni, int edad, boolean mayorEdad) {
		super(nombre, apellido, dni, edad, mayorEdad);
	}
	
	public Director(String nombre, String apellido, String dni, int edad, boolean mayorEdad, String codigoDireccion) {
		this(nombre, apellido, dni, edad, mayorEdad);
		this.codigoDireccion=codigoDireccion;
	}
	
	public void dirigirCentro() {
		System.out.printf("El profesor %s %s dirige la dirección con codigo %s",
				getNombre(), getApellido(), codigoDireccion);
	}
	
	//getters & setters

	public String getCodigoDireccion() {
		return codigoDireccion;
	}

	public void setCodigoDireccion(String codigoDireccion) {
		this.codigoDireccion = codigoDireccion;
	}
	
	

}
