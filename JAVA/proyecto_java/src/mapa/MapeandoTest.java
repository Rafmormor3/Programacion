package mapa;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

class MapeandoTest {

	@Test
	void testMapearPersonasPorGenero() {
		
		Persona p1 = new Persona("Rafa","Morales",Genero.MASCULINO);
		Persona p2 = new Persona("Manolo","Gimenez",Genero.NEUTRO);
		Persona p3 = new Persona("Tomas","Rodriguez",Genero.DESCONOCIDO);
		Persona p4 = new Persona("Maria","Sola",Genero.FEMENINO);
		Persona p5 = new Persona("Ana","Fuentes",Genero.NEUTRO);
		Persona p6 = new Persona("Juana","Garcia",Genero.DESCONOCIDO);
		
		Set<Persona> p = new HashSet<>();
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		p.add(p6);
		
		assert(new Mapeando().mapearPersonasPorGenero(p).size()==4);
	}

	@Test
	void testContarNumeros() {
		
		Mapeando mapa = new Mapeando();
		
		List<Integer> l = new ArrayList<>();
		l.add(2);
		l.add(5);
		l.add(2);
		
		assert(mapa.contarNumeros(l).size()==2);
		
	}

}
