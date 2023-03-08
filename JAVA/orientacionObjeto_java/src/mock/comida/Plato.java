package mock.comida;

import java.util.Objects;

public class Plato {
	
	private String nombre;
	private double precio;
	private static final double IVA=0.21;
	private Vino vino;
	
	public Plato(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Plato(String nombre, double precio) throws Exception {
		this(nombre);
		if(precio<=0) {
			throw new Exception("Precio introducido no valido");
		}
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecioBase() {
		return precio;
	}
	
	public double getPrecioVentaPublico() {
		return precio+(precio*IVA);
	}
	
	public String getVinoRecomendado() {
		return this.vino!=null? this.vino.toString() : "Sin recomendaciones";
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void incrementarPrecio(double incremento) {
		this.precio+=incremento;
	}
	
	public void setVinoRecomendado(Vino vino) {
		this.vino=vino;
	}
	
	public void setVinoRecomendado(String vino, double graduacion) throws Exception {
		setVinoRecomendado(new Vino(vino,graduacion));
	}
	
	public double getGradosVinosRecomendado() {
		return vino.getGraduacion();
	}
	
	public double getIva() {
		return IVA;
	}

	public boolean equals(Object obj) {
		boolean sonIguales = this==obj;
		if(!sonIguales && obj!=null && obj instanceof Plato) {
			Plato otroPlato = (Plato) obj;
			sonIguales=otroPlato.nombre != null && this.nombre!=null && this.nombre.equals(otroPlato.nombre);
		}
		return sonIguales;
	}

	public String toString() {
		return "\nNombre del plato: "+nombre+", precio sin IVA: "+getPrecioBase()+"€, \n"
				+ "precio venta al publico: "+getPrecioVentaPublico()+ ", vino recomendado: "+ getVinoRecomendado();
	}
	
	
	

}
