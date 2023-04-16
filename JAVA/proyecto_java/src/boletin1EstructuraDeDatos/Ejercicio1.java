package boletin1EstructuraDeDatos;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		String[] nombre = new String[3];
		nombre[0]="Rafa";
		nombre[1]="Paco";
		nombre[2]="Jose";
		
		Integer[] numeros = {0,1,2,3,4};
		
		System.out.println(Arrays.toString(nombre));
		System.out.println(Arrays.toString(reverse(nombre)));
		System.out.println(Arrays.toString(reverse(numeros)));
		
		
	}
	
	protected static <T> T[] reverse (T[] arrayOriginal) {
		//Object[] arrayAux = (T[]) new Object[arrayOriginal.length] ;
		T[] copia = arrayOriginal.clone();
		for(int i=arrayOriginal.length-1; i>=0; i--) {
			copia[i]=arrayOriginal[arrayOriginal.length-1 -i];
		}
		return copia;
		
	}

}
