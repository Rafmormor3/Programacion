package numeros;

import java.util.Scanner;

import numeros.tipos.Complejo;

public class Menu {

	public static final String MENU ="\n1. Sumar complejos: Debe solicitar dos números complejos y mostrar el\r\n"
									+ "resultado de la suma.\r\n"
									+ "2. Restar complejos: Debe solicitar dos número complejos y mostrar el\r\n"
									+ "resultado de la resta.\r\n"
									+ "3. Salir.\n";
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(MENU);
		System.out.println("Elige una opcion: ");
		int o = Integer.valueOf(sc.nextLine());
		
		Complejo c1 = new Complejo();
		Complejo c2 = new Complejo();
		
		while(o!=3) {
			
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
			
			switch (o) {
			case 1:
				System.out.println("Suma: "+c1.suma(c2.getParteReal(), c2.getParteImaginaria()));
				break;
			
			case 2:
				System.out.println("Resta: "+c1.resta(c2.getParteReal(), c2.getParteImaginaria()));
				break;
			}
			
			System.out.println(MENU);
			System.out.println("Elige una opcion: ");
			o = Integer.valueOf(sc.nextLine());
			
		}
		
	}

}
