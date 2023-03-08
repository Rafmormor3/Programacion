package boletin3;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		int numero=0;
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduce un numero: ");
		numero=Integer.valueOf(sc.nextLine());
		
		while(numero<0) {
			System.out.print("Introduce un numero: ");
			numero=Integer.valueOf(sc.nextLine());
		}
		
		System.out.print("El numero "+numero+" "+divisiblePorTres(numero));
		
	}
	
	public static String divisiblePorTres(int numero) {
		StringBuilder res = new StringBuilder();
		
		String numeroC = String.valueOf(numero);
		int suma =11, cont=0;
	
		while(suma>10) {
			suma=sumaDigitos(numeroC);
			numeroC=String.valueOf(suma);
		}
		if(suma%3==0) {
			res.append("Es divisible");
		}else {
			res.append("No es divisible");
		}
		
		return res.toString();
	}
	
	public static int sumaDigitos(String cadena) {
		int suma=0;
		for(int i=0; i<cadena.length();i++) {
			suma += Character.getNumericValue(cadena.charAt(i));
		}
		return suma;
	}

}
