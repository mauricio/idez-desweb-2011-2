package br.edu.faculdadeidez.afundeumpolitico;

import java.io.File;
import java.util.Collection;
import java.util.Scanner;

public class LeitorMain {

	public static void main(String[] args) throws Exception {

		Leitor leitor = new Leitor();

		Scanner s = new Scanner(System.in);

		boolean continuar = true;

		while (continuar) {

			System.out.println("Digite a opção:");
			System.out.println("1 - ler arquivo");
			System.out.println("2 - Sair");

			int opcao = s.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do arquivo");
				s.nextLine();
				String nome = s.nextLine();

				try {
					Collection<Politico> politicos = leitor.ler(new File(nome));

					System.out.println(politicos);
				} catch (Exception e) {
					System.out.printf( 
							"Não foi possível ler o arquivo: %s%n", 
							e.getMessage() );
				}

				break;
			case 2:
				continuar = false;
				break;
			default:
				System.out.println("OPção desconhecida");
			}

		}

	}

}
