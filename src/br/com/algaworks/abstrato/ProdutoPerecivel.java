package br.com.algaworks.abstrato;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoPerecivel extends Produto {
    private Date dataValidade;
    
    public void setDataValidade(Date dataValidade) {
    	this.dataValidade=dataValidade;
    }
    public Date getDataValidade() {
    	return dataValidade;
    }
	@Override
	public void imprimir() {
        
		System.out.println("Produto " + getDescricao() + " com validade " + converterData(dataValidade));
		
	}

	@Override
	public void cadastrar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String converterData(Date dataAtual) {
		// TODO converte data produtos pereciveis
		
		SimpleDateFormat dataAtualFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return dataAtualFormatada.format(dataAtual);
	}


}
