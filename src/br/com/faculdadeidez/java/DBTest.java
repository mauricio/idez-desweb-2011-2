package br.com.faculdadeidez.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.h2.Driver;
import org.junit.Test;

public class DBTest {
/*
	"create table pessoas (
        id bigint generated by default as identity,
        primary key (id),
        nome VARCHAR(255),
        email VARCHAR(255),
        endereco VARCHAR(255)
    )"
*/	
	@Test
	public void testCreateTable() throws Exception {
		
		Driver.load();
		
		Connection c = DriverManager.getConnection( "jdbc:h2:pessoas_idez" );
		Statement s =c.createStatement();
		s.execute( "create table pessoas ( id bigint generated by default as identity, primary key (id), nome VARCHAR(255), email VARCHAR(255), endereco VARCHAR(255))" );
		c.commit();
		c.close();
		
	}
	
}
