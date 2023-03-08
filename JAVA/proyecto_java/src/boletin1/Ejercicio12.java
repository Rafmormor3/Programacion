package boletin1;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		int numero=0, cont=0;
		
		System.out.print("Introduce un numero: ");
		
		Scanner sc = new Scanner(System.in);
		numero=Integer.valueOf(sc.nextLine());
		
		while(numero>0) {
			cont++;
			System.out.print("Introduce un nuevo numero: ");
			numero=Integer.valueOf(sc.nextLine());
		}
		System.out.print("Numeros introducidos: "+cont);

	}

}
