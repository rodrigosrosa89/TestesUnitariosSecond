package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import model.Calculadora;

class CalculadoraTest {

	@Test
	public void testSomar() {
		Calculadora calculadora = new Calculadora();
		
		int soma = calculadora.somar(4, 6);
		
		assertTrue(soma == 10);
	}
	
	@Test
	public void testSomarNegativos() {
		Calculadora calculadora = new Calculadora();
		
		int soma = calculadora.somar(-4, -6);
		
		assertEquals(-10, soma);
	}
	
	@Ignore
	public void testSomarSemAnotacao() {
		Calculadora calculadora = new Calculadora();
		
		int soma = calculadora.somar(4, 6);
		
		assertEquals(10, soma);
	}



}
