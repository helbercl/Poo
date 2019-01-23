package br.com.algaworks.abstrato;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Produto {
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public abstract void imprimir();
	public abstract void cadastrar();
	public abstract void atualizar();
	public abstract String converterData(Date dataAtual);
	

}
