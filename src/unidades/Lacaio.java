package unidades;

import cartas.CategoriaLacaio;

public class Lacaio extends Unidade {

	private CategoriaLacaio categoria;
	
	public Lacaio(String nome, int ataque, int vida, CategoriaLacaio categoria) {
		this.nome = nome;
		this.ataque = ataque;
		this.vida = vida;
		this.categoria = categoria;
	}
	
	public String toString() {
		return getNome().substring(0, 4) + "[" + ataque + "/" + vida + "]";
	}
	
	public void atacar(Unidade alvo) {
		alvo.causarDano(this.ataque);
		this.causarDano(alvo.getAtaque());
	}
}
