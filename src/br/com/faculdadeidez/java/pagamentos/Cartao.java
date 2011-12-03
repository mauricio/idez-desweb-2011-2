package br.com.faculdadeidez.java.pagamentos;

import java.util.Date;

public class Cartao {

	private String numero;
	private Date validade;
	private int codigoDeSeguranca;
	private String nome;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public int getCodigoDeSeguranca() {
		return codigoDeSeguranca;
	}

	public void setCodigoDeSeguranca(int codigoDeSeguranca) {
		this.codigoDeSeguranca = codigoDeSeguranca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
