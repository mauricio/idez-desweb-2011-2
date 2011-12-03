package br.com.faculdadeidez.java.configuracao;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Configurador implements LeitorDeConfiguracao {

	private Map<String, LeitorDeConfiguracao> leitores = 
			new HashMap<String, LeitorDeConfiguracao>();
	
	public Configurador() {
		leitores.put( "xml", new LeitorDeConfiguracaoStAX() );
		leitores.put( "properties", new LeitorDeConfiguracaoProperties() );
	}
	
	public Map<String,String> carregar( File f ) {
		
		LeitorDeConfiguracao leitor = null;
		
		for ( Entry<String, LeitorDeConfiguracao> entry : this.leitores.entrySet() ) {
			if ( f.getPath().endsWith( entry.getKey() ) ) {
				leitor = entry.getValue();
				break;
			}
		}
		
		if ( leitor == null ) {
			throw new IllegalArgumentException("Não há leitor para o arquivo " + f);
		} else {
			return leitor.carregar(f);
		}
		
	}
	
}
