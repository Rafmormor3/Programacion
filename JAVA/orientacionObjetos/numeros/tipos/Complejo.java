package numeros.tipos;

public class Complejo {
	
	private double parteReal;
	private double parteImaginaria;
	
	
	public Complejo() {
		super();
	}

	public Complejo(double parteReal, double parteImaginaria) {
		this();
		this.parteReal = parteReal;
		this.parteImaginaria = parteImaginaria;
	}
	
	public String suma(double parteReal, double parteImaginaria) {
		double r=this.parteReal+parteReal;
		double i=this.parteImaginaria+parteImaginaria;
		return String.valueOf(r)+" + "+String.valueOf(i)+"i";
	}
	
	public String resta(double parteReal, double parteImaginaria) {
		double r=this.parteReal-parteReal;
		double i=this.parteImaginaria-parteImaginaria;
		String sig= i>0? "+": "";
		return String.valueOf(r)+sig+String.valueOf(i)+"i";
	}
	
	public String equals(double parteReal, double parteImaginaria) {
		String res="No son iguales";
		if(this.parteReal==parteReal && this.parteImaginaria==parteImaginaria) {
			res="Son iguales";
		}
		return res;
	}
	

	@Override
	public String toString() {
		return "(" + parteReal + ", " + parteImaginaria + ")";
	}

	//getters & setters
	public double getParteReal() {
		return parteReal;
	}

	public void setParteReal(double parteReal) {
		this.parteReal = parteReal;
	}

	public double getParteImaginaria() {
		return parteImaginaria;
	}

	public void setParteImaginaria(double parteImaginaria) {
		this.parteImaginaria = parteImaginaria;
	}
	
	
	
}
