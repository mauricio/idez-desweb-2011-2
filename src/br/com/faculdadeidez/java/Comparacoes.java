package br.com.faculdadeidez.java;

public class Comparacoes {

	public static void main( String ... args ) {
		
		System.out.println( 1 > 2 );
		System.out.println( 3 >= 2 );
		System.out.println( 10 < 11 );
		System.out.println( 50 <= 45 );
		System.out.println( 20 == 20 );
		System.out.println( 30 != 20 );
		
		String texto = "abc";
		String outroTexto = new String( "abc" );
		
		System.out.println( texto == "abc" );
		System.out.println( texto == outroTexto );
		
	}
	
}
