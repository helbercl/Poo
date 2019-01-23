package br.com.algaworks.interfacejava;

import br.com.algaworks.financeiro.Cliente;

public class AppInterface {

	public static void main(String[] args) {

		Operadora operadora = new Cielo();
		Impressora impressora = new ImpressoraEpson();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("HELBER CARDOSO LEMOS");
		cartao.setNumeroCartao("1234");

		Cliente cliente = new Cliente();
		cliente.setDescricao("HELBER CARDOSO LEMOS");
		
		Produto produto = new Produto();
		produto.setCodigo(1);
		produto.setDescricao("Sabonete");
		
		Compra compra = new Compra();
		compra.setCliente(cliente);
		compra.setProduto(produto);
		compra.setValorTotal(20);
		
		       
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
	}

}
