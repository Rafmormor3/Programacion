package boletin2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		double coeA=0, coeB=0, coeC=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce coeficiente A: ");
		coeA=Double.valueOf(sc.nextLine());
		
		System.out.print("Introduce coeficiente B: ");
		coeB=Double.valueOf(sc.nextLine());
		
		System.out.print("Introduce coeficiente C: ");
		coeC=Double.valueOf(sc.nextLine());
		
		System.out.println("El numero de soluciones de la ecuación de segundo grado es "+ numeroSolucionesEcuacionSegundoGrado(coeA, coeB, coeC));

	}
	
	public static int numeroSolucionesEcuacionSegundoGrado(double coeA, double coeB, double coeC) {
		double radicando=Math.pow(coeB, 2)-4*coeA*coeC;
		
		int resultados=0;
		
		if(coeA!=0) {
			if(radicando>0) {
				resultados=2;
			}else if(radicando==0) {
				resultados=1;
			}else {
				resultados=0;
			}
		}else {
			resultados=-1;
		}
		return resultados;
		
	}

}
