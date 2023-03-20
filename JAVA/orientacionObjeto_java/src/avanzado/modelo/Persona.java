package avanzado.modelo;

import java.time.LocalDate;

public class Persona {
	
	private Genero genero;
	private double altura;
	private double peso;
	private String nombre;
	private String apellido1;
	private String apellido2;
	
	private LocalDate fechaNac;

	public Persona(Genero genero, String nombre, String apellido1, String apellido2, double peso, double altura, LocalDate fechaNac) {
		super();
		this.genero=genero;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.peso = peso;
		this.altura = altura;
		this.fechaNac = fechaNac;
	}
	
	public int getEdad() {
		return LocalDate.now().getYear()-this.fechaNac.getYear();
	}
	
	public double getIMC() {
		return this.altura>0? this.peso/(Math.pow(altura, 2)) : 0;
	}

	@Override
	public String toString() {
		return "Persona [genero=" + genero + ", altura=" + altura + ", peso=" + peso + ", \n nombre=" + nombre
				+ ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", fechaNac=" + fechaNac + ", getEdad()="
				+ getEdad() + ", getIMC()=" + getIMC() + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
