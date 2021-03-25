package Dialogs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.Controller;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class AggiuntaAcquistoTotale extends JDialog {
private JLabel lblpunti1;
private JLabel lbltotale1;
private JLabel lbleuro;
	Controller TheController;

	/**
	 * Create the dialog.
	 */
	public AggiuntaAcquistoTotale(Controller c) {
		TheController =c;
		setBounds(100, 100, 490, 388);
		getContentPane().setLayout(null);
			Image sfondo1= new ImageIcon(this.getClass().getResource("/sfondo3.jpg")).getImage();
			
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBackground(new Color(27, 67, 50));
			panel.setBounds(10, 102, 454, 119);
			getContentPane().add(panel);
			
			JLabel lblNewLabel = new JLabel("Prodotto aggiunto all'acquisto correttamente\r\n");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 17));
			lblNewLabel.setBounds(42, 41, 365, 35);
			panel.add(lblNewLabel);
			
			JLabel lblNewLabel_1_1 = new JLabel("Totale:");
			lblNewLabel_1_1.setForeground(new Color(27, 67, 50));
			lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 20));
			lblNewLabel_1_1.setBounds(285, 292, 67, 49);
			getContentPane().add(lblNewLabel_1_1);
			
			 lblpunti1 = new JLabel("New label");
			lblpunti1.setForeground(new Color(27, 67, 50));
			lblpunti1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
			lblpunti1.setBounds(362, 232, 112, 49);
			getContentPane().add(lblpunti1);
			
			 lbltotale1 = new JLabel("New label");
			lbltotale1.setForeground(new Color(27, 67, 50));
			lbltotale1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 17));
			lbltotale1.setBounds(362, 292, 91, 57);
			getContentPane().add(lbltotale1);
			
			lbleuro = new JLabel("\u20AC");
			lbleuro.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 17));
			lbleuro.setBackground(new Color(27, 67, 50));
			lbleuro.setBounds(446, 292, 28, 57);
			getContentPane().add(lbleuro);
			lbleuro.setVisible(false);
			
			JLabel lblNewLabel_1 = new JLabel("Totale Punti:");
			lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 20));
			lblNewLabel_1.setForeground(new Color(27, 67, 50));
			lblNewLabel_1.setBounds(238, 232, 179, 49);
			getContentPane().add(lblNewLabel_1);
			
			JLabel icon = new JLabel("");
			icon.setBounds(0, 35, 32, 41);
			panel.add(icon);
			Image icona= new ImageIcon(this.getClass().getResource("/shopping2.png")).getImage();
			icon.setIcon(new ImageIcon(icona));
			
			JLabel icona2 = new JLabel("");
			icona2.setBounds(421, 35, 33, 41);
			panel.add(icona2);
			Image iconaa= new ImageIcon(this.getClass().getResource("/shopping2.png")).getImage();
			icona2.setIcon(new ImageIcon(iconaa));
			
			JLabel lblAcquistoCompletato = new JLabel("Acquisto Completato!");
			lblAcquistoCompletato.setHorizontalAlignment(SwingConstants.CENTER);
			lblAcquistoCompletato.setForeground(Color.WHITE);
			lblAcquistoCompletato.setFont(new Font("Dialog", Font.BOLD, 17));
			lblAcquistoCompletato.setBounds(36, 73, 365, 35);
			panel.add(lblAcquistoCompletato);
				
			JLabel sfondo = new JLabel("");
			sfondo.setBounds(-82, -223, 602, 608);
			getContentPane().add(sfondo);
			sfondo.setIcon(new ImageIcon(sfondo1));
			
			
			
			
			
			
			
			
			
			
	}
	
	
	


	public JLabel getlbltotale1() {
	    	return  lbltotale1;
	    }
	 
	public JLabel getlbleuro() {
    	return  lbleuro;
    }
	 
	 public JLabel getlblpunti1() {
	    	return  lblpunti1;
	    }
}
