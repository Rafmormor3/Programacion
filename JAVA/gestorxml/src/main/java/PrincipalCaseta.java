package main.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import main.java.model.Casetas.Caseta;
import main.java.model.Casetas.Feria;
import main.java.xml.reader.LectorXMLCaseta;

public class PrincipalCaseta {

	public static void main(String[] args) {
		
		Feria feria = new Feria("./files/casetas.xml");
		/*		
		for(Caseta c : feria.getCasetas()) {
			System.out.println(c.toString());
			
		}
		*/
		System.out.println("\n");
		
		//System.out.println(feria.agruparPorCalles());
		
		//System.out.println(feria.casetasFamiliares());
		//System.out.println(feria.casetasDistrito());
		//System.out.println(feria.otrasCasetas());
		//System.out.println(feria.casetasFamiliaresPorCalle());
		//System.out.println(feria.casetasDistritosPorCalle());
		
		System.out.println(feria.borrarCaseta("ANTONIO BIENVENIDA", 1));
		
		

	}
}