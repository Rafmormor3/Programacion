package boletin1EstructuraDeDatos.ejercicio4;

import java.time.LocalDateTime;

public class Pagina implements Comparable<Pagina>{
	
	private String url;
	private LocalDateTime fechaHora;

	public Pagina(String url, LocalDateTime fechaHora) {
		super();
		this.url = url;
		this.fechaHora=fechaHora;
	}
	

	public String getUrl() {
		return url;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	@Override
	public String toString() {
		return "\nPagina con url: " + url + ", en la fecha:" + fechaHora;
	}

	public int compareTo(Pagina o) {
		return o.fechaHora.compareTo(this.fechaHora);
	}
	
	
	
	
	
	
	
	
}
