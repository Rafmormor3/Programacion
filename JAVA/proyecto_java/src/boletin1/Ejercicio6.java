package boletin1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int dia=0;
		int mes=0;
		
		System.out.print("Introduzca el dia:");
		Scanner sc1 = new Scanner(System.in);
		dia=Integer.valueOf(sc1.nextLine());
		
		System.out.print("Introduzca el mes:");
		Scanner sc2 = new Scanner(System.in);
		mes=Integer.valueOf(sc2.nextLine());
		
		if(dia<=0 || dia>31 || mes<=0 || mes>12) {
			System.out.println("Fecha no valida");
		}else {
			if((dia<=31 && dia>=20 && mes==3) || (mes==4 && dia>=1 && dia<=30) || (mes==5 && dia>=1 && dia<=31) || (mes==6 && dia>=1 && dia<=20)) {
				System.out.println("Primavera --> 20º");
			}else if((dia<=30 && dia>=21 && mes==6) || (mes==7 && dia>=1 && dia<=31) || (mes==8 && dia>=1 && dia<=31) || (mes==9 && dia>=1 && dia<23)) {
				System.out.println("Verano --> 24º");
			}else if((dia<=30 && dia>=23 && mes==9) || (mes==10 && dia>=1 && dia<=31) || (mes==11 && dia>=1 && dia<=30) || (mes==12 && dia>=1 && dia<21)) {
				System.out.println("Otonio --> 19º");
			}else {
				System.out.println("Invierno --> 19º");
			}
		}

	}

}
