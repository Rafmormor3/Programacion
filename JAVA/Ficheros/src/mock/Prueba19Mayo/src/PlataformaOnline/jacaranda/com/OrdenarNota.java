package mock.Prueba19Mayo.src.PlataformaOnline.jacaranda.com;

import java.util.Comparator;

public class OrdenarNota implements Comparator<Temporada> {

	@Override
	public int compare(Temporada o1, Temporada o2) {
		return (int) (o1.getNotaMedia()-o2.getNotaMedia());
	}

}
