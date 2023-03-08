package boletin1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int practica=0;
		int problemas=0;
		int teorico=0;
		
		System.out.print("Introduzca la nota practica: ");
		Scanner sc1 = new Scanner(System.in);
		practica=Integer.valueOf(sc1.nextLine());
		
		System.out.print("Introduzca la nota practica: ");
		Scanner sc2 = new Scanner(System.in);
		problemas=Integer.valueOf(sc2.nextLine());
		
		System.out.print("Introduzca la nota practica: ");
		Scanner sc3 = new Scanner(System.in);
		teorico=Integer.valueOf(sc3.nextLine());
		
		double notaMedia =practica*0.1 + problemas*0.5 + teorico*0.4;
		System.out.println("La nota media es: "+notaMedia);
		
		if (notaMedia<0 || notaMedia>10) {
			System.out.println("Error, la media no es valida.");
		}else {
			if(notaMedia<5) {
				System.out.println("Insuficiente");
			}else if(notaMedia>=5 && notaMedia<6) {
				System.out.println("Suficiente");
			}else if(notaMedia>=6 && notaMedia<7) {
				System.out.println("Bien");
			}else if(notaMedia>=7 && notaMedia<9) {
				System.out.println("Notable");
			}else {
				System.out.println("Sobresaliente");
			}
		}
	}

}
