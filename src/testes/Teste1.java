package testes;

import unidades.herois.Mago;
import unidades.herois.Sacerdote;
import jogo.Jogador;

public class Teste1 {

	public static void main(String[] args) {
		System.out.println("OpenStone v0.0.2");
		Jogador j1 = new Jogador("Jerry", new Sacerdote(), null);
		Jogador j2 = new Jogador("Tom", new Mago(), null);
		j1.getHeroi().saudacoes();
		j2.getHeroi().saudacoes();
		
		j2.getHeroi().poderHeroico(j1.getHeroi());
		j1.getHeroi().poderHeroico(j1.getHeroi());
		
		System.out.println(j1.getHeroi());
		System.out.println(j2.getHeroi());
	}

}
