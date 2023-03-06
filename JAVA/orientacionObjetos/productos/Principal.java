package productos;

public class Principal {

	public static void main(String[] args) {
		
		Producto p = new Producto();
		Producto p2 = new Producto();
		Producto p3 = new Producto();

		p.setDescripcion("Balon de futbol");
		p2.setDescripcion("Camiseta algodon");
		p3.setDescripcion("Botas de cuero");
		
		p.setPrecioSinIVA(20);
		p2.setPrecioSinIVA(10);
		p3.setPrecioSinIVA(30);
		
		System.out.println(p);
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println(p.precioIVA());
		System.out.println(p2.precioIVA());
		System.out.println(p3.precioIVA());
	}

}
