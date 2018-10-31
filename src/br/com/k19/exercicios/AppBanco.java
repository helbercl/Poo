package br.com.k19.exercicios;

public class AppBanco {
	
	public static void main(String[] args) {
		System.out.println("Impressão Metodo Main : " + Funcionario.VALE_REFEICAO_DIARIO);
		
		Funcionario.imprimirValorValeRefeicaoDiario();
		
		Funcionario.alterarValorValeRefeicaoDiario(12.30);
		
		Funcionario.imprimirValorValeRefeicaoDiario();
		
	}

}
