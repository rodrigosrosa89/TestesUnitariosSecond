package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Livro;
import model.Pilha;

class PilhaTestFixture {
	
	private static Pilha pilha;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		pilha = new Pilha();
		System.out.println("Executou o BeforeClass");
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		pilha = null;
		System.out.println("Executou o AfterClass");

	}

	@BeforeEach
	void setUp() throws Exception {
		Livro livro = new Livro("A Terra");
		Livro livro2 = new Livro("A Rua");
		Livro livro3 = new Livro("A Globo");
		Livro livro4 = new Livro("A Lua");
		Livro livro5 = new Livro("O Sol");
		
		pilha.push(livro);
		pilha.push(livro2);
		pilha.push(livro3);
		pilha.push(livro4);
		pilha.push(livro5);
	}

	@AfterEach
	void tearDown() throws Exception {
		int tamanho = pilha.count();
		while(tamanho > 0) {
			pilha.pop();
			tamanho--;
		}
	}

	@Test
	void testNaoAdicionaAlemLimite() {
		pilha.push(new Livro("A volta ao mundo"));
		Livro livro = pilha.pop();
		assertEquals("O Sol", livro.getTitulo());
		System.out.println("Executou teste não adiciona além do limite");
	}
	
	@Test
	void testNaoAdicionaLivroForaPadraoNome() {
		pilha.pop();
		pilha.push(new Livro("Não permitido"));
		Livro livro = pilha.pop();
		assertEquals("A Lua", livro.getTitulo());
		System.out.println("Executou teste não adiciona fora do padrão nome");
	}


}
