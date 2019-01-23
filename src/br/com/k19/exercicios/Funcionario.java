package br.com.k19.exercicios;

public class Funcionario {
	
	private String nome;
	private double salario;
	static  double VALE_REFEICAO_DIARIO=15.50;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	static void alterarValorValeRefeicaoDiario (double taxa) {
		Funcionario.VALE_REFEICAO_DIARIO+=taxa;
	}
	
	static void imprimirValorValeRefeicaoDiario() {
		System.out.println(Funcionario.VALE_REFEICAO_DIARIO);
	}
	

}
