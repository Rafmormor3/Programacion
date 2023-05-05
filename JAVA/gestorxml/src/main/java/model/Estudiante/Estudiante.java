package main.java.model.Estudiante;

import java.util.Objects;

public class Estudiante {
	
	private int id;
	private String nombre;
	private String apellidos;
	private String fechaNacimiento;
	private Genero genero;
	
	
	
	
	public Estudiante(int id, String nombre, String apellidos, String fechaNacimiento, Genero genero) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
	}

	
	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public Genero getGenero() {
		return genero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, fechaNacimiento, genero, id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj || obj!=null && obj instanceof Estudiante && obj.hashCode()==this.hashCode();
	}


	public String toString() {
		return String.format(
				"Estudiante con id %s nombre %s y apellidos %s con fecha de nacimiento"
				+ " %s y género %s"
				, this.id, this.nombre, this.apellidos, this.fechaNacimiento, this.genero);
	}
	
	
	
	
}
