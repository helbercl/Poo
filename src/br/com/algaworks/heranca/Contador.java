package br.com.algaworks.heranca;

public class Contador {

	public  static int CONTADOR = 0;
	// static - Não precisa instanciar para acesso porque ele é da classe não do
	// objeto.
	// final - constante

	public void incrementar() {
		CONTADOR++;
	}

}
