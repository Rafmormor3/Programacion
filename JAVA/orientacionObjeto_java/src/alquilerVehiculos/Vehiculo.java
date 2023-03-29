package alquilerVehiculos;

public abstract class Vehiculo {

	private String matricula;
	private Gama gama;
	private double precioBase;
	
	
	public Vehiculo(String matricula, Gama gama) {
		super();
		this.matricula = matricula;
		this.gama = gama;
		this.precioBase=this.gama.getPrecio();
	}
	
	
	public String getMatricula() {
		return matricula;
	}

	public double getPrecioBase() {
		return this.precioBase;
	}

	public abstract double calcularPrecioAlquiler(String matricula, int numDias);


	
	
	
	
	
}
