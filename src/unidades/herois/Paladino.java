package unidades.herois;

import cartas.CategoriaLacaio;
import unidades.Heroi;
import unidades.Lacaio;
import unidades.Unidade;

public class Paladino extends Heroi {

	public Paladino() {
		this.nome = "Paladino";
	}
	
	@Override
	public void poderHeroico(Unidade alvo) {
		// TODO Auto-generated method stub
		jogador.getLacaios().add(new Lacaio("Silver Hand Recruit", 1, 1, CategoriaLacaio.Nenhuma));
	}

	@Override
	public void saudacoes() {
		// TODO Auto-generated method stub
		System.out.println("Lutarei com honra!");
	}

}
