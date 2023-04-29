package informacionFicheros;

import java.io.File;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		//File fichero1 = new File("C:\\Users\\moral\\OneDrive\\Escritorio\\ProbandoFicheros\\fichero1.txt");
		try {
			//fichero1.createNewFile();
			
			Fichero f1 = new Fichero("C:\\Users\\moral\\OneDrive\\Escritorio\\ProbandoFicheros\\fichero1.txt");
			
			System.out.println(f1.toString());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
