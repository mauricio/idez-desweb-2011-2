package br.com.faculdadeidez.java;

import java.util.Date;

public class PessoaMain {

	public static void main( String ... args ) {				
		Pessoa p = new Pessoa();
		p.setNome( "José" );
		p.setDataDeNascimento( new Date() );
		
		System.out.println( p );
				
		Date d = new Date();
		
		System.out.println( Pessoa.DATE_FORMAT.format( d ) );			
			
		Object a = "abc";
		
		Number n = (Number) a;		
				
	}	
	
}
