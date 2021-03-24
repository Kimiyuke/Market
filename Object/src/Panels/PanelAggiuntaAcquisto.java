package Panels;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Controller.Controller;
import net.proteanit.sql.DbUtils;
import net.proteanit.sql.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTabbedPane;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.SwingConstants; 
public class PanelAggiuntaAcquisto extends JPanel {
	private JTextField txtidprodotto;
	private JTextField txtquantita;
	private JTextField txtcodicetessera;
    Controller TheController;
    private JTextField txtdata;
    private JTextField txtidacquisto;
    private JLabel lblcodicetessera;
    private JLabel lblcidprodotto;
    private JLabel lblcdata;
    private JLabel lblcquantita;
    private JLabel lblcidacquisto;
	/**
	 * Create the panel.
	 */
	public PanelAggiuntaAcquisto (Controller c) {
			TheController=c;
		setBackground(new Color(45, 106, 79));
      setSize(643,501);
      setLayout(null);
      
      JPanel panel = new JPanel();
      panel.setBorder(new MatteBorder(4, 1, 4, 1, (Color) new Color(255, 255, 255)));
      panel.setToolTipText("");
      panel.setBackground(new Color(27, 67, 50));
      panel.setBounds(0, 0, 206, 78);
      add(panel);
      panel.setLayout(null);
      
      JLabel lblNewLabel = new JLabel("Aggiunta Acquisto\r\n");
      lblNewLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
      lblNewLabel.setForeground(new Color(255, 255, 255));
      lblNewLabel.setBounds(10, 11, 206, 62);
      panel.add(lblNewLabel);
      
      JLabel lblidprodotto = new JLabel("Id Prodotto");
      lblidprodotto.setForeground(Color.WHITE);
      lblidprodotto.setFont(new Font("Dialog", Font.ITALIC, 11));
      lblidprodotto.setBounds(10, 120, 63, 14);
      add(lblidprodotto);
      
      txtidprodotto = new JTextField();
     
      txtidprodotto.setBounds(83, 117, 86, 20);
      add(txtidprodotto);
      txtidprodotto.setColumns(10);
      
      JLabel lblquantita = new JLabel("Quantit\u00E0\r\n");
      lblquantita.setFont(new Font("Dialog", Font.ITALIC, 11));
      lblquantita.setForeground(Color.WHITE);
      lblquantita.setBounds(197, 120, 63, 14);
      add(lblquantita);
      
      txtquantita = new JTextField();
      txtquantita.setBounds(257, 117, 86, 22);
      add(txtquantita);
      txtquantita.setColumns(10);
      
      JLabel lblmarca = new JLabel("Codice Tessera\r\n");
      lblmarca.setFont(new Font("Dialog", Font.ITALIC, 11));
      lblmarca.setForeground(Color.WHITE);
      lblmarca.setBounds(367, 120, 82, 14);
      add(lblmarca);
      
      txtcodicetessera = new JTextField();
      txtcodicetessera.setBounds(459, 115, 86, 25);
      add(txtcodicetessera);
      txtcodicetessera.setColumns(10);
      
      JLabel lblhelp = new JLabel("?");
      lblhelp.setToolTipText("Ricorda i primi due caratteri, degli otto, variano a seconda della categoria:\r\nFrutta FR  Verdura VE  Confezionati CO  Latticini LA  Farinacei FA  Uova UO");
     
      lblhelp.setBounds(72, 120, 23, 41);
      add(lblhelp);
      lblhelp.setFont(new Font("Tahoma", Font.PLAIN, 19));
      lblhelp.setForeground(new Color(255, 255, 255));
      
      JPanel paneltotale = new JPanel();
      paneltotale.setBounds(502, 312, 131, 32);
      add(paneltotale);
      paneltotale.setLayout(null);
      
      JLabel lbltotale1 = new JLabel("New label");
      lbltotale1.setHorizontalAlignment(SwingConstants.CENTER);
      lbltotale1.setFont(new Font("Dialog", Font.ITALIC, 11));
      lbltotale1.setBounds(0, 5, 121, 27);
      paneltotale.add(lbltotale1);
      
      JLabel lbltotale = new JLabel("Totale:");
      lbltotale.setForeground(new Color(255, 255, 255));
      lbltotale.setFont(new Font("Dialog", Font.ITALIC, 11));
      lbltotale.setBounds(427, 312, 76, 32);
      add(lbltotale);
      
      JPanel panelpunti = new JPanel();
      panelpunti.setBounds(502, 355, 131, 32);
      add(panelpunti);
      panelpunti.setLayout(null);
      
      JLabel lblpunti1 = new JLabel("New label");
      lblpunti1.setHorizontalAlignment(SwingConstants.CENTER);
      lblpunti1.setFont(new Font("Dialog", Font.ITALIC, 11));
      lblpunti1.setBounds(-10, 0, 131, 32);
      panelpunti.add(lblpunti1);
      
      JLabel lblpunti = new JLabel("Punti Acquisiti:");
      lblpunti.setForeground(new Color(255, 255, 255));
      lblpunti.setFont(new Font("Dialog", Font.ITALIC, 11));
      lblpunti.setBounds(402, 355, 119, 32);
      add(lblpunti);
      
      JLabel lbldata = new JLabel("Data di acquisto\r\n");
      lbldata.setForeground(new Color(255, 255, 255));
      lbldata.setFont(new Font("Dialog", Font.ITALIC, 11));
      lbldata.setBounds(10, 174, 109, 14);
      add(lbldata);
      
      txtdata = new JTextField();
      txtdata.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 11));
      txtdata.setText("dd-mm-yyyy");
      txtdata.setBounds(96, 172, 86, 20);
      add(txtdata);
      txtdata.setColumns(10);
      
      JCheckBox cbx = new JCheckBox("Fine Acquisto?");
      cbx.setBounds(524, 206, 109, 23);
      add(cbx);
      
      JLabel lblidacquisto = new JLabel("Id Acquisto");
      lblidacquisto.setForeground(Color.WHITE);
      lblidacquisto.setFont(new Font("Dialog", Font.ITALIC, 11));
      lblidacquisto.setBounds(270, 37, 63, 20);
      add(lblidacquisto);
      
      txtidacquisto = new JTextField();
      txtidacquisto.setBounds(356, 38, 86, 20);
      add(txtidacquisto);
      txtidacquisto.setColumns(10);
      
       lblcodicetessera = new JLabel("");
       lblcodicetessera.setForeground(Color.RED);
       lblcodicetessera.setFont(new Font("Dialog", Font.BOLD, 11));
       lblcodicetessera.setHorizontalAlignment(SwingConstants.CENTER);
      lblcodicetessera.setBounds(402, 145, 231, 14);
      add(lblcodicetessera);
      
       lblcidprodotto = new JLabel("");
      lblcidprodotto.setHorizontalAlignment(SwingConstants.CENTER);
      lblcidprodotto.setForeground(Color.RED);
      lblcidprodotto.setFont(new Font("Dialog", Font.BOLD, 11));
      lblcidprodotto.setBounds(0, 145, 221, 14);
      add(lblcidprodotto);
      
       lblcquantita = new JLabel("");
      lblcquantita.setHorizontalAlignment(SwingConstants.CENTER);
      lblcquantita.setForeground(Color.RED);
      lblcquantita.setFont(new Font("Dialog", Font.BOLD, 11));
      lblcquantita.setBounds(171, 147, 221, 14);
      add(lblcquantita);
      
       lblcidacquisto = new JLabel("");
      lblcidacquisto.setHorizontalAlignment(SwingConstants.CENTER);
      lblcidacquisto.setForeground(Color.RED);
      lblcidacquisto.setFont(new Font("Dialog", Font.BOLD, 11));
      lblcidacquisto.setBounds(270, 64, 286, 14);
      add(lblcidacquisto);
      
      JPanel panel_1 = new JPanel();
      panel_1.addMouseListener(new MouseAdapter() {
      	
      	
      	  public void mouseClicked(MouseEvent e) {
      	if(cbx.isSelected()) { 
      		
      		lblcodicetessera.setVisible(false);       //LABEL DI ERRORI SETTATE A FALSE
  			lblcidprodotto.setVisible(false);
  			lblcidacquisto.setVisible(false);
  			lblcquantita.setVisible(false);
  			lblcdata.setVisible(false);
      		
  			if ( ! txtquantita.getText().matches("[0-9]+")) {    //CONTROLLO INPUT PER QUANTITA, SI VERIFICA CHE ESSO SIA UN NUMERO
  				lblcquantita.setVisible(true);
  				lblcquantita.setText("attenzione, inserire un numero"); 
      			return;
      		}
  			                                                     // CONTROLLO INPUT DATA DI ACQUISTO
  			if ( ! txtdata.getText().matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")) {    
      			lblcdata.setVisible(true);
      			lblcdata.setText("attenzione, inserire una data valida"); 
      			return;
      		}
    
      		try { //se � l'ultimo acquisto da selezionare allora si effettua funzione per terminare l'acquisto
      		
				if(TheController.getAcquistodao().acquistototale(txtidprodotto.getText().toString(), Integer.valueOf(txtquantita.getText().toString()), 
						txtcodicetessera.getText().toString(), txtdata.getText().toString(), Integer.valueOf(txtidacquisto.getText().toString()), PanelAggiuntaAcquisto.this)) {
				
				txtidprodotto.setText("");
				txtquantita.setText("");
				txtdata.setText("");
				txtcodicetessera.setText("");
				
				lbltotale1.setVisible(true);
      	      paneltotale.setVisible(true);
      	      lbltotale.setVisible(true);
      	      int prezzototale= TheController.getAcquistototaledao().getprezzototale(Integer.valueOf(txtidacquisto.getText().toString()));
      	      lbltotale1.setText(String.valueOf(prezzototale));
      	      
      	      lblpunti1.setVisible(true);
      	      panelpunti.setVisible(true);
      	      lblpunti.setVisible(true);
      	      int puntitotale=TheController.getAcquistototaledao().getpuntitotale(Integer.valueOf(txtidacquisto.getText().toString()));
      	      lblpunti1.setText(String.valueOf(puntitotale));
      	      
				}
				
			}
      			catch (Exception e1) {
				
      					e1.printStackTrace();
      			}
      		
      		
      	}
      	else {
      		
      		lblcodicetessera.setVisible(false);       //LABEL DI ERRORI SETTATE A FALSE
  			lblcidprodotto.setVisible(false);
  			lblcidacquisto.setVisible(false);
  			lblcquantita.setVisible(false);
  			lblcdata.setVisible(false);
      		
  			if ( ! txtquantita.getText().matches("[0-9]+")) {    //CONTROLLO INPUT PER QUANTITA, SI VERIFICA CHE ESSO SIA UN NUMERO
  				lblcquantita.setVisible(true);
  				lblcquantita.setText("attenzione, inserire un numero"); 
      			return;
      		}
  			
  			if ( ! txtidacquisto.getText().matches("[0-9]+")) {    //CONTROLLO INPUT PER iD ACQUISTO, SI VERIFICA CHE ESSO SIA UN NUMERO
  				lblcidacquisto.setVisible(true);
  				lblcidacquisto.setText("attenzione, inserire un numero"); 
      			return;
      		}
  			
  			
  			                                                     // CONTROLLO INPUT DATA DI ACQUISTO
  			if ( ! txtdata.getText().matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")) {    
      			lblcdata.setVisible(true);
      			lblcdata.setText("attenzione, inserire una data valida"); 
      			return;
      		}
  			
  			if ( ! txtidprodotto.getText().matches("[A-Z][A-Z][0-9][0-9][0-9][0-9][0-9][0-9]")) {  //CONTROLLO INPUT PER ID PRODOTTO
  				lblcidprodotto.setVisible(true);          				
  				lblcidprodotto.setText("attenzione, i caratteri devono essere 8"); 
      			return;
      		}
  			
  			
      		try {      //ALTRIMENTI SI AGGIUNGE L'ACQUISTO TRAMITE LA FUNZIONE CON VALORE BOOLEANO "FINE ACQUISTO" A FALSE
      			
					if(TheController.getAcquistodao().acquistosingolo(txtidprodotto.getText().toString(), Integer.valueOf(txtquantita.getText().toString()), 
							txtcodicetessera.getText().toString(), txtdata.getText().toString(), Integer.valueOf(txtidacquisto.getText().toString()), PanelAggiuntaAcquisto.this)) {
					txtidprodotto.setText("");
					txtquantita.setText("");
					txtdata.setText("");
					
					}
      		} 
      				catch (Exception e1) {
					
      						e1.printStackTrace();
      				}
      		
      	}
        }
    });
      		
      		
  
      panel_1.setLayout(null);
      panel_1.setBackground(new Color(45, 106, 79));
      panel_1.setBounds(471, 185, 50, 63);
      add(panel_1);
      
      JLabel icon = new JLabel("");
      icon.setBounds(10, 11, 46, 52);
      panel_1.add(icon);
      Image iconn= new ImageIcon(this.getClass().getResource("/add.png")).getImage();
      icon.setIcon(new ImageIcon(iconn));
      
       lblcdata = new JLabel("");
      lblcdata.setHorizontalAlignment(SwingConstants.CENTER);
      lblcdata.setForeground(Color.RED);
      lblcdata.setFont(new Font("Dialog", Font.BOLD, 11));
      lblcdata.setBounds(0, 210, 221, 14);
      add(lblcdata);
      //setting iniziale prezzo totale a falso
      lbltotale1.setVisible(false);
      paneltotale.setVisible(false);
      lbltotale.setVisible(false);
      
      //setting punti acquisiti a falso
      lblpunti1.setVisible(false);
      panelpunti.setVisible(false);
      lblpunti.setVisible(false);
      
      
      //FUNZIONE PER AGGIUNGERE UN ACQUISTO DI UN SINGOLO PRODOTTO
     
        	
        


	}
	 public JTextField gettxtcodicetessera() {
	    	return  txtcodicetessera;
	    }
	 public JTextField gettxtidprodotto() {
	    	return  txtidprodotto;
	    }
	 public JTextField gettxtdata() {
	    	return  txtdata;
	    }
	 public JTextField gettxtquantita() {
	    	return  txtquantita;
	    }
	 public JLabel getlblcodicetessera() {
	    	return  lblcodicetessera;
	    }
	 
	 public JLabel getlblcheckidprodotto() {
	    	return  lblcidprodotto;
	    }
	 
	 public JLabel getlblcidacquisto() {
	    	return  lblcidacquisto;
	    }
}