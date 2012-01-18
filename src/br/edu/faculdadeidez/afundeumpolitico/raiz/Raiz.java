package br.edu.faculdadeidez.afundeumpolitico.raiz;

public class Raiz {

	public int calcular(int valor) throws NaoTemRaizInteiraException {

		switch (valor) {
		case 0:
		case 1:
			return valor;
		case 2:
		case 3:
			throw new NaoTemRaizInteiraException(valor);
		case 4:
			return 2;
		default:
			return sqrt(valor, new Intervalo(5, valor / 2));
		}
	}

	private int sqrt(int valor, Intervalo intervalo) {
		
		if (intervalo.inicioAoQuadrado() == valor) {
			return intervalo.getInicio();
		}

		if (intervalo.fimAoQuadrado() == valor) {
			return intervalo.getFim();
		}

		if (intervalo.tamanho() <= 1) {
			throw new NaoTemRaizInteiraException(valor);
		}

		int meio = ((intervalo.getFim() - intervalo.getInicio()) / 2)
				+ intervalo.getInicio();

		Intervalo esquerda = new Intervalo(intervalo.getInicio(), meio);
		Intervalo direita = new Intervalo(meio + 1, intervalo.getFim());

		if (direita.estaEntreQuadrados(valor)) {
			return sqrt(valor, direita);
		} else {
			if (esquerda.estaEntreQuadrados(valor)) {
				return sqrt(valor, esquerda);
			}
		}

		throw new NaoTemRaizInteiraException(valor);

	}

}
