package br.com.algaworks.heranca;

public class AppHeranca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jogador jogador = new Jogador();
		jogador.setIdade(37);
		jogador.setNome("Helber Cardoso Lemos");
		jogador.imprimir();
		jogador.seAindaJoga();

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Jhon");
		pessoa.setIdade(40);
		
		Tecnico  tecnico = new Tecnico();
		tecnico.setNome("Newton Cardoso Lemos");
		tecnico.setIdade(25);
		tecnico.ensinarTreinar(jogador);
		
		Object obj = new  Tecnico();
		if (obj instanceof Tecnico) {
			Tecnico tecnico1 = (Tecnico)obj;
		}
		
		

		}

}
