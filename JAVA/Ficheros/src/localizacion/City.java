package localizacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class City {
	
	private int city_id;
	private String city_name;
	private Set<Address> listAddress;
	private int country;
	private int num_calles;
	
	
	public City(int city_id, String city_nombre, int country) throws IOException {
		super();
		this.city_id = city_id;
		this.city_name = city_nombre;
		this.country=country;
		this.listAddress = new HashSet<>();
		this.listAddress=llenarListAddress();
		this.num_calles=numeroCalles();
	}

	public int getCity_id() {
		return city_id;
	}

	public String getCity_name() {
		return city_name;
	}

	public int getCountry() {
		return country;
	}


	public int getNum_calles() {
		return num_calles;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city_name, city_id, listAddress);
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj || obj!=null && obj instanceof City && obj.hashCode()==this.hashCode();
	}
	
	
	
	private Set<Address> llenarListAddress() throws IOException {
		
		File calles = new File("./files/address.txt");
	
		FileReader reader = new FileReader(calles);
		BufferedReader buffer = new BufferedReader(reader);
			
		String linea = buffer.readLine();
		linea = buffer.readLine();	
		while(linea!=null) {
			if(Integer.valueOf(linea.split(",")[4])== this.city_id) {
				Address calle = new Address(Integer.valueOf(linea.split(",")[0]), linea.split(",")[1].toString(), Integer.valueOf(linea.split(",")[4]));
				this.listAddress.add(calle);
			}
			linea = buffer.readLine();
		}
		return this.listAddress;
	}
	
	public int numeroCalles() {
		for(Address a : this.listAddress) {
			if(a.getCity()==this.city_id) {
				this.num_calles++;
			}
		}
		return this.num_calles;
	}
	
	@Override
	public String toString() {
		return String.format("Ciudad %s (id: %s) con %s calles", getCity_name(), this.city_id, this.num_calles);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
