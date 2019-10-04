package br.com.k19.exercicios;


public class AppConta {

	public static void main(String[] args) {
		System.out.println("Contador Static/Classe :" + Conta.contador);
		
		Conta conta1 = new Conta();
		System.out.println("Contador Inst�ncia/Objeto :" + Conta.contador);
		System.out.println("Numero Conta Inst�ncia/Objeto :" + conta1.numeroConta);
		Conta conta2 = new Conta();
		System.out.println("Contador Inst�ncia/Objeto :" + Conta.contador);
		System.out.println("Numero Conta Inst�ncia/Objeto :" + conta2.numeroConta);
		
		System.out.println("Contador Static/Classe - Ap�s Inst�ncia :" + Conta.contador);
		
		Conta.zerarContador();
		System.out.println("Contador Static/Classe - Ap�s Inst�ncia :" + Conta.contador);


	}

}
