package br.com.faculdadeidez.java;
public class Cervejas {

	public static void main(String[] args) {

		int cervejas = 99;

		while (cervejas != 0) {

			if (cervejas == 1) {
				System.out.println(cervejas + " cerveja na freezer");
			} else {
				System.out.println(cervejas + " cervejas na freezer");
			}

			System.out.println("Pego uma garrafa, passo pra frente");
			cervejas--;

			switch (cervejas) {
			case 1:
				System.out.printf("Agora há %d cerveja na freezer%n", cervejas);
				break;
			case 0:
				System.out.println("Nõa há mais cervejas no freezer :( ");
				break;
			default:
				System.out.printf("Agora são %d cervejas na freezer%n",
						cervejas);
			}

			System.out.println();
			// System.out.println( "Agora são " + cervejas +
			// " cervejas na freezer" );
		}

	}

}
