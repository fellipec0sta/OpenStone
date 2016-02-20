package unidades.herois;

import unidades.Heroi;
import unidades.Unidade;

public class Guerreiro extends Heroi {

	public Guerreiro() {
		this.nome = "Guerreiro";
	}
	
	@Override
	public void poderHeroico(Unidade alvo) {
		// TODO Auto-generated method stub
		this.armadura += 2;
	}

	@Override
	public void saudacoes() {
		// TODO Auto-generated method stub
		System.out.println("Vitória ou morte!");
	}

}
