package cliente;

public class CreditoService implements ICredito {

	@Override
	public double getLimite(String cpf) {

		System.out.println("Acessando banco...");
		return 1500;
	}

}
