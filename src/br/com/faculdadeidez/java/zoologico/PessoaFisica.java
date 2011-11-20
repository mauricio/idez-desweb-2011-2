package br.com.faculdadeidez.java.zoologico;

public class PessoaFisica extends Cliente {

	private String cpf;
		
	public PessoaFisica( String cpf ) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	@Override
	public String getIndentificador() {
		return this.getCpf();
	}
	
}
