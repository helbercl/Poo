package br.com.algaworks.sobrecarga;

public class CadastroPessoa {

	public void cadastrar(String nome,int idade) {
		// Salvar no banco de dados
		imprimir(nome,idade);
		//System.out.println("Salvando : \"" + nome + "\" com " + idade + " anos.");
		
	}
	
	public void armazenar(Pessoa pessoa) {
		cadastrar(pessoa.getNome(), pessoa.getIdade());
	}
	
	public void armazenar(String nome,int idade) {
		cadastrar(nome, idade);
		
	}
	
	public void armazenar(String nome) {
		cadastrar(nome, 0);
		
	}
	
	public void imprimir (String nome,int idade) {
		System.out.println(" A pessoa cadastrada é :" + nome + " com idade " + idade + " ..Salvando.....");
	}

	
	public void atualizar() {
		// TODO Auto-generated method stub
		
	}

	
	public void deletar() {
		// TODO Auto-generated method stub
		
	}
	
	

}
