package br.com.algaworks.heranca;

public  class Pessoa {
	
	/*marcar classe com o assinador final a classe n�o pode se tornar superclasse e
	n�o pode ser instanciada
	modificador protected - a classe ta disponivel para as classes do mesmo pacote ou que herdem de tal classe
	*/
	
	protected String nome;
	protected int idade;
	
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
