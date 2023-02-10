package mockExam;

import java.util.Scanner;

public class Ejercicio1Cine {
	
	static final int PRECIO_MIERCOLES=5;
	static final int PRECIO_JUEVES=11;
	static final int PRECIO_NORMAL=8;
	static final double DESCUENTO=0.9;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero de entradas: ");
		int numeroEntradas = Integer.valueOf(sc.nextLine());
		
		while(numeroEntradas>0) {
			int precio=0;
			
			
			System.out.println("Dia de la semana (L,M,X,J,V,S,D): ");
			char diaSemana=sc.nextLine().charAt(0);
			diaSemana=Character.toUpperCase(diaSemana);
			
			System.out.println("Tienes tarjeta CineJacaranda?(S/N): ");
			char tarjeta=sc.nextLine().charAt(0);
			tarjeta=Character.toUpperCase(tarjeta);
			
			if(diaSemana=='X') {
				precio=PRECIO_MIERCOLES*numeroEntradas;
			}else if (diaSemana=='J') {
				precio=PRECIO_JUEVES*(numeroEntradas/2)+PRECIO_NORMAL*(numeroEntradas%2);
			}else {
				precio=PRECIO_NORMAL*numeroEntradas;
			}
			
			double prec = tarjeta=='S'? precio*DESCUENTO : precio;
			System.out.println("El precio de su compra es "+prec+" euros.");
			
			System.out.println("Numero de entradas: ");
			numeroEntradas = Integer.valueOf(sc.nextLine());
			
		}

	}

}
