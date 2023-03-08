package boletin3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		String palabra, texto;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el texto: ");
		texto=sc.nextLine();
		
		System.out.println("Introduce la palabra a contar: ");
		palabra=sc.nextLine();
		
		System.out.println("Numero de veces que aparece "+palabra+": "+numeroVeces(palabra, texto));
		//System.out.println(numeroVeces("palabra", "Tengo una palabra una palabra tengo"));
		
	}
	
	public static int numeroVeces(String palabra, String cadena) {
		int cont=0, nPalabras=0;
		
		for(int i=0; i<cadena.length();i++) {
			if(cadena.charAt(i)==palabra.charAt(cont)) {
				cont++;
				if(palabra.length()==cont) {
					nPalabras++;
					cont=0;
				}
			}else {
				cont=0;
			}
		}
		return nPalabras;
	}

}
