package br.com.faculdadeidez.java.pagamentos;

public class ServicoDePagamento {

	private OperadoraDeCartao operadora;
	
	public ServicoDePagamento( OperadoraDeCartao operadora ) {
		this.operadora = operadora;
	}
	
	public boolean pagar( Cartao cartao, Cliente cliente ) {
		
		Transacao t = this.operadora.pagar(cartao, cliente);
		
		boolean resultado = false;
		
		switch( t.getStatus() ) {
		case SUCESSO:
			resultado = true;
		case DADOS_INCORRETOS:
			System.out.println( "Dados incorretos" );
			break;
		case SALDO_INSUFICIENTE:
			System.out.println( "Não há saldo suficiente" );
			break;
		}		
		
		return resultado;
	}
	
}
