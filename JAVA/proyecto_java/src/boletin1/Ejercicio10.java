package boletin1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		int numero=0;
		int suma=0;
		
		System.out.print("Introduce un numero: ");
		Scanner sc = new Scanner(System.in);
		numero=Integer.valueOf(sc.nextLine());
		
		for(int i=numero;i<=(numero+100);i++) {
			suma=suma+i;
		}
		System.out.println(suma);

	}

}
