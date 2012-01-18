package br.edu.faculdadeidez.afundeumpolitico;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class EscritorMain {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Escrevendo");
		
		Set<Politico> politicos = new HashSet<Politico>();
		
		politicos.add( new Politico( "Ronaldo Cunha Lima", 1, 3 ));
		politicos.add( new Politico( "Ricardo Coutinho", 2, 7 ) );
		politicos.add( new Politico( "Zé Maranhão", 3, 5 ) );
		politicos.add( new Politico( "Cícero Lucena", 7, 4 ) );		
		
		Escritor escritor = new Escritor();
		
		escritor.escrever( politicos , new File( "politicos.xml" ));
	}
	
}
