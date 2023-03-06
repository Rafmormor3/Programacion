package linea.linea;

public class Linea {
	
	private Punto a;
	private Punto b;
	
	
	public Linea() {
		super();
		this.a = new Punto();
		this.b = new Punto();
	}

	public Linea(Punto a, Punto b) {
		this();
		this.a = a;
		this.b = b;
	}
	
	public void moverDerecha (double m) {
		this.a.moverDerecha(m); 
		this.b.moverDerecha(m);
	}
	
	public void moverIzquierda (double m) {
		this.a.moverIzquierda(m); 
		this.b.moverIzquierda(m);
	}
	
	public void moverArriba (double m) {
		this.a.moverArriba(m); 
		this.b.moverArriba(m);
	}
	
	public void moverAbajo (double m) {
		this.a.moverAbajo(m); 
		this.b.moverAbajo(m);
	}

	//A=A o A=B y B=A o B=B equals
	public boolean equals(Object obj) {
		boolean sonIguales = this == obj;
		if(!sonIguales && obj!=null && obj instanceof Linea) {
			Linea otraLinea = (Linea) obj;
			sonIguales=(this.a.equals(otraLinea.a) || this.a.equals(otraLinea.b)) && 
						(this.b.equals(otraLinea.a) || this.b.equals(otraLinea.b));
		}
		return sonIguales;
	}
	
	@Override
	public String toString() {
		return "(" + this.a + "," + this.b + ")";
	}

	//getters & setters
	public Punto getA() {
		return a;
	}

	public void setA(Punto a) {
		this.a = a;
	}

	public Punto getB() {
		return b;
	}

	public void setB(Punto b) {
		this.b = b;
	}
	
	
	
	
	
	
	
	

}
