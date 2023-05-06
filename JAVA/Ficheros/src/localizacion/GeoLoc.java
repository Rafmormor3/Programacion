package localizacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GeoLoc {
	
	Set<Country> listPaises = new HashSet<>();
	
	private Set<Country> llenarListCountry() throws IOException {
		
		File paises = new File("./files/country.txt");
	
		FileReader reader = new FileReader(paises);
		BufferedReader buffer = new BufferedReader(reader);
			
		String linea = buffer.readLine();
		linea = buffer.readLine();	
		while(linea!=null) {
			Country pais = new Country(Integer.valueOf(linea.split(",")[0]),linea.split(",")[1].toString());
			listPaises.add(pais);
			linea = buffer.readLine();
		}
		return listPaises;
	}
	
	public List<Country> mostrar() throws IOException {
		List<Country> ordenado = new ArrayList<>(llenarListCountry());
		Collections.sort(ordenado);
		return ordenado;
	}

}
