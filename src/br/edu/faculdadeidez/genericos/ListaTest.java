package br.edu.faculdadeidez.genericos;

import org.junit.Assert;
import org.junit.Test;

public class ListaTest {

	@Test
	public void testAdicionar() {

		Lista<String> nomes = new Lista<String>();
		nomes.add("José");
		//nomes.add( 10 );

		Assert.assertEquals( "José", nomes.inicio() );
		Assert.assertEquals( "José", nomes.fim() );
		
	}

}
