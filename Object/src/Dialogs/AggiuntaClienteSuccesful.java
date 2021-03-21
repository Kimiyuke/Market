package Dialogs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.Controller;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

public class AggiuntaClienteSuccesful extends JDialog {

	

	/**
	 * Create the dialog.
	 */
	Controller TheController;
	public AggiuntaClienteSuccesful(Controller c) {
		TheController=c;
		getContentPane().setBackground(new Color(149, 213, 178));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(27, 67, 50));
		panel.setLayout(null);
		panel.setBounds(10, 41, 414, 148);
		getContentPane().add(panel);
		
		JLabel lblAggiuntaClienteEffettuata = new JLabel("Aggiunta cliente effettuata con successo");
		lblAggiuntaClienteEffettuata.setForeground(Color.WHITE);
		lblAggiuntaClienteEffettuata.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		lblAggiuntaClienteEffettuata.setBounds(25, 37, 329, 52);
		panel.add(lblAggiuntaClienteEffettuata);
		
		JLabel lblicon = new JLabel("\r\n");
		lblicon.setBounds(0, 39, 46, 55);
		panel.add(lblicon);
		Image icons= new ImageIcon(this.getClass().getResource("/cliente.png")).getImage();
		lblicon.setIcon(new ImageIcon(icons));
		
		JLabel lblicon1 = new JLabel("\r\n");
		lblicon1.setBounds(378, 32, 56, 69);
		panel.add(lblicon1);
		lblicon1.setIcon(new ImageIcon(icons));
	}
}
