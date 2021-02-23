package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Test;

import dao.PilhaDAO;
import model.Livro;
import model.Pilha;

public class PilhaTest {
	
	//@Mock
	//public PilhaDAO pilhaDAO; 
	
	PilhaDAO pilhaDAO = mock(PilhaDAO.class);

	@Test
	public void testeRetiraUltimoLivro() {
		Pilha pilha = new Pilha(pilhaDAO);
		Livro livro = new Livro("A fortaleza");
		pilha.push(livro);

		livro = new Livro("A emboscada");
		pilha.push(livro);

		livro = new Livro("O Naufrago");
		pilha.push(livro);

		String resultadoEsperado = "O Naufrago";
		
		assertEquals(pilha.pop().getTitulo(), resultadoEsperado);

	}

	@Test(expected=Exception.class)
	public void testaLimiteLivros() {
		Pilha pilha = new Pilha(pilhaDAO);
		Livro livro1 = new Livro("A primeiro");
		pilha.push(livro1);

		Livro livro2 = new Livro("A segundo");
		pilha.push(livro2);

		Livro livro3 = new Livro("A terceiro");
		pilha.push(livro3);

		Livro livro4 = new Livro("A quarto");
		pilha.push(livro4);

		Livro livro5 = new Livro("A quinto");
		pilha.push(livro5);

		Livro livro6 = new Livro("A sexto");
		pilha.push(livro6);

	}

	@Test
	public void testNaoAdicionaLivroForaPadraoNome() {
		Pilha pilha1 = new Pilha(pilhaDAO);

		Livro livro1 = new Livro("A Fortaleza");
		pilha1.push(livro1);

		Livro livro2 = new Livro("Homem de ferro");
		pilha1.push(livro2);

		String resultadoEsperado = "A Fortaleza";
		
		assertEquals(pilha1.pop().getTitulo(), resultadoEsperado);

	}
}
