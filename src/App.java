import java.util.TreeSet;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Carro meuCarro; //declaramos
		// meuCarro= new Carro();//instanciamos - objeto tipo carro

		// Carro seuCarro = new Carro();//declarando e inicializando

		// seuCarro <> meuCarro -- na memoria do java são armazenados em locais
		// distintos

		// meuCarro.modelo="Palio";
		// meuCarro.anoDeFabricacao=2010;
		// meuCarro.cor="Verde";
		// meuCarro.fabricante="Fiat";
		//
		// seuCarro.modelo="Fox";
		// seuCarro.anoDeFabricacao=2018;
		// seuCarro.cor="vermelho";
		// seuCarro.fabricante="Wolks";
		// System.out.println("====================MeuCarro========================");
		// System.out.println("Cor : " + meuCarro.cor);
		// System.out.println("Ano Fabricação : " + meuCarro.anoDeFabricacao);
		// System.out.println("Fabricante : " + meuCarro.fabricante);
		// System.out.println("Modelo : " + meuCarro.modelo);
		// System.out.println("====================SeuCarro========================");
		// System.out.println("Cor : " + seuCarro.cor);
		// System.out.println("Ano Fabricação : " + seuCarro.anoDeFabricacao);
		// System.out.println("Fabricante : " + seuCarro.fabricante);
		// System.out.println("Modelo : " + seuCarro.modelo);
		//
		// Proprietario proprietario = new Proprietario();
		// proprietario.nome="João";
		// proprietario.cpf="009.133.235-43";
		// proprietario.idade=25;
		// proprietario.logradouro="Rua Arnaldo Dantas, 393";
		// proprietario.bairro="Santo Antônio";
		// proprietario.cidade="Aracaju";
		//
		// Carro carro = new Carro();
		// carro.anoDeFabricacao=2011;
		// carro.cor="Prata";
		// carro.fabricante="Fiat";
		// carro.modelo="Palio";
		// //carro.proprietario=new Proprietario();
		// carro.proprietario.nome="João";
		// carro.proprietario.cpf="009.133.235-43";
		// carro.proprietario.idade=25;
		// carro.proprietario.logradouro="Rua Arnaldo Dantas, 393";
		// carro.proprietario.bairro="Santo Antônio";
		// carro.proprietario.cidade="Aracaju";
		//
		//
		// System.out.println("Ano Fabricacao :" + carro.anoDeFabricacao);
		// System.out.println("Cor :" + carro.cor);
		// System.out.println("Fabricante :" + carro.fabricante);
		// System.out.println("Modelo :" + carro.modelo);
		// System.out.println("Nome Dono : " + carro.proprietario.nome);
		// System.out.println("CPF Dono : " + carro.proprietario.cpf);
		// System.out.println("Idade Dono : " + carro.proprietario.idade);
		// System.out.println("Logradouro Dono : " + carro.proprietario.logradouro);
		// System.out.println("Cidade Dono : " + carro.proprietario.cidade);
		// System.out.println("Bairro Dono : " + carro.proprietario.bairro);

		// meuCarro.proprietario=dono1;

		// meuCarro.proprietario.nome="Maria Inês";
		//
		// System.out.println("meuCarro.dono.nome :" + meuCarro.proprietario.nome);
		// System.out.println("Dono1.nome :" + dono1.nome);

		// Proprietario dono1 = new Proprietario();
		// dono1.nome="João da Silva";
		//
		// Carro meuCarro = new Carro();
		// meuCarro.modelo="Palio";
		//
		//
		// Carro seuCarro = new Carro();
		// seuCarro.modelo="Civic";
		//
		// meuCarro.proprietario=seuCarro.proprietario=dono1;
		// //seuCarro.proprietario=dono1;
		//
		// System.out.println("Antes da Mudança");
		// System.out.println("meuCarro.dono.nome :" + meuCarro.proprietario.nome);
		// System.out.println("seuCarro.dono.nome :" + meuCarro.proprietario.nome);
		// System.out.println("Dono1.nome :" + dono1.nome);
		//
		//
		// //meuCarro.proprietario.nome="Newton";
		// dono1.nome="Newton";
		//
		// System.out.println("Depois da Mudança");
		// System.out.println("meuCarro.dono.nome :" + meuCarro.proprietario.nome);
		// System.out.println("seuCarro.dono.nome :" + meuCarro.proprietario.nome);
		// System.out.println("Dono1.nome :" + dono1.nome);
		//

		Carro meuCarro = new Carro();
		meuCarro.modelo = "Palio";
		Carro seuCarro = new Carro();
		seuCarro.modelo = "Civic";

		meuCarro.ligar();
		seuCarro.ligar();
		
//		TreeSet<Integer> treeSet = new TreeSet<>();
//		treeSet.add(6);
//		treeSet.add(4);
//		treeSet.add(5);
//		treeSet.add(4);
//		treeSet.add(1);
//		for (Integer temp : treeSet) {
//			System.out.println("Numeros TreeSet :" +temp);
//			
//		}

	}

}
