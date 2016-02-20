package unidades;

import jogo.Jogador;

public abstract class Heroi extends Unidade {

	private Arma arma;
	protected int armadura;
	//referência para o jogador que possui este herói
	protected Jogador jogador;
	
	public Heroi() {
		this.limiteVida = this.vida = 30;
		this.ataque = 0;
		this.armadura = 0;
		this.arma = null;
	}
	
	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	
	//se o poder heróico não atua em uma unidade alvo, passe null
	public abstract void poderHeroico(Unidade alvo);

	public abstract void saudacoes();
	
}
