package br.edu.faculdadeidez.afundeumpolitico.raiz;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import junit.framework.Assert;

import org.junit.Test;

public class RaizTest {

	private Raiz raiz = new Raiz();
	
	@Test
	public void testRaizes() {	
		
		Map<Integer,Integer> numeros = new HashMap<Integer, Integer>();
				
		numeros.put( 5, 25 );
		numeros.put( 6, 36 );
		numeros.put( 7, 49 );
		numeros.put( 8, 64 );
		numeros.put( 9, 81 );
		
		for ( Entry<Integer,Integer> entry : numeros.entrySet() ) {
			Assert.assertEquals( 
					entry.getKey().intValue(), 
					this.raiz.calcular( entry.getValue() )
					);
		}
		
	}

	@Test(expected=NaoTemRaizInteiraException.class) 
	public void testRaizDe12() {
		this.raiz.calcular( 12 );
	}
	
}
