package br.edu.faculdadeidez.afundeumpolitico;

import java.util.HashSet;
import java.util.Set;

public class HashCodes {

	public static void main(String[] args) {
		
		String s = "José";
		String s2 = "Maria";
		String s3 = "Antonio";
		
		System.out.println( s.hashCode() );
		System.out.println( s2.hashCode() );
		System.out.println( s3.hashCode() );
		
		Set<String> nomes = new HashSet<String>();
		nomes.add( s );
		nomes.add( s2 );
		nomes.add( s3 );
		
		System.out.println( nomes.contains( "José" ) );
		
	}
	
}











