package linea;

import java.util.Scanner;

import linea.linea.Linea;
import linea.linea.Punto;

public class Menu {

	public static final String MENU ="\n1. Mover línea\r\n"
									+ "2. Mostrar línea\r\n"
									+ "3. Salir\n";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca eje x del punto A: ");
		double xA = Double.valueOf(sc.nextLine());
		System.out.println("Introduzca eje y del punto A: ");
		double yA = Double.valueOf(sc.nextLine());
		System.out.println("Introduzca eje x del punto B: ");
		double xB = Double.valueOf(sc.nextLine());
		System.out.println("Introduzca eje y del punto B: ");
		double yB = Double.valueOf(sc.nextLine());
		
		Linea l =new Linea(new Punto(xA,yA), new Punto(xB,yB));
		 
		System.out.println(MENU);
		
		System.out.println("Introduzca su eleccion: ");
		int opc = Integer.valueOf(sc.nextLine());
		
		while(opc!=3) {
			switch (opc) {
			case 1:
				System.out.println("A-arriba, B-ABajo, I-Izquierda, D-Derecha");
				char p = sc.nextLine().charAt(0);
				switch (p) {
				case 'A':
					System.out.println("Introduce la distancia:");
					double d = Double.valueOf(sc.nextLine());
					l.moverArriba(d);
					break;
				case 'B':
					System.out.println("Introduce la distancia:");
					d = Double.valueOf(sc.nextLine());
					l.moverAbajo(d);
					break;
				case 'I':
					System.out.println("Introduce la distancia:");
					d = Double.valueOf(sc.nextLine());
					l.moverIzquierda(d);
					break;
				case 'D':
					System.out.println("Introduce la distancia:");
					d = Double.valueOf(sc.nextLine());
					l.moverDerecha(d);
					break;
				}
				break;
			case 2:
				System.out.println(l.toString());
				break;

			}
			System.out.println(MENU);
			
			System.out.println("Introduzca su eleccion: ");
			opc = Integer.valueOf(sc.nextLine());
		}
		

	}

}
