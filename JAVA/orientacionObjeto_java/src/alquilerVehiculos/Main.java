package alquilerVehiculos;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static final int MAXIMO_VEHICULOS=200;
	public static final String MENU = "1. Alta de vehículo\n2. Cálculo de precio de alquiler:\n3. Salir.";

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Vehiculo[] empresa = new Vehiculo[MAXIMO_VEHICULOS];
		int cont=0;
		
		System.out.println(MENU);
		
		
		System.out.println("Seleccione una opcion:");
		int n = Integer.valueOf(sc.nextLine());
		
		while(n!=3) {
			if(n==1) {
				
				String matricula="";
				Gama gama = null;
				Combustible combustible = null;
				
				System.out.println("Tipo de vehiculo (1->Coche/2->Microbus/3->Furgoneta)");
				int tipo = Integer.valueOf(sc.nextLine());
				if(tipo==1) {
					System.out.println("Introduzca la matricula:");
					matricula = sc.nextLine();
					System.out.println("Introduzca la gama (1->Alta/2->Media/3->Baja)");
					int g=Integer.valueOf(sc.nextLine());
					if(g==1) {
						gama=Gama.ALTA;
					}else if(g==2){
						gama=Gama.MEDIA;
					}else if(g==3) {
						gama=Gama.BAJA;
					}else {
						System.out.println("Incorrecto");
					}
					System.out.println("Introduzca la combustible (1->Gasolina/2->Diesel)");
					g=Integer.valueOf(sc.nextLine());
					if(g==1) {
						combustible=Combustible.GASOLINA;
					}else if(g==2){
						combustible=Combustible.DIESEL;
					}else {
						System.out.println("Incorrecto");
					}
					
					empresa[cont]=new Coche(matricula,gama,combustible);
					cont++;
					
				}else if(tipo==2) {
					System.out.println("Introduzca la matricula:");
					matricula = sc.nextLine();
					System.out.println("Introduzca la gama (1->Alta/2->Media/3->Baja)");
					int g=Integer.valueOf(sc.nextLine());
					if(g==1) {
						gama=Gama.ALTA;
					}else if(g==2){
						gama=Gama.MEDIA;
					}else if(g==3) {
						gama=Gama.BAJA;
					}else {
						System.out.println("Incorrecto");
					}
					System.out.println("Introduzca numero plaza");
					g=Integer.valueOf(sc.nextLine());
					
					empresa[cont]=new Microbus(matricula,gama,g);
					cont++;
					
				}else if(tipo==3) {
					System.out.println("Introduzca la matricula:");
					matricula = sc.nextLine();
					System.out.println("Introduzca la gama (1->Alta/2->Media/3->Baja)");
					int g=Integer.valueOf(sc.nextLine());
					if(g==1) {
						gama=Gama.ALTA;
					}else if(g==2){
						gama=Gama.MEDIA;
					}else if(g==3) {
						gama=Gama.BAJA;
					}else {
						System.out.println("Incorrecto");
					}
	
					empresa[cont]=new Furgoneta(matricula,gama);
					cont++;
				}else {
					System.out.println("Dato incorrecto");
				}
			}else if(n==2) {
				
				System.out.println("Introduzca matricula del vehiculo");
				String m = sc.nextLine();
				System.out.println("Introduzca el numero de dias a calcular");
				int numDias = Integer.valueOf(sc.nextLine());
				
				double precio = 0 ;
				boolean res=false;
				for(int i=0; i<empresa.length && res==false; i++) {
					if(empresa[i].getMatricula().equals(m)) {
						 precio=empresa[i].calcularPrecioAlquiler(m, numDias);
						 res=true;
					}
				}
				System.out.println("El precio del vehiculo "+m+"por "+numDias+" dias es de "+precio);
			}
			
			System.out.println(MENU);
			
			
			System.out.println("Seleccione una opcion:");
			n = Integer.valueOf(sc.nextLine());
		}
		
		
		
		
		

	}

}
