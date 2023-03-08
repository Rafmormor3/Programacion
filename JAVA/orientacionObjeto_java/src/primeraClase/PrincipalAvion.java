package primeraClase;

public class PrincipalAvion {

	public static void main(String[] args) {
		
		Avion a1 = new Avion("001",200);
		System.out.println(a1.asignarVuelos(20, 30));
		
		MenuAvion.menu();
		
		
	}

}
