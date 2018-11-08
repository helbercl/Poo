package br.com.algaworks.heranca;

public class Pessoa {
	
	//marcar classe com o assinador final a classe não pode se tornar superclasse e
	//não pode ser instanciada
	
	private String nome;
	private int idade;
	
	public int getIdade() {
		return idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void imprimir() {
		
		System.out.println("Eu sou " + nome + " e tenho idade " + idade);
	}

}
