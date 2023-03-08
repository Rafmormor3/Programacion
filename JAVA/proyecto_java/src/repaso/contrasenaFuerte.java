package repaso;

public class contrasenaFuerte {
	
	static final int LONGITUD =8;
	static final String PUNTUACION=".,:;?¿¡!";

	public static void main(String[] args) {
		
		System.out.println(esFuerte("aEiOU1234."));

	}
	
	
	public static boolean esFuerte(String c) {
		boolean mayus=false, minus=false, tamanio=false, digito=false, puntos=false;
		
		if(!c.isEmpty() && c!=null && c.length()>=LONGITUD) {
			tamanio=true;
			for(int i=0; i<c.length();i++) {
				if(Character.isLowerCase(c.charAt(i))) {
					minus=true;
				}else if(Character.isUpperCase(c.charAt(i))) {
					mayus=true;
				}else if(Character.isDigit(c.charAt(i))) {
					digito=true;
				}else if(signosPuntuacion(c.charAt(i))) {
					puntos=true;
				}
			}
		}
		return mayus && minus && tamanio && digito && puntos;
	}
	
	public static boolean signosPuntuacion(char c) {
		boolean res=false;
		for(int i=0; i<PUNTUACION.length() && res==false; i++) {
			res= c==PUNTUACION.charAt(i)? true:false;
		}
		return res;
	}

}
