package br.edu.faculdadeidez.afundeumpolitico;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class Escritor {

	/*
	 * <politicos>
	 * 		<politico>
	 * 			<nome>Nome</nome>
	 * 			<linha>2</linha>
	 * 			<coluna>3</coluna>
	 * 		</politico>
	 * </politicos>
	 */
	
	public void escrever( Collection<Politico> politicos, File resultado ) 
			throws IOException, XMLStreamException {
		
		Writer writer = new BufferedWriter( new FileWriter(resultado) );
		
		XMLStreamWriter xmlWriter = 
				XMLOutputFactory.newFactory().createXMLStreamWriter( writer );
				
		xmlWriter.writeStartDocument("UTF-8", "1.0");		
		xmlWriter.writeStartElement( "politicos" );
		
		for ( Politico p : politicos ) {
			xmlWriter.writeStartElement( "politico" );
			
			{
				xmlWriter.writeStartElement( "nome" );			
				xmlWriter.writeCharacters( p.getNome() );
				xmlWriter.writeEndElement();				
			}

			{
				xmlWriter.writeStartElement( "linha" );
				xmlWriter.writeCharacters( String.valueOf( p.getLinha() ) );
				xmlWriter.writeEndElement();				
			}
 
			{
				xmlWriter.writeStartElement( "coluna" );
				xmlWriter.writeCharacters( String.valueOf( p.getColuna() ) );
				xmlWriter.writeEndElement();	
			}
			
			xmlWriter.writeEndElement();
		}
		
		xmlWriter.writeEndElement();
		
		xmlWriter.writeEndDocument();
		
		xmlWriter.close();
		
		writer.flush();
		writer.close();
		
	}
	
}
