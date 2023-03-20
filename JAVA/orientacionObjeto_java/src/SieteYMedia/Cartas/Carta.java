package SieteYMedia.Cartas;

import java.util.Objects;

public class Carta {
	
	private int number;
	private Palo palo;
	
	public Carta() {
		super();
	}
	
	public Carta(int number, Palo palo) throws Exception {
		this();
		if( validarNum(number)==false && palo==null) {
			throw new Exception("Datos incorrectos"); 
		}
		this.number = number;
		this.palo = palo;
	}
	
	public boolean validarNum(int number) {
		return (number>0 && number<=7) || (number>=10 && number<=12);
	}
	
	public double getValor() {
		return this.number>0 && this.number<=7? this.number : 0.5;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number, palo);
	}
	
	public boolean equals(Object obj) {
		boolean sonIguales = this==obj;
		if(!sonIguales && obj!=null && obj instanceof Carta) {
			Carta otraCarta = (Carta) obj;
			sonIguales=otraCarta.number != 0 && this.number!=0 && this.number==otraCarta.number &&
					otraCarta.palo!=null && this.palo!=null && otraCarta.palo.equals(this.palo);
		}
		return sonIguales;
	}

	public int getNumber() {
		return this.number;
	}

	public Palo getPalo() {
		return this.palo;
	}

	public String toString() {
		return number + " de " + palo ;
	}
	
	
	
	

}
