package boletin2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int numero1=0, numero2 = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el numero1: ");
		numero1=Integer.valueOf(sc.nextLine());
		
		System.out.print("Introduce el numero2: ");
		numero2=Integer.valueOf(sc.nextLine());
		
		System.out.println("Es "+numero1+" multiplo de "+numero2+"? "+esMultiplo(numero1, numero2));

	}
	
	public static boolean esMultiplo(int numero1, int numero2) {
		boolean res=true;
		if(numero2%numero1!=0) {
			res=false;
		}
		return res;
	}

}
