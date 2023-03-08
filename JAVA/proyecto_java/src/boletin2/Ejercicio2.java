package boletin2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		String str="";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		str=sc.nextLine();
		int cont = str.length();
		
		while(cont>0) {
			char c = str.charAt(cont-1);
			System.out.print(c);
			cont--;
		}
		
		

	}

}
