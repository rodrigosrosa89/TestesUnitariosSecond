package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model.Livro;

class LivroTest {

	@Test
	void test() {
		Livro livro = new Livro("A Lua");
		String resultadoEsperado = livro.getTitulo();
		
		assertEquals(resultadoEsperado, "A Lua");
	}

}
