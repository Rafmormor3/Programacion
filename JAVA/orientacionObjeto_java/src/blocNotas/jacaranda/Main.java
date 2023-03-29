package blocNotas.jacaranda;

import java.time.LocalDateTime;

import blocNotas.jacaranda.bloc.Bloc;
import blocNotas.jacaranda.notas.Nota;
import blocNotas.jacaranda.notas.NotaAlarma;
import blocNotas.jacaranda.notas.NotaAlarmaException;

public class Main {

	public static void main(String[] args) {
		
		Nota n1 = new Nota("Hola buenas tardes");
		System.out.println(n1);
		
		Nota n2 = new Nota("Alvaro estudia perro");
		System.out.println(n2);
		
		Nota n3 = new NotaAlarma("Despierta coño", LocalDateTime.of(2023, 12, 31, 23, 59), false);
		System.out.println(n3);
		
		Nota n4 = new Nota("Hola buenas tardes");
		System.out.println(n1);
		
		Nota n5 = new Nota("Alvaro estudia perro");
		System.out.println(n2);
		
		Nota n6 = new Nota("Hola buenas tardes");
		System.out.println(n1);
		
		Nota n7 = new Nota("Alvaro estudia perro");
		System.out.println(n2);
		
		Bloc blocNotas;
		try {
			blocNotas = new Bloc("Lista 1");
			
			blocNotas.addNota(n1);
			blocNotas.addNota(n2);
			blocNotas.addNota(n3);
			blocNotas.addNota(n4);
			blocNotas.addNota(n5);
			blocNotas.addNota(n6);
			blocNotas.addNota(n7);
			
			blocNotas.updateNota(4, "Rafa estudia cabron");
			System.out.println(blocNotas.toString());
			System.out.println(blocNotas.ordenarBloc());
			
			
			
		} catch (NotaAlarmaException e) {
			e.printStackTrace();
		}
		
		
		

		
		
		System.out.println(n5.isModificado());
		System.out.println(n1.isCreadoAnterior(n7));
		System.out.println(n5.isModificadoAnterior(n2));
		
		

	}

}
