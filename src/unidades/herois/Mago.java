package unidades.herois;

import unidades.Heroi;
import unidades.Unidade;

public class Mago extends Heroi {

	public Mago() {
		this.nome = "Maga";
	}
	
	@Override
	public void saudacoes() {
		System.out.println("Maga diz: Ol�");
	}

	@Override
	public void poderHeroico(Unidade alvo) {
		System.out.println("Maga lan�a poder her�ico em: " + alvo.getNome());
		alvo.causarDano(1);
	}

}
