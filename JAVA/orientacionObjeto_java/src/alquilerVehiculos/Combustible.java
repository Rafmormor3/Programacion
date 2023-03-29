package alquilerVehiculos;

public enum Combustible {
	GASOLINA(3.5), DIESEL(2);
	
	private double precioPorDia;

	private Combustible(double precioPorDia) {
		this.precioPorDia = precioPorDia;
	}

	public double getPrecioPorDia() {
		return precioPorDia;
	}
	
	
}
