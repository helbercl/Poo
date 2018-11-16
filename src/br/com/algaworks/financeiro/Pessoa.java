package br.com.algaworks.financeiro;

public abstract class Pessoa {
  private String descricao;
  private String endereco;
  private int numero;
  private String bairro;
  
  
  public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}

public String getBairro() {
	return bairro;
}

public void setBairro(String bairro) {
	this.bairro = bairro;
}

public String getDescricao() {
	return descricao;
}
  
  public void setDescricao(String descricao) {
	this.descricao = descricao;
}
}
