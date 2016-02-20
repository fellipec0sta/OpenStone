package cartas;

public class CartaLacaio extends Carta {
	
	private int ataque;
	private int vida;
	//a categoria do lacaio pode influenciar na a��o de alguns lacaios ou magias
	private CategoriaLacaio categoria;
	
	public CartaLacaio(int custo, String nome, GemaCarta gema, int ataque, int vida, CategoriaLacaio categoria) {
		super(custo, nome, gema);
		this.ataque = ataque;
		this.vida = vida;
		this.categoria = categoria;
	}
	
	public int getAtaque() {
		return ataque;
	}

	public int getVida() {
		return vida;
	}

	public CategoriaLacaio getCategoria() {
		return categoria;
	}
	
	public String toString() {
		int width = 12;
		String res = "";
		res += "[(" + super.getCusto() + ") ";
		if(super.getNome().length() >= width - 2)
			res += super.getNome().substring(0, width-2) + ".";
		else
			res += super.getNome() + ".";
		res += "(" + this.ataque + ")";
		res += "(" + this.vida + ")";
		res += "]";
		return res;
	}
	
}
