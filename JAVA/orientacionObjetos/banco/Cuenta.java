package banco;

public class Cuenta {
	
	private double saldo;
	private int numReintegros;
	private int numIngresos;
	
	
	public Cuenta(double saldo, int numReintegros, int numIngresos) {
		super();
		this.saldo = saldo;
		this.numReintegros = numReintegros;
		this.numIngresos = numIngresos;
	}
	
	public void reintegro(double reint) {
		this.numReintegros++;
		this.saldo=this.saldo-reint;
	}
	
	public void ingreso(double ingres) {
		this.numIngresos++;
		this.saldo=this.saldo-ingres;	
	}
	

	@Override
	public String toString() {
		return "El saldo de la cuenta es" + saldo + ", numero de reintegros realizados:" + numReintegros + ", numero de ingresos "
				+ "realizados" + numIngresos;
	}
	

	//Getters & Setters
	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public int getNumReintegros() {
		return numReintegros;
	}


	public void setNumReintegros(int numReintegros) {
		this.numReintegros = numReintegros;
	}


	public int getNumIngresos() {
		return numIngresos;
	}


	public void setNumIngresos(int numIngresos) {
		this.numIngresos = numIngresos;
	}
	
	
	
	
	
}
