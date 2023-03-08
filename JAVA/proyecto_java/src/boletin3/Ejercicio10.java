package boletin3;

public class Ejercicio10 {

	public static final String ABECEDARIO="abcdefghijklmnñopqrstuvwxyz";
	
	
	public static void main(String[] args) {
		
		System.out.println(caracterCifradoCesar('z', 3));
		System.out.println(palabraCifradoCesar("CASADO", 3));
		System.out.println(obtenerNivelEquivalentesCifradoCesar("CASado","fdvdgr"));
		
	}
	
	public static char caracterCifradoCesar(char l, int posiciones) {
		char letra = Character.toLowerCase(l);
		return ABECEDARIO.charAt((ABECEDARIO.indexOf(letra)+posiciones)%ABECEDARIO.length());
	}
	
	public static String palabraCifradoCesar(String p, int posiciones) {
		StringBuilder res= new StringBuilder();
		
		if(p!=null && !p.isEmpty()) {
			String palabra = p.toLowerCase();
			for(int i=0; i<palabra.length();i++) {
				res.append(caracterCifradoCesar(palabra.charAt(i), posiciones));
			}
		}
		return res.toString();
	}
	
	public static int obtenerNivelEquivalentesCifradoCesar(String palabra, String palabraCifrada) {
		int desplazamiento=-1;
		boolean equivalentes = false;
		
		while(!equivalentes && desplazamiento<=ABECEDARIO.length()) {
			desplazamiento++;
			if(palabraCifradoCesar(palabra, desplazamiento).equalsIgnoreCase(palabraCifrada)) {
				equivalentes=true;
			}
		}
		return equivalentes?desplazamiento:0;
	}
	
}
