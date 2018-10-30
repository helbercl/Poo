package br.com.algaworks.modificadores.acesso;

import br.com.algaworks.heranca.Cachorro;

public class TreinadorCachorro {
	
	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Bob");
		
		DonoCachorro dono = new DonoCachorro();
		dono.ensinarCachorroSentar(cachorro);
		
	}

}
