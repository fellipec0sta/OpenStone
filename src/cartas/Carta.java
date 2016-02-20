package cartas;

import utilidades.Comparavel;

//Todas as cartas do jogo possuem as seguintes caracter�sticas em comum:
//custo: o valor de mana que deve ser gasto para jogar a carta
//nome: nome da carta
//gema: consulte GemaCarta.java para verificar o significado de cada gema
public class Carta implements Comparavel {

	private int custo;
	private String nome;
	private GemaCarta gema;
	
	public Carta(int custo, String nome, GemaCarta gema) {
		setCusto(custo);
		this.nome = nome;
		this.gema = gema;
	}
	
	public final String getNome() {
		return nome;
	}

	public final int getCusto() {
		return custo;
	}
	public final void setCusto(int custo) {
		this.custo = custo;
		if(this.custo < 0)
			this.custo = 0;
	}
	
	public final boolean equals(Object obj) {
		if(!(obj instanceof Carta))
			return false;
		Carta outra = (Carta) obj;
		return this.nome.compareTo(outra.getNome()) == 0;
	}
	
	//public abstract String toString();
	
	@Override
	public boolean ehMaior(Object obj) {
		if(obj instanceof Carta) {
			Carta outraCarta = (Carta) obj;
			return this.getCusto() > outraCarta.getCusto();
		}
		return false;
	}
}
