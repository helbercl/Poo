package br.com.produtos;

public class AppProduto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//double preco =140;//o tipo primitivo copia um valor e passa para o metodo.Chega uma copia para o metodo.
		
		Preco preco = new Preco();
		preco.valorCustos=140;
		
		
		
		Produto produto = new Produto();
		produto.definirPrecos(preco, 20, 15);
		
	

	}

}
