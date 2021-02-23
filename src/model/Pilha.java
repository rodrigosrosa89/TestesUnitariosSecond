package model;

import java.util.ArrayList;

import dao.PilhaDAO;

public class Pilha {
	int limite = 5;
	ArrayList<Livro> pilha = new ArrayList<Livro>();
	private PilhaDAO pilhaDao;
	
	public Pilha(PilhaDAO pilhaDao) {
		this.pilhaDao = pilhaDao;
	}


	public void push(Livro livro) {
		if(pilha.size() >= limite) {
			throw new ArrayStoreException("Passou do limite");
		}
		
		if(!livro.getTitulo().startsWith("A") && !livro.getTitulo().startsWith("O")) {
			return;
		}
		 
		pilha.add(livro);
		pilhaDao.save(this);
	}
	
	public Livro pop() {
		Livro livro = pilha.get(pilha.size()-1);
		pilha.remove(pilha.size()-1);
		return livro;
	}
	
	public int count() {
		return pilha.size();
	}

}
