package test;

import model.Livro;
import model.Pilha;

public class PilhaTest {

	Pilha pilha = new Pilha();

	public boolean testeRetiraUltimoLivro() {
		Livro livro1 = new Livro("primeiro");
		pilha.push(livro1);

		Livro livro2 = new Livro("segundo");
		pilha.push(livro2);

		Livro livro3 = new Livro("terceiro");
		pilha.push(livro3);

		Livro livro4 = new Livro("quarto");
		pilha.push(livro4);

		Livro ultimoLivro = pilha.pop();

		if (ultimoLivro == livro4) {
			return true;
		}
		return false;
	}

	public boolean testaLimiteLivros() {
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

		return pilha.pop() == livro5;

	}

	public boolean testNaoAdicionaLivroForaPadraoNome() {
		Pilha pilha1 = new Pilha();

		Livro livro0 = new Livro("Alô");
		pilha1.push(livro0);

		Livro livro1 = new Livro("Homem de ferro");
		pilha1.push(livro1);

		return pilha1.pop() == livro0;

	}
}
