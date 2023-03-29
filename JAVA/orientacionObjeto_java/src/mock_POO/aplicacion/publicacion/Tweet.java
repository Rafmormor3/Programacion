package mock_POO.aplicacion.publicacion;

import mock_POO.aplicacion.Usuario;

public class Tweet extends Publicacion {

	public Tweet(String texto, Usuario usuario) throws PublicacionException {
		super(texto, usuario);
	}


	protected void setTexto(String texto) throws PublicacionException {
		if(texto.length()>50) {
			throw new PublicacionException("Tiene mas caracteres del limite");
		}
		this.texto=texto;
	}
	
	public boolean valorar(String valoracion) {
		boolean res=false;
		try {
			Valoraciones v = Valoraciones.valueOf(valoracion.toUpperCase());
			valoracion+=v.getValoracion()*2;
			res=true;
		}catch (Exception e) {
		}
		return res;
	}


	public String toString() {
		return String.format("%s \n%s", 
							getClass().getSimpleName(),
							super.toString());
	}
	
	
	

}
