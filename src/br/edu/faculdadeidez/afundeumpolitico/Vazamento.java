package br.edu.faculdadeidez.afundeumpolitico;

import java.util.List;
import java.util.ArrayList;

public class Vazamento {

	public static final List<int[]> numeros = new ArrayList<int[]>();

	public static void main(String[] args) {

		for (int x = 0; x < Integer.MAX_VALUE; x++) {
			try {
				System.out.printf("Alocou em %s%n", x * 10000);
				numeros.add(new int[10000]);
			} catch (Error t) {
				t.printStackTrace();
			}
		}

	}

}
