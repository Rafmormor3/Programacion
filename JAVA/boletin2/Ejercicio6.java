package boletin2;

import java.util.Scanner;

public class Ejercicio6 {

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
			System.out.println(horaMayor(hora1, hora2, min1, min2, seg1, seg2));
		}else {
			System.out.println(-1000);
		}

	}
	
	public static int horaMayor(int hora1, int hora2, int min1, int min2, int seg1, int seg2){
		int res=0;
		
		if(hora1>hora2 || (hora1==hora2 && min1>min2) || (hora1==hora2 && min1==min2 && seg1>seg2)) {
			res=1;
		}else if(hora1<hora2 || (hora1==hora2 && min1<min2) || (hora1==hora2 && min1==min2 && seg1<seg2)) {
			res=2;
		}else {
			res=0;
		}
		return res;
	}

}
