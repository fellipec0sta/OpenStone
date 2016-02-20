package unidades.herois;

import unidades.Heroi;
import unidades.Unidade;

public class Sacerdote extends Heroi {
	
	public Sacerdote() {
		this.nome = "Sacerdote";
	}
	
	public void poderHeroico(Unidade unidade) {
		unidade.curar(2);
	}
	
	public void saudacoes() {
		System.out.println("Sacerdote diz: saudações");
	}
}
