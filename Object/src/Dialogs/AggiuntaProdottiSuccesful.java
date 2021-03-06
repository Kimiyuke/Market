package Dialogs;
import Panels.PanelMagazzino;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import Controller.Controller;


public class AggiuntaProdottiSuccesful extends JDialog {

	PanelMagazzino panelmagazzino;
	
	private final JPanel contentPanel = new JPanel();

	 Controller TheController;
	public AggiuntaProdottiSuccesful(Controller c) {
		TheController=c;
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 58, 399, 148);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Aggiunta prodotto effettuata con successo");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(34, 24, 389, 52);
		panel.add(lblNewLabel);
		
	         
	}
}
