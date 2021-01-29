package test;

import model.Retangulo;

public class RetanguloTest {
	
	public boolean testCalcularArea() {
		Retangulo retangulo = new Retangulo(10,2);
		int resultadoEsperado = 20;
		int result = retangulo.calcularArea();
		
		if (result == resultadoEsperado) { 
			return true;
		} else {
			return false;
		}
	}
	
	public boolean testCalculaPerimetro() {
		Retangulo retangulo = new Retangulo(10,2);
		int resultadoEsperado = 24;
		int result = retangulo.calcularPerimetro();
		
		if (result == resultadoEsperado) { 
			return true;
		} else {
			return false;
		}

	}

}
