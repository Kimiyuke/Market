package Dialogs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
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
		TheController= c;
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(27, 67, 50));
		panel.setBounds(0, 75, 434, 119);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cliente aggiunto correttamente");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNewLabel.setBounds(26, 31, 372, 61);
		panel.add(lblNewLabel);
		
		JLabel icon = new JLabel("");
		icon.setBounds(-2, 41, 32, 41);
		panel.add(icon);
		Image icona= new ImageIcon(this.getClass().getResource("/cliente.png")).getImage();
		icon.setIcon(new ImageIcon(icona));
		
		JLabel icona2 = new JLabel("");
		icona2.setBounds(401, 41, 33, 41);
		panel.add(icona2);
		Image iconaa= new ImageIcon(this.getClass().getResource("/cliente.png")).getImage();
		icona2.setIcon(new ImageIcon(iconaa));
		
		Image sfondo1= new ImageIcon(this.getClass().getResource("/sfondo3.jpg")).getImage();
		
		JLabel sfondo = new JLabel("");
		sfondo.setBounds(-34, -92, 511, 365);
		getContentPane().add(sfondo);
		sfondo.setIcon(new ImageIcon(sfondo1));
		
		
	}
}
