package mockExam;

import java.util.Scanner;

public class Ejercicio2Frecuencia {

	public static final double FCMRecomendada=0.85;//85%
	public static final double FCM=220;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el año actual; ");
		int anyo=Integer.valueOf(sc.nextLine());
		
		System.out.println("Introduce la fecha de nacimiento (dd/mm/yyyy); ");
		String fecha=sc.nextLine();
		
		System.out.println("La frecuencia maxima recomendada es: "+frecuenciaCardiaca(anyo, fecha));

	}
	
	public static double frecuenciaCardiaca(int anyo, String fecha) {
		int fechaAnyo=Integer.valueOf(fecha.substring(6,fecha.length()));
		double porcentaje=1-FCMRecomendada;
		return FCM-((anyo-fechaAnyo)*porcentaje);
	}

}
