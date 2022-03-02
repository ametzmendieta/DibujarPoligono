package base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PoligonoTest {

	@Test
	void test() {
		Poligono datos = new Poligono("Hexagono");
		int lados = 6; 
		double longitudLado = 10;
		datos.setLados(lados);
		datos.setLongitudLado(longitudLado);
		double completo = datos.calcularPerimetro();
		assertEquals(60, completo);	
		}
	
}
