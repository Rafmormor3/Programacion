package repaso;

import java.util.Scanner;

public class cine {
	
	public static final String DIAS_SEMANA="LMXJVSD";
	public static final String CARNET="SN";
	public static final double PRECIO_MIERCOLES=5;
	public static final double PRECIO_JUEVES=11;
	public static final double PRECIO_BASICO=8;
	public static final double DESCUENTO=0.1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dia=""; 
		String c="";
		int entradas=0;
		
		do {
			System.out.println("Introduce numero de entradas: ");
			entradas = Integer.valueOf(sc.nextLine());
				
			}while(entradas<0);
		
		while(entradas!=0) {
			
			StringBuilder sb = new StringBuilder();
			
			do {
				System.out.println("Introduce un dia de la semana (LMXJVSD);");
				dia=sc.nextLine().toUpperCase();
			}while(!DIAS_SEMANA.contains(dia));
			
			do {
				System.out.println("Tien tarjetaCine? ");
				c=sc.nextLine().toUpperCase();
			}while(!CARNET.contains(c));
			
			
			double precio=0;
			
			if(dia.equals("X")) {
				precio=PRECIO_MIERCOLES*entradas;
			}else if(dia.equals("J")) {
				precio=PRECIO_JUEVES*(entradas/2)+PRECIO_BASICO*(entradas%2);
			}else {
				precio=PRECIO_BASICO*entradas;
			}
			
			if(c.equals("S")) {
				precio=precio*(1-DESCUENTO);
			}
			
			sb.append("El precio de sus entradas es: "+precio);
			
			System.out.println(sb.toString());
			
			do {
				System.out.println("Introduce numero de entradas: ");
				entradas = Integer.valueOf(sc.nextLine());
					
				}while(entradas<0);
			
			
		}
		
		
		

	}

}
