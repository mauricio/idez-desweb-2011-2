package br.com.faculdadeidez.java.zoologico;

public class Leao extends Felino {	
	
	private boolean chefe;	
	
	public Leao(int peso) {
		super(peso);
		System.out.println( "Construtor de leao" );
	}

	public Leao( int peso, boolean chefe ) {
		this( peso );
		this.chefe = chefe;
	}
	
	public Leao( int peso, int altura ) {
		this( peso );
		this.setAltura(altura);
		
		if ( this.getAltura() > 2 ) {
			throw new IllegalArgumentException("Altura não pode ser maior que 2");
		}
		
	}

	public Leao( int peso, int altura, String cor ) {
		this( peso, altura );
		this.setCor( cor );
	}	
	
	public boolean isChefe() {
		return chefe;
	}
	
	public void setChefe(boolean chefe) {
		this.chefe = chefe;
	}
	
	@Override
	public void fazerBarulho() {
		System.out.println( "ROAR!" );
	}
	
}