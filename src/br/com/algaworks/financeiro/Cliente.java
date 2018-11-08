package br.com.algaworks.financeiro;

public class Cliente extends Pessoa {
	public void imprimir() {
		 System.out.println("Cliente com Razão Social :" + getDescricao());
		}
}
