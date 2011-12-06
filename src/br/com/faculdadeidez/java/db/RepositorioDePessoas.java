package br.com.faculdadeidez.java.db;

import java.util.List;

public interface RepositorioDePessoas {

	public void adicionar( Pessoa p );
	public List<Pessoa> listar();
	
}
