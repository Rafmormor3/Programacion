package liga.partido;

import liga.partido.equipos.Equipo;

public class Partido {

	private int jornada;
	private Equipo local;
	private Equipo visitante;
	private char quiniela;
	
	public Partido() {
		super();
		this.local = new Equipo();
		this.visitante = new Equipo();
	}

	public Partido(int jornada, Equipo local, Equipo visitante, char quiniela) {
		super();
		this.jornada = jornada;
		this.local = local;
		this.visitante = visitante;
		this.quiniela = quiniela;
	}
	
	public void ponerResultado(String res) {
		String[] parts = res.split("-");
		this.local.setNumGoles(Integer.valueOf(parts[0]));
		this.visitante.setNumGoles(Integer.valueOf(parts[1]));
		if(Integer.valueOf(parts[0])>Integer.valueOf(parts[1])) {
			this.quiniela='1';
			local.partidosGanados++;
		}else if(Integer.valueOf(parts[0])<Integer.valueOf(parts[1])) {
			this.quiniela='2';
			visitante.partidosGanados++;
		}else {
			this.quiniela='X';
		}
	}
	
	public String toStringN() {
		return "Partido entre equipo local: " + local.getNombre() + ", visitante: " + visitante.getNombre() + " todavia no se ha jugado.";
	}

	public String toStringS() {
		return "Partido entre equipo local: " + local.getNombre() + ",\n y equipo visitante: " + visitante.getNombre() + ",\n jugado en el "
				+ "estadio: " + local.getEstadio() + " de la ciudad: "+ local.getCiudad()+
				" \nha finalizado con "+local.getNumGoles()+" goles del equipo local y "+visitante.getNumGoles()+
				" goles de equipo visitante. \nResultado quiniela = "+quiniela;
	}
	
	
	
	
	
	
	
	
}
