package br.com.algaworks.exercicios;

public class MaquinaCafe {
	
	private Double acucarDisponivel;
	
	public void fazerCafe() {
		this.fazerCafe(10.0);
	}
	
	
	public void fazerCafe(Double quantidadeAcucar) {
		if (acucarDisponivel<quantidadeAcucar) {
			System.out.println("Não há acuçar suficiente para fazer o café.");
		}else {
			acucarDisponivel-=quantidadeAcucar;
			System.out.println("Fazendo o café com " + quantidadeAcucar + " gramas de acuçar.");
		}
	}
	public Double getAcucarDisponivel() {
		return acucarDisponivel;
	}
	
	public void setAcucarDisponivel(Double acucarDisponivel) {
		this.acucarDisponivel = acucarDisponivel;
	}
	
	

}
