package alquilerVehiculos;

public enum Gama {
	ALTA(50),MEDIA(40),BAJA(30);
	
	private int precio;

	private Gama(int precio) {
		this.precio = precio;
	}

	public int getPrecio() {
		return precio;
	}
	
	
	
}
