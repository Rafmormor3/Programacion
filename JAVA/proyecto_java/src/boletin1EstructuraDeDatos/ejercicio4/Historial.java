package boletin1EstructuraDeDatos.ejercicio4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Historial{
	
	private List<Pagina> historial;

	public Historial() {
		super();
		this.historial = new ArrayList<>();
	}
	
	
	public void nuevaPaginaConsultada(String nombre, LocalDateTime fecha) throws Exception {
		boolean res=true;
		if(nombre==null || nombre.isEmpty()) {
			throw new Exception("Nombre nulo o vacio");
		}
		
		Pagina pag = new Pagina(nombre,fecha);
		this.historial.add(pag);	
	}
	
	
	public String consultarHistorialCompleto() {
		Collections.sort(this.historial);
		return this.historial.toString();
	}
	
	
	public String consultarHistorialDia(LocalDateTime fechaDia) throws Exception {
		StringBuilder sb = new StringBuilder();
		if(fechaDia==null) {
			throw new Exception("Dia nulo");
		}else {
			for(Pagina p : this.historial) {
				if(p.getFechaHora().getDayOfMonth()==fechaDia.getDayOfMonth() 
						&& p.getFechaHora().getMonth()== fechaDia.getMonth()
						&& p.getFechaHora().getYear()==fechaDia.getYear()) {
					sb.append(p).append("\n");
				}
			}
		}
		return sb.toString();
	}
	
	public void borrarHistorial() {
		this.historial.clear();
	}
	
	//Iteradores
	public void borrarVisitas(String nombre) {
		Iterator<Pagina> pg = this.historial.iterator();
		while(pg.hasNext()==true) {
			Pagina siguiente = pg.next();
			if(siguiente.getUrl().equals(nombre)) {
				pg.remove();
			}
		}
	}

	
	
}
