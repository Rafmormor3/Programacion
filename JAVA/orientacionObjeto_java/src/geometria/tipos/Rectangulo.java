package geometria.tipos;

public class Rectangulo extends Figura {
	
	private double ancho;
	private double longitud;
	
	public Rectangulo() {
		super();
		this.ancho = 1.0;
		this.longitud = 1.0;
	}
	
	public Rectangulo(double ancho, double longitud) {
		this();
		setAncho(ancho);
		setLongitud(longitud);
	}
	
	public double getPerimetro() {
		return this.ancho*2 + this.longitud*2;
	}
	
	public double getArea () {
		return this.ancho*this.longitud;
	}

	
	//GETTERS & SETTERS
	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		if(ancho>0 && ancho<=20) {
			this.ancho=ancho;
		}else {
			this.ancho=0.0;
		}
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		if(longitud>0 && longitud<=20) {
			this.longitud=longitud;
		}else {
			this.longitud=0.0;
		}
	}
	
	
	
	
}
