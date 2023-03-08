package liga.partido;

import liga.partido.equipos.Equipo;

public class Partido {

	private int jornada;
	
	private Equipo local;
	private int golesLocal;
	
	private Equipo visitante;
	private int golesVisitante;
	
	private char quiniela;
	
	public Partido() {
		super();
		this.local = new Equipo();
		this.visitante = new Equipo();
	}

	public Partido(int jornada, Equipo local, Equipo visitante, char quiniela) {
		super();
		this.jornada =0;
		this.local = local;
		this.visitante = visitante;
		this.quiniela = 0;
	}
	
	public void ponerResultado(String res) {
		String[] parts = res.split("-");
		this.golesLocal=Integer.valueOf(parts[0]);
		this.golesVisitante= Integer.valueOf(parts[1]);
		if(Integer.valueOf(parts[0])>Integer.valueOf(parts[1])) {
			this.quiniela='1';
			this.local.partidoGanado();;
		}else if(Integer.valueOf(parts[0])<Integer.valueOf(parts[1])) {
			this.quiniela='2';
			this.visitante.partidoGanado();;
		}else {
			this.quiniela='X';
		}
	}

	public String toString() {
		String mensaje="";
		if(this.quiniela==0) {
			mensaje="Partido entre equipo local: \" + local.getNombre() + \", visitante: \" + visitante.getNombre() + \" todavia no se ha jugado.";
		}else {
			mensaje="Partido entre equipo local: " + local.getNombre() + ",\n y equipo visitante: " + visitante.getNombre() + ",\n jugado en el "
					+ "estadio: " + local.getEstadio() + " de la ciudad: "+ local.getCiudad()+
					" \nha finalizado con "+golesLocal+" goles del equipo local y "+golesVisitante+
					" goles de equipo visitante. \nResultado quiniela = "+quiniela;
		}
		return mensaje;
	}
	
	
	
	
	
	
	
	
}
