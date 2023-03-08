package primeraClase;

import java.util.Scanner;

public class MenuAvion {
	
	public static final String MENU = "\na)Asignar Vuelo\n"
										+"b)Obtener numero de vuelos\n"
										+ "c)Obtener numero de kilometros\n"
										+ "d)Obtener media de kilometros por vuelo\n"
										+ "e)Cambio de compannia\n"
										+ "f)Informacion del avion\n"
										+ "g)Salir\n";

	public static void menu() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seleccione 1 para crear un avion con id y 2 para un avion con id y compannia:");
		Avion avion;
			
		if(Integer.valueOf(sc.nextLine())==1) {
			System.out.println("Introduce el idAvion: ");
			String id=sc.nextLine();
			
			System.out.println("Introduce la capacidad del avion: ");
			int cap = Integer.valueOf(sc.nextLine());
			
			avion=new Avion(id, cap);
			
		}else if(Integer.valueOf(sc.nextLine())==2) {
			System.out.println("Introduce el idAvion: ");
			String id=sc.nextLine();
			
			System.out.println("Introduce la capacidad del avion: ");
			int cap = Integer.valueOf(sc.nextLine());
			
			System.out.println("Introduce compannia: ");
			String comp = sc.nextLine();
			
			avion=new Avion(id, cap, comp);
			
		}else {
			avion=null;
		}
			
		System.out.println(MENU);
	
		System.out.println("Introduce una opcion: ");
		String opcion = sc.nextLine();
		
		
		
		while(!opcion.equalsIgnoreCase("G")) {
			
			switch (opcion) {
			case "A":
				
				System.out.println("Numero de asientos que estaran ocupados: ");
				int ocu=Integer.valueOf(sc.nextLine());
				
				System.out.println("Numero de km que recorrera el avion: ");
				double km = Double.valueOf(sc.nextLine());
				
				System.out.println("Se ha podido asignar el vuelo? "+ avion.asignarVuelos(ocu, km));
				break;
				
			case "B":
				System.out.println("Numero de vuelos realizados por el avion: "+avion.getNumVuelos());
				break;
				
			case "C":
				System.out.println("Numero de km total realizado por el avion: "+avion.getKmVolados());
				break;
				
			case "D":
				System.out.println("Media de km por vuelos: "+ avion.getMediaKm());
				break;
				
			case "E":
				System.out.println("Introduce la compannia a cambiar: ");
				String comp= sc.nextLine();
				
				avion.setCompannia(comp);
				break;
				
			case "F":
				System.out.println(avion.toString());
				
			}
			
			System.out.println(MENU);
			System.out.println("Introduce una opcion: ");
			opcion = sc.nextLine().toUpperCase();
		}
		
	}

}
