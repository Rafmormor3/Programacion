package parking.aparcamiento;

import java.time.LocalDateTime;
import java.util.Objects;

public class Vehiculo implements Comparable<Vehiculo>{
	
	private String marca;
	private String modelo;
	private String matricula;
	private Combustible combustible;
	private LocalDateTime fechaEntrada;
	private TipoVehiculo tipoVehiculo;
	
	
	public Vehiculo() {
		super();
	}

	public Vehiculo(String marca, String modelo, String matricula, Combustible combustible, LocalDateTime fechaEntrada,
			TipoVehiculo tipoVehiculo) throws Exception {
		this();
		if(!matriculaCorrecta(matricula)) {
			throw new Exception("Matricula Incorrecta");
		}
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.combustible = combustible;
		this.fechaEntrada = fechaEntrada;
		this.tipoVehiculo = tipoVehiculo;
	}

	
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public Combustible getCombustible() {
		return combustible;
	}

	public LocalDateTime getFechaEntrada() {
		return fechaEntrada;
	}

	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}

	
	public boolean matriculaCorrecta(String matricula) {
		int cont=0;
		
		if(matricula!=null && !matricula.isEmpty() && matricula.length()<=8) {
			for(int i=0; i<matricula.length() && cont<4 ; i++) {
				if(Character.isDigit(matricula.charAt(i))) {
					cont++;
				}
			}
		}
		
		return cont==4? true:false;
	}
	
	
	public int hashCode() {
		return Objects.hash(combustible, fechaEntrada, marca, matricula, modelo, tipoVehiculo);
	}

	public boolean equals(Object obj) {
		boolean sonIguales = this==obj;
		if(!sonIguales && obj!=null &&  obj instanceof Vehiculo) {
			Vehiculo otroVehiculo = (Vehiculo) obj;
			sonIguales = this.matricula!=null && !this.matricula.isEmpty() && otroVehiculo.matricula!=null 
					&& !otroVehiculo.matricula.isEmpty() && this.matricula.equals(otroVehiculo.matricula);
		}
		return sonIguales;
	}

	public String toString() {
		return "\nVehiculo con marca " + marca + ", modelo " + modelo + ", matricula " + matricula + ", combustible "
				+ combustible + ", fecha de entrada " + fechaEntrada + " y es un " + tipoVehiculo;
	}

	public int compareTo(Vehiculo o) {
		return this.fechaEntrada.compareTo(o.fechaEntrada);
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	

}
