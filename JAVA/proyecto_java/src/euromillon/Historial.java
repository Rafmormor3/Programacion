package euromillon;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import euromillon.exceptions.HistorialException;

public class Historial {
	
	private Map<LocalDate, Combinacion> sorteos;

	public Historial() {
		super();
		this.sorteos = new HashMap<>();
	}
	
	public void addSorteo(LocalDate fecha, Combinacion c) throws HistorialException {
		if(fecha==null || c==null) {
			throw new HistorialException("Error al introducir los datos");
		}
		this.sorteos.put(fecha, c);
	}
	
	public void addSorteo(int day, int month, int year , Combinacion c) throws HistorialException {
		if(day==0 || month==0 || year==0 || c==null) {
			throw new HistorialException("Datos erroneos");
		}
		LocalDate fecha = LocalDate.of(year, month, day);
		this.sorteos.put(fecha, c);
	}
	
	public boolean actualizarSorteo(LocalDate fecha, Combinacion c) {
		boolean res=false;
		if(fecha!=null && c!=null && this.sorteos.containsKey(fecha)) {
			this.sorteos.replace(fecha, this.sorteos.get(fecha), c);
			res=true;
		}
		return res;
	}
	
	public boolean actualizarSorteo(int day, int month, int year , Combinacion c) {
		boolean res=false;
		if(day!=0 && month!=0 && year!=0 && this.sorteos.containsKey(LocalDate.of(year, month, day))) {
			this.sorteos.replace(LocalDate.of(year, month, day), c);
			res=true;
		}
		return res;
	}
	
	public boolean borrarSorteo(LocalDate fecha) {
		boolean res=false;
		if(fecha!=null && this.sorteos.containsKey(fecha)) {
			this.sorteos.remove(fecha);
			res=true;
		}
		return res;
	}
	
	public List<String> listarSorteosDesdeFecha(LocalDate fecha){
		List<String> lista = new ArrayList<>();
		Map<LocalDate,Combinacion> aux = new TreeMap<>(this.sorteos);
		for(LocalDate f : aux.keySet()) {
			if(f.isAfter(fecha)) {
				lista.add(aux.get(f).toString());
			}
		}
		return lista;
	}
	
	public List<String> mostrarHistorico(){
		List<String> lista = new ArrayList<>();
		for(LocalDate f : this.sorteos.keySet()) {
			lista.add(this.sorteos.get(f).toString());
		}
		return lista;
	}
	
	public Map<String,Integer> comprobarAciertos(LocalDate fecha, Combinacion c){
		Map<String, Integer> aciertos = new HashMap<>();
		for(LocalDate f : this.sorteos.keySet()) {
			if(f.equals(fecha)) {
				aciertos.put(this.sorteos.get(f).toString(), this.sorteos.get(f).comprobarCombinacion(c));
			}
		}
		return aciertos;
		
	}
	

}
