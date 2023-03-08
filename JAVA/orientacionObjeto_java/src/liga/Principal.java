package liga;

import liga.partido.Partido;
import liga.partido.equipos.Equipo;

public class Principal {

	public static void main(String[] args) {
		
		Equipo betis =new Equipo("Betis","Villamarin","Sevilla",0);
		Equipo sevilla = new Equipo("Sevilla","Pizjuan","Sevilla",0);
		
		Partido p1 = new Partido(1, betis,sevilla, 'X');
		System.out.println(p1.toString());
		
		System.out.println("\n");
		
		p1.ponerResultado("3-1");
		System.out.println(p1.toString());
		
		System.out.println("\n");
		
		Partido p2 = new Partido(2, sevilla, betis, '1');
		p2.ponerResultado("2-1");
		System.out.println(p2.toString());
		
		

	}

}
