package boletin1EstructuraDeDatos.ejercicio5;

import java.time.LocalDate;

public class Profesor extends Persona {
 
	
	public Profesor(String nombre, LocalDate fechaNac) {
		super(nombre, fechaNac);
	}

	@Override
	public void enviarMensaje(Persona destinatario, String texto) throws Exception {
		destinatario.recibirMensaje(new Mensaje(this,texto));
	}
	
	
	
}
