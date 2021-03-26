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
import javax.swing.JButton;

public class PanelAggiuntaClienti extends JPanel {
	private JTextField txtcf;
	private JTextField txtnome;
	private JTextField txtcognome;
    
    FruttaDAO FruttaDAO;
    PanelClienti panelclienti;
    PanelMagazzinoRicerca panelmagazzinoricerca;

	Controller TheController;
	private JTextField txtcodicetessera;
	private JLabel lblcnome;
	private JLabel lblccognome;
	private JLabel lblCodicetessera;
	private JLabel lblccodicetessera;
	private JLabel lblcognome;
	private JLabel lblccf;


	
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
	      lblidprodotto.setFont(new Font("Dialog", Font.BOLD, 12));
	      lblidprodotto.setBounds(0, 120, 86, 14);
	      add(lblidprodotto);
	      
	      txtcf = new JTextField();
	      txtcf.setBounds(96, 118, 86, 20);
	      add(txtcf);
	      txtcf.setColumns(10);
	      
	      JLabel lblnome = new JLabel("Nome");
	      lblnome.setFont(new Font("Dialog", Font.BOLD, 13));
	      lblnome.setForeground(Color.WHITE);
	      lblnome.setBounds(199, 120, 63, 14);
	      add(lblnome);
	      
	      txtnome = new JTextField();
	      txtnome.setBounds(257, 117, 86, 22);
	      add(txtnome);
	      txtnome.setColumns(10);
	      
	      JLabel lblmarca = new JLabel("Cognome");
	      lblmarca.setFont(new Font("Dialog", Font.BOLD, 13));
	      lblmarca.setForeground(Color.WHITE);
	      lblmarca.setBounds(380, 120, 76, 14);
	      add(lblmarca);
	      
	      txtcognome = new JTextField();
	      txtcognome.setBounds(459, 115, 86, 25);
	      add(txtcognome);
	      txtcognome.setColumns(10);
	      
	      lblcnome = new JLabel("\r\n");
			lblcnome.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
			lblcnome.setForeground(new Color(255, 0, 0));
			lblcnome.setBounds(199, 145, 198, 14);
			add(lblcnome);
			
			 lblcognome = new JLabel("\r\n");
			lblcognome.setForeground(Color.RED);
			lblcognome.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
			lblcognome.setBounds(380, 145, 198, 14);
			add(lblcognome);
			
			 lblccodicetessera = new JLabel("\r\n");
			lblccodicetessera.setForeground(Color.RED);
			lblccodicetessera.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
			lblccodicetessera.setBounds(330, 86, 245, 14);
			add(lblccodicetessera);
			
			 lblccf = new JLabel("\r\n");
			lblccf.setForeground(Color.RED);
			lblccf.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
			lblccf.setBounds(0, 146, 198, 14);
			add(lblccf);
	      
	      JPanel panel_1 = new JPanel();
	      panel_1.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent e) {

				
				
				lblccodicetessera.setVisible(false);       //LABEL DI ERRORI SETTATE A FALSE
	      		lblcognome.setVisible(false);  
	      		lblcnome.setVisible(false); 
	      		lblccf.setVisible(false);
	      		                                                     //CONTROLLO SE QUALCHE INPUT E' NULLa
	      		checknull(txtnome.getText(), lblcnome );  
	      		checknull(txtcognome.getText(), lblcognome );
	      		checknull(txtcf.getText(), lblccf );
	      		checknull(txtcodicetessera.getText(), lblccodicetessera );
	      		
	      		
	      		
	  			if (  ! txtnome.getText().matches("[A-Za-z]+[\\sA-Za-z]*")) {    //CONTROLLO INPUT PER NOME 
	  				lblcnome.setVisible(true);
	  				lblcnome.setText("attenzione, campo errato"); 
	      			return;
	      		}
	  			
	  			if (  ! txtcognome.getText().matches("[A-Za-z]+[\\sA-Za-z]*")) {    //CONTROLLO INPUT PER  COGNOME
	  				lblcognome.setVisible(true);
	  				lblcognome.setText("attenzione, campo errato"); 
	      			return;
	      		}
	  			
	  			System.out.println(1);
	      		
           
	              try {
	      			
					if(TheController.getClientidao().Addcliente(txtcf.getText().toString(),txtnome.getText().toString(),txtcognome.getText().toString(),txtcodicetessera.getText().toString(), PanelAggiuntaClienti.this)) {
						 
					TheController.clientisuccesful();  //APRE J DIALOG PER L'AVVENUTA DI UN CLIENTE
						
					}//fine if
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
	      icon.setBounds(0, 11, 40, 41);
	      panel_1.add(icon);
	      Image icons= new ImageIcon(this.getClass().getResource("/add.png")).getImage();
			icon.setIcon(new ImageIcon(icons));
			
			JLabel lblCodiceTessera = new JLabel("Codice Tessera");
			lblCodiceTessera.setForeground(Color.WHITE);
			lblCodiceTessera.setFont(new Font("Dialog", Font.BOLD, 13));
			lblCodiceTessera.setBounds(216, 57, 106, 14);
			add(lblCodiceTessera);
			
			txtcodicetessera = new JTextField();
			txtcodicetessera.setColumns(10);
			txtcodicetessera.setBounds(357, 55, 86, 20);
			add(txtcodicetessera);
			
			JLabel lblhelp = new JLabel("?");
			lblhelp.setToolTipText("Ricorda i primi  quattro caratteri sono lettere maiuscole e  i restanti quattro sono numeri");
			lblhelp.setForeground(Color.WHITE);
			lblhelp.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblhelp.setBounds(320, 57, 23, 33);
			add(lblhelp);
			
			
	     
	      
	}
	
	 public void checknull(String text, JLabel lbl) {                        //FUNZIONE CHE CONTROLLA SE IL PARAMENTRO è NULLO
		 if (   text.matches("")) {    
				lbl.setVisible(true);
				lbl.setText("*attenzione, campo obbligatorio"); 
   			return;
   		}
		
	}

	public JLabel getLblcnome() {
	 		return lblcnome;
	 	}
	 
	 public JLabel getLblccf() {
	 		return lblccf;
	 	}
	 public JLabel getLblcognome() {
	 		return lblccognome;
	 	}
	 
	 public JLabel getLblcodicetessera() {
	 		return lblccodicetessera;
	 	}
}
