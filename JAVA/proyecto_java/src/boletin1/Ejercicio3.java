package boletin1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		System.out.print("Introduzca un caracter cualquiera: ");
		Scanner sc = new Scanner(System.in);
		Character caract =sc.nextLine().charAt(0);
		
		System.out.println(clasificacionChar(caract));
		
	}

	public static String clasificacionChar(char caract) {
		
		String mensaje="Otro tipo de caracter";
		
		if(Character.isUpperCase(caract)) {
			mensaje="Letra Mayuscula";
		}else if(Character.isLowerCase(caract)) {
			mensaje="Letra Minuscula";
		}else if(Character.isDigit(caract)) {
			mensaje="Digito entre 0 y 9";
		}else if(Character.isWhitespace(caract) || caract==' ') {
			mensaje="Espacio en blanco";
		}else if(caract=='{'|| caract=='}' || caract=='(' || caract==')') {
			mensaje="Parentesis () o llaves {}";
		}
		return(mensaje);
	}
	
}
