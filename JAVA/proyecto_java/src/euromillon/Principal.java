package euromillon;

import java.time.LocalDate;

import euromillon.exceptions.CombinacionException;
import euromillon.exceptions.HistorialException;

public class Principal {

	public static void main(String[] args) {
		
		
		try {
			Historial h = new Historial();
			
			Combinacion c1 = new Combinacion(1, 30, 45, 5, 7, 8, 10);
			Combinacion ganador = new Combinacion(1, 28, 40, 5, 7, 3, 10);
			Combinacion c2 = new Combinacion(4, 27, 46, 5, 7, 6, 11);
			
			h.addSorteo(15, 10, 2022, ganador);
			System.out.println(h.comprobarAciertos(LocalDate.of(2022, 10, 15), c1));
			h.actualizarSorteo(LocalDate.of(2022, 10, 15), c1);
			System.out.println(h.comprobarAciertos(LocalDate.of(2022, 10, 15), c1));
			//h.borrarSorteo(LocalDate.of(2022, 10, 15));
			h.addSorteo(LocalDate.of(2023, 1, 12), c2);
			System.out.println(h.listarSorteosDesdeFecha(LocalDate.of(2022, 10, 14)));

			
			
		} catch (CombinacionException  | HistorialException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
