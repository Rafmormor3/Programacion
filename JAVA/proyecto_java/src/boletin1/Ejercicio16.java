package boletin1;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		int numero=0, cont=0, mayor=0, suma=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(cont<3) {
			
			System.out.print("Introduce los sueldos de cada empleado: ");
			numero=Integer.valueOf(sc.nextLine());
			
			cont++;
			suma =suma+numero;
			if(numero>=1000) {
				mayor++;
			}
		}
		System.out.println("Suma total es: "+suma);
		System.out.println("Total empleados con mas de 1000€ de sueldo: "+mayor);
		
	}
}
