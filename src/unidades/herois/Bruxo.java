package unidades.herois;

import unidades.Heroi;
import unidades.Unidade;

public class Bruxo extends Heroi {

	public Bruxo() {
		this.nome = "Bruxo";
	}
	
	@Override
	public void poderHeroico(Unidade alvo) {
		//nesse caso, n�o � necess�rio um alvo
		jogador.puxarCarta();
		this.causarDano(2);
	}

	@Override
	public void saudacoes() {
		// TODO Auto-generated method stub
		System.out.println("Bruxo diz: sua alma ser� minha");
	}

}
