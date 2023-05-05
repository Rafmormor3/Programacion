package euromillon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;

import euromillon.exceptions.CombinacionException;
import euromillon.exceptions.HistorialException;

public class Principal {

	public static void main(String[] args) {
		
		
		try {
			Historial h = new Historial();
			
			/*
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
			*/
			
			File fichero1 = new File("C:\\Users\\moral\\OneDrive\\Escritorio\\ProbandoFicheros\\Euromillones 2004 a 2023.csv");
			
			FileReader reader = new FileReader(fichero1);
			BufferedReader buffer = new BufferedReader(reader);
			
			String linea=buffer.readLine();
			
			linea=buffer.readLine();
			
			while(linea!=null) {
				
				
				String[] datos = linea.split(",");
				String[] fecha = datos[0].split("/");
				
				Combinacion c = new Combinacion(Integer.valueOf(datos[1]),Integer.valueOf(datos[2]),
												Integer.valueOf(datos[3]),Integer.valueOf(datos[4]),Integer.valueOf(datos[5]),
												Integer.valueOf(datos[7]),Integer.valueOf(datos[8]));
				h.addSorteo(Integer.valueOf(fecha[0]), Integer.valueOf(fecha[1]), Integer.valueOf(fecha[2]), c);
				linea=buffer.readLine();
			}
			
			//System.out.println(h.listarSorteosDesdeFecha(LocalDate.of(2022, 10, 15)));
			System.out.println(h.mostrarHistorico());

			System.out.println(h.mayorRepeticion("numeros"));
			System.out.println(h.menorRepeticion("numeros"));
			System.out.println(h.mayorRepeticion("estrellas"));
			System.out.println(h.menorRepeticion("estrellas"));
			
			Combinacion c1 = new Combinacion(1, 2, 3, 4, 5, 8, 9);
			System.out.println(h.maximoNumeroAciertos(c1));
			
			System.out.println(h.mayorSecuenciaConsecutivos());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
