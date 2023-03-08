package boletin1;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		int longitud=0, n0=0, n1=1, suma=1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la longitud de la serie:");
		longitud=Integer.valueOf(sc.nextLine());
		
		System.out.println(n1);
		
		for(int i=1;i<longitud;i++) {
			suma=n0+n1;
			System.out.println(suma);
			n0=n1;
			n1=suma;
		}
		
		

	}

}
