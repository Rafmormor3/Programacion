package boletin1EstructuraDeDatos.ejercicio2;

public class Alumno implements Comparable<Alumno>{
	
	private String nombre;
	private String dni;
	private int edad;
	private char sexo;
	private String ciudad;
	
	public Alumno(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public Alumno(String nombre, String dni, int edad, char sexo, String ciudad) throws Exception {
		this(nombre, dni);
		
		if(ciudad==null || (sexo!='H' && sexo!='M') || edad<0) {
			throw new Exception("Datos no validos");
		}
		
		this.edad = edad;
		this.sexo = sexo;
		this.ciudad = ciudad;
	}

	public String getDni() {
		return dni;
	}

	public int getEdad() {
		return edad;
	}

	public char getSexo() {
		return sexo;
	}

	public String getCiudad() {
		return ciudad;
	}

	@Override
	public String toString() {
		return "\nNombre del alumno: " + nombre + ", dni: " + dni;
	}
	
	
	public boolean equals(Object obj) {
		boolean sonIguales = this==obj;
		if(!sonIguales && obj!=null && obj instanceof Alumno) {
			Alumno otro = (Alumno) obj;
			sonIguales=otro.dni != null && this.dni!=null && this.dni.equals(otro.dni);
		}
		return sonIguales;
	}

	@Override
	public int compareTo(Alumno o) {
		return this.edad-o.edad;
	}
	
	
}
