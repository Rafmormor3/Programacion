package localizacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Country implements Comparable<Country>{
	
	private int country_id;
	private String country;
	private int numero_ciudades;
	private int numero_calles;
	private Set<City> list_City;
	
	public Country(int country_id, String country) throws IOException {
		super();
		this.country_id=country_id;
		this.country=country;
		this.list_City = new HashSet<>();
		this.list_City= llenarListCity();
		this.numero_ciudades= this.list_City.size();
		this.numero_calles=numeroCalles();
		
	}

	public String getCountry() {
		return country;
	}

	public Set<City> getList_City() {
		return list_City;
	}

	@Override
	public int hashCode() {
		return Objects.hash(country, country_id, list_City);
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj || obj!=null && obj instanceof Country && obj.hashCode()==this.hashCode();
	}
	
	@Override
	public String toString() {
		return String.format("Pais %s (id: %s) con %s ciudades y %s calles", this.country, this.country_id, this.numero_ciudades, this.numero_calles);
	}
	
	private Set<City> llenarListCity() throws IOException {
		File ciudades = new File("./files/city.txt");
	
		FileReader reader = new FileReader(ciudades);
		BufferedReader buffer = new BufferedReader(reader);
			
		String linea = buffer.readLine();
		linea = buffer.readLine();	
		while(linea!=null ) {
			if(Integer.valueOf(linea.split(",")[2])==this.country_id) {
				City ciudad = new City(Integer.valueOf(linea.split(",")[0]), linea.split(",")[1].toString(), Integer.valueOf(linea.split(",")[2]) );
				this.list_City.add(ciudad);
			}
			linea = buffer.readLine();
		}
		return this.list_City;
	}
	
	private int numeroCalles() {
		int res=0;
		for(City c : this.list_City) {
			res+=c.numeroCalles();
		}
		return res;
	}
	
	@Override
	public int compareTo(Country o) {
		return this.numero_calles==o.numero_calles? this.getCountry().compareTo(o.getCountry()) : o.numero_calles-this.numero_calles;
	}
	
	
	
}
