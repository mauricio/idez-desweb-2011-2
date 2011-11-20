package br.com.faculdadeidez.java;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;

public class IOUtilsTest {

	private static final String FILE_CONTENTS = "Este é um arquivo de texto.";
	private static final String FILE = "exemplo.txt";

	@Test
	public void testRead() throws Exception {		
		String content = IOUtils.read( new File( FILE ) );		
		Assert.assertEquals( FILE_CONTENTS, content );				
	}
	
    @Test
    public void testCopy() throws Exception {    	
    	File source = new File( FILE );
    	File destination = new File( "copia.txt" );
    	
    	IOUtils.copy( source, destination );
    	
    	String content = IOUtils.read(destination);
    	Assert.assertEquals( FILE_CONTENTS, content );
    }
	
}