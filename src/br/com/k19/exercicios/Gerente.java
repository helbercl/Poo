package br.com.k19.exercicios;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class Gerente {

	private String nome;
	private double salario;

	public void aumentarSalario() {
		// aumentar salario com taxa fixa
		this.aumentarSalario(10);
	}

	public void aumentarSalario(double taxa) {
		// aumentar salario com taxa variavel
		salario += ((salario * taxa) / 100);
		System.out.println("Salario R$ " + salario + " com taxa igual a " + taxa);
	}

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

}
