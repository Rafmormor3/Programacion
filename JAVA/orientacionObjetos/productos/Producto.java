package productos;

public class Producto {
	
	public static final double IVA = 0.2;
	
	public static int cont =0;
	
	private int codigo;
	private String descripcion;
	private double precioSinIVA;
	
	public Producto() {
		super();
		this.codigo=cont++;
	}

	public Producto(String descripcion, double precioSinIVA) {
		this();
		this.codigo=cont++;
		this.descripcion = descripcion;
		this.precioSinIVA = precioSinIVA;
	}
	
	public double precioIVA() {
		return this.precioSinIVA + (this.precioSinIVA*IVA);
	}

	//getters & setters
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioSinIVA() {
		return precioSinIVA;
	}

	public void setPrecioSinIVA(double precioSinIVA) {
		this.precioSinIVA = precioSinIVA;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precioSinIVA=" + precioSinIVA + "]";
	}
	
	
	

}
