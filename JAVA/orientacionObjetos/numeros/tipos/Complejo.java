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
	
	public Complejo suma(Complejo c2) {
		Complejo c3 = new Complejo();
		c3.setParteReal(this.parteReal+c2.getParteReal());
		c3.setParteImaginaria(this.parteImaginaria+c2.getParteImaginaria());
		return c3;
	}
	
	public Complejo resta(Complejo c2) {
		Complejo c3 = new Complejo();
		c3.setParteReal(this.parteReal-c2.getParteReal());
		c3.setParteImaginaria(this.parteImaginaria-c2.getParteImaginaria());
		return c3;
	}
	
	public String equals(Complejo c2) {
		String res="No son iguales";
		if(this.parteReal==c2.getParteReal() && this.parteImaginaria==c2.getParteImaginaria()) {
			res="Son iguales";
		}
		return res;
	}
	
	public Complejo multiplicacion(Complejo c2) {
		Complejo c3 = new Complejo();
		c3.setParteReal(this.parteReal*c2.getParteReal()-this.parteImaginaria*c2.getParteImaginaria());
		c3.setParteImaginaria(this.parteReal*c2.getParteImaginaria()+this.parteImaginaria*c2.getParteReal());
		return c3;
	}
	
	public Complejo division(Complejo c2) {
		Complejo c3 = new Complejo();
		c2.setParteImaginaria(c2.parteImaginaria*-1);
		if(!(c2.getParteReal()==0 && c2.getParteImaginaria()==0)) {
			c3.setParteReal( (this.parteReal*c2.getParteReal()-this.parteImaginaria*c2.getParteImaginaria()) 
				/ (Math.pow(c2.parteReal, 2)+Math.pow(c2.parteImaginaria, 2)));
			c3.setParteImaginaria( (this.parteReal*c2.getParteImaginaria()+this.parteImaginaria*c2.getParteReal()) 
				/ (Math.pow(c2.parteReal, 2)+Math.pow(c2.parteImaginaria, 2)));
		}
		
		return c3;
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
