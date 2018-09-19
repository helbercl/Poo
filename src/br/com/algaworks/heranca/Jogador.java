package br.com.algaworks.heranca;

public class Jogador extends Pessoa {
	
	protected boolean aindaJoga;
	
	public void seAindaJoga() {
		aindaJoga=true;
		
		if (getIdade()>35) {
			 aindaJoga=false;
		}
		
		System.out.println("Ainda joga? " + aindaJoga);
	}

}
