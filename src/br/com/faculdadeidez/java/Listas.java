package br.com.faculdadeidez.java;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Listas {

	public static void main( String ... args ) {
		
		List<String> nomes = new LinkedList<String>();
		
		nomes.add( "José" );
		nomes.add( "Maria" );
		nomes.add( "João" );
		nomes.add( "Fátima" );		
		
		System.out.println( nomes );		
		System.out.println( nomes.get( 2 ) );		
		System.out.println( nomes.contains( "Maria" ) );
		System.out.println( nomes.contains( "Roberto" ) );
		
		nomes.remove( 3 );		
		nomes.remove( "José" );
		
		System.out.println( nomes );
		
		Collections.sort( nomes );
	
		String abc ="abc".toUpperCase();
		System.out.println( abc );
		
		System.out.println( nomes );
		
		nomes.add( "Maria" );
		
		System.out.println( nomes );
		
		System.out.println( nomes.indexOf( "Maria" ) );
		
	}
	
}
