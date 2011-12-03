package br.com.faculdadeidez.java.zoologico;

import java.util.Date;

public abstract class Cliente {

	private String nome;

	private String email;

	private Date clienteDesde;

	
	
	@Override
	public int hashCode() {
		return this.getIndentificador().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {

		boolean resultado = false;
		
		if ( obj instanceof Cliente ) {
			Cliente cliente = (Cliente) obj;
			resultado = this.getIndentificador().equals(cliente.getIndentificador());
		}
		
		return resultado;
		
	}

	public abstract String getIndentificador();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getClienteDesde() {
		return clienteDesde;
	}

	public void setClienteDesde(Date clienteDesde) {
		this.clienteDesde = clienteDesde;
	}

	
	
	
}
