package br.com.exercicio.algaworks.interfaces;

public class Imovel implements Seguravel {
	private double valorMercado;
	private int areaConstruida;

	public Imovel(double valorMercado, int areaConstruida) {
		this.areaConstruida = areaConstruida;
		this.valorMercado = valorMercado;
	}

	@Override
	public double calcularValorApolice() {
		// TODO Auto-generated method stub
		double valorApolice = this.valorMercado * 0.003;
		valorApolice = valorApolice + (areaConstruida * 0.5);

		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		// TODO Auto-generated method stub
		return "Imovel com área construída de " + this.areaConstruida + " m2 e valor de mercado " + this.valorMercado;
	}

}
