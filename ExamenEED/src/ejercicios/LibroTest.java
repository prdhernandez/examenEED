package ejercicios;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LibroTest {

	@Test
	@DisplayName(value = "1D diario oficial 978-84-480-0718-8")
	public void testISBN13() {
		Libro l = new Libro("1D diario oficial", "978-84-480-0718-8", "HarperCollins", "cupula");
		boolean resultado;
		resultado = l.checkISBN13();
		assertTrue(resultado);
	}

}
