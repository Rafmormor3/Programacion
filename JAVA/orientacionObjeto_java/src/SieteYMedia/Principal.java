package SieteYMedia;

import java.util.Scanner;

import SieteYMedia.Cartas.Baraja;
import SieteYMedia.Cartas.Carta;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Baraja b;
		try {
			b = new Baraja();
		} catch (Exception e1) {
			e1.getMessage();
		}
		
		double puntUser=0;
		double puntBanca=0;
		System.out.println("Bienvenido a las 7/30");
		
		System.out.println("\nQuiere jugar?(S/N)");
		char res=sc.nextLine().charAt(0);
		while(res!='S' && res!='N') {
			System.out.println("Opcion incorrecta");
			System.out.println("\nQuiere jugar?(S/N)");
			res=sc.nextLine().charAt(0);
		}
		
		b.barajar();
		try {
			
			if(res=='S') {
				
				System.out.println("\nEs su Turno");
				Carta c = b.getSiguiente();
				System.out.println("Su primera carta es: "+ c);
				puntUser+=c.getValor();
				System.out.println("Puntuacion del usuario: "+puntUser);
				char us='S';
				
				while(us=='S' && puntUser<=7.5) {
					if(us=='S') {
						System.out.println("\nQuiere carta?(S/N)");
						us=sc.nextLine().charAt(0);
						while(us!='S' && us!='N') {
							System.out.println("Opcion incorrecta");
							System.out.println("\nQuiere carta?(S/N)");
							us=sc.nextLine().charAt(0);
						}
						if(us=='S') {
							c = b.getSiguiente();
							System.out.println("Su carta es: "+ c);
							puntUser+=c.getValor();
							System.out.println("Puntuacion del usuario: "+puntUser);
						}
					}
					
				}
				
				System.out.println("\nTurno de la banca: ");
				char banc='S';
				c = b.getSiguiente();
				System.out.println("La carta de la banca es: "+ c);
				puntBanca+=c.getValor();
				System.out.println("Puntuacion de la banca: "+puntBanca);
				
				while(banc=='S'  && puntBanca<=7.5) {
					if(banc=='S') {
						System.out.println("\nQuiere carta?(S/N)");
						banc=sc.nextLine().charAt(0);
						while(banc!='S' && banc!='N') {
							System.out.println("Opcion incorrecta");
							System.out.println("\nQuiere carta?(S/N)");
							banc=sc.nextLine().charAt(0);
						}
						
						if(banc=='S') {
							c = b.getSiguiente();
							System.out.println("Carta de la banca: "+ c);
							puntBanca+=c.getValor();
							System.out.println("Puntuacion de la banca: "+puntBanca);
						}
					}
				}
				
				if((puntBanca>=puntUser || puntUser>7.5) && puntBanca<=7.5) {
					System.out.println("Gana la banca");
				}else {
					System.out.println("HAS GANADO");
				}
			}
			
			System.out.println("Vuelva Pronto");
			
			
		}catch(Exception e){
			e.getMessage();
		}
		

	}

}
