package localizacion;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CityTest {

	@ParameterizedTest
	@CsvSource({"2, Abha, 82, 2",
				"70,Bergamo,49,2",
				"377,Okinawa,50,2"
				})
	void testNumeroCalles(int id, String nombre, int pais, int resultado) {
		try {
			
			City c = new City(id, nombre, pais);
			
			assert(c.numeroCalles()==resultado);
			
		} catch (IOException e) {
			assert(false);
		}
	}

}
