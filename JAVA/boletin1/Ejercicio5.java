package boletin1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int hora=0;
		
		System.out.println("Introduzca la hora:");
		Scanner sc = new Scanner(System.in);
		hora=Integer.valueOf(sc.nextLine());
		
		if(hora<0 || hora>23) {
			System.out.println("Hora no valida");
		}else {
			if(hora>=6 && hora<13) {
				System.out.println("BUENOS DIAS");
			}else if(hora>=13 && hora<21) {
				System.out.println("BUENAS TARDES");
			}else {
				System.out.println("BUENAS NOCHES");
			}
		}
		

	}

}
