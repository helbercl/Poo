package br.com.algaworks.abstrato;

import java.util.Date;


public class AppProduto {

	public static void main(String[] args) {
		
		
		Produto  produto  = new ProdutoPerecivel();
		produto.setDescricao("Leite UHC");

		ProdutoPerecivel pp = (ProdutoPerecivel) produto;
		
		Date dataatual = new Date();
		
		pp.setDataValidade(dataatual);
		produto.imprimir();
	}

}
