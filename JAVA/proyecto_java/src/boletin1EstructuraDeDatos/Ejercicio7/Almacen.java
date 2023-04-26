package boletin1EstructuraDeDatos.Ejercicio7;

import java.util.Arrays;

public class Almacen {
	
	private  Caja[] cajas;
	public static final int NUM_MAX_CAJAS=20;
	
	public Almacen(Caja[] cajas) {
		super();
		this.cajas = new Caja[NUM_MAX_CAJAS];
		for(int i=0; i<NUM_MAX_CAJAS; i++) {
			this.cajas[i] = new Caja();
		}
	}
	
	public void abrirCaja(int id) throws Exception {
		Caja c = buscarCaja(id);
		if(c!=null) {
			abrirCaja(c);
		}
	}
	
	public void abrirCaja(Caja caja) throws Exception {
		caja.abrirCaja();
	}
	
	public void cerrarCaja(Caja caja) throws Exception {
		caja.cerrarCaja();
	}
	public void cerrarCaja(int id) throws Exception {
		Caja c = buscarCaja(id);
		if(c!=null) {
			cerrarCaja(c);
		}
	}
	
	public Caja obtenerCajaPrioritaria() {
		Arrays.sort(cajas);
		return cajas[0];
	}
	
	public  String asignarClientesACaja(Cliente c) {
		Caja caja = obtenerCajaPrioritaria();
		caja.enColaCliente();
		return caja.toString();
	}
	
	public String atenderCliente(int idCaja) throws Exception {
		return buscarCaja(idCaja).atenderCliente();
	}
	
	private Caja buscarCaja(int id) {
		Caja caja = null;
		for(int i=0; i<NUM_MAX_CAJAS && caja==null; i++) {
			if(this.cajas[i].getId()==id) {
				caja=this.cajas[i];
			}
		}
		return caja;
	}
	
}
