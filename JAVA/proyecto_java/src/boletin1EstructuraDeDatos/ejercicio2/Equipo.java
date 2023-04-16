package boletin1EstructuraDeDatos.ejercicio2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Equipo <T>{
	
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
	
}
