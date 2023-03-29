package alquilerVehiculos;

public class Furgoneta extends Vehiculo {
	
	public static final int PMA=250;

	public Furgoneta(String matricula, Gama gama) {
		super(matricula, gama);
	}

	@Override
	public double calcularPrecioAlquiler(String matricula, int numDias) {
		return this.getPrecioBase()*numDias + 0.5 * PMA;
	}

}
