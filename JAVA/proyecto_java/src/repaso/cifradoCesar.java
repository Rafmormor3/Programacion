package repaso;

public class cifradoCesar {
	
	public static final String ABC="abcdefghijklmnñopqrstuvwxyz";

	public static void main(String[] args) {
		System.out.println(convertirCaracter('b', 1));
		System.out.println(convertirPalabra("casado",3 ));

	}
	
	public static char convertirCaracter(char c, int nivel) {
		return ABC.charAt((ABC.indexOf(c)+nivel)%ABC.length());
	}
	
	public static String convertirPalabra(String palabra, int nivel) {
		StringBuilder sb = new StringBuilder();
		palabra.toLowerCase();
		
		if(palabra!=null && !palabra.isEmpty() && nivel>0) {
			for(int i=0; i<palabra.length(); i++) {
				sb.append(convertirCaracter(palabra.charAt(i), nivel));
			}
		}
		return sb.toString().toUpperCase();
	}

}
