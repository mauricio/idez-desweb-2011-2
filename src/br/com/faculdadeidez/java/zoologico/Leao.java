package br.com.faculdadeidez.java.zoologico;

public class Leao extends Animal {

	private boolean chefe;
	
	public boolean isChefe() {
		return chefe;
	}
	
	public void setChefe(boolean chefe) {
		this.chefe = chefe;
	}
	
	@Override
	public void fazerBarulho() {
		System.out.println( "ROAR!" );
	}
	
}