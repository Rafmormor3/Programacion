package repaso;

public class palabraEscondida {

	public static void main(String[] args) {
		
		System.out.println(estaPalabra("  d", "  "));

	}
	
	public static boolean estaPalabra(String texto, String palabra) {
		boolean res=false;
		int cont=0;
		
		if(texto!=null && palabra!=null && !texto.isEmpty() && !palabra.isEmpty() && palabra.length()<=texto.length()) {
			
			for(int i=0; i<palabra.length();i++) {
				if(palabra.charAt(i)==palabra.charAt(cont)) {
					cont++;
				}
			}	
			
			res= cont==palabra.length()? true:res;
		}
		return res;
	}

}
