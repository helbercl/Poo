package br.com.algaworks.enums;

public class Carta {
	
	private int numero;
	private  Naipes naipe;
	
	public Carta(int numero,Naipes naipe) {
	  this.numero =numero;
	  this.naipe=naipe;
	}
	
	public void imprimirCarta() {
		System.out.println("Sou " +numero+ " de " +naipe);
	}

}
