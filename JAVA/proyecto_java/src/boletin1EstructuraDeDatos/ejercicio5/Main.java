package boletin1EstructuraDeDatos.ejercicio5;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Persona p1 = new Profesor("Alvaro", LocalDate.of(1978, 10, 10));
		Persona p2 = new Alumno("Rafa", LocalDate.of(2002, 5, 9));
		Persona p3 = new Alumno("Fran", LocalDate.of(1994, 10, 25));
		
		try {
			p1.enviarMensaje(p2, "Hola que pasa");
			p1.enviarMensaje(p2, "El this no existe");
			System.out.println(p2.leerBuzon());
			
			p2.enviarMensaje(p3, "Hola fran");
			p1.enviarMensaje(p3, "Hola mundo");
			System.out.println(p3.leerBuzon());
			//p3.borrarMensajeBuzon(20);
			System.out.println(p3.leerBuzonOrdenado());
			
			//System.out.println(p1.leerBuzon());
			
			System.out.println(p3.almacenarMensajesEspecificos("Hola"));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
