package linea.linea;

public class Punto {

	private double x;
	private double y;
	
	
	public Punto() {
		super();
		this.x=0;
		this.y=0;
	}

	public Punto(double x, double y) {
		this();
		this.x = x;
		this.y = y;
	}
	
	public void moverDerecha (double m) {
		this.x += m;
	}
	
	public void moverIzquierda (double m) {
		this.x -= m;
	}
	
	public void moverArriba (double m) {
		this.y += m;
	}
	
	public void moverAbajo (double m) {
		this.y -= m;
	}
	
	
	
	//equals x=x e y=y
	public boolean equals(Object obj) {
		boolean sonIguales = this==obj;
		if(!sonIguales && obj!=null && obj instanceof Punto) {
			Punto otroPunto = (Punto) obj;
			sonIguales = this.x == otroPunto.x && this.y == otroPunto.y;
		}
		return sonIguales;
	}
	
	@Override
	public String toString() {
		return "("+ this.x + ", " + this.y + ")";
	}

	//getters & setters
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	
	
	
}
