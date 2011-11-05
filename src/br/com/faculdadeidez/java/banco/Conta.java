package br.com.faculdadeidez.java.banco;

public class Conta {

	private double saldo;
	
	public boolean transferir( double valor, Conta destino ) {		
		
		return this.sacar(valor) && destino.depositar(valor);
		
	}
	
	public boolean depositar( double valor ) {		
		boolean resultado = false;
		
		if ( valor > 0 ) {
			this.saldo += valor;
			resultado = true;
		}
		
		return resultado;		
	}
	
	public boolean sacar( double valor ) {		
		boolean resultado = false;
		
		if ( valor > 0 && valor <= this.saldo ) {
			this.saldo -= valor;
			resultado = true;
		}
		
		return resultado;		
	}
	
	public double getSaldo() {
		return saldo;
	}
	
}