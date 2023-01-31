package boletin2;

public class Programa {

	public static void main(String[] args) {
		
		Password password = new Password("1234aAb;");
		System.out.println(password.esFuerte());
		
		System.out.println(new Password("1234a;").esFuerte());
		System.out.println(new Password("12").esFuerte());
		System.out.println(new Password("1234a;AA").esFuerte());

	}

}
