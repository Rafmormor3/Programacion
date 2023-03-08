package boletin1;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		int numero=0, cont=0, contp=0,max=0;
		double pares=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		numero=Integer.valueOf(sc.nextLine());
		
		while(numero>0) {
			cont++;
			if(numero%2==0) {
				pares+=numero;
				contp++;
				max=(max<numero)?numero:max;
			}
			System.out.println("Introduce un numero: ");
			numero=Integer.valueOf(sc.nextLine());
		}
		System.out.println("Numeros introducidos: "+cont);
		System.out.println("Media de numeros pares: "+(pares/contp));
		System.out.println("Mayor numero par: "+max);

	}

}
