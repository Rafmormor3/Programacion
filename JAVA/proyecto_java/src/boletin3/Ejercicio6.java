package boletin3;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero entero para saber si es capicua: ");
		int numero = Integer.valueOf(sc.nextLine());
		System.out.println(esCapicua(numero));
		
		System.out.print("Introduce un decimal para saber si es capicua: ");
		double decimal = Double.valueOf(sc.nextLine());
		System.out.println(esCapicua(decimal));
		
		
		//System.out.println(esCapicua(1234));
		//System.out.println(esCapicua(12.12));

	}
	
	public static boolean esCapicua(int num) {
		boolean res;
		String numero = String.valueOf(num);
		String vuelta= String.valueOf(Ejercicio5.darVuelta(numero));
		
		res= numero.equals(vuelta)?true:false;
		return res;
	}
	
	public static boolean esCapicua(double num) {
		boolean res;
		String numero = String.valueOf(num);
		String cadena="";
		
		for(int i=0; i<numero.length();i++) {
			if(!(numero.charAt(i)=='.')) {
				cadena+=numero.charAt(i);
			}
		}
		String vuelta=String.valueOf(Ejercicio5.darVuelta(cadena));
		
		res=cadena.equals(vuelta)?true:false;
		return res;
		
	}
	

}
