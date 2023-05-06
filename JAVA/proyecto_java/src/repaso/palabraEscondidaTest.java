package repaso;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class palabraEscondidaTest {
	
	private palabraEscondida sut;
	
	@BeforeEach
	void setUp() {
		sut = new palabraEscondida();
	}

	@Test
	public void testEstaPalabra() {
		assertTrue(sut.estaPalabra("Al agua pato", "pato"));
		assertNotNull(sut.estaPalabra("Hola Don Pepito", "Hola"));
	}
	
	@Test
	public void testNoEstaPalabra() {
		assertFalse(sut.estaPalabra("adios", "hola"));
	}

}
