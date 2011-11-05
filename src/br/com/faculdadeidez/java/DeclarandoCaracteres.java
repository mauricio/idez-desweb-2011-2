package br.com.faculdadeidez.java;

public class DeclarandoCaracteres {

	public static void main( String[] args) {
		
		char primeiro = 'P';
		char segundo = '\uface';
		char quarto = 0x7658;
		char terceiro = 57;
		
		System.out.printf( "%s - %s - %s - %s", primeiro, segundo, terceiro, quarto );
		
	}
	
}
