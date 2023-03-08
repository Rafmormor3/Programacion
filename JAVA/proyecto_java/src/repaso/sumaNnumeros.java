package repaso;

import java.util.Scanner;

public class sumaNnumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero (fin para acabar):");
		String numero = sc.nextLine();
		
		int suma=0;
		while(!numero.equals("fin")) {
			int n=Integer.valueOf(numero);
			suma+=n;
			
			System.out.println("Introduce un numero (fin para acabar):");
			numero = sc.nextLine();
		}
		
		System.out.println("La suma de los numeros introducidos es: "+suma);

	}

}
