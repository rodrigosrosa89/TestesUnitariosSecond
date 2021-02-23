package dao;

import model.Pilha;

public class PilhaDAO implements IPilhaDao {
	
	@Override
	public void save(Pilha pilha) {
		System.out.println("Pilha salva com sucesso!");
	}

}
