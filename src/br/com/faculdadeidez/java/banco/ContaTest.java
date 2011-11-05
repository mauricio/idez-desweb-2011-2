package br.com.faculdadeidez.java.banco;

import org.junit.Assert;
import org.junit.Test;

public class ContaTest {

	@Test
	public void testDepositarComSucesso() {		
		Conta c = new Conta();
		c.depositar( 200 );
		
		Assert.assertEquals( 200 , c.getSaldo(), 0);		
	}

	@Test
	public void testDepositarValorNegativo() {		
		Conta c = new Conta();
		c.depositar( -200 );
		
		Assert.assertEquals( 0 , c.getSaldo(), 0);		
	}	

	@Test
	public void testSacarValor() {		
		Conta c = new Conta();
		c.depositar( 400 );
		
		c.sacar( 100 );
		
		Assert.assertEquals( 300 , c.getSaldo(), 0);
	}

	@Test
	public void testSacarValorMaiorQueSaldo() {		
		Conta c = new Conta();
		c.depositar( 200 );
		
		c.sacar( 300 );
		
		Assert.assertEquals( 200 , c.getSaldo(), 0);
	}	

	@Test
	public void testSacarValorNegativo() {		
		Conta c = new Conta();
		c.depositar( 200 );
		
		c.sacar( -100 );
		
		Assert.assertEquals( 200 , c.getSaldo(), 0);
	}		
	
}
