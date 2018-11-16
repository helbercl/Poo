package br.com.exercicio.algaworks.interfaces;

public class AppSeguro {

	public static void main(String[] args) {
		CorretoraSeguro corretora = new CorretoraSeguro();
		Carro meuCarro = new Carro(45000d, 2012);
		Imovel minhaCasa = new Imovel(920000, 320);
		corretora.fazerPropostaSeguro(meuCarro);
		corretora.fazerPropostaSeguro(minhaCasa);

	}

}
