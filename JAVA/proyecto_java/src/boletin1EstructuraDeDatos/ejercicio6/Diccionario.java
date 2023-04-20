package boletin1EstructuraDeDatos.ejercicio6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Diccionario{
	
	private Map<String, Set<String>> diccionario;

	public Diccionario() {
		super();
		this.diccionario = new HashMap<>();
	}
	
	public void añadirPalabra(String palabra, String significado) throws Exception {
		if(palabra==null || significado==null) {
			throw new Exception("Valores introducidos nulos");
		}
		
		if(!this.diccionario.containsKey(palabra)) {
			Set<String> significados = new HashSet<>();
			this.diccionario.put(palabra, significados);
		}
		this.diccionario.get(palabra).add(significado);
	}
	
	public String buscarPalabra(String palabra) throws Exception {
		StringBuilder sb = new StringBuilder();
		if(palabra==null || !this.diccionario.containsKey(palabra)) {
			throw new Exception("Palabra no encontrada");
		}
		
		sb.append(this.diccionario.get(palabra));
		
		return sb.toString();
	}
	
	public void borrarPalabra(String palabra) throws Exception {
		if(palabra==null || !this.diccionario.containsKey(palabra)) {
			throw new Exception("Palabra no encontrada");
		}
		
		this.diccionario.remove(palabra);
	}
	
	public Map<String,Set<String>> listarPalabraQueContenga(String texto) throws Exception{
		if(texto==null) {
			throw new Exception("Valor introducido nulo");
		}
		
		Map<String,Set<String>> ordenado = new TreeMap<>();
		
		for(String k : this.diccionario.keySet()) {
			if(k.contains(texto)) {
				ordenado.put(k, this.diccionario.get(k));
			}
		}
		return ordenado;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(String k: this.diccionario.keySet()) {
			sb.append(k +": "+this.diccionario.get(k)+"\n");
		}
		return sb.toString();
	}

	
	
	
	
}
