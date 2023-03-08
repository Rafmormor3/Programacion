package com.edu;

import java.util.Scanner;

public class Principal {
	
	//Método principal o punto de entrada en java
	
	public static void main(String[] args) {

		//System.out.println("Hola, " + args[0]); //Para consola
		/*
		System.out.print("Introduce algo: ");
		
		Scanner sc = new Scanner(System.in);
		
		String cadena = sc.nextLine();
		
		System.out.println("El contenido de la cadena es: "+cadena);
		System.out.print("Introduzca algo mas: ");
		
		String cadena2=sc.nextLine();
		System.out.println("El contenido de la cadena es: "+cadena+' '+cadena2);
		int numero=390000000;
		System.out.println(numero);
		
		byte numeroMenor=(byte)numero;
		System.out.println(numeroMenor);
		
		char letra = 'a';
		System.out.println(letra);
		 */
		
		// || OR
		// && AND
		
		/*
		//Ejercicio 1
		int edad=0;
		
		System.out.println("Cuantos anyos tienes? ");
		Scanner sc = new Scanner(System.in);
		edad=Integer.valueOf(sc.nextLine());
		
		if (edad>=18) {
			System.out.println("Eres mayor de edad\n");
			//System.out.println("Puedes sacarte el carnet de conducir");
		}else {
			System.out.println("Eres menor de edad\n");
		}
		
		//Ejercicio 2
		
		System.out.println("Cuantos anyos tienes? ");
		Scanner sc1 = new Scanner(System.in);
		edad=Integer.valueOf(sc1.nextLine());
		
		if (edad>=18 && edad<=65) {
			System.out.println("Eres adulto\n");
		}else if (edad<18) {
			System.out.println("Eres un niñ@\n");
		}else {
			System.out.println("Eres un/una anciano/anciana\n ");
		}
		
		//Ejercicio 3
		
		int mes = 0;
		System.out.print("Introduzca el mes: ");
		Scanner sc3 = new Scanner(System.in);
		mes=Integer.valueOf(sc3.nextLine());
		
		int anyo=0;
		System.out.print("Introduzca el año:");
		Scanner sc4 = new Scanner(System.in);
		anyo=Integer.valueOf(sc4.nextLine());
		
		if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
			System.out.println("Tiene 31 dias el mes "+ mes);
		}else if(mes==2 && anyo%4==0 &&(anyo%100!=0 || anyo%400==0)) {
			System.out.println("Tiene 29 dias el mes "+ mes);
		}else if(mes==2) {
			System.out.println("Tiene 28 dias el mes "+ mes);
		}else {
			System.out.println("Tiene 30 dias el mes "+ mes);
		}
		
		
		int mes1 = 2;
		int year = 2022;
		
		switch (mes1) {
		case 1,3,5,8,10,12:{
			System.out.println("Tiene 31 dias");
			break;
		}case 4,6,9,11:{
			System.out.println("Tiene 30 dias");
			break;
		}case 2:{
			if (year%4==0 && (year%100!=0 || year%400==0)) {
				System.out.println("Tiene 29 dias");
			}else {
				System.out.println("Tiene 28 dias");
			}
			break;
		}default:{
			System.out.println("El mes introducido es erroneo");
			break;
		}
		 
		
		String n1="Ana";
		n1.concat(" Gonzalez");
		System.out.println(n1);
		
		StringBuilder nombre = new StringBuilder("Ana");
		nombre.append(false).append(3).append(" Gonzalez");
		n1.indexOf("Gon", 2);
		nombre.indexOf("Mu", 6);
		
		System.out.println(nombre);
		*/
		
		System.out.println(77%2);
		}
		
	}

