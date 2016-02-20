package testes;

import cartas.*;
import unidades.herois.*;
import jogo.GerenciaPartida;
import jogo.Jogador;

public class Teste3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CartaLacaio c1 = new CartaLacaio(1, "Silver hand recruit", GemaCarta.Basica, 1, 1, CategoriaLacaio.Nenhuma);
		CartaLacaio c2 = new CartaLacaio(1, "Murloc Raider", GemaCarta.Basica, 2, 1, CategoriaLacaio.Nenhuma);
		CartaLacaio c3 = new CartaLacaio(3, "Iron Sensei", GemaCarta.Rara, 2, 2, CategoriaLacaio.Mecanico);
		CartaLacaio c4 = new CartaLacaio(5, "Faceless manipulator", GemaCarta.Epica, 3, 3, CategoriaLacaio.Nenhuma);
		CartaLacaio c5 = new CartaLacaio(6, "Boulderfist Ogre", GemaCarta.Basica, 6, 7, CategoriaLacaio.Nenhuma);
		CartaLacaio c6 = new CartaLacaio(4, "Houndmaster", GemaCarta.Basica, 4, 3, CategoriaLacaio.Nenhuma);
		CartaLacaio c7 = new CartaLacaio(4, "Oasis snapjaw", GemaCarta.Basica, 2, 7, CategoriaLacaio.Fera);
		CartaLacaio c8 = new CartaLacaio(3, "Wolfrider", GemaCarta.Basica, 3, 1, CategoriaLacaio.Nenhuma);
		CartaLacaio c9 = new CartaLacaio(8, "ForceTank MAX", GemaCarta.Comum, 7, 7, CategoriaLacaio.Mecanico);
		CartaLacaio c10 = new CartaLacaio(7, "Stormwind Champion", GemaCarta.Comum, 6, 6, CategoriaLacaio.Nenhuma);
		CartaLacaio c11 = new CartaLacaio(6, "Cabal Shadow Priest", GemaCarta.Epica, 4, 5, CategoriaLacaio.Nenhuma);
		CartaLacaio c12 = new CartaLacaio(2, "Doomsayer", GemaCarta.Epica, 0, 7, CategoriaLacaio.Nenhuma);
		CartaLacaio c13 = new CartaLacaio(9, "King Krush", GemaCarta.Lendaria, 8, 8, CategoriaLacaio.Fera);
		CartaLacaio c14 = new CartaLacaio(2, "Acidic Swamp Ooze", GemaCarta.Basica, 3, 2, CategoriaLacaio.Nenhuma);
		
		CartaMagia m1 = new CartaMagia(3, "Healing touch", GemaCarta.Basica, "Restore 8 health");
		CartaMagia m2 = new CartaMagia(2, "Arcane Explosion", GemaCarta.Basica, "Deal 1 damage to all enemy minions");
		CartaMagia m3 = new CartaMagia(6, "Starfire", GemaCarta.Comum, "Deal 5 damage. Draw a card");
		CartaMagia m4 = new CartaMagia(5, "Cobra shot", GemaCarta.Comum, "Deal 3 damage to a minion and the enemy hero");
		CartaMagia m5 = new CartaMagia(4, "Mass dispel", GemaCarta.Rara, "Silence all enemy minions. Draw a card");
		
		Deck d1 = new Deck("Deck 1");
		d1.adicionar(c1);
		d1.adicionar(c3);
		d1.adicionar(c5);
		d1.adicionar(c7);
		d1.adicionar(c9);
		d1.adicionar(c11);
		d1.adicionar(c13);
		d1.adicionar(m1);
		d1.adicionar(m3);
		d1.adicionar(m5);
		
		Deck d2 = new Deck("Deck 2");
		d2.adicionar(c2);
		d2.adicionar(c4);
		d2.adicionar(c6);
		d2.adicionar(c8);
		d2.adicionar(c10);
		d2.adicionar(c12);
		d2.adicionar(c14);
		d2.adicionar(m2);
		d2.adicionar(m4);
		
		Jogador j1 = new Jogador("Jerry", new Bruxo(), d1);
		Jogador j2 = new Jogador("Tom", new Cacador(), d2);
		
		j1.getHeroi().saudacoes();
		j2.getHeroi().saudacoes();
		
		j1.getHeroi().poderHeroico(null);
		j2.getHeroi().poderHeroico(j1.getHeroi());
		
		System.out.println(j1.oldToString());
		System.out.println(j2.oldToString());
		
		j1.novoTurno();
		j2.novoTurno();
		
		System.out.println(j1.oldToString());
		System.out.println(j2.oldToString());

	}

}
