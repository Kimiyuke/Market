package Dialogs;
import Panels.PanelMagazzino;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import Controller.Controller;
import java.awt.Color;


public class AggiuntaProdottiSuccesful extends JDialog {

	PanelMagazzino panelmagazzino;

	 Controller TheController;
	public AggiuntaProdottiSuccesful(Controller c) {
		getContentPane().setBackground(new Color(149, 213, 178));
		TheController=c;
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(27, 67, 50));
		panel.setBounds(0, 64, 434, 124);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblAggiuntaClienteEffettuata = new JLabel("Aggiunta prodotto effettuata con successo");
		lblAggiuntaClienteEffettuata.setForeground(Color.WHITE);
		lblAggiuntaClienteEffettuata.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		lblAggiuntaClienteEffettuata.setBounds(57, 27, 339, 50);
		panel.add(lblAggiuntaClienteEffettuata);
		
		JLabel lblicon = new JLabel("");
		lblicon.setBounds(0, 27, 70, 50);
		panel.add(lblicon);
		Image icons= new ImageIcon(this.getClass().getResource("/mela.png")).getImage();
		lblicon.setIcon(new ImageIcon(icons));
		
		JLabel lblicon1 = new JLabel("");
		lblicon1.setBounds(398, 27, 36, 50);
		panel.add(lblicon1);
		lblicon1.setIcon(new ImageIcon(icons));
		
	         
	}
}
