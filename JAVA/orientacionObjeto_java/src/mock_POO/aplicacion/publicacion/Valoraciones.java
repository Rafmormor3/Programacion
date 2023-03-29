package mock_POO.aplicacion.publicacion;

public enum Valoraciones {
	SUPERBUENA(3), MUYBUENA(2),BUENA(1), NORMAL(0), REGULAR(-1), MUYMALA(-2);
	
	private int valoracion;
	
	Valoraciones(int v){
		this.valoracion=valoracion;
	}
	
	public int getValoracion() {
		return this.valoracion;
	}
}
