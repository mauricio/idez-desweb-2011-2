package br.edu.faculdadeidez.afundeumpolitico.raiz;

public class NaoTemRaizInteiraException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3841691436452161289L;
	
	private final int numero;
	
	public NaoTemRaizInteiraException( int numero ) {
		super( String.format( "Não há raiz inteira para %s", numero ) );
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
}
