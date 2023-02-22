package numeros;

import java.util.Scanner;

import numeros.tipos.Complejo;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Complejo c1 = new Complejo();
		Complejo c2 = new Complejo();
		
		System.out.println("Introduce parte real del primer numero complejo: ");
		c1.setParteReal(Double.valueOf(sc.nextLine()));
		System.out.println("Introduce imaginaria real del primer numero complejo: ");
		c1.setParteImaginaria(Double.valueOf(sc.nextLine()));
		
		System.out.println("Introduce parte real del segundo numero complejo: ");
		c2.setParteReal(Double.valueOf(sc.nextLine()));
		System.out.println("Introduce imaginaria real del segundo numero complejo: ");
		c2.setParteImaginaria(Double.valueOf(sc.nextLine()));
		
		System.out.println("Primer numero complejo: "+c1.toString());
		System.out.println("Segundo numero complejo: "+c2.toString());
		
		System.out.println("Suma: "+c1.suma(c2.getParteReal(), c2.getParteImaginaria()));
		System.out.println("Resta: "+c1.resta(c2.getParteReal(), c2.getParteImaginaria()));

	}

}
