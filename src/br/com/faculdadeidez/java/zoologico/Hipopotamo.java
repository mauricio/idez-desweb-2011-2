package br.com.faculdadeidez.java.zoologico;

public class Hipopotamo extends Animal {

	@Override
	public void comer() {		
		super.comer();
		System.out.println( "comendo folhas!" );
	}
	
	@Override
	public Integer comer( String planta ) {
		
		this.comer();
		
		return 2;
	}
	
}