import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DepositoCombustibleTest {

	@Test
	void testGetDepositoNivel() {
		assertEquals(100, 100);
	}

	@Test
	void testGetDepositoMax() {
		assertEquals(100, 100);
	}

	@Test
	void testEstaVacio() {
		assertTrue(100 == 0);
	}

	@Test
	void testEstaLleno() {
		assertTrue(200 == 100);
	}

	@Test
	void testFill() {
		assertTrue(200 == 100 + 30);
	}

	@Test
	void testConsumir() {
		assertTrue(100 == 200 - 30);
	}

}
