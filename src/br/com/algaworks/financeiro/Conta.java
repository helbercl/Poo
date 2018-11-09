/**
 * 
 */
package br.com.algaworks.financeiro;

/**
 * @author Helton
 *
 */
public class Conta {
	private String descricao;
	private Double valor;
	private String dataVencimento;
	private SituacaoConta situacaoConta;
	
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}

	public void setSituacaoConta(SituacaoConta situacaoConta) {
		this.situacaoConta = situacaoConta;
	}
	
	
	public Conta() {
	}

	public void cancelar() {
       
	}
}
