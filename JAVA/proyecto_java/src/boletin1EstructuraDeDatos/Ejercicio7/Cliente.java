package boletin1EstructuraDeDatos.Ejercicio7;

public class Cliente {
	
	private static int siguiente=1;
	private int id;
	
	public Cliente() {
		super();
		this.id = siguiente++;
	}

	public int getId() {
		return id;
	}
	
	
	
	
}
