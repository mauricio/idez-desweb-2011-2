package br.com.faculdadeidez.java.pagamentos;

public interface OperadoraDeCartao {

	
	Transacao autorizar( Cartao cartao, Cliente cliente  );
	Transacao pagar( Cartao cartao, Cliente cliente );
	
}
