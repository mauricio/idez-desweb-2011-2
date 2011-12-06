package br.com.faculdadeidez.java.configuracao;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class IOUtils {

	private IOUtils() {
	}

	public static void forceClose(Closeable r) {
		if (r != null) {
			try {
				r.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}

	public static void forceClose(Connection c) {
		if (c != null) {
			try {
				c.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}

}
