package boletin1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int numero=0;
		
		for(int i=0; i<5; i++) {
			
			System.out.print("Introduce un numero: ");
			Scanner sc = new Scanner(System.in);
			numero=Integer.valueOf(sc.nextLine());
			
			if(numero%3==0) {
				System.out.println(numero);
			}
		}
		

	}

}
