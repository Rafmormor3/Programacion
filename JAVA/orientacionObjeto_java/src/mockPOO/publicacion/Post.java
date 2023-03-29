package mockPOO.publicacion;

import mockPOO.usuario.Usuario;

public class Post extends Publicacion {

	private int numLecturas;
	private String tema;
	
	
	public Post(String texto, Usuario usuario, String tema) {
		super(texto, usuario);
		this.tema = tema;
	}

	@Override
	protected void setTexto(String texto) throws PublicacionException {
		if(this.texto.isBlank()) {
			throw new PublicacionException("Texto vacio");
		}
		this.texto=texto;
	}
	
	public boolean valorar(String valoracion) {
		this.numLecturas++;
		super.valorar(valoracion);
		return true;
	}

	public String toString() {
		return String.format("%s \n%s",
				getClass().getSimpleName(), super.toString());
	}

	public int getNumLecturas() {
		return numLecturas;
	}

	public String getTema() {
		return tema;
	}
	
	
	
	
	
}
