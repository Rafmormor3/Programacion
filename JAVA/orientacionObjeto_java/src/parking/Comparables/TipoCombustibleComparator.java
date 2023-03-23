package parking.Comparables;

import java.util.Comparator;

import parking.aparcamiento.Vehiculo;

public class TipoCombustibleComparator implements Comparator<Vehiculo>{

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		int res=0;
		
		if(o1!=null && o2!=null) {
			res= o1.getTipoVehiculo().compareTo(o2.getTipoVehiculo());
			if(res==0) {
				res=o1.getCombustible().compareTo(o2.getCombustible());
			}
		}else if(o1==null) {
			res=1;
		}else if(o2==null) {
			res=-1;
		}
		
		return res;
	}

}
