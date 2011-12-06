package br.com.faculdadeidez.java.db;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class RepositorioDePessoasTest {

	@Test
	public void testAdicionar() {
		
		Pessoa p = new Pessoa();
		p.setNome( "José " + System.currentTimeMillis() );
		p.setEmail( "jose@gmail.com" );
		p.setEndereco( "Meu endereço" );
		
		RepositorioDePessoas repo = new RepositorioDePessoasJDBC();
		
		repo.adicionar(p);
		
		List<Pessoa> pessoas = repo.listar();
		
		Pessoa ultima = pessoas.get( pessoas.size() - 1 );
		
		Assert.assertEquals( p.getNome(), ultima.getNome() );
		
	}
	
}
