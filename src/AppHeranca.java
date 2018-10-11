import br.com.algaworks.heranca.Jogador;
import br.com.algaworks.heranca.Pessoa;

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

		}

}
