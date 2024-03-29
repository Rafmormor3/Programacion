package boletin3;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//System.out.println(quitarBlancos("hola mundo muy cruel   "));
		//System.out.println(darVuelta("un mundo muy cruel"));
		System.out.println(esPalindromo("somos o no somos"));
		System.out.println(esPalindromo("Ligar es ser agil"));
		System.out.println(esPalindromo("un mundo muy cruel"));
		System.out.println(esPalindromo(null));
		System.out.println(esPalindromo(""));

	}
	
	public static String quitarBlancos(String cadena) {
		StringBuilder res = new StringBuilder();
		
		for(int i=0; i<cadena.length();i++) {
			if(Character.isWhitespace(cadena.charAt(i))==false) {
				res.append(cadena.charAt(i));
			}
		}
		return res.toString();
	}
	
	public static String darVuelta(String cadena) {
		StringBuilder vuelta = new StringBuilder();
		String cadenaN= quitarBlancos(cadena);
		
		for(int i=cadenaN.length()-1; i>=0; i--) {
			vuelta.append(cadenaN.charAt(i));
		}
		return vuelta.toString();
	}
	
	public static String esPalindromo(String cadena) {
		StringBuilder res = new StringBuilder();
		
		if(cadena!=null && !cadena.isEmpty()) {
			String cadenaD= quitarBlancos(cadena);
			String cadenaV= darVuelta(cadena);
		
			res = cadenaD.equalsIgnoreCase(cadenaV)?res.append("Es palindromo"):res.append("No es palindromo");
		}else {
			res.append("0");
		}
		return res.toString();
	}

}
