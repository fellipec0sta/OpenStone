package cartas;

public class CartaMagia extends Carta {

	//por enquanto armazenaremos somente a descrição desta carta
	private String descricao;
	
	public CartaMagia(int custo, String nome, GemaCarta gema, String descricao) {
		super(custo, nome, gema);
		this.descricao = descricao;
	}

	public String toString() {
		int width = 12;
		String res = "";
		res += "[(" + super.getCusto() + ") ";
		res += super.getNome() + ": ";
		res += descricao;
		res += "]";
		return res;
	}
}
