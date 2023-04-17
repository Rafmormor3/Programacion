package boletin1EstructuraDeDatos.ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Equipo <T extends Alumno>{
	
	private final int MAYOR=18;
	private String nombreEquipo;
	private Set<T> grupo;
	
	public Equipo(String nombreEquipo) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.grupo = new HashSet<>();
	}
	
	public void añadirAlumno(T a) throws Exception {
		if(buscarAlmuno(a)==1) {
			throw new Exception("Alumno ya esta en el equipo");
		}
		this.grupo.add(a);
	}
	
	public void borrarAlumno(T a) throws Exception {
		if(buscarAlmuno(a)==-1) {
			throw new Exception("Alumno no esta en el equipo");
		}
		this.grupo.remove(a);
	}
	
	public T estaEnEquipo(T a) {
		T res = a;
		if(buscarAlmuno(a)==-1) {
			res=null;
		}
		return res;
	}
	
	public String listaPersona() {
		return this.grupo.toString();
	}
	
	public Set<T> unionEquipos(Equipo e){
		Set<T> aux = new HashSet<>();
		aux.addAll(this.grupo);
		aux.addAll(e.grupo);
		return aux;
	}
	
	public Set<T> interseccion(Equipo e){
		Set<T> aux = new HashSet<>(this.grupo);
		aux.retainAll(e.grupo);
		return aux;
	}
	
	@Override
	public String toString() {
		return nombreEquipo + "\n";
	}

	private int buscarAlmuno(T a) {
		int res=-1;
		for(T t: grupo) {
			if(a.equals(t)) {
				res=1;
			}
		}
		return res;
	}
	
	//----EJERCICIO 8----
	
	public String masculinoMayoresEdad(){
		List<T> aux = new ArrayList<>();
		for(T a : grupo) {
			if(a.getEdad()>=MAYOR && a.getSexo()=='H') {
				aux.add(a);
			}
		}
		Collections.sort(aux);
		return aux.toString();
		
	}
	public boolean exclusivoFem() {
		boolean res=true;
		for(T a :grupo) {
			if(a.getSexo()=='H') {
				res=false;
			}
		}
		return res;
	}
	
	public int numMayores() {
		int res=0;
		for(T a:grupo) {
			if(a.getEdad()>=MAYOR) {
				res++;
			}
		}
		return res;
	}
	
	public int edadMayor() {
		int res=0;
		for(T a:grupo) {
			if(a.getSexo()=='M' && a.getEdad()>=MAYOR && a.getEdad()>res) {
				res=a.getEdad();
			}
		}
		return res;
	}
	
	public Set<T> dniMascMayores(){
		Set<T> valores = new HashSet<>();
		for(T a :grupo) {
			if(a.getSexo()=='H' && a.getEdad()<MAYOR) {
				valores.add(a);
			}
		}
		return valores;
	}
	
	public boolean existeJugadoraMayor() {
		boolean res=false;
		for(T a : grupo) {
			if(a.getSexo()=='M' && a.getEdad()>=MAYOR) {
				res=true;
			}
		}
		return res;
	}
	
	public int numCiudadesDif() {
		Set<String> aux = new HashSet<>();
		int cont=0;
		for(T a:grupo) {
			if(!aux.contains(a.getCiudad())) {
				cont++;
				aux.add(a.getCiudad());
			}
		}
		return cont;
	}
	
}










