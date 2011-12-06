package br.com.faculdadeidez.java.pagamentos;

import org.junit.Assert;
import org.junit.Test;

public class ServicoDePagamentoTest {

	@Test
	public void testPagarComSucesso() {		
		OperadoraDeCartao operadora = new FakeOperadoraDeCartao();		
		ServicoDePagamento servico = new ServicoDePagamento(operadora);
		
		Cartao cartao = new Cartao();
		cartao.setNumero("4444 4444 4444 4444");
		
		Cliente cliente = new Cliente();
		
		Assert.assertTrue( servico.pagar(cartao, cliente) );
		
	}
	
}
