package boletin1EstructuraDeDatos.ejercicio2;

public class Alumno {
	
	private String nombre;
	private String dni;
	
	
	public Alumno(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public String getDni() {
		return dni;
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
	
	
}
