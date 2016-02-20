package unidades.herois;

import unidades.Heroi;
import unidades.Unidade;

public class Cacador extends Heroi {

	public Cacador() {
		this.nome = "Ca�ador";
	}
	
	@Override
	public void poderHeroico(Unidade alvo) {
		// TODO Auto-generated method stub
		if(alvo instanceof Heroi) {
			alvo.causarDano(2);
		} else {
			System.out.println("Poder her�ico inv�lido");
		}
	}

	@Override
	public void saudacoes() {
		// TODO Auto-generated method stub
		System.out.println("Ca�ador diz: vou ca�ar voc�");
	}

}
