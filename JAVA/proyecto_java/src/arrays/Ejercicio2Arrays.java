package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2Arrays {

	public static void main(String[] args) {
		
		int numeros[] = new int[10];
		Scanner sc = new Scanner(System.in);
		int cont=0;
		
		while(cont<10) {
			System.out.println("Introduce el numero en la posicion "+cont+" :");
			int num = Integer.valueOf(sc.nextLine());
			
			numeros[cont]=num;
			cont++;
		}
		System.out.println(Arrays.toString(numeros));
		System.out.println(Arrays.toString(moverPosicion(numeros)));
		

	}
	
	public static int[] moverPosicion(int numeros[]) {
		int numerosP[] = new int[10];
		numerosP[0]=numeros[9];
		for(int i=1; i<numeros.length;i++) {
			numerosP[i]=numeros[i-1];
		}
		return numerosP;
	}

}
