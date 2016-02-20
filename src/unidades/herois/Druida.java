package unidades.herois;

import unidades.Heroi;
import unidades.Unidade;

public class Druida extends Heroi {

	public Druida() {
		this.nome = "Druida";
	}
	
	@Override
	public void poderHeroico(Unidade alvo) {
		// TODO Auto-generated method stub
		this.armadura++;
	}

	@Override
	public void saudacoes() {
		// TODO Auto-generated method stub
		System.out.println("Tenho que proteger a natureza!");
	}

}
