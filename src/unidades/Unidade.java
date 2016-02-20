package unidades;

public abstract class Unidade {

	protected int vida;
	protected int ataque;
	protected int limiteVida;
	protected String nome;
	
	public int getVida() {
		return vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void curar(int quantia) {
		vida += quantia;
		if(vida > limiteVida)
			vida = limiteVida;
	}
	
	public void causarDano(int quantia) {
		vida -= quantia;
	}
	
	public boolean estaVivo() {
		return vida > 0;
	}
	
	@Override
	public String toString() {
		return "Unidade [vida=" + vida + ", ataque=" + ataque + ", limiteVida="
				+ limiteVida + "]";
	}	
	
}
