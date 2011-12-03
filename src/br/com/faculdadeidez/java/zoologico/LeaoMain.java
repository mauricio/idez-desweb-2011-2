package br.com.faculdadeidez.java.zoologico;

public class LeaoMain {

	public static void main( String ... args ) {
		
		Leao leao = new Leao( 10 );
		leao.setChefe( true );
		
		System.out.println( leao.isChefe() );
		
		Animal a = leao;
		
		Leao l = ( Leao ) a;
		System.out.println( l.isChefe() );
		
	}
	
}
