package main;

import test.PilhaTest;

public class PilhaMain {

	public static void main(String[] args) {

		PilhaTest teste = new PilhaTest();
		boolean resultado;
		
		resultado = teste.testaLimiteLivros();
		System.out.println(resultado);

		resultado = teste.testeRetiraUltimoLivro();
		System.out.println(resultado);

		resultado = teste.testNaoAdicionaLivroForaPadraoNome();
		System.out.println(resultado);

	}

}
