package maquina.tipos;

	


public class MaquinaCafe {

	public static final double P_LECHE=0.8;
	public static final double P_CAFE=1.0;
	public static final double P_CAFE_LECHE=1.5;
	
	private int cafe;
	private int leche;
	private int vasos;
	private double monedero;
	
	
	public MaquinaCafe() {
		super();
		this.cafe = 50;
		this.leche = 50;
		this.vasos = 80;
		this.monedero = 0;
	}
	
	public void vaciarMonedero() {
		this.monedero=0;
	}
	
	public void llenarDepositos() {
		this.cafe = 50;
		this.leche = 50;
		this.vasos = 80;
	}
	
	public String servir(double dinero, int opcion) {
		String res ="";
		
		if(dinero<P_LECHE) {
			res="No puede elegir ninguna opcion (dinero insuficiente)";
		}else if(this.monedero+dinero<(dinero-P_CAFE_LECHE)) {
			res="No hay cambio para usted";
		}else if (this.leche==0) {
			res="No hay leche, lo sentimos.";
		}else if(this.cafe==0) {
			res="No hay cafe, lo sentimos.";
		}else if(dinero>=P_LECHE && opcion==2) {
			this.leche--;
			this.vasos--;
			this.monedero+=0.8;
			res="Producto Servido, su vuelta es: "+String.valueOf(dinero-P_LECHE);
		}else if(dinero>=P_CAFE && opcion==1) {
			this.cafe--;
			this.vasos--;
			this.monedero+=1;
			res="Producto Servido, su vuelta es: "+String.valueOf(dinero-P_CAFE);
		}else if(dinero>=P_CAFE_LECHE && opcion==3) {
			this.leche--;
			this.cafe--;
			this.vasos--;
			this.monedero+=1.5;
			res="Producto Servido, su vuelta es: "+String.valueOf(dinero-P_CAFE_LECHE);
		}else {
			res="No se ha podido servir";
		}
		return res;
	}


	@Override
	public String toString() {
		return "Dosis de cafe: " + cafe + ", dosis de leche " + leche + ", numero de vasos " + vasos + ", el monedero tiene "
				+ "recaudado " + monedero + "€";
	}
	
	//getters & setters
	public int getCafe() {
		return cafe;
	}


	public void setCafe(int cafe) {
		this.cafe = cafe;
	}


	public int getLeche() {
		return leche;
	}


	public void setLeche(int leche) {
		this.leche = leche;
	}


	public int getVasos() {
		return vasos;
	}


	public void setVasos(int vasos) {
		this.vasos = vasos;
	}


	public double getMonedero() {
		return monedero;
	}


	public void setMonedero(double monedero) {
		this.monedero = monedero;
	}




	
	
	
	
	
	
}
