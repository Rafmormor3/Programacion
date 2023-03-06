package jarras;

import java.util.Scanner;

import jarras.jarraObj.Jarra;

public class Menu {

	public static final String MENU ="\n1. Llenar jarra\r\n"
									+ "2. Vaciar jarra\r\n"
									+ "3. Volcar jarra A en B . \r\n"
									+ "4. Volcar jarra B en A.\r\n"
									+ "5. Ver estado de las jarras: Se mostrará la capacidad y el agua que contiene, tanto\r\n"
									+ "para la jarra A como para la B.\r\n"
									+ "6. Salir.\r\n";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la capacidad de A:");
		double n = Double.valueOf(sc.nextLine());
		
		Jarra A = new Jarra(n);
		
		System.out.println("Introduce la capacidad de B:");
		n = Double.valueOf(sc.nextLine());
		
		Jarra B = new Jarra(n);
		
		System.out.println(MENU);
		System.out.println("Introduce la opcion: ");
		int o = Integer.valueOf(sc.nextLine());
		
		while(o!=6) {
			switch (o) {
			case 1:
				System.out.println("Que jarra llenara (A/B)");
				char j = sc.nextLine().charAt(0);
				if(j=='A') {
					A.llenarJarra();
				}else if(j=='B'){
					B.llenarJarra();
				}else {
					System.out.println("Esa jarra no existe.");
				}
				break;
			case 2:
				System.out.println("Que jarra vaciara (A/B)");
				j = sc.nextLine().charAt(0);
				if(j=='A') {
					A.vaciarJarra();
				}else if(j=='B'){
					B.vaciarJarra();
				}else {
					System.out.println("Esa jarra no existe.");
				}
				break;
			case 3:
				A.volcarJarra(B);
				break;
			case 4:
				B.volcarJarra(A);
				break;
			case 5:
				System.out.println("Jarra A: "+A.toString());
				System.out.println("Jarra B: "+B.toString());
				break;

			}
			System.out.println(MENU);
			System.out.println("Introduce la opcion: ");
			o = Integer.valueOf(sc.nextLine());
		}

	}

}
