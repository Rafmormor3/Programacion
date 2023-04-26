package boletin1EstructuraDeDatos.ejercicio5;

import java.time.LocalDateTime;
import java.util.Comparator;

public class Mensaje implements Comparable<Mensaje>{

	private Persona remitente;
	private String texto;
	private LocalDateTime fechaHora;
	private String id;
	private static int secuencia=1;
	
	public Mensaje(Persona remitente, String texto) throws Exception {
		super();
		if(remitente==null || texto==null) {
			throw new Exception("Valores nulos");
		}
		this.remitente = remitente;
		this.texto = texto;
		this.fechaHora = LocalDateTime.now();
		this.id=""+secuencia++;
	}

	public String getId() {
		return id;
	}

	public String getTexto() {
		return texto;
	}

	@Override
	public String toString() {
		return "\nMensaje "+id+" De: " + remitente.getNombre()+ ", Texto:" + texto + ", Fecha y Hora=" + fechaHora;
	}

	@Override
	public int compareTo(Mensaje o) {
		return id.compareTo(o.id);
	}




	
	
	
	
	
	
	
	
	
}
