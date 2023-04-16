package listSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		
		List<Object> listaNombres = new ArrayList<>();
		
		listaNombres.add("rafa");
		listaNombres.add("rafa");
		listaNombres.add(0);
		listaNombres.add("adios");
		listaNombres.add(true);
		
		System.out.println(listaNombres.size());
		System.out.println(listaNombres.toString());
		
		Set<Object> conjunto = new HashSet<>();
		conjunto.addAll(listaNombres);
		conjunto.add(0);
		conjunto.add(0);
		conjunto.add(0);
		
		System.out.println(conjunto.size());
		System.out.println(conjunto.toString());
		
		List<Persona> personas = new ArrayList<>();
		Persona<String,String> p1 = new Persona("Rafa","Morales");
		Persona<String,String> p2 = new Persona("Paco","Camero");
		Persona<String,String> p3 = new Persona("Jose","Donoso");
		Persona<String, String> p4 = new Persona("Antonio","Romero");
		personas.add(p1);
		personas.add(p1);
		personas.add(p2);
		personas.add(p2);
		personas.add(p3);
		personas.add(p3);
		personas.add(1, p4);
		
		System.out.println(personas.size());
		System.out.println(personas.toString());
		
		Set<Persona> conjuntoPersonas = new HashSet<>();
		conjuntoPersonas.addAll(personas);
		System.out.println(conjuntoPersonas.size());
		System.out.println(conjuntoPersonas.toString());
		
		
		
	}

}
