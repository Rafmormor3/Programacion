package boletin1;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int radio=0;
		
		System.out.print("Introduce el radio del Circulo: ");
		radio=Integer.valueOf(sc.nextLine());
		
		System.out.println("Area: "+calcularAreaCirculo(radio));
		System.out.println("Longitud: "+calcularLongitudCirculo(radio));

	}
	
	public static int calcularAreaCirculo(int radio) {
		int area =(int)(Math.PI * Math.pow(radio, 2));
		return area ;
	}
	
	public static int calcularLongitudCirculo(int radio) {
		int longitud = (int)(2*Math.PI*radio);
		return longitud;
	}

}
