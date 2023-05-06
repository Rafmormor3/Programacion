package localizacion;

import java.util.Objects;

public class Address implements Comparable<Address>{
	
	private int address_id;
	private String address;
	private int city;
	
	
	public Address(int address_id, String address, int city) {
		super();
		
		this.address_id = address_id;
		this.address = address;
		this.city=city;
	}

	public int getAddress_id() {
		return address_id;
	}

	public String getAddress() {
		return address;
	}

	public int getCity() {
		return city;
	}


	@Override
	public int hashCode() {
		return Objects.hash(address, address_id, city);
	}


	@Override
	public boolean equals(Object obj) {
		return this==obj || obj!=null && obj instanceof Address && obj.hashCode()==this.hashCode();
	}


	@Override
	public String toString() {
		return String.format("Calle %s (id: %s)", this.address, this.address_id);
	}


	@Override
	public int compareTo(Address o) {
		return this.address_id-o.address_id;
	}
	
	
	
	
	
	
}
