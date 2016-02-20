package unidades;

public class Arma {

	private int ataque;
	private int durabilidade;
	
	public Arma(int ataque, int durabilidade) {
		this.ataque = ataque;
		this.durabilidade = durabilidade;
	}
	
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDurabilidade() {
		return durabilidade;
	}
	public void setDurabilidade(int durabilidade) {
		this.durabilidade = durabilidade;
	}
}
