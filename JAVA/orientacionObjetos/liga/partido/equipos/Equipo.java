package liga.partido.equipos;

public class Equipo {

	private String nombre;
	private int numGoles;
	private String estadio;
	private String ciudad;
	public int partidosGanados=0;
	

	public Equipo() {
		super();
	}

	public Equipo(String nombre, int numGoles, String estadio, String ciudad,int partidosGanados ) {
		this();
		this.nombre = nombre;
		this.numGoles = numGoles;
		this.estadio = estadio;
		this.ciudad = ciudad;
		this.partidosGanados = partidosGanados;
	}

	//getters & setters
	public int getNumGoles() {
		return numGoles;
	}

	public void setNumGoles(int numGoles) {
		this.numGoles = numGoles;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEstadio() {
		return estadio;
	}

	public String getCiudad() {
		return ciudad;
	}

	public int getPartidosGanados() {
		return partidosGanados;
	}
	
	
	
	
	
	
	
	
}
