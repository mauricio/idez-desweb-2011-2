package br.com.faculdadeidez.java;
import java.math.BigDecimal;


public class DeclarandoFloats {

	public static void main( String[] args ) {
		float preco = 3.34F;
		double medida = 12342.45566;
		
		System.out.println( 1.01 + 1.17 );
		
		BigDecimal primeiro = new BigDecimal( "1.01" );
		BigDecimal segundo = new BigDecimal( "1.17" );
		
		System.out.println( primeiro.add( segundo ) );
	}
	
}
