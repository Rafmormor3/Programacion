package boletin3;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		System.out.println(buscarRemplazar("el gato con botas", "gato", "perro"));
		System.out.println(buscarRemplazar(null, null, null));
		System.out.println(buscarRemplazar("", "", ""));
		System.out.println(buscarRemplazar("el gato con botas", "perro", "gato"));
	}

	public static StringBuilder buscarRemplazar(String texto, String palabra, String sustituto) {
		StringBuilder res = new StringBuilder();
		
		if(texto!=null && palabra!=null && sustituto!=null && !texto.isEmpty() && !palabra.isEmpty() &&
				!sustituto.isEmpty() && Ejercicio4.contains(palabra, texto)==true) {
			res.append(texto.replace(palabra, sustituto));
		}else {
			res.append("0");
		}
		return res;	
		
	}
}
