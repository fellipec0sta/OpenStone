package unidades.herois;

import unidades.Heroi;
import unidades.Unidade;

public class Mago extends Heroi {

	public Mago() {
		this.nome = "Maga";
	}
	
	@Override
	public void saudacoes() {
		System.out.println("Maga diz: Olá");
	}

	@Override
	public void poderHeroico(Unidade alvo) {
		System.out.println("Maga lança poder heróico em: " + alvo.getNome());
		alvo.causarDano(1);
	}

}
