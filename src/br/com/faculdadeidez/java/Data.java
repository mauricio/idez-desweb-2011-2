package br.com.faculdadeidez.java;

import java.util.Calendar;

public class Data {

	private Calendar data = Calendar.getInstance();
	
	public void setDia( int dia ) {
		this.data.set( Calendar.DAY_OF_MONTH , dia);
	}
	
	public void setMes( int mes ) {
		this.data.set( Calendar.MONTH, mes - 1  );
	}
	
	public void setAno( int ano ) {
		this.data.set( Calendar.YEAR, ano );
	}
	
	public int getDia() {
		return this.data.get( Calendar.DAY_OF_MONTH );
	}
	
	public int getMes() {
		return this.data.get( Calendar.MONTH ) + 1;
	}
	
	public int getAno() {
		return this.data.get( Calendar.YEAR );
	}
	
}
