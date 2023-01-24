package boletin1;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		int numero=0;
		
		System.out.print("Introduce un numero: ");
		Scanner sc = new Scanner(System.in);
		numero=Integer.valueOf(sc.nextLine());
		
		while(numero>0) {
			System.out.print("Su cuadrado: "+ (Math.pow(numero, 2)+"\n"));
			System.out.print("Introduce un numero: ");
			numero=Integer.valueOf(sc.nextLine());
		}

	}

}
