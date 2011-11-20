package br.com.faculdadeidez.java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa implements Comparable<Pessoa> {

	public static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yy");
	private String nome;
	private Date dataDeNascimento;
	private String cpf;

	public Pessoa() {}
	
	public Pessoa( String cpf ) {
		this.cpf = cpf;
		
		if ( this.cpf == null ) {
			throw new IllegalArgumentException("Cpf não pode ser nulo");
		}
		
	}

	public Pessoa( String cpf, Date dataDeNascimento ) {
		this( cpf );
		this.dataDeNascimento = dataDeNascimento;
	}	
	
	@Override
	public int compareTo(Pessoa pessoa) {
		
		int resultado = 0;
		
		if ( this.getDataDeNascimento().getTime() 
				> pessoa.getDataDeNascimento().getTime() ) {
			resultado = -1;
		}
		
		if ( this.getDataDeNascimento().getTime() 
				< pessoa.getDataDeNascimento().getTime() ) {
			resultado = 1;
		}
		
		return resultado;
	}
	
	@Override
	public int hashCode() {
		return this.getCpf().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {

		boolean resultado = false;
		
		if ( obj instanceof Pessoa ) {			
			Pessoa p = (Pessoa) obj;			
			resultado = this.getCpf().equals( p.getCpf() );
		}
		
		return resultado;
	}
	
	@Override
	public String toString() {					
		return this.cpf + " " + DATE_FORMAT.format( this.dataDeNascimento ) ;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

}
