package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculoTest {

	@Test
	void test() {
		
		double passaValor1 = 1;
		double passaValor2 = 2;
		double resultadoEsperado = 3;
		
		double retornoFeito = Calculo.executaCalculo(passaValor1, passaValor2);
		
		assertEquals(resultadoEsperado, retornoFeito,0);
	}

}
