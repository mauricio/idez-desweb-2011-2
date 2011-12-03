package br.com.faculdadeidez.java.afundeumpolitico;

import java.util.HashSet;
import java.util.Set;

public class Posicao {

	private int x;
	private int y;	
	
	public Posicao(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int hashCode() {
		return String.format( "%d-%d", this.x, this.y ).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		boolean resultado = false;
		
		if ( obj instanceof Posicao ) {
			
			Posicao p = (Posicao) obj;
			resultado = this.x == p.x && this.y == p.y;
		}
		
		return resultado;
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public static void main( String[] args ) {
		
		Set<Posicao> posicoes = new HashSet<Posicao>();
		posicoes.add( new Posicao( 1, 3 ) );
		posicoes.add( new Posicao( 3, 7 ) );
		posicoes.add( new Posicao( 4, 6 ) );
		
		
		Posicao p = new Posicao( 1, 3 );
		
		System.out.println( posicoes.remove( p ) );
		
		
	}
	
}
