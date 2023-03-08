package linea;

import linea.linea.Linea;
import linea.linea.Punto;

public class Principal {

	public static void main(String[] args) {
		 Punto p = new Punto(5,4);
		 Punto p1= new Punto(4,5);
		 
		 Linea l = new Linea(new Punto(4,5),new Punto(5,4));
		 Linea ll = new Linea(p,p1);
		 
		 System.out.println(l);
		 System.out.println(ll);
		 
		 System.out.println(p.equals(p1));
		 System.out.println(l.equals(ll));
		 
		 l.moverDerecha(5);
		 System.out.println(l);

	}

}
