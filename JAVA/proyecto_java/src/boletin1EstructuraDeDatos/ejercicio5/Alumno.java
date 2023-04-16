package boletin1EstructuraDeDatos.ejercicio5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alumno extends Persona {

	private LocalDate fechaNac;
	public final int MAYOR=18;
	
	public Alumno(String nombre, LocalDate fechaNac) {
		super(nombre);
		this.fechaNac=fechaNac;
	}

	@Override
	public void enviarMensaje(Persona destinatario, String texto) throws Exception {
		if(esMayorDeEdad() || destinatario instanceof Profesor) {
			Mensaje ms = new Mensaje(this, texto);
			destinatario.recibirMensaje(ms);
		}else {
			throw new Exception("No puede mandar mensaje");
		}
	}
	
	public boolean esMayorDeEdad() {
        return (int)ChronoUnit.YEARS.between(this.fechaNac, LocalDate.now())>=MAYOR;
    }


    

}
