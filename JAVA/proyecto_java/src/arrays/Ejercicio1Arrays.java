package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1Arrays {

	public static void main(String[] args) {
		
		int numeros[] = new int[10];
		Scanner sc = new Scanner(System.in);
		
		int cont=numeros.length-1;
		while(cont>=0) {
			System.out.println("Introduce un numero: ");
			int num = Integer.valueOf(sc.nextLine());
			numeros[cont]=num;
			cont--;
		}
		System.out.println(Arrays.toString(numeros));

	}

}
