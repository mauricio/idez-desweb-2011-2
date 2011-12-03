package br.com.faculdadeidez.java.configuracao;

import java.io.File;
import java.util.Map;

public interface LeitorDeConfiguracao {

	Map<String,String> carregar( File file );
	
}
