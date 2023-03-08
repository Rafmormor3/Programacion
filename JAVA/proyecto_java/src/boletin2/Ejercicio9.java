package boletin2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		System.out.println(toDecimal(null));
		System.out.println(toDecimal(""));
		System.out.println(toDecimal("11"));
	}
	
	public static int toDecimal(String binario) {
		
		int decimal=0;
		int cont=0;
		
		if(validarBinario(binario)) {
			for(int i=binario.length()-1; i>=0;i--) {
				int bit = Character.getNumericValue(binario.charAt(i));
				decimal+= bit * (int) Math.pow(2, cont);
				cont++;
			}
		}
	
		return decimal;
	}
	
	public static boolean validarBinario(String binario) {
		boolean res=false;
		if(binario!=null && !binario.isEmpty()) {
			for(int i=0; i<binario.length();i++) {
				if(binario.charAt(i)=='0' || binario.charAt(i)=='1') {
					res=true;
				}
			}
		}
		return res;
	}

}
