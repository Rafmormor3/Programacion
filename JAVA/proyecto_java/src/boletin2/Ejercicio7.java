package boletin2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int hora1=0, hora2=0, min1=0, min2=0, seg1=0, seg2=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce hora1: ");
		hora1=Integer.valueOf(sc.nextLine());
		
		System.out.print("Introduce min1: ");
		min1=Integer.valueOf(sc.nextLine());
		
		System.out.print("Introduce seg1: ");
		seg1=Integer.valueOf(sc.nextLine());
		
		System.out.print("Introduce hora2: ");
		hora2=Integer.valueOf(sc.nextLine());
		
		System.out.print("Introduce min2: ");
		min2=Integer.valueOf(sc.nextLine());
		
		System.out.print("Introduce seg2: ");
		seg2=Integer.valueOf(sc.nextLine());
		
		if((hora1>=0 && hora1<=23) && (hora2>=0 && hora2<=23) && (min1>=0 && min1<=59) && 
				(min2>=0 && min2<=59) && (seg1>=0 && seg1<=59) && (seg2>=0 && seg2<=59)) {
			System.out.println("La diferencia de segundos entre una hora y otra es: "+segundosEntre(hora1, hora2, min1, min2, seg1, seg2)+" segundos");
		}else {
			System.out.println(-1000);
		}

	}
	
	static int segundosEntre(int h1, int h2, int m1, int m2, int s1, int s2) {
		
		int t1=h1*60*60+m1*60+s1;
		int t2=h2*60*60+m2*60+s2;
		
		int res=Math.abs(t1-t2);
		
		return res;
	}
}
