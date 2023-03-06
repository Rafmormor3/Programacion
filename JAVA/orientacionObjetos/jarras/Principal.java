package jarras;

import jarras.jarraObj.Jarra;

public class Principal {

	public static void main(String[] args) {
		Jarra a = new Jarra(7);
		Jarra b = new Jarra(4);
		
		a.llenarJarra();
		a.toString();
		a.volcarJarra(b);
		b.vaciarJarra();
		a.volcarJarra(b);
		a.llenarJarra();
		a.volcarJarra(b);

	}

}
