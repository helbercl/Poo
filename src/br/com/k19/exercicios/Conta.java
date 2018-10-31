/**
 * 
 */
package br.com.k19.exercicios;

/**
 * @author helber
 *
 */
public class Conta {
	
	static int contador=0;
	int numeroConta;
	
	public Conta() {
	  Conta.contador++;
	  this.numeroConta=Conta.contador;
	}
	
	
	static void zerarContador() {
		System.out.println("Valor Atual Contador de Classe : " + Conta.contador);
		System.out.println("Zerando o contador de contas ...");
		Conta.contador=0;
		
	}

}
