package jogo;

import java.util.Random;
import java.util.Scanner;

import cartas.*;
 
public class GerenciaPartida {

	private Jogador j1, j2;
	
	//Jogador que est� jogando atualmente 
	private Jogador quemJoga;
	private Scanner sc;
	
	public void trocaTurnoJogador() {
		if(quemJoga == j1)
			quemJoga = j2;
		else
			quemJoga = j1;
		quemJoga.novoTurno();
	}
	
	public Jogador oponenteDeQuemJoga() {
		if(quemJoga == j1)
			return j2;
		else
			return j1;
	}
	
	public Jogador getQuemJoga() {
		return quemJoga;
	}
	
	public GerenciaPartida(Jogador j1, Jogador j2) {
		this.j1 = j1;
		this.j2 = j2;
		
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		if(rand.nextInt(2) == 0)
			quemJoga = j1;
		else
			quemJoga = j2;
		
		j1.getHeroi().saudacoes();
		j2.getHeroi().saudacoes();
		
		for(int i = 0; i < 3; i++) {
			quemJoga.puxarCarta();
			oponenteDeQuemJoga().puxarCarta();
		}
		oponenteDeQuemJoga().puxarCarta();
		oponenteDeQuemJoga().getMao().add(new CartaMagia(0, "A moeda", GemaCarta.Basica, "Gain 1 Mana Crystal this turn only"));
		quemJoga.novoTurno();
	}
	
}
