package mock_POO.aplicacion.publicacion;

import java.time.LocalDateTime;
import java.util.Objects;

import mock.comida.Plato;
import mock_POO.aplicacion.Usuario;

public abstract class Publicacion implements Comparable<Publicacion>, Valorable{

	protected String texto;
	private LocalDateTime fechaCreacion;
	protected int valoracion;
	private int codigo;
	private static int codigoSiguiente;
	private Usuario usuario;
	
	
	public Publicacion(String texto, Usuario usuario) throws PublicacionException {
		super();
		setTexto(texto);
		this.usuario = usuario;
		this.fechaCreacion=LocalDateTime.now();
		this.codigo=codigoSiguiente;
		codigoSiguiente++;
	}
	

	protected String getTexto() {
		return this.texto;
	}

	protected abstract void setTexto(String texto) throws PublicacionException;


	public int hashCode() {
		return Objects.hash(fechaCreacion, texto);
	}
	
	public boolean equals(Object obj) {
		boolean sonIguales = this==obj;
		if(!sonIguales && obj!=null && obj instanceof Publicacion) {
			Publicacion otraPubli = (Publicacion) obj;
			sonIguales=this.texto.equals(otraPubli.texto) ;
		}
		return sonIguales;
	}


	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}


	public int getValoracion() {
		return valoracion;
	}
	
	public boolean valorar(String valoracion) {
		boolean res=false;
		try {
			Valoraciones v = Valoraciones.valueOf(valoracion.toUpperCase());
			valoracion+=v.getValoracion();
			res=true;
		}catch (Exception e) {
		}
		return res;
	}

	public int getCodigo() {
		return this.codigo;
	}
	
	public String getLoginUsuario() {
		return this.usuario.getLogin();
	}


	public String toString() {
		return String.format("%s"
							+ "Publicación: %s \n"
							+ "Realizada por: %s \n"
							+ "Valoración: %s \n"
							+ "Fecha de publicación: %s \n", 
							getClass().getSimpleName(),
							this.texto, 
							getLoginUsuario(), 
							this.valoracion, 
							this.fechaCreacion);
	}
	
	public int compareTo(Publicacion p) {
		return this.valoracion==p.valoracion? this.fechaCreacion.compareTo(p.fechaCreacion): this.valoracion-p.valoracion;
	}
	
	public boolean isAnterior(Publicacion p) {
		boolean res =false;
		if(this.fechaCreacion.isBefore(p.fechaCreacion)) {
			res=true;
		}
		return res;
	}
	
	
	
	
	
}
