package boletin1EstructuraDeDatos.ejercicio2;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Alumno a1 = new Alumno("Rafa", "1234Q");
		Alumno a2 = new Alumno("Ana", "111GG");
		Alumno a3 = new Alumno("Manolo", "0987J");
		Alumno a4 = new Alumno("Rafa", "1234567");
		Alumno a5 = new Alumno("Antonio", "23423H");
		Alumno a6 = new Alumno("Juan", "000JJ");
		
		Equipo e1 = new Equipo("Betis");
		Equipo e2 = new Equipo("Sevilla");
		
		//Ejercicio 3

		Equipo num = new Equipo("Numeros");
		Equipo num1 = new Equipo("Numeros1");
		
		
		try {
			/*
			e1.añadirAlumno(a1);
			e1.añadirAlumno(a2);
			e1.añadirAlumno(a3);
			e1.añadirAlumno(a4);
			
			System.out.println(e1.listaPersona());
			
			e1.borrarAlumno(a1);
			System.out.println(e1.listaPersona());
			
			System.out.println(e1.estaEnEquipo(a6));
			
			e2.añadirAlumno(a3);
			e2.añadirAlumno(a4);
			e2.añadirAlumno(a5);
			e2.añadirAlumno(a6);
			
			System.out.println(e2.listaPersona());
			System.out.println(e2.unionEquipos(e1));
			/*
			 /*
			num.añadirAlumno(3);
			num.añadirAlumno(4);
			num.añadirAlumno(8);
			System.out.println(num.listaPersona());
			
			num1.añadirAlumno(3);
			num1.añadirAlumno(4);
			num1.añadirAlumno(7);
			System.out.println(num1.listaPersona());
			
			System.out.println(num.interseccion(num1));
			System.out.println(e1.interseccion(e2));
			
			num1.añadirAlumno(3);
			*/
			
			//EJERCICIO 8
			Alumno b1 = new Alumno("Rafa", "1234Q",21,'H',"Sevilla");
			Alumno b2 = new Alumno("Ana", "111GG",20,'M',"Valencia");
			Alumno b3 = new Alumno("Manolo", "0987J",30,'H',"Oviedo");
			Alumno b4 = new Alumno("Maria", "45678L",17,'M',"Sevilla");
			Alumno b5 = new Alumno("Juana", "23423H",27,'M',"Sevilla");
			Alumno b6 = new Alumno("Elena", "000JJ",25,'M',"Sevilla");
			
			Equipo eb = new Equipo("ATM");
			
			eb.añadirAlumno(b1);
			eb.añadirAlumno(b2);
			eb.añadirAlumno(b3);
			eb.añadirAlumno(b4);
			eb.añadirAlumno(b5);
			eb.añadirAlumno(b6);
			
			System.out.println(eb.masculinoMayoresEdad());
			System.out.println(eb.exclusivoFem());
			System.out.println(eb.numMayores());
			System.out.println(eb.edadMayor());
			System.out.println(eb.dniMascMayores());
			System.out.println(eb.existeJugadoraMayor());
			System.out.println(eb.numCiudadesDif());

			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
