package parking.Comparables;

import java.util.Comparator;

import parking.aparcamiento.Vehiculo;

public class MarcaModeloComparator implements Comparator<Vehiculo>{
	
	public int compare(Vehiculo o1, Vehiculo o2) {
		int res=0;
		
		if(o1!=null && o2!=null) {
			res = o1.getMarca().compareTo(o2.getMarca());
			if(res==0) {
				res=o1.getModelo().compareTo(o2.getModelo());
			}
		}else if(o1==null) {
			res=1;
		}else if(o2==null) {
			res=-1;
		}
		return res;
	}

}
