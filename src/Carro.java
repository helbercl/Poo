
public class Carro {

	// atribuir propriedades
	// variveis de escopo do objeto - quando criar o objeto

	String fabricante; // null por default
	String modelo;// null por default
	String cor;// null por default
	int anoDeFabricacao;
	Proprietario proprietario;
	boolean biCombustivel;// false por default
	boolean ligado;// false por default

	// atribuir comportamentos

	void ligar() {
		// nome do metodo pode conter uderscore,$,numero
		// ligado=true;
//		if (modelo !=null && !modelo.equals("")) {
//			System.out.println("Ligando o carro " + modelo);	
//		}else{
//			System.out.println("Ligando o carro sem modelo especificado!" );
//		}

		if (modelo == null || modelo.equals("")) {

			return;
		}
		System.out.println("Ligando o carro " + modelo);

	}

	void imprimir() {

		System.out.println("Carro  com caracteristicas : fabricante : " + fabricante + "\n modelo : " + modelo
				+ " \n cor : " + cor + "\n Ano Fabricação : " + anoDeFabricacao + "\n Proprietario :" + proprietario
				+ "\n bicombustivel :" + biCombustivel + "\n Ligado :" + ligado);
	}

}
