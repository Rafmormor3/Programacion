package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont[]= new int[10];
		
		int suma=0;
		int veces=0;
		
		System.out.println("Introduce un numero del 1 al 1000 (-1 para parar): ");
		int num = Integer.valueOf(sc.nextLine());
		
		while(num>0) {
			suma+=num;
			veces++;
			
			String nu = String.valueOf(num);
			int n = Character.getNumericValue(nu.charAt(nu.length()-1));
			
			cont[n]++;
			
			System.out.println("Introduce un numero del 1 al 1000 (-1 para parar): ");
			num = Integer.valueOf(sc.nextLine());
			
		}
		System.out.println("Media numeros introducidos: "+(double)suma/(double)veces);
		System.out.println(Arrays.toString(cont));
		
		int mayor=cont[0], m=0;
		for(int i=1; i<cont.length;i++) {
			if(cont[i]>mayor) {
				m=i;
				mayor=cont[i];
			}
		}
		System.out.println("Digito que mas veces termina: "+ m);
		
		System.out.println("Digitos que no ha terminado ningun numero: ");
		for(int i=0; i<cont.length;i++) {
			if(cont[i]==0) {
				System.out.println(i);
			}
		}
		

	}

}
