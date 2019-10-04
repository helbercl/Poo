package br.com.algaworks.financeiro;

public class AppContas {

	public static void main(String[] args) {
		
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setDescricao("Casa & Cia Neg�cios Imobili�rios");
		imobiliaria.imprimir();
		Fornecedor mercado = new Fornecedor();
		mercado.setDescricao("Mercado do Jo�o");
		mercado.imprimir();
		Cliente atacadista = new Cliente();
		atacadista.setDescricao("Tri�ngulo Quadrado Atacadista");
		atacadista.imprimir();
		atacadista.setDescricao("teste");
		atacadista.imprimir();
		Cliente telecom = new Cliente();
		telecom.setDescricao("FoneNet Telecomunica��es");
		telecom.imprimir();

		// instanciando contas a pagar

		ContasPagar contasPagar = new ContasPagar();
		contasPagar.setDescricao("Aluguel da matriz");
		contasPagar.setValor(1230d);
		contasPagar.setDataVencimento("10/05/2012");
		contasPagar.setFornecedor(imobiliaria);
		contasPagar.imprimir();
		ContasPagar contaPagar2 = new ContasPagar(mercado, "Compras do m�s", 390d, "19/05/2012");
		contaPagar2.imprimir();
	}

}
