package boletin2;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		System.out.println(invertirCaracterPorPares("Hola mundos"));
		

	}
	
	public static String invertirCaracterPorPares(String original) {
		
		StringBuilder sb = new StringBuilder();
		
		if(original!=null && !original.isEmpty()) {
			for (int i=0;i<original.length()-1; i+=2) {
				sb.append(original.charAt(i+1));
				sb.append(original.charAt(i));
			}
			/*
			if(original.length()%2!=0) {
				sb.append(original.charAt(original.length()-1));
			}
			*/
			sb.append((original.length()%2!=0)?original.charAt(original.length()-1):"");
		}
		
		return sb.toString();
	}

}
