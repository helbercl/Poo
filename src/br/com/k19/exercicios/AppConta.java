package br.com.k19.exercicios;


public class AppConta {

	public static void main(String[] args) {
		System.out.println("Contador Static/Classe :" + Conta.contador);
		
		Conta conta1 = new Conta();
		System.out.println("Contador Instância/Objeto :" + conta1.contador);
		System.out.println("Numero Conta Instância/Objeto :" + conta1.numeroConta);
		Conta conta2 = new Conta();
		System.out.println("Contador Instância/Objeto :" + conta2.contador);
		System.out.println("Numero Conta Instância/Objeto :" + conta2.numeroConta);
		
		System.out.println("Contador Static/Classe - Após instâncias :" + Conta.contador);
		
		Conta.zerarContador();
		System.out.println("Contador Static/Classe - Após instâncias :" + Conta.contador);


	}

}
