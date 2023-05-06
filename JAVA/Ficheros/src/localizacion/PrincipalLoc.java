package localizacion;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrincipalLoc {

	public static void main(String[] args) {
		
		GeoLoc g = new GeoLoc();
		File f1 = new File("./files/paisesOrdenados.txt");
		
		try {
			
			FileWriter writer = new FileWriter(f1);
			PrintWriter printer = new PrintWriter(writer);
			
			for(Country c : g.mostrar()) {
				printer.println(c);
			}
			
			printer.close();
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
