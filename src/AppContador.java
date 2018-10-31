import br.com.algaworks.heranca.Contador;

public class AppContador {
	public static void main(String[] args) {

		//Contador.contador++;
		
		Contador.CONTADOR=Contador.ramdomValor();;
		int valor = Contador.CONTADOR;
		System.out.println("VALOR :" + valor);
		
		
		Contador c = new Contador();
		c.incrementar();
		System.out.println(c.CONTADOR);
		System.out.println(Contador.CONTADOR);
		
		Contador.recuperarValor();
		
		
	}
}
