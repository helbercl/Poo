package br.com.exercicio.algaworks.interfaces;

public class Carro implements Seguravel {
    private double valorMercado;
    private int anoFabricacao;
    
    public Carro(double valorMercado,int anoFabricacao) {
		this.valorMercado=valorMercado;
		this.anoFabricacao=anoFabricacao;
	}
	@Override
	public double calcularValorApolice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String obterDescricao() {
		// TODO Auto-generated method stub
		return "Carro ano " + this.anoFabricacao +
				" com valor de mercado " + this.valorMercado;
	}

}
