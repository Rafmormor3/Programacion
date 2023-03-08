package mock.comida;

public class Vino {
	
	private String nombre;
	private double graduacion;
	
	public Vino(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Vino(String nombre, double graduacion) throws Exception {
		this(nombre);
		if(graduacion<0) {
			throw new Exception("Graduacion introducida no valida.");
		}
		this.graduacion = graduacion;
	}

	public String getNombreVino() {
		return nombre;
	}

	public double getGraduacion() {
		return graduacion;
	}
	
	public boolean equals(Object obj) {
		boolean sonIguales = this==obj;
		if(!sonIguales && obj!=null && obj instanceof Vino) {
			Vino otroVino = (Vino) obj;
			sonIguales=otroVino.nombre != null && this.nombre!=null && this.nombre.equals(otroVino.nombre);
		}
		return sonIguales;
	}

	public String toString() {
		return "Vino " + nombre + ", con graduacion " + graduacion;
	}
	
	
	
	
}
