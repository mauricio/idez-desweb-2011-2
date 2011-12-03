package br.com.faculdadeidez.java.configuracao;

import java.io.Closeable;
import java.io.IOException;

public class IOUtils {

	private IOUtils() {}

	public static void forceClose(Closeable r) {
		if ( r != null ) {
			try {
				r.close();
			} catch ( IOException e ) {
				throw new RuntimeException(e);
			}
		}
	}
	
	
	
}
