package boletin1EstructuraDeDatos.ejercicio5;

import java.time.LocalDateTime;

public class Mensaje implements Comparable<Mensaje>{

	private Persona remitente;
	private String texto;
	private LocalDateTime fechaHora;
	private static int id=0;
	
	public Mensaje(Persona remitente, String texto) throws Exception {
		super();
		if(remitente==null || texto==null) {
			throw new Exception("Valores nulos");
		}
		this.remitente = remitente;
		this.texto = texto;
		this.fechaHora = LocalDateTime.now();
	}

	public static int getId() {
		return id++;
	}

	public String getTexto() {
		return texto;
	}

	@Override
	public String toString() {
		return "\nMensaje "+getId()+" De: " + remitente.getNombre()+ ", \nTexto:" + texto + ", \nFecha y Hora=" + fechaHora;
	}

	@Override
	public int compareTo(Mensaje o) {
		return this.remitente.getNombre().compareTo(o.remitente.getNombre());
	}


	
	
	
	
	
	
	
	
	
}
