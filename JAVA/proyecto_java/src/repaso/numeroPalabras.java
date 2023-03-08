package repaso;

public class numeroPalabras {
	
	public static void main(String[] args) {
		System.out.println(numeroPalabrasFraseParrafo("hola buenas gat./n tardes gato. bonito gato"));
	}
	
	 public static int numeroPalabra(String texto, String palabra) {
		 int cont=0, p=0;
		 for(int i=texto.indexOf(palabra); i<texto.length();i++) {
			 if(texto.charAt(i)==palabra.charAt(cont)) {
				 cont++;
				 if(cont==palabra.length()) {
					 cont=0;
					 p++;
				 }
			 }
		 }
		 return p;
	 }
	
	 public static String numeroPalabrasFraseParrafo(String texto) {
		 int n=0, f=1, p=1;
		 StringBuilder sb = new StringBuilder();
		 for(int i=1; i<texto.length();i++) {
			 
			 if(texto.charAt(i-1)=='/' && texto.charAt(i)=='n'&& n>1) {
				 p++;
			 }
			 if(texto.charAt(i-1)!=' ' && texto.charAt(i)==' ') {
				 n++;
			 }
			 if(texto.charAt(i-1)!=' ' && texto.charAt(i)=='.' && n>1) {
				 f++;
			 }
		 }
		 if(!texto.endsWith(" ")) {
			 n++;
		 }
		 sb.append(p+" "+f+" "+n);
		 return sb.toString();
	 }
	 
	 
}














