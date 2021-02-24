package cliente;

public class Venda {

	private double valor;
	private Cliente cliente;
	private ICredito creditoService;
	private boolean pagamentoAVista = true;

	public Venda(double valor, Cliente cliente, ICredito creditoService) {
		this.valor = valor;
		this.cliente = cliente;
		this.creditoService = creditoService;
	}

	public double getValor() {
		return valor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public boolean checkOut() {
		double limite;

		if (pagamentoAVista) {
			return true;
		}

		try {
			limite = creditoService.getLimite(cliente.getCpf());
			if (valor > limite) {
				return false;
			}
		} catch (RuntimeException ex) {
			return false;
		}
		
		return true;
	}

	public void setPagamentoAVista(boolean b) {
		pagamentoAVista = b;
	}

}
