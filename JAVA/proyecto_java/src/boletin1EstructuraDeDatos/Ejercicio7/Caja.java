package boletin1EstructuraDeDatos.Ejercicio7;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Caja implements Comparable<Caja>{
	
	private List<Cliente> clientes;
	private boolean estado;
	private static int siguiente=0;
	private int id;

	public Caja() {
		super();
		this.clientes = new ArrayList<>();
		this.estado=false;
		this.id=siguiente++;
	}
	
	public int getId() {
		return id;
	}
	
	public int getNumClientes() {
		return this.clientes.size();
	}

	public void abrirCaja() throws Exception {
		if(estado==false) {
			estado=true;
		}else {
			throw new Exception("Ya abierta");
		}
	}
	
	public void cerrarCaja() throws Exception {
		if(estado==true && clientes.isEmpty()) {
			estado=false;
		}else {
			throw new Exception("No se puede cerrar");
		}
	}
	
	public void enColaCliente() {
		this.clientes.add(null);
	}
	
	public String atenderCliente() throws Exception {
		String mensaje = "";
		if(estado==false || this.clientes.isEmpty()) {
			throw new Exception("No se puede atender");
		}else {
			mensaje=String.format("",this.clientes.remove(0).getId());
		}
		return mensaje;
	}

	@Override
	public int compareTo(Caja o) {
		return getNumClientes()==o.getNumClientes()? getId()-o.getId() : getNumClientes()-o.getNumClientes();
	}

	@Override
	public int hashCode() {
		return Objects.hash(estado, clientes, id);
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj || obj!=null && obj instanceof Caja && obj.hashCode()==this.hashCode();
	}
	
	
	
	
}
