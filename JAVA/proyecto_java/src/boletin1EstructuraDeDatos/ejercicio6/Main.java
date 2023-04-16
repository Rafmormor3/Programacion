package boletin1EstructuraDeDatos.ejercicio6;

public class Main {
	
	public static void main(String[] args) {
		
		Diccionario dic = new Diccionario();
		
		try {
			
			dic.añadirPalabra("tapon", "Cierre de una botella");
			dic.añadirPalabra("raton", "animal");
			dic.añadirPalabra("arco", "arma");
			
			dic.añadirPalabra("raton", "periferico");
			dic.añadirPalabra("tapon", "bloqueo en el baloncesto");
			System.out.println(dic.toString());
			
			System.out.println(dic.buscarPalabra("raton"));
			dic.borrarPalabra("raton");
			
			System.out.println(dic.toString());
			
			dic.añadirPalabra("zapato", "calzado");
			dic.añadirPalabra("pato", "animal");
			dic.añadirPalabra("patada", "accion");
			System.out.println(dic.toString());
			
			System.out.println(dic.listarPalabraQueContenga("pat"));
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
