package boletin3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introcude la cadena: ");
		String cadena = sc.nextLine();
		
		System.out.println("Introcude la bandera (par/impar): ");
		String bandera = sc.nextLine();
		
		System.out.println(caracteresParImpar(cadena, bandera));

	}
	
	public static String caracteresParImpar(String cadena, String bandera) {
		String resultadoP="", resultadoI="";
		int cont=0;
		StringBuilder res = new StringBuilder();
		
		/*
		for(int i=0; i<cadena.length(); i++) {
			if(i%2!=0) {
				resultadoP+=cadena.charAt(i);
			}else {
				resultadoI+=cadena.charAt(i);
			}
		}
		*/
		
		/*
		while(cont<cadena.length()) {
			if(cont%2!=0) {
				resultadoP+=cadena.charAt(cont);
			}else {
				resultadoI+=cadena.charAt(cont);
			}
			cont++;
		}
		*/
		
		do {
			if(cont%2!=0) {
				resultadoP+=cadena.charAt(cont);
			}else {
				resultadoI+=cadena.charAt(cont);
			}
			cont++;
		}while(cont<cadena.length());
		
		
		if(cadena!=null && !cadena.isEmpty() && bandera.equals("par")) {
			res.append(resultadoP);
		}else if (cadena!=null && !cadena.isEmpty() && bandera.equals("impar")) {
			res.append(resultadoI);
		}else {
			res.append("Datos no validos.");
		}
		return res.toString();
		
	}

}
