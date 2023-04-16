package listSet;

public class Persona<K, T> {
	
	private K nombre;
	private T apellido;
	
	public Persona(K nombre, T apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return nombre + " " + apellido ;
	}
	
	
	
	
	
}
