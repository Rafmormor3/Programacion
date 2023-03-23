package parking;

import java.util.Arrays;

import parking.Comparables.FechaVehiculoComparator;
import parking.Comparables.MarcaModeloComparator;
import parking.Comparables.MatriculaComparator;
import parking.Comparables.TipoCombustibleComparator;
import parking.aparcamiento.Vehiculo;

public class Parking{
	
	private static final int NUM_PLAZAS=50;
	private Vehiculo[] aparcamiento;
	
	
	public Parking() {
		super();
		this.aparcamiento = new Vehiculo[NUM_PLAZAS];
	}
	

	public Vehiculo[] getAparcamiento() {
		return aparcamiento;
	}


	public void aparcar(Vehiculo v) {
		boolean res=false;
		for(int i=0; i<aparcamiento.length && res==false;i++) {
			if(aparcamiento[i]==null) {
				aparcamiento[i]=v;
				res=true;
			}
		}
	}
	
	public void sacarCoche(String matricula) {
		boolean res = false;
		if(matricula!=null && !matricula.isEmpty()) {
			for(int i=0;i<aparcamiento.length && res==false;i++) {
				if(aparcamiento[i].getMatricula().equals(matricula)) {
					aparcamiento[i]=null;
					res=true;
				}
			}
		}
	}

	public String ordenarAparcamiento() {
		Arrays.sort(this.aparcamiento);
		return Arrays.toString(this.aparcamiento);
	}
	
	public String aparcamientoLibre() {
		Arrays.sort(this.aparcamiento, new FechaVehiculoComparator());
		return Arrays.toString(this.aparcamiento);
	}
	
	public String ordenadoMarcaModelo() {
		Arrays.sort(this.aparcamiento, new MarcaModeloComparator());
		return Arrays.toString(this.aparcamiento);
	}

	public String ordenarTipoCombustible() {
		Arrays.sort(this.aparcamiento, new TipoCombustibleComparator());
		return Arrays.toString(this.aparcamiento);
	}
	
	public String ordenarMatricula() {
		Arrays.sort(this.aparcamiento, new MatriculaComparator());
		return Arrays.toString(this.aparcamiento);
	}

}
