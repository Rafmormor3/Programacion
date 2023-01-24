package boletin1;

public class Ejercicio7 {

	public static  final int LOWER_LIMIT=0;
	public static  final int UPPER_LIMIT=100;
	
	public static void main(String[] args) {
	
		int cont=0;
		
		System.out.println("Bucle WHILE");
		while(cont<UPPER_LIMIT) {
			cont++;
			System.out.print(cont+",");
		}
		System.out.println("\n");
		while(cont>LOWER_LIMIT) {
			System.out.print(cont+",");
			cont--;
		}
		System.out.println("\n");
		while(cont<=UPPER_LIMIT) {
			if(cont%5==0) {
				System.out.print(cont+",");
				cont++;
			}else {
				cont++;
			}
		}
		System.out.println("\n");
		int cont3 = 320;
		while(cont3>=160) {
			System.out.print(cont3+",");
			cont3=cont3-20;
		}
		
		
		System.out.println("\n");
		System.out.println("\nBucle FOR");
		for(int i=LOWER_LIMIT; i<=UPPER_LIMIT; i++) {
			System.out.print(i+",");
		}
		System.out.println("\n");
		for(int i=UPPER_LIMIT; i>LOWER_LIMIT; i--) {
			System.out.print(i+",");
		}
		System.out.println("\n");
		for(int i=LOWER_LIMIT; i<=UPPER_LIMIT; i++) {
			if(i%5==0) {
				System.out.print(i+",");
			}
		}
		System.out.println("\n");
		for(int i=320; i>=160; i=i-20) {
			System.out.print(i+",");
		}
		
		
		
		System.out.println("\n");
		System.out.println("\nBucle DO WHILE");
		int cont2=0;
		do {
			cont2++;
			System.out.print(cont2+",");
		}while(cont2<100);
		System.out.println("\n");
		do {
			System.out.print(cont2+",");
			cont2--;
		}while(cont2>0);
		System.out.println("\n");
		do {
			if(cont2%5==0) {
				System.out.print(cont2+",");
				cont2++;
			}else {
				cont2++;
			}
		}while(cont2<=100);
		System.out.println("\n");
		int cont4=320;
		do {
			System.out.print(cont4+",");
			cont4=cont4-20;
		}while(cont4>=160);

	}

}
