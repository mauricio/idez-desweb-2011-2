package br.com.faculdadeidez.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

public class IOUtils {

	private IOUtils() {}
	
	public static void copy( File source, File destination ) throws Exception {
		
		InputStream in = new FileInputStream( source );
		OutputStream out = new FileOutputStream( destination );
		
		int read = -1;
		
		while ( ( read = in.read() ) != -1 ) {
			out.write(read);
		}
		
		in.close();
		out.flush();
		out.close();

	}
	
	public static String read( File source ) throws Exception {		
		
		StringBuilder builder = new StringBuilder();
		
		Reader reader = new FileReader( source );
		int read = -1;
		
		while( ( read = reader.read() ) != -1 ) {
			builder.append( (char) read );
		}
		
		reader.close();
		
		return builder.toString();
	}
	
}
