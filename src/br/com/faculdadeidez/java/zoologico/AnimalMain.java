package br.com.faculdadeidez.java.zoologico;

public class AnimalMain {

	public static void main( String ... args ) {		
		
		Hipopotamo h = new Hipopotamo();
		h.comer();
		h.movimentar();		
		
		Number comeu = h.comer( "abacate" );
		
		Animal a = h;		
		a.comer();
		
		Number outroComeu = a.comer( "ração" );
		
		Object str = "string";
		
		System.out.println( str );
		
	}
	
}
