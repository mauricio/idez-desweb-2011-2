package br.com.faculdadeidez.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;

public class PessoaTest {

	private static final String CPF = "000.000.000-00";

	@Test
	public void testEquals() {		
		Pessoa pessoa = new Pessoa( CPF );
		Pessoa outraPessoa = new Pessoa( "111.111.111-11" );
		
		Assert.assertFalse( pessoa.equals( outraPessoa ) );		
	}
	
	@Test
	public void testEqualsComSucesso() {
		Pessoa pessoa = new Pessoa( CPF );
		Pessoa outraPessoa = new Pessoa( CPF );
		
		Assert.assertTrue( pessoa.equals( outraPessoa ) );		
	}
	
	@Test
	public void testEqualsEmColecao() {
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add( new Pessoa( CPF )  );
		pessoas.add( new Pessoa( "111.111.111-11" ) );
		pessoas.add( new Pessoa( "222.222.222-22" ) );
		pessoas.add( new Pessoa( "333.333.333-33" ) );
		
		Pessoa p = new Pessoa( "222.222.222-22" );
		
		System.out.println( pessoas.indexOf( p ) );
		
		Assert.assertEquals( 2, pessoas.indexOf( p ) );
		
		
	}
	
	@Test
	public void testEqualsComSet() {
		
		Set<Pessoa> conjunto = new HashSet<Pessoa>();
		
		for ( int x = 0; x < 50; x++ ) {
			conjunto.add( new Pessoa( String.valueOf( x ) ) );
		}
		
		Assert.assertTrue( conjunto.contains( new Pessoa( "45" ) ) );
		
		Iterator<Pessoa> iterator = conjunto.iterator();
		System.out.println( "Com iterator" );
		while ( iterator.hasNext() ) {
			Pessoa p = iterator.next();			
			//System.out.println( p.getCpf() );
		}
		
		System.out.println( "Com foreach" );
		for ( Pessoa p : conjunto ) {
			//System.out.println( p.getCpf() );
		}
		
	}
	
	@Test
	public void testTreeSetPessoas() throws Exception {		
		SortedSet<Pessoa> pessoas = new TreeSet<Pessoa>();		
		pessoas.add( 
				new Pessoa( 
						"1", 
						Pessoa.DATE_FORMAT.parse( "01/02/2012" ) ) );		
		pessoas.add( 
				new Pessoa( 
						"2", 
						Pessoa.DATE_FORMAT.parse( "01/01/2012" ) ) );		
		pessoas.add( 
				new Pessoa( 
						"3", 
						Pessoa.DATE_FORMAT.parse( "01/01/2013" ) ) );		
		pessoas.add( 
				new Pessoa( 
						"4", 
						Pessoa.DATE_FORMAT.parse( "05/12/2012" ) ) );		
		System.out.println( pessoas );
	}
	
	
}
