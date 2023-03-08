package com.edu;

public class Persona {
	
	private String nombre;
	private String apellido;
	private String dni;
	private int edad;
	private boolean mayorEdad;
	
	public Persona(String nombre, String apellido, String dni, int edad, boolean mayorEdad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
		this.mayorEdad = mayorEdad;
	}

	public void saludar() {
		System.out.printf("Buenas tardes, me llamo %s %s", nombre, apellido);
	}

	//GETTER & SETTERS
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isMayorEdad() {
		return mayorEdad;
	}

	public void setMayorEdad(boolean mayorEdad) {
		this.mayorEdad = mayorEdad;
	}
	
	


}
