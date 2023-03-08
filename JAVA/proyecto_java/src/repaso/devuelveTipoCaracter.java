package repaso;

import java.util.Scanner;

public class devuelveTipoCaracter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un caracter: ");
		char c = sc.nextLine().charAt(0);
		
		System.out.println(tipoCaracter(c));

	}

	public static String tipoCaracter(char c) {
		StringBuilder sb = new StringBuilder();
		
		if(Character.isLowerCase(c)) {
			sb.append("Letra minuscula");
		}else if(Character.isUpperCase(c)) {
			sb.append("Letra mayuscula");
		}else if(Character.isDigit(c)) {
			sb.append("Es un digito entre 0 y 9");
		}else if(c=='.' || c==',') {
			sb.append("Es un signo de puntuacion");
		}else if(Character.isWhitespace(c)) {
			sb.append("Es un espacio en blanco");
		}else if(c=='(' || c==')' || c=='{' || c=='}') {
			sb.append("Es () o {}");
		}else {
			sb.append("Es otro caracter.");
		}
		
		return sb.toString();
	}
}
