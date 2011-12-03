package br.com.faculdadeidez.java.zoologico;

public class Animal extends Object {

	private int peso;
	private int altura;
	private String cor;

	public Animal() {
		super();
		System.out.println( "Construtor de animal" );
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println( "Finalizando o objeto" );
	}
	
	public void comer() {
		System.out.println( "Comendo alguma coisa" );
	}
	
	public Number comer( String planta ) {
		System.out.println( "Comendo " + planta );	
		return 1L;
	}	

	public void movimentar() {
		System.out.println( "Andando..." );
	}

	public void dormir() {
		System.out.println( "zzzz" );
	}
	
	public void fazerBarulho() {
		System.out.println( "Fazendo barulho" );
	}
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
