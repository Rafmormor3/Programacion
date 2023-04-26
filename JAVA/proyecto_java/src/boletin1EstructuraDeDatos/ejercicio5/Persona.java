package boletin1EstructuraDeDatos.ejercicio5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class Persona{
	public final int MAYOR=18;
	
	private String nombre;
	private LocalDate fechaNac;
	private List<Mensaje> buzon;
	
	public Persona(String nombre,LocalDate fechaNac) {
		super();
		this.nombre = nombre;
		this.fechaNac=fechaNac;
		this.buzon= new ArrayList<>();
	}
	
	public abstract void enviarMensaje(Persona destinatario, String texto) throws Exception;
	
	public boolean esMayorDeEdad() {
        return (int)ChronoUnit.YEARS.between(this.fechaNac, LocalDate.now())>=MAYOR;
    }
	
	protected void recibirMensaje(Mensaje mensaje) {
		this.buzon.add(mensaje);
	}

	public String getNombre() {
		return nombre;
	}

	public String leerBuzon() throws Exception {
		if(this.buzon.size()==0) {
			throw new Exception("Vacio");
		}
		return this.buzon.toString();
	}
	
	public String leerBuzonOrdenado() throws Exception {
		if(this.buzon.size()==0) {
			throw new Exception("Vacio");
		}
		Collections.sort(this.buzon);
		return this.buzon.toString();
	}
	
	public void borrarMensajeBuzon(int numeroMensaje) throws Exception {
		Iterator<Mensaje> it = this.buzon.iterator();
		int encontrado = -1;
		while(it.hasNext()==true) {
			Mensaje sig = it.next();
			if(Integer.valueOf(sig.getId())==numeroMensaje) {
				it.remove();
				encontrado=0;
			}
		}
		if(encontrado==-1) {
			throw new Exception("No encontrado");
		}
	}
	
	public String almacenarMensajesEspecificos(String texto) {
		Iterator<Mensaje> it = this.buzon.iterator();
		List<Mensaje> aux = new ArrayList<>();
		while(it.hasNext()==true) {
			Mensaje sig = it.next();
			if(sig.getTexto().contains(texto)) {
				aux.add(sig);
			}
		}
		return aux.toString();
	}


}
