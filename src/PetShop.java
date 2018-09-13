
public class PetShop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro cachorro = new Cachorro();
		
		cachorro.nome="Bidu";
		cachorro.idade=1;
		cachorro.raca="Boxer";
		cachorro.sexo='M';
		
		Cachorro outrocachorro = new Cachorro();
		
		outrocachorro.nome="Max";
		outrocachorro.idade=2;
		outrocachorro.raca="PitBull";
		outrocachorro.sexo='F';

		System.out.println("======================Cachorro=================");
		System.out.println("Nome: " + cachorro.nome);
		System.out.println("Idade: " + cachorro.idade);
		System.out.println("Raça: " + cachorro.raca);
		System.out.println("Sexo: " + cachorro.sexo);
		System.out.println("=================OutroCachorro=================");
		System.out.println("Nome: " + outrocachorro.nome);
		System.out.println("Idade: " + outrocachorro.idade);
		System.out.println("Raça: " + outrocachorro.raca);
		System.out.println("Sexo: " + outrocachorro.sexo);


	}

}
