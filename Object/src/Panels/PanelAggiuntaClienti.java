package Panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import Controller.Controller;
import DAOS.FruttaDAO;

public class PanelAggiuntaClienti extends JPanel {
	private JTextField txtidprodotto;
	private JTextField txtnome;
	private JTextField txtmarca;
    
    FruttaDAO FruttaDAO;
    PanelClienti panelclienti;
    PanelMagazzinoRicerca panelmagazzinoricerca;

	Controller TheController;
	public PanelAggiuntaClienti(Controller c) {
		TheController=c;
		setBackground(new Color(45, 106, 79));
	      setSize(585,225);
	      setLayout(null);
	      
	     
	      JPanel panel = new JPanel();
	      panel.setBorder(new MatteBorder(4, 1, 4, 1, (Color) new Color(255, 255, 255)));
	      panel.setToolTipText("");
	      panel.setBackground(new Color(27, 67, 50));
	      panel.setBounds(0, 0, 206, 78);
	      add(panel);
	      panel.setLayout(null);
	      
	      JLabel lblNewLabel = new JLabel("Aggiunta Clienti");
	      lblNewLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
	      lblNewLabel.setForeground(new Color(255, 255, 255));
	      lblNewLabel.setBounds(10, 11, 206, 62);
	      panel.add(lblNewLabel);
	      
	      JLabel lblidprodotto = new JLabel("Codice Fiscale");
	      lblidprodotto.setForeground(Color.WHITE);
	      lblidprodotto.setFont(new Font("Dialog", Font.ITALIC, 11));
	      lblidprodotto.setBounds(0, 120, 86, 14);
	      add(lblidprodotto);
	      
	      txtidprodotto = new JTextField();
	      txtidprodotto.setBounds(96, 118, 86, 20);
	      add(txtidprodotto);
	      txtidprodotto.setColumns(10);
	      
	      JLabel lblnome = new JLabel("Nome");
	      lblnome.setFont(new Font("Dialog", Font.ITALIC, 11));
	      lblnome.setForeground(Color.WHITE);
	      lblnome.setBounds(199, 120, 63, 14);
	      add(lblnome);
	      
	      txtnome = new JTextField();
	      txtnome.setBounds(257, 117, 86, 22);
	      add(txtnome);
	      txtnome.setColumns(10);
	      
	      JLabel lblmarca = new JLabel("Cognome");
	      lblmarca.setFont(new Font("Dialog", Font.ITALIC, 11));
	      lblmarca.setForeground(Color.WHITE);
	      lblmarca.setBounds(393, 120, 63, 14);
	      add(lblmarca);
	      
	      txtmarca = new JTextField();
	      txtmarca.setBounds(459, 115, 86, 25);
	      add(txtmarca);
	      txtmarca.setColumns(10);
	      
	      JPanel panel_1 = new JPanel();
	      panel_1.setBackground(new Color(45,106, 79));
	      panel_1.setBounds(525, 151, 50, 63);
	      add(panel_1);
	      panel_1.setLayout(null);
	      
	      JLabel icon = new JLabel("");
	      icon.setBounds(0, 11, 46, 52);
	      panel_1.add(icon);
	      Image icons= new ImageIcon(this.getClass().getResource("/add.png")).getImage();
			icon.setIcon(new ImageIcon(icons));
	     
	      
	}
}
