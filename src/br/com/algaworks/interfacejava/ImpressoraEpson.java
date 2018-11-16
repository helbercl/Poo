package br.com.algaworks.interfacejava;

public class ImpressoraEpson implements Impressora {

	@Override
	public void imprimir(Imprimivel imprimivel) {
	System.out.println("*******************************");
	System.out.println(imprimivel.getCabecalho());
	System.out.println("*******************************");
	System.out.println(imprimivel.getCorpoPagina());
	System.out.println();
	System.out.println("--------------------------------");
	System.out.println("  Epson ");
	System.out.println("--------------------------------");

	

	}

}
