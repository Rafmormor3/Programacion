package SieteYMedia.Cartas;

public class Baraja {
	
	protected int num_Cartas;
	protected int siguiente;
	private Carta[] cartas;
	
	private Carta[] barajada = new Carta[40];
	
	
	public Baraja() throws Exception {
		super();
		this.siguiente=0;
		this.num_Cartas=40;
		this.cartas=new Carta[this.num_Cartas];
		llenarBaraja();
		
	}
	
	public void barajar() {
		int cont=0;
		this.siguiente=0;
		
		while(cont<40) {
			int pos = (int)(Math.random()*40);
			if(barajada[pos]==null) {
				barajada[pos]=this.cartas[cont];
				cont++;
			}
		}
	}
	
	public Carta getSiguiente() throws Exception {
		Carta c = barajada[this.siguiente] ;
		this.siguiente++;
		return c;
	}
	
	private Palo generarPalo() {
		int pos=(int)(Math.random()*5);
		return Palo.values()[pos];
	}
	
	private int generarNumero() {
		int n=0;
		do {
			n=(int)(Math.random()*12+1);
		}while(n==8 || n==9);
		return n;
	}
	
	public void llenarBaraja() throws Exception {
		int cont=0;
		for(int i=0; i<=Palo.values().length-1;i++) {
			for(int j=1;j<=12;j++) {
				if(j!=8 && j!=9) {
					this.cartas[cont]=new Carta(j,Palo.values()[i]);
					cont++;
				}
			}
		}
	}
	

}
