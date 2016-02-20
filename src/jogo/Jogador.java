package jogo;

import java.util.ArrayList;

import unidades.Heroi;
import unidades.Lacaio;
import cartas.CartaLacaio;
import cartas.Carta;
import cartas.Deck;

public class Jogador {

	private String nome;
	private Heroi heroi;
	private int limiteCristaisMana;
	private int cristaisMana;
	private ArrayList<Lacaio> lacaios;
	private ArrayList<Carta> mao;
	private Deck deck;

	public int getCristaisMana() {
		return cristaisMana;
	}
	
	public int getLimiteCristaisMana() {
		return limiteCristaisMana;
	}

	public void gastarCristaisMana(int quantia) {
		cristaisMana -= quantia;
	}
	
	public Deck getDeck() {
		return deck;
	}
	
	public String getNome() {
		return nome;
	}
	
	public ArrayList<Lacaio> getLacaios() {
		return lacaios;
	}
	
	public ArrayList<Carta> getMao() {
		return mao;
	}
	
	public Jogador(String nome, Heroi heroi, Deck deck) {
		limiteCristaisMana = 7;
		cristaisMana = limiteCristaisMana;
		this.nome = nome;
		this.heroi = heroi;
		this.deck = deck;
		mao = new ArrayList<Carta>();
		lacaios = new ArrayList<Lacaio>();
		heroi.setJogador(this);
	}

	public Heroi getHeroi() {
		return heroi;
	}
	
	public void novoTurno() {
		if(limiteCristaisMana < 10)
			limiteCristaisMana++;
		cristaisMana = limiteCristaisMana;
		puxarCarta();
	}
	
	public void puxarCarta() {
		Carta cartaPuxada = deck.puxarCarta();
		mao.add(cartaPuxada);
	}
	
	public void usarCarta(int i) {
		//o �ndice da carta deve estar no intervalo v�lido
		if(i < 0 || i >= mao.size())
			return;
		Carta cartaEscolhida = mao.get(i);
		//o custo da carta n�o pode ultrapassar o n�mero de cristais de mana
		if(cartaEscolhida.getCusto() > cristaisMana) {
			System.out.println("N�o h� mana suficiente");
			return;
		}
		
		cristaisMana -= cartaEscolhida.getCusto();
		if(cartaEscolhida instanceof CartaLacaio) {
			System.out.println(getNome() + " adicionou " + cartaEscolhida.getNome() + " na mesa");
			//pergunta: porque o casting abaixo � necess�rio?
			CartaLacaio cartaLacaioEscolhida = (CartaLacaio) cartaEscolhida;
			Lacaio novoLacaio = new Lacaio(cartaLacaioEscolhida.getNome(), cartaLacaioEscolhida.getAtaque(), cartaLacaioEscolhida.getVida(), cartaLacaioEscolhida.getCategoria());
			getLacaios().add(novoLacaio);
		} else {
			System.out.println("Voc� escolheu uma carta magia");
		}
		mao.remove(i);
	}
	
	public String oldToString() {
		String res = "";
		res += "Jogador: " + getNome() + " " + this.cristaisMana + "/" + this.limiteCristaisMana + "\n";
		res += this.getHeroi().toString() + "\n";
		res += "M�o do jogador:\n";
		for(int i = 0; i < mao.size(); i++)
			res += mao.get(i).toString() + "\n";
		res += this.deck.toString();
		return res;
	}
	
	public String toString() {
		String strLacaios = "";
		for(int i = 0; i < this.lacaios.size(); i++)
			strLacaios += lacaios.get(i).toString() + " ";
		return "\t\t\t" + getHeroi().getNome() + "[" + getHeroi().getVida() + "] " + "(" + nome + ") Cristais: [" + cristaisMana + "/" + limiteCristaisMana + "]\n"
				+ strLacaios;
	}
	
}
