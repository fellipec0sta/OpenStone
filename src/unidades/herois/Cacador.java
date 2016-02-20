package unidades.herois;

import unidades.Heroi;
import unidades.Unidade;

public class Cacador extends Heroi {

	public Cacador() {
		this.nome = "Caçador";
	}
	
	@Override
	public void poderHeroico(Unidade alvo) {
		// TODO Auto-generated method stub
		if(alvo instanceof Heroi) {
			alvo.causarDano(2);
		} else {
			System.out.println("Poder heróico inválido");
		}
	}

	@Override
	public void saudacoes() {
		// TODO Auto-generated method stub
		System.out.println("Caçador diz: vou caçar você");
	}

}
