package mockPOO.publicacion;

import mockPOO.usuario.Usuario;

public class Recomendacion extends Publicacion {
	
	private int numeroEstrellas;

	public Recomendacion(String texto, Usuario usuario, int numeroEstrellas) throws PublicacionException {
		super(texto, usuario);
		if(!(numeroEstrellas>=1 && numeroEstrellas<=5)) {
			throw new PublicacionException("Numero de estrellas incorrecto");
		}
		this.numeroEstrellas = numeroEstrellas;
	}

	
	@Override
	protected void setTexto(String texto) throws PublicacionException {
		if(this.texto.length()<100 || this.texto.length()>200) {
			throw new PublicacionException("Cantidad de caracteres incorrectos");
		}
		this.texto=texto;
	}


	public int getNumeroEstrellas() {
		return numeroEstrellas;
	}


	@Override
	public String toString() {
		return String.format("%s \n%s \n%s",
				getClass().getSimpleName(), super.toString(), this.numeroEstrellas);
	} 
	
	


	
	
	
	

}
