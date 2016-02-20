package cartas;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

	private ArrayList<Carta> cartas;
	private String nome;
	
	public Deck(String nome) {
		this.nome = nome;
		cartas = new ArrayList<Carta>();
	}
	
	public void adicionar(Carta carta) {
		if(cartas.size() == 30)
			return;
		int cont = 0;
		for(int i = 0; i < cartas.size(); i++)
			if(cartas.get(i).equals(carta))
				cont++;
		if(cont == 2)
			return;
		cartas.add(carta); 
	}
	
	public Carta puxarCarta() {
		if(cartas.isEmpty()) {
			System.out.println("Não há mais cartas no deck!");
			return null;
		}
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		int numeroCartaSorteada = rand.nextInt(cartas.size());
		Carta cartaSorteada = cartas.get(numeroCartaSorteada);
		cartas.remove(numeroCartaSorteada);
		return cartaSorteada;
	}
	
	public String toString() {
		String res = "#### Deck " + this.nome + " ####\n";
		for(int i = 0; i < this.cartas.size(); i++)
			res += cartas.get(i).toString() + "\n";
		return res;
	}
}
