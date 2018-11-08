package br.com.algaworks.financeiro;

public class ContasReceber extends Conta {
	private Cliente cliente;

	public ContasReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
		this.cliente = cliente;
	}

	public void receber() {

	}

	public void cancelar() {
		if (getValor() <= 50000) {
          setSituacaoConta(SituacaoConta.CANCELADA);
		}else {
			System.out.println("Conta não pode ser cancelada!");
		}
	}
}
