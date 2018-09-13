package br.com.folhapagamento;

import java.util.Scanner;

public class AppFolhaPagamento {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Salario salario = new Salario();
		System.out.print("Informe as horas extras: ");
		salario.horasExtras=entrada.nextInt();
		System.out.print("Informe as horas normais: ");
		salario.horasNormais=entrada.nextInt();
		System.out.print("Informe Valor hora Extra: ");
		salario.valorHora=entrada.nextDouble();
		System.out.print("Informe Valor hora Normal: ");
		salario.valorHoraExtra=entrada.nextDouble();
		
		FolhaPagamento folha = new FolhaPagamento();		
		folha.calcularSalario(salario);
		folha.imprimirHolerite();

	}

}
