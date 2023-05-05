package main.java.model.Casetas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import main.java.xml.reader.LectorXMLCaseta;

public class Feria {
	
	private String ruta;
	private List<Caseta> casetas;
	
	
	public Feria(String ruta) {
		super();
		this.casetas = new LectorXMLCaseta().cargarDatos(ruta);
	}
	
	
	public List<Caseta> getCasetas() {
		return casetas;
	}

	public Map agruparPorCalles(){
		Map<String, Set<Caseta>> calles = new HashMap<>();
		for(Caseta c : this.casetas) {
			if(!calles.containsKey(c.getCalle())) {
				calles.put(c.getCalle(), new HashSet<>());
			}
			calles.get(c.getCalle()).add(c);
			
		}
		return calles;
		
	}
	
	public Set<Caseta> casetasFamiliares(){
		Set<Caseta> familiares = new HashSet<>();
		for(Caseta c : this.casetas) {
			if(c.getClase().equals(Clase.FAMILIAR)) {
				familiares.add(c);
			}
		}
		return familiares;
	}
	
	public Set<Caseta> casetasDistrito(){
		Set<Caseta> distrito = new HashSet<>();
		for(Caseta c : this.casetas) {
			if(c.getClase().equals(Clase.DISTRITO)) {
				distrito.add(c);
			}
		}
		return distrito;
	}
	
	public Set<Caseta> otrasCasetas(){
		Set<Caseta> otra = new HashSet<>();
		for(Caseta c : this.casetas) {
			if(!casetasDistrito().contains(c.getTitulo()) 
					&& !casetasFamiliares().contains(c.getTitulo()) ) {
				otra.add(c);
			}
		}
		return otra;
	}
	
	public Map casetasFamiliaresPorCalle() {
		Map<String, Integer> familiares = new HashMap<>();
		Map<String, Set<Caseta>> calles = new HashMap<>(agruparPorCalles());
		
		for(String c : calles.keySet()) {
			int cont =0;
			for(Caseta caseta : calles.get(c)) {
				if(caseta.getClase().equals(Clase.FAMILIAR)) {
					cont++;
				}
			}
			familiares.put(c, cont);
		}
		return familiares;
	}

	public Map casetasDistritosPorCalle() {
		Map<String, Integer> familiares = new HashMap<>();
		Map<String, Set<Caseta>> calles = new HashMap<>(agruparPorCalles());
		
		for(String c : calles.keySet()) {
			int cont =0;
			for(Caseta caseta : calles.get(c)) {
				if(caseta.getClase().equals(Clase.DISTRITO)) {
					cont++;
				}
			}
			familiares.put(c, cont);
		}
		return familiares;
	}
	
	public Set<Caseta> borrarCaseta(String calle, int numero){
		List<Caseta> cas = new ArrayList<>(this.casetas);
		Set<Caseta> res = new HashSet<>();
		Collections.sort(cas);
		Iterator<Caseta> it = cas.iterator();
		Caseta borrada = null;
		
		while(it.hasNext()) {
			Caseta c = it.next();
			
			if(borrada!=null) {
				c.setId(c.getId()-c.getModulos());
			}
			
			if(c.getCalle().equals(calle) && c.getNumero()==numero) {
				borrada=c;
			}else {
				res.add(c);
			}
			
		}
		
		return res;
	}
	
	
}
