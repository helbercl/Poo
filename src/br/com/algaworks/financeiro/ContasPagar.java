package br.com.algaworks.financeiro;

public class ContasPagar extends Conta {
	private Fornecedor  fornecedor;
	public ContasPagar(Fornecedor fornecedor,String descricao,Double valor,String dataVencimento) {
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
		setFornecedor(fornecedor);
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public ContasPagar() {
		// TODO Auto-generated constructor stub
	}
	
	public void pagar() {}
	
	public void imprimir() {
		 System.out.println("Contas a pagar com descrição :" + getDescricao() + " valor R$ " + getValor() + 
				 " para o fornecedor " + fornecedor.getDescricao() + " com data de vencimento " + getDataVencimento());
		}
}
