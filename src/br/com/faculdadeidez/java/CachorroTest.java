package br.com.faculdadeidez.java;

public class CachorroTest {

	public static void main( String[] args ) {
		
		Cachorro c = new Cachorro();
		c.nome = "Ralf";
		
		c.latir();
		
		System.out.println( c.nome );
		
	}
	
}
