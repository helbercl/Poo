package br.com.algaworks.polimorfismo;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

public class AppConta {

	public static void main(String[] args) {
		// Polimorfismo depende da herança (extends)
		Conta conta = new Conta();
		conta.setSaldo(4000);
		imprimirSaldo(conta);
		System.out.println("==============================");
		// ---------------------------------------------
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setSaldo(3500);
		// ---------------------------------------------
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setSaldo(2000.0);
		// ---------------------------------------------
		/*
		 * De acordo com o conceito de herança conta corrente e conta poupança são
		 * contas. Com isso é possivel passar como parâmetro um objeto tipo conta
		 * corrente ou poupança para um metodo que espera um objeto Conta.
		 */
		imprimirSaldo(contaCorrente);
		System.out.println("==============================");
		imprimirSaldo(contaPoupanca);
		System.out.println("==============================");

		// conta corrente é uma conta? <----Sim
		Conta cc = new ContaCorrente();
		cc.setSaldo(8000);
		imprimirSaldo(cc);
		System.out.println("==============================");
		// conta poupança é uma conta? <----Sim
		Conta cp = new ContaPoupanca();
		cp.setSaldo(9000);
		imprimirSaldo(cp);
		
		
       /*Tentar reescrever o metodo to String da classe object para imprimir os dados que
        *estão sendo impressos no metodo static imprimir saldo. Quando executamos o metodo sysout println
        * este chama internamente o toString para impressão.
        * */ 		
		
		
		
		System.out.println("==============================");

	}



	public static void imprimirSaldo(Conta conta) {
        /*Cada hora o objeto passado como parametro pode mudar sendo do tipo conta corrente, poupança ou mesmo conta
         *Assumir varias formas -Polimorfismo */
		
		//Casting de Objeto - instaced of informa se determinada variavel é de tal tipo de dados (retornar boolean)
		System.out.println("Saldo da conta : R$ " + conta.getSaldo());
		if (conta instanceof ContaCorrente) {
			// Conta é uma conta corrente? <----Não necessariamente. Poder ser uma conta poupança.
			ContaCorrente cc = (ContaCorrente)conta;
			//Faço o casting porque o instanceof garante que conta é desse tipo
			System.out.println("O limite da Conta Corrente é de R$ " + cc.getLimite());
			
		}
		if (conta instanceof ContaPoupanca) {
			
			ContaPoupanca cp = (ContaPoupanca) conta;
			System.out.println("O rendimento da conta poupança é de R$ " + cp.getRendimentos());
			
		}
		
		
		
	}

}
