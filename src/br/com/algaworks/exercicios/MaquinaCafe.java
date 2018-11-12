package br.com.algaworks.exercicios;

public class MaquinaCafe {
	
	private Double acucarDisponivel;
	
	public void fazerCafe() {
		this.fazerCafe(10.0);
	}
	
	
	public void fazerCafe(Double quantidadeAcucar) {
		if (acucarDisponivel<quantidadeAcucar) {
			System.out.println("N�o h� acu�ar suficiente para fazer o caf�.");
		}else {
			acucarDisponivel-=quantidadeAcucar;
			System.out.println("Fazendo o caf� com " + quantidadeAcucar + " gramas de acu�ar.");
		}
	}
	public Double getAcucarDisponivel() {
		return acucarDisponivel;
	}
	
	public void setAcucarDisponivel(Double acucarDisponivel) {
		this.acucarDisponivel = acucarDisponivel;
	}
	
	

}
