package br.com.algaworks.sobreposicao;

import java.sql.Date;
import java.text.DateFormat;

public class AppSobreposicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProdutoPerecivel pp = new ProdutoPerecivel();
		pp.descricao="Arroz Tio João";
		pp.dataValidade = new java.util.Date();
		pp.identificar();
		

	}

}
