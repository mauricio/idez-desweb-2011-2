package br.edu.faculdadeidez.afundeumpolitico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class Leitor {

	public Collection<Politico> ler(File arquivo) {

		Reader reader = null;
		XMLStreamReader xmlReader = null;

		try {

			reader = new BufferedReader(new FileReader(arquivo));
			xmlReader = XMLInputFactory.newFactory().createXMLStreamReader(
					reader);

			return processarXML(xmlReader);

		} catch (XMLStreamException eXML) {
			throw new IllegalArgumentException(eXML);
		} catch (IOException eIO) {
			throw new IllegalArgumentException(eIO);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {

			if (reader != null) {
				try {
					reader.close();
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}

			if (xmlReader != null) {
				try {
					xmlReader.close();
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}

		}

	}

	protected Collection<Politico> processarXML(XMLStreamReader xmlReader)
			throws XMLStreamException {

		Set<Politico> politicos = new HashSet<Politico>();

		String nome = null;
		int coluna = -1;
		int linha = -1;

		String elementoAtual = null;

		while (xmlReader.hasNext()) {

			int event = xmlReader.next();

			switch (event) {
			case XMLStreamReader.START_ELEMENT: {
				elementoAtual = xmlReader.getLocalName();
			}
				break;
			case XMLStreamReader.END_ELEMENT: {
				elementoAtual = xmlReader.getLocalName();

				if ("politico".equals(elementoAtual)) {
					politicos.add(new Politico(nome, linha, coluna));
				}

				elementoAtual = null;

			}
				break;
			case XMLStreamReader.CHARACTERS: {

				if ("nome".equals(elementoAtual)) {
					nome = xmlReader.getText();
				}

				if ("linha".equals(elementoAtual)) {
					linha = Integer.valueOf(xmlReader.getText());
				}

				if ("coluna".equals(elementoAtual)) {
					coluna = Integer.valueOf(xmlReader.getText());
				}

			}
				break;
			}

		}

		return politicos;

	}

}
