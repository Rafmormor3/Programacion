package boletin3;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		System.out.println(contains("mundo", "hola mundo cruel"));
		System.out.println(contains("", ""));
		System.out.println(contains(null, null));
		System.out.println(startsWirth("sub", "subterraneo"));
		System.out.println(startsWirth("", ""));
		System.out.println(startsWirth(null, null));
		System.out.println(endsWirth("do", "de vuelta al mundo"));
		System.out.println(endsWirth("", ""));
		System.out.println(endsWirth(null, null));

	}
	
	public static boolean startsWirth(String prefijo, String texto) {
		boolean res = false;
		int cont=0;
		
		if(prefijo!=null && !prefijo.isEmpty() && texto!=null && !texto.isEmpty()) {
			for(int i=0; i<prefijo.length();i++) {
				if(prefijo.charAt(i)==texto.charAt(i)) {
					cont++;
				}
			}
			res= cont==prefijo.length()? res=true : res;
		}
		return res;
	}
	
	
	public static boolean contains(String palabra, String texto) {
		boolean res = false;
		int cont=0,i=0;
		
		if(palabra!=null && !palabra.isEmpty() && texto!=null && !texto.isEmpty()) {
			
			while(i<texto.length() && cont!=palabra.length()) {
				
				if(texto.charAt(i)==palabra.charAt(cont)) {
					cont++;
				}
				i++;
			}
			
			if(palabra.length()==cont) {
				res=true;
			}
		}
			
		return res;
	}
	
	
	public static boolean endsWirth(String sufijo, String texto) {
		boolean res=false;
		int cont=0;
		
		if(sufijo!=null && !sufijo.isEmpty() && texto!=null && !texto.isEmpty()) {
			for(int i=texto.length()-sufijo.length();i<texto.length();i++) {
				if(texto.charAt(i)==sufijo.charAt(cont)) {
					cont++;
				}
			}
			res = cont==sufijo.length() ?true:res;
		}
		
		return res;
	}
}






