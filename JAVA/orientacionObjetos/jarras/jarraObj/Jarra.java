package jarras.jarraObj;

public class Jarra {
	
	private double capacidad;
	private double cantidad;
	
	double cantidadTotal=0;
	
	public Jarra() {
		super();
		this.cantidad = 0;
	}

	public Jarra(double capacidad) {
		this();
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Jarra [capacidad=" + capacidad + ", agua que contiene=" + cantidad + "]";
	}
	
	public void llenarJarra() {
		this.cantidad=this.capacidad;
	}
	
	public void vaciarJarra() {
		this.cantidad=0;
	}
	
	public void volcarJarra(Jarra b) {
		if(this.cantidad>b.capacidad) {
			cantidadTotal+=b.capacidad-b.cantidad;
			this.cantidad=this.cantidad-(b.capacidad-b.cantidad);
			b.cantidad=b.capacidad-b.cantidad;	
		}else {
			cantidadTotal+=this.cantidad;
			b.cantidad+=this.cantidad;
			this.cantidad=0;
		}
	}
	
	
}
