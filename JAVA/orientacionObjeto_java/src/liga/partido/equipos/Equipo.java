package liga.partido.equipos;

public class Equipo {

	private String nombre;
	private String estadio;
	private String ciudad;
	private int partidosGanados;
	

	public Equipo() {
		super();
	}

	public Equipo(String nombre, String estadio, String ciudad,int partidosGanados ) {
		this();
		this.nombre = nombre;
		this.estadio = estadio;
		this.ciudad = ciudad;
		this.partidosGanados = 0;
	}
	
	public void partidoGanado() {
		this.partidosGanados++;
	}

	//getters & setters

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
