package br.edu.faculdadeidez.genericos;


public class Lista <T> {

	private No<T> inicio;
	private No<T> fim;
	
	public T inicio() {
		return this.inicio.getElemento();
	}
	
	public T fim() {
		return this.fim.getElemento();
	}
	
	public void add( T elemento ) {
	
		No<T> no = new No<T>();
		no.setElemento(elemento);
		
		if ( this.inicio == null ) {
			this.inicio = no;
			this.fim = no;
		} else {
			this.fim.setProximo(no);
			this.fim = no;
		}
		
		
	}
	
}