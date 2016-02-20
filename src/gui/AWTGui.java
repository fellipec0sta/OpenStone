package gui;

import java.awt.Button;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;

import unidades.Lacaio;
import cartas.Carta;
import jogo.GerenciaPartida;
import jogo.Jogador;

public class AWTGui extends Frame implements ActionListener {

	private GerenciaPartida gp;
	private Panel lacaiosQuemJogaPanel;
	private Panel lacaiosOponentePanel;
	private Panel cartasPanel;
	private Label quemJogaLabel;
	private Label oponenteLabel;
	private Panel quemJogaPanel;
	private Button usarCartaButton;
	private Button poderHeroicoButton;
	private Button terminarTurnoButton;
	private Choice cartasChoice;
	
	private void atualizarCartasPanel(Panel p, Jogador jogador) {
		p.removeAll();
		ArrayList<Carta> cartas = jogador.getMao();
		for(int i = 0; i < cartas.size(); i++) {
			p.add(new Button(cartas.get(i).toString()));
		}
		p.validate();
	}
	
	private void atualizarCartasChoice(Choice c, Jogador jogador) {
		c.removeAll();
		ArrayList<Carta> cartas = jogador.getMao();
		for(int i = 0; i < cartas.size(); i++) {
			c.addItem(cartas.get(i).toString());
		}
	}
	private void atualizarLacaios(Panel p, Jogador jogador) {
		p.removeAll();
		ArrayList<Lacaio> lacaios = jogador.getLacaios();
		for(int i = 0; i < lacaios.size(); i++)
			p.add(new Button(lacaios.get(i).toString()));
		p.validate();
	}
	
	private void atualizarInterface() {
		//atualizarCartasPanel(cartasPanel, gp.getQuemJoga());
		atualizarCartasChoice(cartasChoice, gp.getQuemJoga());
		atualizarLacaios(lacaiosQuemJogaPanel, gp.getQuemJoga());
		atualizarLacaios(lacaiosOponentePanel, gp.oponenteDeQuemJoga());
		
		quemJogaLabel.setText(gp.getQuemJoga().toString());
	}
	
	public AWTGui(GerenciaPartida gp) {
		this.gp = gp;
		
		setLayout(new GridLayout(5, 1));
		setTitle("OpenStone");
		setSize(640, 480);
		
		lacaiosQuemJogaPanel = new Panel();
		lacaiosOponentePanel = new Panel();
		lacaiosQuemJogaPanel.setLayout(new FlowLayout());
		lacaiosOponentePanel.setLayout(new FlowLayout());
		
		cartasPanel = new Panel();
		cartasPanel.setLayout(new GridLayout(10, 1));
		
		quemJogaLabel = new Label("Quem Joga");
		oponenteLabel = new Label("Oponente");
		cartasChoice = new Choice();
		usarCartaButton = new Button("Usar carta");
		poderHeroicoButton = new Button("Poder Heróico");
		terminarTurnoButton = new Button("Terminar turno");
		
		usarCartaButton.addActionListener(this);
		terminarTurnoButton.addActionListener(this);
		quemJogaPanel = new Panel();
		quemJogaPanel.setLayout(new FlowLayout());
		quemJogaPanel.add(cartasChoice);
		quemJogaPanel.add(usarCartaButton);
		quemJogaPanel.add(poderHeroicoButton);
		quemJogaPanel.add(terminarTurnoButton);
		
		this.add(oponenteLabel);
		this.add(lacaiosOponentePanel);
		this.add(lacaiosQuemJogaPanel);
		this.add(cartasPanel);
		this.add(quemJogaPanel);
		this.add(quemJogaLabel);
		
		atualizarInterface();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource() == usarCartaButton) {
			gp.getQuemJoga().usarCarta(cartasChoice.getSelectedIndex());
		}
		if(ae.getSource() == terminarTurnoButton) {
			gp.trocaTurnoJogador();
		}
		atualizarInterface();
	}

}
