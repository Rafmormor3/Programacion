package boletin2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		String binario="";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero binario:");
		binario=sc.nextLine();
		
		int cont=0;
		for(int i=0; i<binario.length(); i++) {
			if (!(binario.charAt(i)=='1' || binario.charAt(i)=='0')) {
				cont++;
			}
		}
		
		if(cont>0) {
			System.out.println("No es binario.");
		}else {
			System.out.println(toDecimal(binario));
		}
	}
	
	public static int toDecimal(String binario) {
		
		int decimal=0;
		int cont=0;
		
		for(int i=binario.length()-1; i>=0;i--) {
			int bit = Character.getNumericValue(binario.charAt(i));
			decimal+= bit * (int) Math.pow(2, cont);
			cont++;
			
		}
		return decimal;
	}

}
