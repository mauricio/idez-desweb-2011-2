package br.edu.faculdadeidez.afundeumpolitico;

public class Erros {

	public static void main(String[] args) {
		executar();
	}

	public static void executar() {
		executarInterno();
	}

	public static void executarInterno() {

		System.out.println("Vai dar erro");

		String e = null;
		
		try {

			e.toString();

			System.out.println( "Depois da linha do erro" );
			
		} catch (NullPointerException exception) {
			exception.printStackTrace();
			System.out.println("Tratei o erro");
		}

		System.out.println("Deu erro aqui");

	}

}
