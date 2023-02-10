package boletin3;

public class Ejercicio7 {

	public static void main(String[] args) {
		System.out.println(estarPalabra("shybaoxln","hola")==false);
		System.out.println(estarPalabra("shybaoxlna","hola")==true);
		System.out.println(estarPalabra("shybaoxlnaaaa","hola")==true);
	}
	
	public static boolean estarPalabra(String texto, String palabra) {
		int cont=0, letra=0;
		String cadena="";
		boolean res=false;
		
		if(texto != null && palabra!=null && !texto.isEmpty() && !palabra.isEmpty()) {
			while(letra<texto.length() && !cadena.equals(palabra)) {
				if(texto.charAt(letra)== palabra.charAt(cont)) {
					cadena+=palabra.charAt(cont);
					cont++;
				}
				letra++;
			}
			res=cont==palabra.length()?true:res;
		}
		return res;
	}

}
