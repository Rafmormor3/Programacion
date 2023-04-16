package boletin1EstructuraDeDatos.ejercicio4;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Principal {
	
	public static final String MENU = "\n1.Nueva Pagina \n2.Consultar Historial Completo \n3.Consultar historial de un dia "
									+ "\n4.Borrar todo el historial \n5.Borrar visitas a una pagina \n6.Salir\n";

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Historial h = new Historial();
		
		System.out.println(MENU);
		
		System.out.println("Elija una de las opciones: ");
		int opc = Integer.valueOf(sc.nextLine());
		
		while(opc!=6) {
			try {
				if(opc==1) {
					System.out.println("Introduce nombre de la pagina: ");
					String nombre = sc.nextLine();
					
					System.out.println("Introduce la fecha (dd/mm/yyyy hh/mm/ss): ");
					String fechaHora = sc.nextLine();
					int d =Integer.valueOf(fechaHora.substring(0, 2));
					int m =Integer.valueOf(fechaHora.substring(3, 5));
					int y =Integer.valueOf(fechaHora.substring(6, 10));
					int hora =Integer.valueOf(fechaHora.substring(11, 13));
					int min =Integer.valueOf(fechaHora.substring(14, 16));
					int seg =Integer.valueOf(fechaHora.substring(17));
					
					h.nuevaPaginaConsultada(nombre, LocalDateTime.of(y, m, d, hora, min, seg));
					
				}else if(opc==2) {
					System.out.println(h.consultarHistorialCompleto());
					
				}else if(opc==3) {
					System.out.println("Introduce el dia a consultar (dd/mm/yyyy): ");
					String fechaHora = sc.nextLine();
					int d =Integer.valueOf(fechaHora.substring(0, 2));
					int m =Integer.valueOf(fechaHora.substring(3, 5));
					int y =Integer.valueOf(fechaHora.substring(6));
					
					System.out.println(h.consultarHistorialDia(LocalDateTime.of(y, m, d, 0, 0, 0)));
					
				}else if(opc==4) {
					h.borrarHistorial();
					
				}else {
					//No me va
					System.out.println("Introduce la pagina que quiere borrar: ");
					String nombre = sc.nextLine();
					h.borrarVisitas(nombre);
				}
				System.out.println(MENU);
				System.out.println("Elija una de las opciones: ");
				opc = Integer.valueOf(sc.nextLine());
				
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		

	} 

}
