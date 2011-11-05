package br.com.faculdadeidez.java;
import java.util.Scanner;

public class ExemploDeScanner {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		boolean continuar = true;

		while (continuar) {

			System.out.println("Digite um número:");
			int numero = s.nextInt();

			System.out.println( "Escolha uma operação:" );
			System.out.println( "0 - Sair" );
			System.out.println( "1 - Raiz quadrada" );
			System.out.println( "2 - Elevar a potência de 2" );
			
			int opcao = s.nextInt();
			switch( opcao ) {
			case 0: 
				continuar = false;
				break;
			case 1:
				System.out.printf( 
						"A raiz quadrada de %d é %.2f %n", numero, Math.sqrt( numero ) );
				break;
			case 2:
				System.out.printf( 
						"O número %d ao quadrado é %d%n", numero, numero * numero );
			}
			
		}

	}

}
