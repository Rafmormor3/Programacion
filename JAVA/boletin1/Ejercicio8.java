package boletin1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int numero=0;
		int cont=0;
		int suma=0;
		
		System.out.print("Introduce un numero: ");
		Scanner sc = new Scanner(System.in);
		numero = Integer.valueOf(sc.nextLine());
		
		/*
		do {
			suma=suma+numero;
			System.out.print("Introduce otro numero: ");
			numero = Integer.valueOf(sc.nextLine());
			cont++;
			
		}while(cont<15);
		
		System.out.println("La suma es:"+ suma);
		
		
		while(cont<15) {
			suma=suma+numero;
			System.out.print("Introduce un nuevo numero: ");
			numero=Integer.valueOf(sc.nextLine());
			cont++;
		}
		System.out.println("La suma es:"+suma);
		 */
		
		for(int i=0; i<15; i++) {
			System.out.print("Introduce un numero: ");
			numero=Integer.valueOf(sc.nextLine());
			suma=suma+numero;
		}
		System.out.println("La suma es:"+suma);

	}

}
