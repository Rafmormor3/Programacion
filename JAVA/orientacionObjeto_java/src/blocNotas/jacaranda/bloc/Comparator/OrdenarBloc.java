package blocNotas.jacaranda.bloc.Comparator;

import java.util.Comparator;

import blocNotas.jacaranda.bloc.Bloc;
import blocNotas.jacaranda.notas.Nota;

public class OrdenarBloc implements Comparator<Nota>{

	@Override
	public int compare(Nota o1, Nota o2) {
		int res=0;
		
		if(o1!=null && o2!=null) {
			res = o1.getFechaCreacion().compareTo(o2.getFechaCreacion());
		}else if(o1==null) {
			res=1;
		}else if(o2==null) {
			res=-1;
		}
		return res;
	}

}
