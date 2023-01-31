package boletin2;

public class Password {
	
	private String valor;
	
	private final int LONGITUD_MINIMA_SEGURA = 8;
	public final String SIGNOS_PUNTUACION=",.;:-_¿?!()¡";
	
	public Password (String valor) {
		super();
		this.valor=valor;
	}
	
	/**
	 * Devuelve si la contraseña es fuerte, es decir, 8 o más caracteres, entre ellos una mayuscula , 
	 * una minuscula, un signo de puntuacion y al menos un digito. 
	 * @return True si la contraseña es fuerte, false si no lo es.
	 */
	
	public boolean esFuerte() {
		
		boolean longitudSegura = valor!=null && valor.length()>=LONGITUD_MINIMA_SEGURA;
		boolean existeMayus=false;
		boolean existeMinuscula=false;
		boolean existeDigito=false;
		boolean existeSignoPuntuacion=false;
		
		if(longitudSegura) {
			for(int i=0; i<valor.length();i++) {
				if(Character.isUpperCase(valor.charAt(i))) {
					existeMayus=true;
				}else if (Character.isLowerCase(valor.charAt(i))) {
					existeMinuscula=true;
				}else if(Character.isDigit(valor.charAt(i))) {
					existeDigito=true;
				}else if (esSignoPuntuacion(valor.charAt(i))) {
					existeSignoPuntuacion=true;
				}
			}
		}
		return longitudSegura && existeDigito && existeMayus
				&& existeMinuscula && existeSignoPuntuacion;
	}
	
	private boolean esSignoPuntuacion(char caract) {
		boolean esSigno=false;
		for(int j=0; j<SIGNOS_PUNTUACION.length();j++) {
			if(SIGNOS_PUNTUACION.charAt(j)==caract) {
				esSigno=true;
			}
		}
		return esSigno;
	}
}
