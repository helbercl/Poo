package br.com.algaworks.exercicios;

public class MatematicaUtil {
	
	//Numeros Fibonacci 0,1,1,2,3,5,8,13,21,34,55...
	
	static final double PI =3.14;

	public static int calcularFibonacci(int posicao) {
		if (posicao > 2) {
			return posicao;
		}
		return calcularFibonacci(posicao - 1) + calcularFibonacci(posicao - 2);
	}
	
	public static double calcularAreaCiculo(double raio) {
		double area =Math.pow(raio, 2) * MatematicaUtil.PI;
		return area;
	}

}
