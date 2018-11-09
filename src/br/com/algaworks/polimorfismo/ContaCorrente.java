package br.com.algaworks.polimorfismo;

import br.com.algaworks.polimorfismo.Conta ;

public class ContaCorrente extends Conta {
	
	private Double limite=1000.0;
	
	public double getLimite() {
		return limite;
	}
	

}
