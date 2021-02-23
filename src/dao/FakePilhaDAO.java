package dao;

import model.Pilha;

public class FakePilhaDAO implements IPilhaDao {

	@Override
	public void save(Pilha pilha) {
		System.out.println("Não falo com Banco de dados");
	}

}
