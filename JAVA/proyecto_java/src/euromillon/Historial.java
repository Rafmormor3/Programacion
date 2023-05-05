package euromillon;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
		addSorteo(LocalDate.of(year, month, day), c);
	}
	
	public boolean actualizarSorteo(LocalDate fecha, Combinacion c) {
		boolean res=false;
		if(fecha!=null && c!=null && this.sorteos.containsKey(fecha)) {
			this.sorteos.replace(fecha, c);
			res=true;
		}
		return res;
	}
	
	public boolean actualizarSorteo(int day, int month, int year , Combinacion c) {
		return actualizarSorteo(LocalDate.of(year, month, day), c);
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
			if(fecha==null || f.isAfter(fecha)) {
				lista.add(aux.get(f).toString());
			}
		}
		return lista;
	}
	
	public List<String> mostrarHistorico(){
		return listarSorteosDesdeFecha(null);
	}
	
	public Map<String,Integer> comprobarAciertos(LocalDate fecha, Combinacion c) throws HistorialException{
		Map<String, Integer> aciertos = new HashMap<>();
		if(!this.sorteos.containsKey(fecha)) {
			throw new HistorialException();
		}
		aciertos.put(fecha.toString(), this.sorteos.get(fecha).comprobarCombinacion(c));
		return aciertos;
		
	}
	
	public String maximoNumeroAciertos(Combinacion c) throws HistorialException {
		StringBuilder sb = new StringBuilder();
		int cont=0;
		
		for(LocalDate f : sorteos.keySet()) {
			if(sorteos.get(f).comprobarCombinacion(c)>0) {
				cont=sorteos.get(f).comprobarCombinacion(c);
			}
			
		}
		sb.append("El maximo de aciertos posibles es de: "+cont);
		return sb.toString();
	}
	
	private Map<Integer, Integer> listaNumerosRepes(){
		Map<Integer, Integer> aux = new TreeMap<>();
		
		for(LocalDate f : sorteos.keySet()) {
			
			for(int i : sorteos.get(f).getNumeros()) {
				if(!aux.containsKey(i)) {
					aux.put(i, 1);
				}
				aux.put(i, aux.get(i)+1);
			}
		}
		return aux;
	}
	
	private Map<Integer, Integer> listaEstrellasRepes(){
		Map<Integer, Integer> aux = new TreeMap<>();
		
		for(LocalDate f : sorteos.keySet()) {
			
			for(int i : sorteos.get(f).getEstrellas()) {
				if(!aux.containsKey(i)) {
					aux.put(i, 1);
				}
				aux.put(i, aux.get(i)+1);
			}
		}
		return aux;
	}
	
	public String mayorRepeticion(String flag) {
		StringBuilder sb = new StringBuilder();
		Map<Integer, Integer> aux = null;
		
		if(flag.equals("numeros")) {
			aux = listaNumerosRepes();
		}else if(flag.equals("estrellas")){
			aux = listaEstrellasRepes();
		}
		int cont = 1;
		Set<Integer> numeros = new HashSet<>();
		
		for(Integer i : aux.keySet()) {
			if(aux.get(i)>cont) {
				numeros.clear();
				numeros.add(i);
				cont=aux.get(i);
			}else if(aux.get(i)==cont) {
				numeros.add(i);
				cont=aux.get(i);
			}
		}
		sb.append(flag+" ").append(numeros.toString()).append(" -> ").append(cont);
		
		return sb.toString();
	}
	
	public String menorRepeticion(String flag) {
		StringBuilder sb = new StringBuilder();
		Map<Integer, Integer> aux = null;
		
		if(flag.equals("numeros")) {
			aux = listaNumerosRepes();
		}else if(flag.equals("estrellas")){
			aux = listaEstrellasRepes();
		}
		
		Set<Integer> numeros = new HashSet<>();
		int cont = 0;
		
		for(Integer i : aux.keySet()) {
			if(aux.get(i)<cont || cont==0) {
				numeros.clear();
				numeros.add(i);
				cont=aux.get(i);
			}else if(aux.get(i)==cont) {
				numeros.add(i);
				cont=aux.get(i);
			}
		}
		sb.append(flag+" ").append(numeros.toString()).append(" -> ").append(cont);
		
		return sb.toString();
	}
	 
	public Map<List<Integer>, Integer> mayorSecuenciaConsecutivos(){
		Map<List<Integer>, Integer> res = new HashMap<>();
		int cont=0;
		for(LocalDate f : sorteos.keySet()) {
			List<Integer> lista = new ArrayList<>(sorteos.get(f).getNumeros());
			for(int i=1 ; i<lista.size(); i++) {
				if(lista.get(i-1)+1==lista.get(i)) {
					cont=1;
					cont++;
				}
			}
			res.put(lista, cont);
			cont=0;
		}
		
		return res;
	}
	

}
