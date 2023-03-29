package mock_POO.aplicacion.publicacion;

import mock_POO.aplicacion.Usuario;

public class Recomendacion extends Publicacion {
	
	private int numeroEstrellas;

	public Recomendacion(String texto, Usuario usuario, int numeroEstrellas) throws PublicacionException {
		super(texto, usuario);
		if(numeroEstrellas<1 || numeroEstrellas>5) {
			throw new PublicacionException("El numero de estraellas es incorrecto");
		}
		this.numeroEstrellas = numeroEstrellas;

	}
	
	protected void setTexto(String texto) throws PublicacionException {
		if(texto.length()>200 || texto.length()<100) {
			throw new PublicacionException("Logitud no correcta");
		}
		this.texto=texto;
	}


	public String toString() {
		return String.format("\n%s \n%sNumero estrellas: %s", 
							getClass().getSimpleName(),
							super.toString(),
							this.getNumeroEstrellas());
	}

	public int getNumeroEstrellas() {
		return numeroEstrellas;
	}
	
	
	
	
	
}
