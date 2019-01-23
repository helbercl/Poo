package br.com.algaworks.interfacejava;

import br.com.algaworks.financeiro.Cliente;

//é possivel extender mais de uma interface diferente da classe
//que é somente uma
public class Compra implements Autorizavel, Imprimivel {

	private double valorTotal;
	private Produto produto;
	private Cliente cliente;

	// sobscrever
	@Override
	public double getValorTotal() {
		return this.valorTotal;
	}

	@Override
	public String getCabecalho() {
		// TODO Auto-generated method stub
		return this.getProduto().getDescricao() + " = " + this.getValorTotal();
	}

	@Override
	public String getCorpoPagina() {
		// TODO Auto-generated method stub
		return this.getCliente().getDescricao();
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
