package mock.Prueba19Mayo.src.Principal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import mock.Prueba19Mayo.src.PlataformaOnline.jacaranda.com.Catalogo;
import mock.Prueba19Mayo.src.PlataformaOnline.jacaranda.com.Serie;
import mock.Prueba19Mayo.src.PlataformaOnline.jacaranda.com.SerieException;
import mock.Prueba19Mayo.src.PlataformaOnline.jacaranda.com.Tema;
import mock.Prueba19Mayo.src.PlataformaOnline.jacaranda.com.Temporada;

public class Main {

	
	
	public static void main(String[] args) {
		
		Catalogo catalogo = new Catalogo();
		File ficheroSeries = new File("C:\\Users\\moral\\WE_DAWB\\CODE\\Ficheros\\src\\mock\\Prueba19Mayo\\src\\PlataformaOnline\\jacaranda\\com\\FicheroSeries.csv");
		File ficheroTemporada = new File("C:\\Users\\moral\\WE_DAWB\\CODE\\Ficheros\\src\\mock\\Prueba19Mayo\\src\\PlataformaOnline\\jacaranda\\com\\FicheroTemporada.csv");
		File ficheroCapitulos = new File("C:\\Users\\moral\\WE_DAWB\\CODE\\Ficheros\\src\\mock\\Prueba19Mayo\\src\\PlataformaOnline\\jacaranda\\com\\FicheroCapitulos.csv");

		try {
			
			catalogo.annadirSerie("This is us", 2015, Tema.DRAMA);
			catalogo.annadirSerie("Friends", 1990, Tema.COMEDIA);
			catalogo.annadirSerie("Dallas", 1970, Tema.INTRIGA);
			catalogo.annadirTemporada("This is us", "Empezamos");
			catalogo.annadirTemporada("This is us", "Seguimos");
			catalogo.annadirTemporada("This is us", "Finalizamos");
			catalogo.annadirCapituloTemporada("This is us", "Empezamos", "La familia");
			catalogo.annadirCapituloTemporada("This is us", "Empezamos", "El problema");
			catalogo.annadirCapituloTemporada("This is us", "Empezamos", "Los niños");
			catalogo.annadirCapituloTemporada("This is us", "Empezamos", "CAsi el final");
			catalogo.annadirCapituloTemporada("This is us", "Empezamos", "El final");
			
			
			FileWriter writer = new FileWriter(ficheroSeries);
			PrintWriter printer = new PrintWriter(writer);
			
			for(Serie s : catalogo.listarSeries()) {
				printer.println(s.toString());
			}
			
			printer.close();
			writer.close();
			
			//-----------------------------------------------------
			
			writer = new FileWriter(ficheroTemporada);
			printer = new PrintWriter(writer);
			
			for(Serie s : catalogo.listarSeries()) {
				for(Temporada t : s.getTemporadas()) {
					printer.println(s.getNombreSerie()+": "+t.toString());
				}
			}
			
			printer.close();
			writer.close();
			
			//-----------------------------------------------------
			
			writer = new FileWriter(ficheroCapitulos);
			printer = new PrintWriter(writer);
			
			for(Serie s : catalogo.listarSeries()) {
				for(Temporada t : s.getTemporadas()) {
					for(String c : t.getCapitulos()) {
						printer.println(s.getNombreSerie()+", "+t.getNombreTemporada()+", "+c);
					}
				}
			}
			
			printer.close();
			writer.close();
			
			
		} catch (SerieException | IOException e) {
			e.printStackTrace();
		}
		
		

	}
	
	
}
