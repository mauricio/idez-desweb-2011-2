package br.com.faculdadeidez.java.configuracao;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class LeitorDeConfiguracaoTest {
	
	private Map<String,String> config;
	
	public LeitorDeConfiguracaoTest() {
		config = new HashMap<String,String>();
		config.put( "host", "localhost" );
		config.put( "porta", "8080" );
		config.put( "usuario" , "meu_usuario" );
		config.put( "senha", "123456" );
	}
	
	@Test
	public void testConfigurador() {		
		Configurador configurador = new Configurador();
		
		File xml = new File( "configuracao.xml" );
		File properties = new File( "configuracao.properties" );
		
		Assert.assertEquals( config, configurador.carregar( xml ) );
		Assert.assertEquals( config, configurador.carregar( properties ) );		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConfiguradorComErro() {
		Configurador configurador = new Configurador();
		configurador.carregar( new File( "aula-1.pdf" ) );		
	}
	
	@Test
	public void testLerXML() {
		LeitorDeConfiguracao leitor = new LeitorDeConfiguracaoStAX();		
		File arquivo = new File("configuracao.xml");		
		Assert.assertEquals( config, leitor.carregar( arquivo ));		
	}
	
	@Test
	public void testLerProperties() {		
		LeitorDeConfiguracao leitor = new LeitorDeConfiguracaoProperties();		
		File arquivo = new File("configuracao.properties");		
		Assert.assertEquals( config, leitor.carregar( arquivo ));		
	}
	

}
