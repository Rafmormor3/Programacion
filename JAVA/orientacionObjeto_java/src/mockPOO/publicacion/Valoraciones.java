package mockPOO.publicacion;

public enum Valoraciones {
	SUPERBUENA(3), MUYBUENA(2), BUENA(1), NORMAL(0), REGULAR(-1), MUYMALA(-2);
	
	private int valoracion;

	private Valoraciones(int valoracion) {
		this.valoracion = valoracion;
	}

	public int getValoracion() {
		return valoracion;
	}
	
	
}
