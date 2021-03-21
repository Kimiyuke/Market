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
	private JTextField txtcf;
	private JTextField txtnome;
	private JTextField txtcognome;
    
    FruttaDAO FruttaDAO;
    PanelClienti panelclienti;
    PanelMagazzinoRicerca panelmagazzinoricerca;

	Controller TheController;
	private JTextField txtcodicetessera;
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
	      
	      txtcf = new JTextField();
	      txtcf.setBounds(96, 118, 86, 20);
	      add(txtcf);
	      txtcf.setColumns(10);
	      
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
	      
	      txtcognome = new JTextField();
	      txtcognome.setBounds(459, 115, 86, 25);
	      add(txtcognome);
	      txtcognome.setColumns(10);
	      
	      JPanel panel_1 = new JPanel();
	      panel_1.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent e) {
	      		
	      		try {
					TheController.getClientidao().Addcliente(txtcf.getText().toString(),txtnome.getText().toString(),txtcognome.getText().toString(),txtcodicetessera.getText().toString());
				    TheController.clientisuccesful();
	      		} 
	      		
	      		catch (Exception e1) {
					
					e1.printStackTrace();
				}
	      		
	      		
	      	}
	      	
	      });
	      panel_1.setBackground(new Color(45,106, 79));
	      panel_1.setBounds(525, 151, 50, 63);
	      add(panel_1);
	      panel_1.setLayout(null);
	      
	      JLabel icon = new JLabel("");
	      icon.setBounds(0, 11, 46, 52);
	      panel_1.add(icon);
	      Image icons= new ImageIcon(this.getClass().getResource("/add.png")).getImage();
			icon.setIcon(new ImageIcon(icons));
			
			JLabel lblCodiceTessera = new JLabel("Codice Tessera");
			lblCodiceTessera.setForeground(Color.WHITE);
			lblCodiceTessera.setFont(new Font("Dialog", Font.ITALIC, 11));
			lblCodiceTessera.setBounds(257, 57, 86, 14);
			add(lblCodiceTessera);
			
			txtcodicetessera = new JTextField();
			txtcodicetessera.setColumns(10);
			txtcodicetessera.setBounds(357, 55, 86, 20);
			add(txtcodicetessera);
			
			JLabel lblhelp = new JLabel("?");
			lblhelp.setToolTipText("Ricorda i primi  quattro caratteri sono lettere maiuscole e  i restanti quattro sono numeri");
			lblhelp.setForeground(Color.WHITE);
			lblhelp.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblhelp.setBounds(341, 57, 23, 41);
			add(lblhelp);
	     
	      
	}
}
