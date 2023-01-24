package boletin1;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		int suma=0;
		String numero="";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el numero que quieras: ");
		numero = sc.nextLine();
		
		while(!(numero.equals("fin"))) {
			int numero1 = Integer.valueOf(numero);
			suma+=numero1;
			System.out.print("Introduce el numero que quieras: ");
			numero = sc.nextLine();
		}
		System.out.println(suma);

	}

}
