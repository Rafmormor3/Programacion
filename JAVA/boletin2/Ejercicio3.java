package boletin2;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		String cadena="";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca la contraseña: ");
		cadena=sc.nextLine();
		
		if(cadena.length()>=8 && hayMayuscula(cadena)==true && hayMinuscula(cadena) && hayDigitos(cadena)==true
				&& hayDigitos(cadena)==true) {
			System.out.println("Es segura");
		}else{
			System.out.println("No es segura la contraseña");
		}
		
	}
	
	public static boolean hayMayuscula(String cadena) {
		boolean res=false;
		for(int i=0; i<cadena.length(); i++) {
			if (Character.isUpperCase(cadena.charAt(i))) {
				res=true;
			}
		}
		return res;
	}
	
	public static boolean hayMinuscula(String cadena) {
		boolean res=false;
		for(int i=0; i<cadena.length(); i++) {
			if (Character.isLowerCase(cadena.charAt(i))) {
				res=true;
			}
		}
		return res;
	}
	
	public static boolean hayDigitos(String cadena) {
		boolean res=false;
		for(int i=0; i<cadena.length(); i++) {
			if (Character.isDigit(cadena.charAt(i))) {
				res=true;
			}
		}
		return res;
	}
	
	public static boolean haySignoPuntuacion(String cadena) {
		String signos =",.-;:_?¿¡!{}[]()";
		int cont=0, iguales=0;
		boolean res=false;
		
		for(int i=0;i<cadena.length();i++) {
			cont=0;
			while(cont<signos.length()) {
				if(cadena.charAt(i)==signos.charAt(cont)) {
					iguales++;
				}
				cont++;
			}
		}
		
		if(iguales>0) {
			res=true;
		}
		return res;
	}
	
	
}
