package br.com.algaworks.sobrecarga;

public class AppCadastro {
	
	public static void main(String[] args) {
		CadastroPessoa cadastro = new CadastroPessoa();
		Pessoa pessoa  =new Pessoa("José", 32);
		cadastro.armazenar(pessoa);
		
	    cadastro.armazenar("Helber", 25);
	    cadastro.armazenar("Marcio");
	}

}
