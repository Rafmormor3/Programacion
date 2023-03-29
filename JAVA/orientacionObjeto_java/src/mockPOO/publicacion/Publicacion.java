package mockPOO.publicacion;

import java.time.LocalDateTime;
import java.util.Objects;

import mockPOO.usuario.Usuario;

public abstract class Publicacion implements Comparable<Publicacion>, Valorable{
	
	protected String texto;
	private LocalDateTime fechaCreacion;
	protected int valoracion;
	private int codigo;
	private static int codigoSiguiente;
	private Usuario usuario;
	
	
	public Publicacion(String texto, Usuario usuario) {
		super();
		this.texto = texto;
		this.usuario = usuario;
		this.fechaCreacion=LocalDateTime.now();
		this.codigo=codigoSiguiente;
		codigoSiguiente++;
	}

	protected String getTexto() {
		return texto;
	}
	
	protected abstract void setTexto(String texto) throws PublicacionException;

	@Override
	public int hashCode() {
		return Objects.hash(fechaCreacion, usuario);
	}

	public boolean equals(Object obj) {
		boolean iguales = this==obj;
		if(!iguales && obj!=null && obj instanceof Publicacion) {
			Publicacion otro = (Publicacion) obj;
			iguales=this.codigo==otro.codigo ;
		}
		return false;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public int getValoracion() {
		return valoracion;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public String getLoginUsuario() {
		return this.usuario.getLogin();
	}

	public String toString() {
		return String.format("Publicacion: %s\nRealizada por: %s\nValoracion: %s\nFecha publicacion: %s",
				this.texto, usuario.getLogin(), this.valoracion, this.fechaCreacion);
	}
	 
	@Override
	public int compareTo(Publicacion p) {
		return this.fechaCreacion.compareTo(p.fechaCreacion);
	}
	
	public boolean isAnterior(Publicacion p) {
		return this.fechaCreacion.isBefore(p.fechaCreacion);
	}
	
	
	@Override
	public boolean valorar(String valoracion) {
		
		Valoraciones v = Valoraciones.valueOf(valoracion.toUpperCase());
		this.valoracion=+v.getValoracion();
		
		return true;
	}
	
	
	
	
	
	
	

}
