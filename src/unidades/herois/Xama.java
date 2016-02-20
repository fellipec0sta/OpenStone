package unidades.herois;

import java.util.Random;

import cartas.CategoriaLacaio;
import unidades.Heroi;
import unidades.Lacaio;
import unidades.Unidade;

public class Xama extends Heroi {

	public Xama() {
		this.nome = "Xamã";
	}
	
	@Override
	public void poderHeroico(Unidade alvo) {
		// TODO Auto-generated method stub
		//não condiz com o jogo original ainda, pois não pode haver duplicidade desses lacaios
		Random rand = new Random();
		int r = rand.nextInt(4); 
		if(r == 0)
			jogador.getLacaios().add(new Lacaio("Healing Totem", 0, 2, CategoriaLacaio.Nenhuma));
		if(r == 1)
			jogador.getLacaios().add(new Lacaio("Stoneclaw Totem", 0, 2, CategoriaLacaio.Nenhuma));
		if(r == 2)
			jogador.getLacaios().add(new Lacaio("Wrath of Air Totem", 0, 2, CategoriaLacaio.Nenhuma));
		if(r == 3)
			jogador.getLacaios().add(new Lacaio("Searing Totem", 1, 1, CategoriaLacaio.Nenhuma));
	}

	@Override
	public void saudacoes() {
		// TODO Auto-generated method stub
		System.out.println("Pelo martelo da perdição!");
	}

}
