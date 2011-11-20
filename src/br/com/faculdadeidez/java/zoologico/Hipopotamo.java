package br.com.faculdadeidez.java.zoologico;

public class Hipopotamo extends Animal {

	@Override
	public void comer() {		
		System.out.println( "comendo folhas!" );
	}
	
	@Override
	public Integer comer( String planta ) {		
		return 2;
	}
	
}