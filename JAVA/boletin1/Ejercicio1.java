package boletin1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int numero1=0;
		int numero2=0;
		boolean multiplo=false;
		
		System.out.print("Introduce el primer numero: ");
		Scanner sc1 = new Scanner(System.in);
		numero1 = Integer.valueOf(sc1.nextLine());
		
		System.out.print("Introduce el segundo numero: ");
		Scanner sc2 = new Scanner(System.in);
		numero2 = Integer.valueOf(sc2.nextLine());
		
		if(numero1%numero2==0 || numero2%numero1==0) {
			System.out.println(multiplo=true);
		}else{
			System.out.println(multiplo);
		}
		
		

	}

}
