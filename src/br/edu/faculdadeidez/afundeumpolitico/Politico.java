package br.edu.faculdadeidez.afundeumpolitico;

public class Politico {

	private String nome;
	private int linha;
	private int coluna;
		
	public Politico(String nome, int linha, int coluna) {
		this( linha, coluna );
		this.nome = nome;
	}	
	
	public Politico(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}

	@Override
	public String toString() {
		return String.format( "<%s> - %sx%s", this.nome, this.linha, this.coluna );
	}
	
	public int getLinha() {
		return linha;
	}
	
	public int getColuna() {
		return coluna;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public int hashCode() {
		return String.format( "%dx%d", this.linha, this.coluna ).hashCode();
	}
	
	@Override
	public boolean equals(Object other) {

		boolean resultado = false;
		
		if ( other instanceof Politico ) {
			Politico p = (Politico) other;
			resultado = this.linha == p.linha 
					&& this.coluna == p.coluna;
		}
		
		return resultado;
	}
	
}
