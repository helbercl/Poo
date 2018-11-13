import java.util.Scanner;

public class AppPaciente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente paciente = new Paciente();
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o peso :");
		paciente.peso = entrada.nextDouble();

		System.out.print("Informe a altura:");
		paciente.altura = entrada.nextDouble();

		Imc imcCalculado = paciente.calcularIndiceMassaCorporal();
		System.out.println("Flag Abaixo do Peso :" + imcCalculado.abaixoDoPesoIdeal);
		System.out.println("Flag Peso Ideal :" + imcCalculado.pesoIdeal);
		System.out.println("Flag Obeso :" + imcCalculado.obeso);
		System.out.println("IMC : " + imcCalculado.grauObesidade);

	}

}
