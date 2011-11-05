package br.com.faculdadeidez.java.livraria;

import br.com.faculdadeidez.java.Livro;

public class Livraria extends Livro {

	public static void main( String[] args ) {
		
		Livro a = new Livro();
		Livro b = new Livro();
		
		a.setNome("1984");
		b.setNome("O código Da Vinci");
		
		b = a;
		
		Livro c = b;
		c.setNome("A Torre Negra");
		
		System.out.println( a.getNome() );
		System.out.println( b.getNome() );
		System.out.println( c.getNome() );
		
	}
	
}
