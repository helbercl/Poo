package br.com.algaworks.sobreposicao;

import java.util.Date;

public class ProdutoPerecivel extends Produto {

	protected Date dataValidade;

	@Override
	public void identificar() {
		
		super.identificar();
		//sobreposicao - considera o metodo da classe em questão mesmo com o mesmo assinador da superclasse Produto.
		System.out.println("Minha Data de Validade é " + dataValidade);
	}
}
