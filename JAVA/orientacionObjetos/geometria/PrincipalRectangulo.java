package geometria;

import java.util.Scanner;

import geometria.tipos.Circulo;
import geometria.tipos.Figura;
import geometria.tipos.Rectangulo;

public class PrincipalRectangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rectangulo rectangulo;
		
		System.out.println("Introduce el ancho;");
		double ancho = Double.valueOf(sc.nextLine());
		
		System.out.println("Introduce la longitud;");
		double longitud = Double.valueOf(sc.nextLine());
		
		rectangulo = new Rectangulo(ancho, longitud);
		
		System.out.println("Area: "+rectangulo.getArea());
		System.out.println("Perimetro: "+rectangulo.getPerimetro());
		
		//PROBAR HERENCIAS (abstract)
		Figura figura = new Circulo(9);
		System.out.println(figura.getArea());
		System.out.println(figura.getPerimetro());

	}

}
