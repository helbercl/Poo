
public class ClasseArray {
	public static void main(String[] args) {

		// int[] notas = new int[4];
		// notas[0] = 10;
		// notas[1] = 5;
		// notas[2] = 8;
		// notas[3] = 9;

		Carro[] carros = new Carro[4];
		Carro carro = new Carro();
		carro.anoDeFabricacao = 1985;
		carro.biCombustivel = true;
		carro.cor = "Branco";
		carro.fabricante = "Fiat";
		carro.modelo = "Uno";
		carro.ligado = true;
		carros[0] = carro;

		// for (int i = 0; i < notas.length; i++) {
		// System.out.println("posição [" +i+"]= "+ notas[i]);
		// }

		for (Carro car : carros) {

			car.imprimir();
		}

	}
}
