package mockExam;

import java.util.Scanner;

public class Ejercicio1Cine {
	
	public static final double PRECIO_MIERCOLES=5;
	public static final double PRECIO_JUEVES=11;
	public static final double PRECIO_NORMAL=8;
	public static final double DESCUENTO=0.1;
	public static final String DIAS_SEMANAS="LMXJVSD";
	public static final String POSEE_TARJETA="SN";

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String diaSemana="";
		String tarjeta="";
		
		System.out.println("Numero de entradas: ");
		int numeroEntradas = Integer.valueOf(sc.nextLine());
		
		while(numeroEntradas>0) {
			double precio=0;
			
			do{
				System.out.println("Dia de la semana (L,M,X,J,V,S,D): ");
				diaSemana=sc.nextLine().toUpperCase();
			}while(DIAS_SEMANAS.indexOf(diaSemana)==-1);
			
			do{
				System.out.println("Tienes tarjeta CineJacaranda?(S/N): ");
				tarjeta=sc.nextLine().toUpperCase();
			}while(POSEE_TARJETA.indexOf(tarjeta)==-1);
			
			
			if(diaSemana.equalsIgnoreCase("X")) {
				precio=PRECIO_MIERCOLES*numeroEntradas;
			}else if (diaSemana.equalsIgnoreCase("J")) {
				precio=((int)PRECIO_JUEVES*(numeroEntradas/2))+PRECIO_NORMAL*(numeroEntradas%2);
			}else {
				precio=PRECIO_NORMAL*numeroEntradas;
			}
			
			precio = tarjeta.equalsIgnoreCase("S")? precio*(1-DESCUENTO) : precio;
			System.out.println("El precio de su compra es "+precio+" euros.");
			
			System.out.println("Numero de entradas: ");
			numeroEntradas = Integer.valueOf(sc.nextLine());	
		}
	}
}
