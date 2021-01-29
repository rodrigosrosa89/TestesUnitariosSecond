package main;

import test.RetanguloTest;

public class RetanguloMain {

	public static void main(String[] args) {
		RetanguloTest test = new RetanguloTest();
		boolean resultado;
		
		resultado = test.testCalcularArea();
		System.out.println("Teste calcular área = " + resultado);
		
		resultado = test.testCalculaPerimetro();
		System.out.println("Teste calcular perímetro = " + resultado);
	}

}
