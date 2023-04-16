package boletin1EstructuraDeDatos.ejercicio5;

public class Profesor extends Persona {
 
	
	public Profesor(String nombre) {
		super(nombre);
	}

	@Override
	public void enviarMensaje(Persona destinatario, String texto) throws Exception {
		Mensaje ms = new Mensaje(this,texto);
		destinatario.recibirMensaje(ms);
	}
	
	
	
}
