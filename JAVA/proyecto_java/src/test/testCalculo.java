package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testCalculo {
	
	Calculo c = new Calculo();
	
	@Test
	void testSuma() {
		assertEquals(4, c.suma(2, 2));
	}
	
	@Test
	void testDivision() {
		assertEquals(4, c.division(8, 2));
		assertEquals(1, c.division(2, 2));
	}

}
