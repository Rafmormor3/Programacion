package boletin3;

public class Ejercicio9 {

	public static void main(String[] args) {

		System.out.println(contarPalabrasFrasesParrafos("Hola buenas tardes, como vas./n Espero que nos veamos pronto/n Un saludo."));
		System.out.println(contarPalabrasFrasesParrafos(null));
		System.out.println(contarPalabrasFrasesParrafos(""));

	}
	
	public static String contarPalabrasFrasesParrafos (String texto) {
		int contPalabra=0, contFrase=0, contParrafos=0;
		StringBuilder res = new StringBuilder();
		
		if(texto!=null && !texto.isEmpty()) {
			for(int i=0; i<texto.length()-1;i++) {
				if(texto.charAt(i)!=' ' && (texto.charAt(i+1)==' ' || texto.charAt(i+1)==',')) {
					contPalabra++;
				}else if(texto.charAt(i)!=' ' && texto.charAt(i+1)=='.') {
					contFrase++;
				}else if(texto.charAt(i)=='/' && texto.charAt(i+1)=='n') {
					contParrafos++;
				}
			}
		}
		
		res=res.append("+Numero palabras: "+contPalabra + "   +Numero frase: "+contFrase+ "   +Numero parrafos: "+contParrafos);
		
		return res.toString();
	}

}
