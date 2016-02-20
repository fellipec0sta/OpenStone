package testes;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import jogo.GerenciaPartida;
import jogo.Jogador;
import unidades.Lacaio;
import unidades.Unidade;
import unidades.herois.*;
import utilidades.Sort;
import cartas.CartaLacaio;
import cartas.CartaMagia;
import cartas.CategoriaLacaio;
import cartas.Deck;
import cartas.GemaCarta;

public class Teste4 {

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
		
		Jogador j1 = new Jogador("Jerry", new Paladino(), d1);
		Jogador j2 = new Jogador("Tom", new Xama(), d2);
		
		GerenciaPartida gp = new GerenciaPartida(j1, j2);
		//System.out.println(j1.oldToString());
		//System.out.println(j2.oldToString());
		
		Scanner sc = new Scanner(System.in);
		while(j1.getHeroi().estaVivo() && j2.getHeroi().estaVivo()) {
			//Sort.organizar(j1.getMao());
			System.out.println(j1);
			System.out.println(j2);
			System.out.println("Vez de: " + gp.getQuemJoga().getHeroi().getNome());
			System.out.println("Escolha uma opcao: ");
			System.out.println("0: usar poder heroico");
			System.out.println("1: usar carta");
			System.out.println("2: atacar com lacaio");
			System.out.println("3: terminar turno");
			int opcao = sc.nextInt();
			switch(opcao) {
			case 0:
				if(gp.getQuemJoga().getHeroi() instanceof Mago || gp.getQuemJoga().getHeroi() instanceof Sacerdote) {
					ArrayList<Unidade> alvos = new ArrayList<Unidade>();
					alvos.add(gp.getQuemJoga().getHeroi());
					alvos.add(gp.oponenteDeQuemJoga().getHeroi());
					alvos.addAll(gp.getQuemJoga().getLacaios());
					alvos.addAll(gp.oponenteDeQuemJoga().getLacaios());
					for(int i = 0; i < alvos.size(); i++) {
						System.out.println(i + ": " + alvos.get(i));
					}
					System.out.println("Digite o alvo: ");
					int alvoEscolhido = sc.nextInt();
					gp.getQuemJoga().getHeroi().poderHeroico(alvos.get(alvoEscolhido));
				}
				else if(gp.getQuemJoga().getHeroi() instanceof Cacador) {
					gp.getQuemJoga().getHeroi().poderHeroico(gp.oponenteDeQuemJoga().getHeroi());
				} else {
					gp.getQuemJoga().getHeroi().poderHeroico(null);
				}
				break;
			case 1:
				for(int i = 0; i < gp.getQuemJoga().getMao().size(); i++)
					System.out.println(i + ": " + gp.getQuemJoga().getMao().get(i));
				System.out.println("Digite a carta: ");
				int cartaEscolhida = sc.nextInt();
				gp.getQuemJoga().usarCarta(cartaEscolhida);
				break;
			case 2:
				//escolher o lacaio que atacará
				for(int i = 0; i < gp.getQuemJoga().getLacaios().size(); i++)
					System.out.println(i + ": " + gp.getQuemJoga().getLacaios().get(i));
				System.out.println("Digite o lacaio: ");
				int lacaioEscolhido = sc.nextInt();
				Lacaio lacaioAtaque = gp.getQuemJoga().getLacaios().get(lacaioEscolhido);
				
				//escolher o lacaio alvo
				ArrayList<Unidade> alvos = new ArrayList<Unidade>();
				alvos.add(gp.oponenteDeQuemJoga().getHeroi());
				alvos.addAll(gp.oponenteDeQuemJoga().getLacaios());
				for(int i = 0; i < alvos.size(); i++) {
					System.out.println(i + ": " + alvos.get(i));
				}
				System.out.println("Digite o alvo: ");
				int alvoEscolhido = sc.nextInt();
				Unidade unidadeAlvo = alvos.get(alvoEscolhido);
				
				lacaioAtaque.atacar(unidadeAlvo);
				
				break;
			case 3: //troca turno
				System.out.println("#######################################");
				gp.trocaTurnoJogador();
				break;
			}
		}
	}

}
