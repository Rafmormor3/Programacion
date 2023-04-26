package boletin1EstructuraDeDatos.ejercicio5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alumno extends Persona {
	
	public Alumno(String nombre, LocalDate fechaNac) {
		super(nombre, fechaNac);
	}

	@Override
	public void enviarMensaje(Persona destinatario, String texto) throws Exception {
		if(esMayorDeEdad() || destinatario instanceof Profesor) {
			
			destinatario.recibirMensaje(new Mensaje(this, texto));
			
		}else {
			throw new Exception("No puede mandar mensaje");
		}
	}


    

}
