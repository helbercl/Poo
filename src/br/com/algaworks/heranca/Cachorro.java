package br.com.algaworks.heranca;

public class Cachorro {

	public String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void sentar() {
		System.out.println("Eu, " + nome + ", vou sentar!");
	}
	
}
