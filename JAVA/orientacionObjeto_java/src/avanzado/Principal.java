package avanzado;

import java.time.LocalDate;
import java.util.Scanner;

import avanzado.modelo.Genero;
import avanzado.modelo.Persona;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Genero genero=null;
		do {
			try {
				System.out.println("Introduce el genero (MASCULINO/FEMENINO): ");
				genero=Genero.valueOf(sc.nextLine().toUpperCase());
			}catch (Exception e) {
				System.out.println("Dato erroneo");
			}
		}while(genero==null);
		
		
		String nombre= null;
		do {
			try {
				System.out.println("Introduce su nombre: ");
				String n=sc.nextLine();
				nombre= !hayDigito(n)? n : null;
			}catch (Exception e) {
				System.out.println("Dato erroneo");
			}
		}while(nombre==null);
		
		String apellido1= null;
		do {
			try {
				System.out.println("Introduce su primer apellido: ");
				String n=sc.nextLine();
				apellido1= !hayDigito(n)? n : null;
			}catch (Exception e) {
				System.out.println("Dato erroneo");
			}
		}while(apellido1==null);
		
		String apellido2= null;
		do {
			try {
				System.out.println("Introduce su segundo apellido: ");
				String n=sc.nextLine();
				apellido2= !hayDigito(n)? n : null;
			}catch (Exception e) {
				System.out.println("Dato erroneo");
			}
		}while(apellido2==null);
		
		double altura=0;
		do {
			try {
				System.out.println("Introduce su altura: ");
				double a=Double.valueOf(sc.nextLine());
				if(a>0 && a<2.53) {
					altura=a;
				}
			}catch (Exception e) {
				System.out.println("Dato erroneo");
			}
		}while(altura==0);
		
		double peso=0;
		do {
			try {
				System.out.println("Introduce su peso: ");
				double a=Double.valueOf(sc.nextLine());
				if(a>0 && a<250) {
					peso=a;
				}
			}catch (Exception e) {
				System.out.println("Dato erroneo");
			}
		}while(peso==0);
		
		int dia=0;
		int mes=0;
		int anyo=0;
		LocalDate fecha=null;
		do {
			try {
				System.out.println("Introduce el dia de su nacimiento: ");
				int a=Integer.valueOf(sc.nextLine());
				if(a>0 && a<=31) {
					dia=a;
				}
				
				System.out.println("Introduce el dia de su nacimiento: ");
				 a=Integer.valueOf(sc.nextLine());
				if(a>0 && a<=12) {
					mes=a;
				}
				
				System.out.println("Introduce el dia de su nacimiento: ");
				 a=Integer.valueOf(sc.nextLine());
				if(a>1900 && a<=LocalDate.now().getYear()) {
					anyo=a;
				}
				
				if(dia!=0 && mes !=0 && anyo!=0) {
					fecha = LocalDate.of(anyo, mes, dia);
				}
				
			}catch (Exception e) {
				System.out.println("Dato erroneo");
			}
		}while(fecha==null);
		
		Persona antonio = new Persona(genero,nombre,apellido1, apellido2, peso, altura, fecha);
		
		System.out.println(antonio.toString());

	}
	
	public static boolean hayDigito(String n) {
		boolean digito=false;
		if(n!=null && !n.isEmpty()) {
			for(int i=0;i<n.length() && digito==false ;i++) {
				if(Character.isDigit(n.charAt(i))) {
					digito=true;
				}
			}
		}
		return digito;
	}

}
