package br.com.algaworks.exercicios;

public class AppMaquinaCafe {

	public static void main(String[] args) {
		
		
		MaquinaCafe cafeteira = new MaquinaCafe();
		
		cafeteira.setAcucarDisponivel(100.00);
		cafeteira.fazerCafe();
		cafeteira.fazerCafe(90.00);
		cafeteira.fazerCafe();

	}

}
