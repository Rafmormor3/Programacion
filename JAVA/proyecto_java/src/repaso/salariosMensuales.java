package repaso;

import java.util.Scanner;

public class salariosMensuales {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cont=0, salario=0, sum=0;
		
		for(int i=0; i<10; i++) {
			System.out.println("Introduce salario: ");
			salario=Integer.valueOf(sc.nextLine());
			
			sum+=salario;
			
			if(salario>1000) {
				cont++;
			}
		}
		System.out.println("Suma de los salarios:"+sum+"  Salarios mayores a 1000:"+cont);

	}
	
}
