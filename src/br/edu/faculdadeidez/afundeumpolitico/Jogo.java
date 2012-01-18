package br.edu.faculdadeidez.afundeumpolitico;

import java.util.HashSet;
import java.util.Set;

public class Jogo {

	private Set<Politico> politicos = new HashSet<Politico>();
	
	public Jogo() {	
		this.politicos.add( new Politico( "Ronaldo Cunha Lima", 1, 3 ));
		this.politicos.add( new Politico( "Ricardo Coutinho", 2, 7 ) );
		this.politicos.add( new Politico( "ZŽ Maranh‹o", 3, 5 ) );
		this.politicos.add( new Politico( "C’cero Lucena", 7, 4 ) );
	}
	
	public boolean atirar( int linha, int coluna ) {		
		Politico p = new Politico( linha, coluna );
		
		return this.politicos.remove(p);
	}
	
	public boolean acabou() {		
		return this.politicos.isEmpty();		
	}
	
}
