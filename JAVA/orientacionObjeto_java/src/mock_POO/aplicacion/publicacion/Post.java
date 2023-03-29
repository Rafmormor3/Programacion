package mock_POO.aplicacion.publicacion;

import mock_POO.aplicacion.Usuario;

public class Post extends Publicacion {
	
	private int numeroLecturas;
	private String tema;
	
	
	public Post(String texto, Usuario usuario,String tema) throws PublicacionException {
		super(texto, usuario);
		this.tema = tema;
	}

	protected void setTexto(String texto) throws PublicacionException {
		if(texto==null || texto.isBlank()) {
			throw new PublicacionException("No puede estar vacio");
		}
		this.texto=texto;
	}
	
	public boolean valorar(String valoracion) {
		this.numeroLecturas++;
		super.valorar(valoracion);
		return false;
	}

	public String toString() {
		return "Post.\nPublicacion:" + texto + "\nRealizada por: " + getLoginUsuario() + "\nValoracion: " + valoracion
				+ "\nFecha de publicacion: " + getFechaCreacion();
	}

	public int getNumeroLecturas() {
		return numeroLecturas;
	}

	public String getTema() {
		return tema;
	}
	
	
	
	
	
}
