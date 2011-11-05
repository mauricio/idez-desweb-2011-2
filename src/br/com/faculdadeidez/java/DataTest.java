package br.com.faculdadeidez.java;

import org.junit.Assert;
import org.junit.Test;

public class DataTest {

	private int x;
	
	@Test
	public void testGetMes() {
		
		Data data = new Data();	
		data.setMes( 5 );
		
		Assert.assertEquals( 5, data.getMes() );
		
	}
	
}
