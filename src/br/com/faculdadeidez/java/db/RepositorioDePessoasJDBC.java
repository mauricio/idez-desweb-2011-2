package br.com.faculdadeidez.java.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.faculdadeidez.java.configuracao.IOUtils;

public class RepositorioDePessoasJDBC implements RepositorioDePessoas {

	static {
		try {
			Class.forName("org.h2.Driver");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:h2:pessoas_idez");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void adicionar(Pessoa p) {

		Connection c = this.getConnection();
		
		try {
			
			PreparedStatement s = c.prepareStatement(
				"INSERT INTO pessoas ( nome, email, endereco ) VALUES ( ?, ?, ? )"); 
			s.setString( 1, p.getNome() );
			s.setString(2, p.getEmail());
			s.setString( 3 , p.getEndereco());
			
			s.executeUpdate();
			
		} catch ( SQLException e ) {
			throw new RuntimeException(e);
		} finally {
			IOUtils.forceClose(c);
		}
		
	}

	@Override
	public List<Pessoa> listar() {

		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		Connection c  = this.getConnection();
		
		try {
			
			PreparedStatement s = c.prepareStatement( "SELECT * FROM pessoas" );
			
			ResultSet resultSet = s.executeQuery();
			
			while ( resultSet.next() ) {
				Pessoa p = new Pessoa();
				p.setId( resultSet.getLong( "id" ) );
				p.setNome( resultSet.getString("nome") );
				p.setEmail(resultSet.getString("email") );
				p.setEndereco( resultSet.getString("endereco") );
				
				pessoas.add(p);
			}
			
		} catch ( SQLException e ) {
			throw new RuntimeException(e);
		} finally {
			IOUtils.forceClose( c );
		}
		
		return pessoas;
	}

}
