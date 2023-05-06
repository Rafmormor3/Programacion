package informacionFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Principal {

	public static void main(String[] args) {
		File fichero1 = new File("C:\\Users\\moral\\OneDrive\\Escritorio\\ProbandoFicheros\\Euromillones 2004 a 2023.csv");
		try {
			//fichero1.createNewFile();
			
			//Fichero f1 = new Fichero("C:\\Users\\moral\\OneDrive\\Escritorio\\ProbandoFicheros\\fichero1.txt");
			/*
			FileWriter writer = new FileWriter(fichero1);
			PrintWriter printer = new PrintWriter(writer);
			
			for(String elemento : "Hola-mundo-cruel".split("-")) {
				printer.println(elemento);
			}
			
			printer.close();
			writer.close();
			*/
			
			FileReader reader = new FileReader(fichero1);
			BufferedReader buffer = new BufferedReader(reader);
			
			String linea=buffer.readLine();
			linea=buffer.readLine();
			
			while(linea!=null) {
				System.out.println(linea.split(",")[0]);
				linea=buffer.readLine();
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
