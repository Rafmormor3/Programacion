package com.edu;

public class Ordenanza extends Persona {

	private String zonaAsignada;
	
	public Ordenanza(String nombre, String apellido, String dni, int edad, boolean mayorEdad) {
		super(nombre, apellido, dni, edad, mayorEdad);
	}
	
	public Ordenanza(String nombre, String apellido, String dni, int edad, boolean mayorEdad, String zonaAsignada) {
		this(nombre, apellido, dni, edad, mayorEdad);
		this.zonaAsignada=zonaAsignada;
	}
	
	public void gestionarModulo() {
		System.out.printf("%s %s gestiona el modulo %s.",getNombre(), getApellido(), zonaAsignada);
	}

	//GETTERS & SETTERS
	
	public String getZonaAsignada() {
		return zonaAsignada;
	}

	public void setZonaAsignada(String zonaAsignada) {
		this.zonaAsignada = zonaAsignada;
	}
	
	

}
