package br.edu.faculdadeidez.afundeumpolitico.raiz;

public class Intervalo {

	private int inicio;
	private int fim;

	public Intervalo(int inicio, int fim) {
		this.inicio = inicio;
		this.fim = fim;
	}
	
	@Override
	public String toString() {
		return String.format( "(%d..%d)", this.inicio, this.fim );
	}

	public int getInicio() {
		return inicio;
	}

	public int getFim() {
		return fim;
	}

	public int tamanho() {
		return this.fim - this.inicio;
	}

	public int inicioAoQuadrado() {
		return this.inicio * this.inicio;
	}

	public int fimAoQuadrado() {
		return this.fim * this.fim;
	}

	public boolean estaEntreQuadrados(int valor) {
		return this.inicioAoQuadrado() <= valor
				&& this.fimAoQuadrado() >= valor;
	}

}
