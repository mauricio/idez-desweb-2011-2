package br.com.faculdadeidez.java.configuracao;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

public class LeitorDeConfiguracaoStAX implements LeitorDeConfiguracao {

	@Override
	public Map<String, String> carregar(File file) {

		XMLInputFactory factory = XMLInputFactory.newFactory();
		Reader r = null;

		try {
			r = new FileReader(file);
			XMLStreamReader xml = factory.createXMLStreamReader(r);

			int evento = -1;
			Map<String,String> resultado = new HashMap<String, String>();
			String tagAtual = null;
			String chaveAtual = null;

			while (xml.hasNext()) {
				evento = xml.next();

				switch (evento) {
				case XMLStreamReader.START_ELEMENT: {
					tagAtual = xml.getLocalName();
					System.out.printf( "Entrou em %s%n", tagAtual );
					
					if ( "chave".equals( tagAtual ) ) {
						chaveAtual = xml.getAttributeValue( null, "nome" );
						System.out.printf( "Chave atual é %s%n", chaveAtual );
					}
					
				}
				break;
				case XMLStreamReader.CHARACTERS : {
					
					if ( "chave".equals( tagAtual ) ) {
						resultado.put(chaveAtual, xml.getText().trim() );
					}										
					
				}
				break;
				case XMLStreamReader.END_ELEMENT: {
					
					if ( "chave".equals( tagAtual ) ) {
						chaveAtual = null;
					}
					
					tagAtual = null;
					
				}
				break;
				}

			}
			
			return resultado;
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			IOUtils.forceClose(r);
		}

	}

}
