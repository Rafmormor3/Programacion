package boletin2;

import java.util.Scanner;

public class Ejercicio10y11 {

	public static void main(String[] args) {
		
		//System.out.println(gcd(1220,516));
		int n1=0, n2=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero: ");
		n1=Integer.valueOf(sc.nextLine());
		
		System.out.println("Introduce el segundo numero: ");
		n2=Integer.valueOf(sc.nextLine());
		
		System.out.println("El máximo común divisor es: "+gcd(n1, n2));
		System.out.println("El mínimo común múltiplo es: "+minimoComunMultiplo(n1, n2));

	}
	
	public static int gcd(int n1, int n2){
		int r =0;
		while(n2>0) {
			r=n1%n2;
			n1=n2;
			n2=r;
		}
		return n1;
	}
	
	public static int minimoComunMultiplo(int n1, int n2) {
		int mcd=gcd(n1, n2);
		return (n1*n2)/mcd;
	}
	
	public static int factorial(int n) {
		return n==0? 1 : n*factorial(n-1);
	}
}
