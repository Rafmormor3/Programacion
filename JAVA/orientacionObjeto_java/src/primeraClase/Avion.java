package primeraClase;

public class Avion {
	
	private String idAvion;
	private int capacidad;
	private int numVuelos;
	private double kmVolados;
	private String compannia;
	
	

	public Avion(String idAvion, int capacidad) {
		super();
		this.idAvion = idAvion;
		this.capacidad = capacidad;
		this.numVuelos=0;
		this.kmVolados=0.0;
		
	}
	
	public Avion(String idAvion, int capacidad, String compannia) {
		this(idAvion, capacidad);
		this.compannia = compannia;
		
	}
	
	public boolean asignarVuelos(int capacidad, double kilometros) {
		boolean res=false;
		if(this.capacidad>=capacidad && capacidad>0 && kilometros>0) {
			res=true;
			this.kmVolados+=kilometros;
			this.numVuelos++;
		}
		return res;
		
	}
	
	public double getMediaKm() {
		return this.numVuelos>0? this.kmVolados/this.numVuelos : 0;
		
	}

	@Override
	public String toString() {
		return "Avion con id: " + idAvion + ", con numero de vuelos: " + numVuelos + ", kilometros volados: " + kmVolados + " km,  de la compannia: "
				+ compannia + " y con una media de " + getMediaKm() + "km volados.";
	}

	//GETTERS & SETTERS
	public String getCompannia() {
		return compannia;
	}


	public void setCompannia(String compannia) {
		this.compannia = compannia;
	}


	public String getIdAvion() {
		return idAvion;
	}


	public int getCapacidad() {
		return capacidad;
	}


	public int getNumVuelos() {
		return numVuelos;
	}


	public double getKmVolados() {
		return kmVolados;
	}
	
	
	

}
