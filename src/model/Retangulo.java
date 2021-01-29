package model;

public class Retangulo {
	
	private int base;
	private int altura;
	
	public Retangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	public int calcularArea() {
		return base * altura;
	}
	
	public int calcularPerimetro() {
		return (base * 2) + (altura*2);
	}
	
	public int getBase() {
		return base;
	}
	
	public void setBase(int base) {
		this.base = base; 
	}
	

}
