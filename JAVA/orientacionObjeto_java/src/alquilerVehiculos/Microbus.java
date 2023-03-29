package alquilerVehiculos;

public class Microbus extends Vehiculo {
	
	private int numPlazas;
	private static final double PRECIO_PLAZA=5;

	public Microbus(String matricula, Gama gama, int numPlazas) {
		super(matricula, gama);
		this.numPlazas=numPlazas;
	}

	@Override
	public double calcularPrecioAlquiler(String matricula, int numDias) {
		return this.getPrecioBase()*numDias+(this.numPlazas*PRECIO_PLAZA);
	}

}
