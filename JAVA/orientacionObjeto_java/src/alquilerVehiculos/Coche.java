package alquilerVehiculos;

public class Coche extends Vehiculo {
	
	private Combustible combustible;

	public Coche(String matricula, Gama gama, Combustible combustible) {
		super(matricula, gama);
		this.combustible=combustible;
		
	}

	@Override
	public double calcularPrecioAlquiler(String matricula, int numDias) {
		
		return (this.getPrecioBase()+this.combustible.getPrecioPorDia())*numDias;
	}

}
