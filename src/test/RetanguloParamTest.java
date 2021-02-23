package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import lombok.Data;
import model.Retangulo;

@RunWith(Parameterized.class)
@Data
public class RetanguloParamTest {

	private int base;
	private int altura;
	private int area;

	@Parameters
	public static Collection<Object[]> parametros() {
		return Arrays.asList(new Object[][] { 
			{ 10, 20, 200 }, 
			{ 10, 30, 300 }, 
			{ 10, 40, 400 }, 
			{ 10, 50, 500 } });
	}

	public RetanguloParamTest(int base, int altura, int area) {
		this.base = base;
		this.altura = altura;
		this.area = area;
	}

	@Test
	public void testCalcularArea() {
		Retangulo retangulo = new Retangulo(base, altura);
		int resultado = retangulo.calcularArea();
		assertEquals(resultado, area);
	}

}
