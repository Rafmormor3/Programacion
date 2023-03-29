package blocNotas.jacaranda.notas;

import java.time.LocalDateTime;
import java.util.Objects;

public class Nota implements Comparable<Nota> {
	
	private static int codigoSiguiente;
	private int codigo;
	private String texto;
	private LocalDateTime fechaCreacion;
	private LocalDateTime fechaUltimaModificacion;
	
	
	public Nota(String texto) {
		super();
		this.texto = texto;
		this.codigo=codigoSiguiente;
		codigoSiguiente++;
		this.fechaCreacion=LocalDateTime.now();
		this.fechaUltimaModificacion=null;
	}


	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
		this.fechaUltimaModificacion=LocalDateTime.now();
	}


	public int getCodigo() {
		return codigo;
	}


	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}


	public LocalDateTime getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}
	
	public boolean isModificado() {
		boolean res=false;
		if(this.fechaUltimaModificacion!=null) {
			res=true;
		}
		return res;
	}
	
	public boolean isEmpty() {
		return this.texto.isEmpty();
	}
	
	public boolean isCreadoAnterior(Nota n) {
		return this.fechaCreacion.isBefore(n.fechaCreacion);
	}
	
	public boolean isModificadoAnterior(Nota n) {
		boolean res=false;
		if((this.fechaUltimaModificacion==null && n.fechaUltimaModificacion==null) || (this.fechaUltimaModificacion==null && n.fechaUltimaModificacion!=null)) {
			res=false;
		}else if(this.fechaUltimaModificacion!=null && n.fechaUltimaModificacion==null) {
			res=true;
		}else {
			res=this.fechaUltimaModificacion.isBefore(n.fechaUltimaModificacion);
		}
		return res;
	}


	public int hashCode() {
		return Objects.hash(codigo, fechaCreacion, fechaUltimaModificacion, texto);
	}

	public boolean equals(Object obj) {
		boolean iguales = this==obj;
		
		if(!iguales && obj!=null && obj instanceof Nota) {
			Nota otraNota = (Nota) obj;
			iguales= this.texto!=null && !this.texto.isEmpty() && otraNota.texto!=null && !otraNota.texto.isEmpty() && this.texto.equals(otraNota.texto) 
					&& this.fechaCreacion!=null && otraNota.fechaCreacion!=null && this.fechaCreacion.equals(otraNota.fechaCreacion);
		}
		
		return iguales;
	}

	@Override
	public int compareTo(Nota o) {
		return this.fechaCreacion.compareTo(o.fechaCreacion);
	}


	@Override
	public String toString() {
		return "Nota con Codigo: " + codigo + ", texto: " + texto + ", fechaCreacion: " + fechaCreacion
				+ ", fechaUltimaModificacion: " + fechaUltimaModificacion ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
