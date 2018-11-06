package br.com.algaworks.heranca;

public class Tecnico extends Pessoa {
	
	public void ensinarTreinar(Jogador jogador) {
		System.out.println("O tecnico " + getNome() + " treina o jogador " + jogador.getNome());
	}

}
