package br.com.folhapagamento;

public class FolhaPagamento {
	
	double salarioCalculado;
	
	double calcularSalario (Salario salario){
		
		salarioCalculado = (salario.horasNormais * salario.valorHora)+(salario.horasExtras * salario.valorHoraExtra);		
		
		return salarioCalculado;
		
		
	}
	
	void imprimirHolerite(){
		
		System.out.println("Salario : " + salarioCalculado);
	}

}
