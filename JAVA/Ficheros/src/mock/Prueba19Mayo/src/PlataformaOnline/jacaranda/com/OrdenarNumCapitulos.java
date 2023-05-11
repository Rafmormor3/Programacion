package mock.Prueba19Mayo.src.PlataformaOnline.jacaranda.com;

import java.util.Comparator;

public class OrdenarNumCapitulos implements Comparator<Temporada> {

	@Override
	public int compare(Temporada o1, Temporada o2) {
		return o1.getNumeroCapitulos()-o2.getNumeroCapitulos();
	}

}
