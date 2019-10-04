package br.com.k19.exercicios;

public class AppGerente {

	public static void main(String[] args) {
		

		Gerente gerente = new Gerente();
		gerente.setNome("Helber Cardoso Lemos");

		gerente.setSalario(2500);
		System.out.println("Aumentando a taxa default de 10%.");
		gerente.aumentarSalario();
		System.out.println("Aumentando a taxa variavel.");

		gerente.aumentarSalario(25);

	}

}
