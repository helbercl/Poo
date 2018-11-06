package br.com.algaworks.enums;

public enum Naipes {
	
	//Serve para declarar valores absolutos (constantes) - Não modificam muito

	OURO("Vermelho"),
	PAUS("Amarelo"),
	ESPADA("Preto"),
	COPAS("Vermelho");
	
	 Naipes(String cor) {
		// TODO Auto-generated constructor stub
		 this.cor=cor;
		 
	}
	 
	 private String cor;
	 
	 public String getCor() {
		return cor;
	}
}
