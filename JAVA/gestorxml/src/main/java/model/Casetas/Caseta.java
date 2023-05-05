package main.java.model.Casetas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Caseta implements Comparable<Caseta> {
	
	private String titulo;
	private String calle;
	private int numero;
	private int modulos;
	private Clase clase;
	private String entidad;
	private int id;
	private int idCalle;
	
	
	public Caseta(String titulo, String calle, int numero, int modulos, Clase clase, String entidad, int id,
			int idCalle) {
		super();
		this.titulo = titulo;
		this.calle = calle;
		this.numero = numero;
		this.modulos = modulos;
		this.clase = clase;
		this.entidad = entidad;
		this.id = id;
		this.idCalle = idCalle;
	}
	
	//getters
	public String getTitulo() {
		return titulo;
	}
	
	public String getCalle() {
		return calle;
	}

	public int getNumero() {
		return numero;
	}

	public int getModulos() {
		return modulos;
	}

	public Clase getClase() {
		return clase;
	}

	public String getEntidad() {
		return entidad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdCalle() {
		return idCalle;
	}


	@Override
	public int hashCode() {
		return Objects.hash(calle, clase, entidad, id, idCalle, modulos, numero, titulo);
	}


	@Override
	public boolean equals(Object obj) {
		return this==obj || obj!=null && obj instanceof Caseta && obj.hashCode()==this.hashCode();
	}


	@Override
	public String toString() {
		return String.format("\nCaseta de nombre %s (id: %s), situada en la calle %s (id_calle: %s),\n"
							+ "numero %s, modulo %s, de clase %s, con entidad %s ", 
							this.titulo, this.id, this.calle, this.idCalle,
							this.numero, this.modulos, this.clase.toString(), this.entidad);
	}

	@Override
	public int compareTo(Caseta o) {
		return this.idCalle==o.idCalle? this.id-o.id : this.idCalle-o.idCalle;
	}
	
	
	
	
	
	
	
}
