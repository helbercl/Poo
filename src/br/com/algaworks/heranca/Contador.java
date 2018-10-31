package br.com.algaworks.heranca;

import java.util.Random;

public class Contador {

	public  static int CONTADOR = 0;
	// static - Não precisa instanciar para acesso porque ele é da classe não do objeto.
	// final - constante  - não muda o valor.
	/* para que uma variavel com valor comum para todos os objetos seja uma variavel de objeto e não de instância(classe)
	usamos o modificador static.
	*Metodos com modificador static - usam quando é necessário manipular dados da instância da classe. Caso modificar uma variavel em que nao se faz necessário 
	*referenciar um objeto pois os dados dessa variavels não é de propriedade de tal objeto mas que auxiliar uma outra variavel que pertença ao objeto/instância.  
	*/

	public void incrementar() {
		CONTADOR++;
	}
	
	public static void recuperarValor() {
		System.out.println("Contador está com valor :" + CONTADOR);
	}

	public static int ramdomValor() {
		Random numeroRandomico = new Random();		
		return CONTADOR= numeroRandomico.nextInt();
	}
}
