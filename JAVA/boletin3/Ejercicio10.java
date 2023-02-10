package boletin3;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		System.out.println(caracterCifradoCesar('Z', 3));
		System.out.println(palabraCifradoCesar("CASADO", 3));
		System.out.println(equivalentesCifradoCesar("CASado","fdvdgr" , 3));
		
	}
	
	public static char caracterCifradoCesar(char l, int posiciones) {
		char letra = Character.toLowerCase(l);
		String abc="abcdefghijklmnñopqrstuvwxyz";
		int i=0;
		char res = '0';
		
		while(i<abc.length() && res =='0') {
			if(abc.charAt(i)== letra) {
				if((i+posiciones)>=abc.length()) {
					res=abc.charAt((i+posiciones)-(abc.length()));
				}else {
					res=abc.charAt(i+posiciones);
				}
			}
			i++;
		}
		return res;
	}
	
	public static String palabraCifradoCesar(String p, int posiciones) {
		String res="";
		if(p!=null && !p.isEmpty()) {
			String palabra = p.toLowerCase();
			for(int i=0; i<palabra.length();i++) {
				res+=caracterCifradoCesar(palabra.charAt(i), posiciones);
			}
		}
		return res;
	}
	
	public static boolean equivalentesCifradoCesar(String p, String c, int posiciones) {
		boolean res=false;
		
		if(palabraCifradoCesar(p, posiciones).equals(c) && p!=null && !p.isEmpty()
				&& c!=null && !c.isEmpty()) {
			String palabra = p.toLowerCase();
			String cifrado = c.toLowerCase();
			res=true;
		}
		return res;
	}
	
}
