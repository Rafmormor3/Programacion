package mockPOO.publicacion;

import mockPOO.usuario.Usuario;

public class Tweet extends Publicacion {

	public Tweet(String texto, Usuario usuario){
		super(texto, usuario);
	}

	@Override
	protected void setTexto(String texto) throws PublicacionException {
		if(this.texto.length()>50) {
			throw new PublicacionException("Mas de 50 caracteres");
		}
		this.texto=texto;
	}

	public boolean valorar(String valoracion) {
		Valoraciones v = Valoraciones.valueOf(valoracion.toUpperCase());
		this.valoracion=+v.getValoracion()*2;
		return true;
	}

	public String toString() {
		return String.format("%s \n%s",
				getClass().getSimpleName() , super.toString());
	}
	
	

}
