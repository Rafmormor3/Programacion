package parking;

import java.time.LocalDateTime;
import java.util.Arrays;

import parking.aparcamiento.Combustible;
import parking.aparcamiento.TipoVehiculo;
import parking.aparcamiento.Vehiculo;

public class Main {

	public static void main(String[] args) {
		Parking p = new Parking();
		
		try {
			Vehiculo v1 = new Vehiculo("Opel","Corsa","1234AAA",Combustible.ELECTRICO,LocalDateTime.of(2022, 12, 30, 10, 30),TipoVehiculo.AUTOMOVIL);
			Vehiculo v2 = new Vehiculo("Audi","A1","123456A",Combustible.GASOLINA,LocalDateTime.of(2023, 1, 4, 15, 30),TipoVehiculo.AUTOMOVIL);
			Vehiculo v3 = new Vehiculo("Audi","R8","1255TT",Combustible.ELECTRICO,LocalDateTime.of(2023, 2, 20, 10, 30),TipoVehiculo.AUTOMOVIL);
			Vehiculo v4 = new Vehiculo("Seat","Leon","TTT12367",Combustible.HIBRIDO,LocalDateTime.of(2022, 5, 15, 1, 40),TipoVehiculo.AUTOMOVIL);
			Vehiculo v5 = new Vehiculo("Mercedes","GLC","0000J",Combustible.ELECTRICO,LocalDateTime.now(),TipoVehiculo.AUTOMOVIL);
			
			p.aparcar(v1);
			p.aparcar(v2);
			p.aparcar(v3);
			p.aparcar(v4);
			p.aparcar(v5);
			
			
			//System.out.println(p.ordenarAparcamiento());
			System.out.println(p.aparcamientoLibre());
			
			System.out.println(p.ordenadoMarcaModelo());
			Vehiculo v6 = new Vehiculo("Citroen","Picasso","5711HMX",Combustible.GASOIL,LocalDateTime.now(),TipoVehiculo.AUTOMOVIL);
			
			p.sacarCoche("0000J");
			p.aparcar(v6);
			System.out.println(p.aparcamientoLibre());
			
			System.out.println(p.ordenarTipoCombustible());
			
			System.out.println(p.ordenarMatricula());
			

			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
