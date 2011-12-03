package br.com.faculdadeidez.java.configuracao;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;

public class LeitorDeConfiguracaoProperties implements LeitorDeConfiguracao {

	@Override
	public Map<String, String> carregar(File file) {
		
		Properties properties = new Properties();
		
		Reader r = null;
		try {
			r = new FileReader( file );
			
			properties.load(r);
			
			Map<String,String> resultado = new HashMap<String, String>();
			
			for ( Entry<Object, Object> entry : properties.entrySet() ) {
				resultado.put( 
						entry.getKey().toString(), 
						entry.getValue().toString() );
			}
			
			return resultado;
			
		} catch ( IOException e ) {
			throw new RuntimeException(e);
		} finally {
			IOUtils.forceClose(r);
		}
		
	}
	
}
