package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class PilhaTestRunner {

	public static void main(String[] args) {
		Result resultado = JUnitCore.runClasses(PilhaTest.class);
		System.out.println("Teste feito com sucesso? " + resultado.wasSuccessful());
	}

}
