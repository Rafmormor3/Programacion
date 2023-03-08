package com.edu;

public class Estudiante extends Persona {
	
	static String ciclo;
	static int curso;
	
	public Estudiante(String nombre, String apellido, String dni, int edad, boolean mayorEdad) {
		super(nombre, apellido, dni, edad, mayorEdad);
	}
	
	public Estudiante(String nombre, String apellido, String dni, int edad, boolean mayorEdad, String ciclo, int curso) {
		this(nombre, apellido, dni, edad, mayorEdad);
		this.ciclo=ciclo;
		this.curso=curso;
	}
	
	public void hacerExamen() {
		System.out.printf("El alumno de nombre %s %s hace el examen del ciclo %s , curso %s",
				getNombre(), getApellido(), ciclo, curso);
	}

	//GETTERS & SETTERS
	
	public static String getCiclo() {
		return ciclo;
	}

	public static void setCiclo(String ciclo) {
		Estudiante.ciclo = ciclo;
	}

	public static int getCurso() {
		return curso;
	}

	public static void setCurso(int curso) {
		Estudiante.curso = curso;
	}
	
	
	

}
