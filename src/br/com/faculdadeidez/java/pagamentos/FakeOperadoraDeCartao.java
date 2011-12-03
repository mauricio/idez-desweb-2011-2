package br.com.faculdadeidez.java.pagamentos;

public class FakeOperadoraDeCartao implements OperadoraDeCartao {

	@Override
	public Transacao autorizar(Cartao cartao, Cliente cliente) {
		throw new UnsupportedOperationException("Não está implementado");
	}

	@Override
	public Transacao pagar(Cartao cartao, Cliente cliente) {

		Status status = Status.DADOS_INCORRETOS;
		
		if ( "4444 4444 4444 4444".equals( cartao.getNumero() ) ) {
			status = Status.SUCESSO;
		}
		
		if ( "3333 3333 3333 3333".equals( cartao.getNumero() ) ) {
			status = Status.SALDO_INSUFICIENTE;
		}
		
		return new Transacao( System.currentTimeMillis(), status );
	}

}
