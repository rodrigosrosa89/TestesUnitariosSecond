package cliente;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class VendasTest {

	@Test
	void testCheckOutDentroDoLimite() {
		Cliente cliente = new Cliente("123", "Rodrigo");
		ICredito iCreditoMock = mock(ICredito.class);
		when(iCreditoMock.getLimite(cliente.getCpf())).thenReturn(2500.00);
		
		Venda venda = new Venda(2000.00, cliente, iCreditoMock);
		
		boolean resultado = venda.checkOut();
		assertTrue(resultado);
	}
	
	@Test
	void testCheckOutForaDoLimite() {
		Cliente cliente = new Cliente("123", "Rodrigo");
		ICredito iCreditoMock = mock(ICredito.class);
		when(iCreditoMock.getLimite(cliente.getCpf())).thenReturn(500.00);
		
		Venda venda = new Venda(2000.00, cliente, iCreditoMock);
		venda.setPagamentoAVista(false);
		
		boolean resultado = venda.checkOut();
		assertFalse(resultado);
	}
	
	@Test
	void testCheckOutVendaAVista() {
		Cliente cliente = new Cliente("123", "Rodrigo");
		ICredito iCreditoMock = mock(ICredito.class);
		when(iCreditoMock.getLimite(cliente.getCpf())).thenReturn(1000.00);
		
		verify(iCreditoMock, never()).getLimite(cliente.getCpf());
	}
	
	@Test
	void testCheckOutVendaAVistaServiceFalhar() {
		Cliente cliente = new Cliente("123", "Rodrigo");
		ICredito iCreditoMock = mock(ICredito.class);
		when(iCreditoMock.getLimite(anyString())).thenThrow(new RuntimeException());
		Venda venda = new Venda(2000.00, cliente, iCreditoMock);
		venda.setPagamentoAVista(false);
		
		assertFalse(venda.checkOut());

	}




}
