package geometria.tipos;

public class Circulo extends Figura{
	
	private double radio;

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}
	
	public double getPerimetro() {
		return 2*Math.PI*this.radio;
	}
	
	public double getArea () {
		return Math.PI*Math.pow(radio, 2);
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	//getters & setters
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	

}
