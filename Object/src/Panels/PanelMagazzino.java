package Panels;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.Font;
import java.awt.Image;

import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Controller.Controller;
import DAOS.FruttaDAO;
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
import javax.swing.JComponent;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JSpinner;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent; 
public class PanelMagazzino extends JPanel {
	private JTextField txtidprodotto;
	private JTextField txtnome;
	private JTextField txtmarca;
	private JTextField txtdisponibilitatotale;
	private JTextField txtprezzo;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
    Controller TheController;
    FruttaDAO FruttaDAO;
    PanelClienti panelclienti;
    PanelMagazzinoRicerca panelmagazzinoricerca;
    private JTextField datachooser;
    private JTextField data1;
    private JTextField data2;
    private JTextField data3;
    private JLabel lblcnome;
    private JLabel lblcmarca;
    private JLabel lblcidprodotto;
    private JLabel lblcdatadiscadenza;
    private JLabel lbldisp;
    private JLabel lblPrezzo;
    private JLabel lblcdata1;
    private JLabel lblcdata2;
    private JLabel lblcdata3;
    private JLabel lblctxt1; 
    private JLabel lblctxt2; 
    private JLabel lblctxt3; 
    private JLabel lblhelp;
    
	/**
	 * Create the panel.
	 */
	public PanelMagazzino(Controller c) {
		setBackground(new Color(45, 106, 79));
		TheController=c;
		
      setSize(591,501);
      setLayout(null);
      
     
      JPanel panel = new JPanel();
      panel.setBorder(new MatteBorder(4, 1, 4, 1, (Color) new Color(255, 255, 255)));
      panel.setToolTipText("");
      panel.setBackground(new Color(27, 67, 50));
      panel.setBounds(0, 0, 206, 78);
      add(panel);
      panel.setLayout(null);
      
      JLabel lblNewLabel = new JLabel("Aggiunta Prodotti");
      lblNewLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
      lblNewLabel.setForeground(new Color(255, 255, 255));
      lblNewLabel.setBounds(10, 11, 206, 62);
      panel.add(lblNewLabel);
      
      JLabel sfondo = new JLabel("");
      sfondo.setBounds(0, 11, 642, 489);
      panel.add(sfondo);
      
      Image background= new ImageIcon(this.getClass().getResource("/sfondo3.jpg")).getImage();
      
      
      JLabel lblNewLabel_1 = new JLabel("Seleziona categoria");
      lblNewLabel_1.setFont(new Font("Dialog", Font.ITALIC, 15));
      lblNewLabel_1.setForeground(new Color(255, 255, 255));
      lblNewLabel_1.setBounds(216, 30, 164, 25);
      add(lblNewLabel_1);
      
      
      
      

      JComboBox comboBox = new JComboBox();
      comboBox.setEditable(true);
      comboBox.setBackground(new Color(149, 213, 178));
      comboBox.setFont(new Font("Dialog", Font.ITALIC,13));
      
      comboBox.setBorder(BorderFactory.createEmptyBorder());
                                                                                       
      comboBox.setRenderer(new DefaultListCellRenderer(){                  //animazione per la combobox, setta ad arancione l'elemento dove si trova il cursore
          @Override 
          
          public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus)
          {                JComponent result = (JComponent)super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
          if (isSelected) 
              setForeground(Color.orange);

              result.setOpaque(false);
              return result;
          }});
     
      
      comboBox.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent arg0) {
      		if (comboBox.getSelectedItem().toString().equals("Frutta")){
      			lbl1.setText("Data di raccolta");
      			data1.setVisible(true);
      			lbl1.setVisible(true);
      			
      			lbl2.setVisible(false);
      			lbl3.setVisible(false);
      			txt1.setVisible(false);
      			txt2.setVisible(false);
      			txt3.setVisible(false);
      			data2.setVisible(false);
      			data3.setVisible(false);
            }
      		
      		else if(comboBox.getSelectedItem().toString().equals("Verdura")) {
      			lbl1.setText("Data di raccolta");
      			data1.setVisible(true);
      			lbl1.setVisible(true);
      			
      			lbl2.setVisible(false);
      			lbl3.setVisible(false);
      			txt1.setVisible(false);
      			txt2.setVisible(false);
      			txt3.setVisible(false);
      			data2.setVisible(false);
      			data3.setVisible(false);
          		
      		}
      		else if(comboBox.getSelectedItem().toString().equals("Farinacei")) {
      			lbl1.setText("Peso");
      			lbl1.setVisible(true);
      		    txt1.setVisible(true);
      		    
      			lbl2.setVisible(true);
      			lbl2.setText("Ingredienti");
      			txt2.setVisible(true);
      			
      			lbl3.setVisible(true);
      			lbl3.setText("Data di produzione");
      			data3.setVisible(true);
      			
      			data2.setVisible(false);
      			data1.setVisible(false);
      			txt3.setVisible(false);  
      			
      		}
      		else if(comboBox.getSelectedItem().toString().equals("Confezionati")) {
                lbl1.setText("Peso");
                lbl1.setVisible(true);
                txt1.setVisible(true);
                
      			lbl2.setVisible(true);
      			lbl2.setText("Ingredienti");
      			txt2.setVisible(true);
      			
      			lbl3.setVisible(true);
      			lbl3.setText("Data di produzione");
      			data3.setVisible(true);
      			
      			
      			txt3.setVisible(false);  
      			data2.setVisible(false);
      			data1.setVisible(false);
      			
      		}
      		else if(comboBox.getSelectedItem().toString().equals("Latticini")) {
      			lbl1.setText("Data di Mungitura");
      			lbl1.setVisible(true);
      			data1.setVisible(true);
      			lbl2.setVisible(true);
      			lbl2.setText("Data di Produzione");
      			data2.setVisible(true);
      			lbl3.setVisible(true);
      			lbl3.setText("Peso");
      			txt3.setVisible(true);
      			
      			data3.setVisible(false);
      			txt1.setVisible(false);
      			txt2.setVisible(false);
      			
      			
      		}
      		else if(comboBox.getSelectedItem().toString().equals("Uova")) {
      			lbl1.setText("Data di deposizione");
      			
      			data1.setVisible(true);
      			lbl1.setVisible(true);
      			lbl2.setVisible(true);
      			lbl2.setText("Provenienza Allevamento");
      			txt2.setVisible(true);
      			lbl3.setVisible(true);
      			lbl3.setText("Quantità");
      			txt3.setVisible(true);
      			
      			data3.setVisible(false);
      			data2.setVisible(false);
      			txt1.setVisible(false);
      			
      			
      		}
      		
      	}
      });
      comboBox.setModel(new DefaultComboBoxModel(new String[] {"Frutta", "Verdura", "Farinacei", "Confezionati", "Latticini", "Uova"}));
      comboBox.setBounds(367, 33, 97, 22);
      add(comboBox);
      
      JLabel lblidprodotto = new JLabel("Id Prodotto");
      lblidprodotto.setForeground(new Color(255, 255, 255));
      lblidprodotto.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 11));
      lblidprodotto.setBounds(10, 120, 63, 14);
      add(lblidprodotto);
      
      txtidprodotto = new JTextField();
      txtidprodotto.setBounds(102, 118, 86, 20);
      add(txtidprodotto);
      txtidprodotto.setColumns(10);
      
      JLabel lblnome = new JLabel("Nome");
      lblnome.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 11));
      lblnome.setForeground(new Color(255, 255, 255));
      lblnome.setBounds(199, 120, 63, 14);
      add(lblnome);
      
      txtnome = new JTextField();
      txtnome.setBounds(257, 117, 86, 22);
      add(txtnome);
      txtnome.setColumns(10);
      
      JLabel lblmarca = new JLabel("Marca");
      lblmarca.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 11));
      lblmarca.setForeground(new Color(255, 255, 255));
      lblmarca.setBounds(393, 120, 63, 14);
      add(lblmarca);
      
      txtmarca = new JTextField();
      txtmarca.setBounds(459, 115, 86, 25);
      add(txtmarca);
      txtmarca.setColumns(10);
      
      JLabel lbldatadiscadenza = new JLabel("Data Di Scadenza");
      lbldatadiscadenza.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 11));
      lbldatadiscadenza.setForeground(new Color(255, 255, 255));
      lbldatadiscadenza.setBounds(3, 187, 93, 14);
      add(lbldatadiscadenza);
      
      JLabel lbldisponibilitatotale = new JLabel("Disponibilit\u00E0 totale");
      lbldisponibilitatotale.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 11));
      lbldisponibilitatotale.setForeground(new Color(255, 255, 255));
      lbldisponibilitatotale.setBounds(216, 187, 94, 14);
      add(lbldisponibilitatotale);
      
      txtdisponibilitatotale = new JTextField();
      txtdisponibilitatotale.setBounds(320, 181, 94, 20);
      add(txtdisponibilitatotale);
      txtdisponibilitatotale.setColumns(10);
      
      txtprezzo = new JTextField();
      txtprezzo.setBounds(496, 181, 86, 20);
      add(txtprezzo);
      txtprezzo.setColumns(10);
      
      txt1 = new JTextField();
      txt1.setBounds(129, 249, 97, 20);
      add(txt1);
      txt1.setColumns(10);
      
      
      
      
      
      lbl1= new JLabel("a");
      lbl1.setForeground(new Color(255, 255, 255));
      lbl1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
      lbl1.setBounds(0, 251, 119, 14);
      add(lbl1);
      
      lbl2 = new JLabel(" a");
      lbl2.setForeground(new Color(255, 255, 255));
      lbl2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 11));
      lbl2.setBounds(0, 335, 119, 17);
      add(lbl2);
      
      lbl3 = new JLabel("a");
      lbl3.setForeground(new Color(255, 255, 255));
      lbl3.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 11));
      lbl3.setBounds(0, 429, 119, 14);
      add(lbl3);
      
      txt2 = new JTextField();
      txt2.setBounds(129, 334, 97, 20);
      add(txt2);
      txt2.setColumns(10);
      
      txt3 = new JTextField();
      txt3.setBounds(129, 427, 97, 20);
      add(txt3);
      txt3.setColumns(10);
      
      JPanel panel_1 = new JPanel();
      panel_1.setBackground(new Color(45, 106, 79));
      panel_1.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		
      		lblcnome.setVisible(false);             //LBL DI ERRORI A FALSO
				lblcmarca.setVisible(false);
				lblcidprodotto.setVisible(false);
				lblcdatadiscadenza.setVisible(false);
				lbldisp.setVisible(false);
				lblPrezzo.setVisible(false);
				lblctxt1.setVisible(false);
				lblctxt2.setVisible(false);
				lblctxt3.setVisible(false);
				lblcdata1.setVisible(false);
				lblcdata3.setVisible(false);
				lblcdata2.setVisible(false);
				
      		if ( ! txtdisponibilitatotale.getText().matches("[0-9]+")) {    //CONTROLLO INPUT PER DISPONIBILITA, SI VERIFICA CHE ESSO SIA UN NUMERO
      			lbldisp.setVisible(true);
      			lbldisp.setText("attenzione, inserire un numero"); 
      			return;
      		}
      		                                                               //CONTROLLO INPUT PREZZO CHE SIA UN NUMERIC 5.2
      		if ( ! txtprezzo.getText().matches("([1-9]{1}[0-9]{0,2}(\\,\\d{3})*(\\.\\d{0,2})?|[1-9]{1}\\d{0,}(\\.\\d{0,2})?|0(\\.\\d{0,2})?|(\\.\\d{1,2}))$|^\\-?\\$?([1-9]{1}\\d{0,2}(\\,\\d{3})*(\\.\\d{0,2})?|[1-9]{1}\\d{0,}(\\.\\d{0,2})?|0(\\.\\d{0,2})?|(\\.\\d{1,2}))$|^\\(\\$?([1-9]{1}\\d{0,2}(\\,\\d{3})*(\\.\\d{0,2})?|[1-9]{1}\\d{0,}(\\.\\d{0,2})?|0(\\.\\d{0,2})?|(\\.\\d{1,2}))\\)\" ")) {   
      			lblPrezzo.setVisible(true);
      			lblPrezzo.setText("attenzione, inserire un numero"); 
      			return;
      		}
      		                                              //CONTROLLO REGEX DATA di scadenza
      		if ( ! datachooser.getText().matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")) {    
      			lblcdatadiscadenza.setVisible(true);
      			lblcdatadiscadenza.setText("attenzione, inserire una data valida"); 
      			return;
      		}
      		
      		if (  ! txtnome.getText().matches("[A-Za-z]+[\\sA-Za-z]*")) {    //CONTROLLO INPUT PER NOME, SI VERIFICA CHE CONTENGA SOLO LETTERE
  				lblcnome.setVisible(true);
  				lblcnome.setText("attenzione, campo errato"); 
      			return;
      		}
  			
  			if (  ! txtmarca.getText().matches("[A-Za-z]+[\\sA-Za-z]*")) {    //CONTROLLO INPUT PER MARCA, SI VERIFICA CHE CONTENGA SOLO LETTERE
  				lblcmarca.setVisible(true);
  				lblcmarca.setText("attenzione, campo errato"); 
      			return;
      		}
      		
      		if(comboBox.getSelectedItem().toString().equals("Frutta")){       //INSERIMENTO FRUTTA
      			
      			
      																	//CONTROLLO REGEX DATA di raccolta
  				if ( ! data1.getText().matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")) {    
  	      			lblcdata1.setVisible(true);
  	      			lblcdata1.setText("attenzione, inserire una data valida"); 
  	      			return;
  	      		}
  				
  				if ( ! txtidprodotto.getText().matches("[F][R][0-9][0-9][0-9][0-9][0-9][0-9]")) {  //CONTROLLO INPUT PER ID PRODOTTO
      				lblcidprodotto.setVisible(true);          				
      				lblcidprodotto.setText("attenzione, i caratteri devono essere 8"); 
          			return;
          		}
  				
      			try {	 
      			//IF CHE CONTROLLA SE LA FUNZIONE RESTITUISCE TRUE(OSSIA SE L'INSERIMENTO è ANDATO A BUON FINE)
      				 if(TheController.getFruttadao().InsertFrutta(txtnome.getText().toString(),txtmarca.getText().toString(),Float.valueOf(txtprezzo.getText()), 
											datachooser.getText().toString() , data1.getText().toString(),txtidprodotto.getText().toString(),
											Integer.valueOf(txtdisponibilitatotale.getText().toString()), PanelMagazzino.this)) {
				 txtidprodotto.setText("");
				 txtnome.setText("");
				 txtmarca.setText("");
				 txtdisponibilitatotale.setText("");
				 txtprezzo.setText("");
				 txt1.setText("");
				 txt2.setText("");
				 datachooser.setText("");
				 data1.setText("");
				 data2.setText("");
				 data3.setText("");
				 
				 TheController.prodottisuccesful();
					}
				 
				 
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
      		}
      		else if(comboBox.getSelectedItem().toString().equals("Verdura")) {
      			
      		//CONTROLLO REGEX DATA di raccolta
  				if ( ! data1.getText().matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")) {    
  	      			lblcdata1.setVisible(true);
  	      			lblcdata1.setText("attenzione, inserire una data valida"); 
  	      			return;
  	      		}
  				
  				if ( ! txtidprodotto.getText().matches("[V][E][0-9][0-9][0-9][0-9][0-9][0-9]")) {  //CONTROLLO INPUT PER ID PRODOTTO
      				lblcidprodotto.setVisible(true);          				
      				lblcidprodotto.setText("attenzione, i caratteri devono essere 8"); 
          			return;
          		}
      			
      				try {
      				 //IF CHE CONTROLLA SE LA FUNZIONE RESTITUISCE TRUE(OSSIA SE L'INSERIMENTO è ANDATO A BUON FINE)
      					if(TheController.getVerduradao().InsertVerdura(txtnome.getText().toString(),txtmarca.getText().toString(),Float.valueOf(txtprezzo.getText().toString()), 
							datachooser.getText().toString() , data1.getText().toString(),txtidprodotto.getText().toString(),
							Integer.valueOf(txtdisponibilitatotale.getText().toString()), PanelMagazzino.this )) {
						
					
					
							txtidprodotto.setText("");
							txtnome.setText("");
							txtmarca.setText("");
							txtdisponibilitatotale.setText("");
							txtprezzo.setText("");
							txt1.setText("");
							txt2.setText("");
							datachooser.setText("");
							data1.setText("");
							data2.setText("");
							data3.setText("");
					 
							TheController.prodottisuccesful();
      					}
				
      				
      				
      			
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
      	}
      		else if(comboBox.getSelectedItem().toString().equals("Farinacei")) {
      			
      			if ( ! txt1.getText().matches("[0-9]+")) {    //CONTROLLO INPUT PER PESO, SI VERIFICA CHE ESSO SIA UN NUMERO
      				lblctxt1.setVisible(true);
      				lblctxt1.setText("attenzione, inserire un numero"); 
          			return;
          		}
      			 
      				//CONTROLLO REGEX DATA DI SCADENZA
  				if ( ! data3.getText().matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")) {    
  	      			lblcdata3.setVisible(true);
  	      			lblcdata3.setText("attenzione, inserire una data valida"); 
  	      			return;
  	      		}
  				
  				if ( ! txtidprodotto.getText().matches("[F][A][0-9][0-9][0-9][0-9][0-9][0-9]")) {  //CONTROLLO INPUT PER ID PRODOTTO
      				lblcidprodotto.setVisible(true);          				
      				lblcidprodotto.setText("attenzione, i caratteri devono essere 8"); 
          			return;
          		}
  				
      			try {

      				 //IF CHE CONTROLLA SE LA FUNZIONE RESTITUISCE TRUE(OSSIA SE L'INSERIMENTO è ANDATO A BUON FINE)
					if(TheController.getFarinaceidao().InsertFarinacei(txtnome.getText().toString(),txtmarca.getText().toString(),Float.valueOf(txtprezzo.getText().toString()), 
							datachooser.getText().toString() ,Integer.valueOf( txt1.getText().toString()), txt2.getText().toString(),   data3.getText().toString(),txtidprodotto.getText().toString(),
							Integer.valueOf(txtdisponibilitatotale.getText().toString()), PanelMagazzino.this)) {
					
							txtidprodotto.setText("");             //RESET CAMPI PER IL PROSSIMO INSERIMENTO
							txtnome.setText("");
							txtmarca.setText("");
							txtdisponibilitatotale.setText("");
							txtprezzo.setText("");
							txt1.setText("");
							txt2.setText("");
							datachooser.setText("");
							data1.setText("");
							data2.setText("");
							data3.setText("");
					 
							TheController.prodottisuccesful();
					}
					
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
          	}
      		else if(comboBox.getSelectedItem().toString().equals("Confezionati")) {
      			
      			if ( ! txt1.getText().matches("[0-9]+")) {    //CONTROLLO INPUT PER PESO, SI VERIFICA CHE ESSO SIA UN NUMERO
      				lblctxt1.setVisible(true);
      				lblctxt1.setText("attenzione, inserire un numero"); 
          			return;
          		}
      			 
      																	//CONTROLLO REGEX DATA DI SCADENZA
  				if ( ! data3.getText().matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")) {    
  	      			lblcdata3.setVisible(true);
  	      			lblcdata3.setText("attenzione, inserire una data valida"); 
  	      			return;
  	      		}
  				
  				if ( ! txtidprodotto.getText().matches("[C][O][0-9][0-9][0-9][0-9][0-9][0-9]")) {  //CONTROLLO INPUT PER ID PRODOTTO
      				lblcidprodotto.setVisible(true);          				
      				lblcidprodotto.setText("attenzione, i caratteri devono essere 8"); 
          			return;
          		}
  				
      			try {
      				 //IF CHE CONTROLLA SE LA FUNZIONE RESTITUISCE TRUE(OSSIA SE L'INSERIMENTO è ANDATO A BUON FINE)
					if(TheController.getConfezionatidao().InsertConfezionati(txtnome.getText().toString(),txtmarca.getText().toString(),Float.valueOf(txtprezzo.getText().toString()), 
							datachooser.getText().toString() ,Integer.valueOf( txt1.getText().toString()), txt2.getText().toString(),   data3.getText().toString(),txtidprodotto.getText().toString(),
							Integer.valueOf(txtdisponibilitatotale.getText().toString()), PanelMagazzino.this)) {
						
							txtidprodotto.setText("");
							txtnome.setText("");
							txtmarca.setText("");
							txtdisponibilitatotale.setText("");
							txtprezzo.setText("");
							txt1.setText("");
							txt2.setText("");
							datachooser.setText("");
							data1.setText("");
							data2.setText("");
							data3.setText("");
					 
							TheController.prodottisuccesful();
					}
				}  catch (Throwable e1) {
					
					e1.printStackTrace();
				}
      			
          	}
      		else if(comboBox.getSelectedItem().toString().equals("Latticini")) {
      										//CONTROLLO REGEX DATA DI MUNGITURA
      				if ( ! data1.getText().matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")) {    
      					 lblcdata1.setVisible(true);
      					 lblcdata1.setText("attenzione, inserire una data valida"); 
      					 return;
      				}
      										//CONTROLLO REGEX DATA DI PRODUZIONE
      				if ( ! data2.getText().matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")) {    
     					 lblcdata2.setVisible(true);     					
     					 lblcdata2.setText("attenzione, inserire una data valida"); 
     					 return;
     				}
      				
      				if ( ! txt3.getText().matches("[0-9]+")) {  //CONTROLLO INPUT PER PESO, SI VERIFICA CHE ESSO SIA UN NUMERO
          				lblctxt3.setVisible(true);
          				System.out.println( txt3.getText());
          				lblctxt3.setText("attenzione, inserire un numero"); 
              			return;
              		}
      				if ( ! txtidprodotto.getText().matches("[L][A][0-9][0-9][0-9][0-9][0-9][0-9]")) {  //CONTROLLO INPUT PER ID PRODOTTO
          				lblcidprodotto.setVisible(true);          				
          				lblcidprodotto.setText("attenzione, i caratteri devono essere 8"); 
              			return;
              		}
      				
      				
      				System.out.println( txtnome.getText());
      				System.out.println( txtmarca.getText());
      				System.out.println( txtprezzo.getText());
      				System.out.println( txtdisponibilitatotale.getText());
      				System.out.println( datachooser.getText());
      				System.out.println( txtidprodotto.getText());
      				
      			try {
      				 //IF CHE CONTROLLA SE LA FUNZIONE RESTITUISCE TRUE(OSSIA SE L'INSERIMENTO è ANDATO A BUON FINE)
					if(TheController.getLatticinidao().InsertLatticini(txtnome.getText().toString(),txtmarca.getText().toString(),Float.valueOf(txtprezzo.getText().toString()), 
							datachooser.getText().toString() ,Integer.valueOf( txt3.getText().toString()), data1.getText().toString(),  data2.getText().toString(),txtidprodotto.getText().toString(),
							Integer.valueOf(txtdisponibilitatotale.getText().toString()),PanelMagazzino.this)) {
								txtidprodotto.setText("");
								txtnome.setText("");
								txtmarca.setText("");
								txtdisponibilitatotale.setText("");
								txtprezzo.setText("");
								txt3.setText("");
								txt2.setText("");
								datachooser.setText("");
								data1.setText("");
								data2.setText("");
								data3.setText("");
					 
								TheController.prodottisuccesful();
					}
				}  catch (Throwable e1) {
					
					e1.printStackTrace();
				}
          	}
      		else if(comboBox.getSelectedItem().toString().equals("Uova")) {
      			
      			                                                      //CONTROLLO INPUT DATA  DI DEPOSIZIONE
      			if ( ! data1.getText().matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")) {    
					 lblcdata1.setVisible(true);
					 lblcdata1.setText("attenzione, inserire una data valida"); 
					 return;
				}
      			
      			if ( ! txt3.getText().matches("[0-9]+")) {    //CONTROLLO INPUT PER QUANTITA, SI VERIFICA CHE ESSO SIA UN NUMERO
      				lblctxt3.setVisible(true);
      				lblctxt3.setText("attenzione, inserire un numero"); 
          			return;
          		}

      			try {
      				 //IF CHE CONTROLLA SE LA FUNZIONE RESTITUISCE TRUE(OSSIA SE L'INSERIMENTO è ANDATO A BUON FINE)
					if(TheController.getUovadao().InsertUova(txtnome.getText().toString(),txtmarca.getText().toString(),Float.valueOf(txtprezzo.getText().toString()), 
							datachooser.getText().toString() ,Integer.valueOf( txt3.getText().toString()), data1.getText().toString(),txt2.getText().toString(), txtidprodotto.getText().toString(),
							Integer.valueOf(txtdisponibilitatotale.getText().toString()),PanelMagazzino.this)) {
					
							txtidprodotto.setText("");
							txtnome.setText("");
							txtmarca.setText("");
							txtdisponibilitatotale.setText("");
							txtprezzo.setText("");
							txt1.setText("");
							txt2.setText("");
							datachooser.setText("");
							data1.setText("");
							data2.setText("");
							data3.setText("");
					 
							TheController.prodottisuccesful();
					}
				}  catch (Exception e1) {
					
					e1.printStackTrace();
				}
      			
          	}
      }
      	});
      panel_1.setBounds(529, 335, 67, 41);
      add(panel_1);
      panel_1.setLayout(null);
      
      JLabel lblaggiungi = new JLabel("\r\n");
      lblaggiungi.setFont(new Font("Dialog", Font.PLAIN, 11));
      lblaggiungi.setBounds(10, 0, 67, 41);
      panel_1.add(lblaggiungi);
      Image iconn= new ImageIcon(this.getClass().getResource("/add.png")).getImage();
		lblaggiungi.setIcon(new ImageIcon(iconn));
      
      JLabel lblprezzo = new JLabel("Prezzo");
      lblprezzo.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 11));
      lblprezzo.setForeground(new Color(255, 255, 255));
      lblprezzo.setBounds(434, 187, 46, 14);
      add(lblprezzo);
      
      datachooser = new JTextField();
      datachooser.addFocusListener(new FocusAdapter() {
      	@Override
      	public void focusLost(FocusEvent e) {
      		if (datachooser.getText().equals("") ) {
      			datachooser.setText("dd-mm-yyyy");
      		}
      	}});
      datachooser.addMouseListener(new MouseAdapter() {
      	@Override
     	public void mouseClicked(MouseEvent e) {
      		if (datachooser.getText().equals("dd-mm-yyyy") ) {
      		datachooser.setText("");
      	}
      	}});
      datachooser.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 11));
      datachooser.setText("dd-mm-yyyy");
      datachooser.setBounds(108, 185, 86, 20);
      add(datachooser);
      datachooser.setColumns(10);
      
      data1 = new JTextField();
      data1.addFocusListener(new FocusAdapter() {
      	@Override
      	public void focusLost(FocusEvent e) {
      		if (data1.getText().equals("") ) {
      			data1.setText("dd-mm-yyyy");
      		}
      	}
      });
      data1.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		if (data1.getText().equals("dd-mm-yyyy") ) {
      		data1.setText("");
      	}
      	}});
      data1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 11));
      data1.setText("dd-mm-yyyy");
      data1.setBounds(302, 249, 86, 20);
      add(data1);
      data1.setColumns(10);
      
      data2 = new JTextField();
      data2.addFocusListener(new FocusAdapter() {
      	@Override
    	public void focusLost(FocusEvent e) {
      		if (data2.getText().equals("") ) {
      			data2.setText("dd-mm-yyyy");
      		}
      	}
      });
      data2.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		if (data2.getText().equals("dd-mm-yyyy") ) {
      		data2.setText("");
      	}
      	}});
      data2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 11));
      data2.setText("dd-mm-yyyy");
      data2.setColumns(10);
      data2.setBounds(302, 334, 86, 20);
      add(data2);
      
      data3 = new JTextField();
      data3.addFocusListener(new FocusAdapter() {
      	@Override
    	public void focusLost(FocusEvent e) {
      		if (data3.getText().equals("") ) {
      			data3.setText("dd-mm-yyyy");
      		}
      	}
      });
      data3.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		if (data3.getText().equals("dd-mm-yyyy") ) {
      		data3.setText("");
      	}
      	}});
      data3.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 11));
      data3.setText("dd-mm-yyyy");
      data3.setColumns(10);
      data3.setBounds(302, 427, 86, 20);
      add(data3);
      
      lblcnome = new JLabel("");
      lblcnome.setForeground(Color.RED);
      lblcnome.setFont(new Font("Dialog", Font.BOLD, 11));
      lblcnome.setBounds(209, 140, 205, 14);
      add(lblcnome);
      
      lblcmarca = new JLabel("");
      lblcmarca.setForeground(Color.RED);
      lblcmarca.setFont(new Font("Dialog", Font.BOLD, 11));
      lblcmarca.setBounds(350, 145, 241, 14);
      add(lblcmarca);
      
      lblcidprodotto = new JLabel("");
      lblcidprodotto.setForeground(Color.RED);
      lblcidprodotto.setFont(new Font("Dialog", Font.BOLD, 11));
      lblcidprodotto.setBounds(0, 145, 241, 14);
      add(lblcidprodotto);
      
      lblcdatadiscadenza = new JLabel("");
      lblcdatadiscadenza.setForeground(Color.RED);
      lblcdatadiscadenza.setFont(new Font("Dialog", Font.BOLD, 11));
      lblcdatadiscadenza.setBounds(0, 211, 194, 14);
      add(lblcdatadiscadenza);
      
       lbldisp = new JLabel("");
      lbldisp.setForeground(Color.RED);
      lbldisp.setFont(new Font("Dialog", Font.BOLD, 11));
      lbldisp.setBounds(216, 211, 225, 14);
      add(lbldisp);
      
      lblPrezzo = new JLabel("");
      lblPrezzo.setForeground(Color.RED);
      lblPrezzo.setFont(new Font("Dialog", Font.BOLD, 11));
      lblPrezzo.setBounds(393, 211, 203, 14);
      add(lblPrezzo);
      
       lblcdata1 = new JLabel("");
      lblcdata1.setForeground(Color.RED);
      lblcdata1.setFont(new Font("Dialog", Font.BOLD, 11));
      lblcdata1.setBounds(267, 280, 213, 14);
      add(lblcdata1);
      
      lblcdata2 = new JLabel("");
      lblcdata2.setForeground(Color.RED);
      lblcdata2.setFont(new Font("Dialog", Font.BOLD, 11));
      lblcdata2.setBounds(267, 365, 230, 14);
      add(lblcdata2);
      
       lblcdata3 = new JLabel("");
      lblcdata3.setForeground(Color.RED);
      lblcdata3.setFont(new Font("Dialog", Font.BOLD, 11));
      lblcdata3.setBounds(267, 447, 241, 14);
      add(lblcdata3);
      
       lblctxt1 = new JLabel("");
      lblctxt1.setForeground(Color.RED);
      lblctxt1.setFont(new Font("Dialog", Font.BOLD, 11));
      lblctxt1.setBounds(0, 280, 241, 14);
      add(lblctxt1);
      
       lblctxt2 = new JLabel("");
      lblctxt2.setForeground(Color.RED);
      lblctxt2.setFont(new Font("Dialog", Font.BOLD, 11));
      lblctxt2.setBounds(0, 362, 241, 14);
      add(lblctxt2);
      
      lblctxt3 = new JLabel("");
      lblctxt3.setForeground(Color.RED);
      lblctxt3.setFont(new Font("Dialog", Font.BOLD, 11));
      lblctxt3.setBounds(0, 454, 241, 14);
      add(lblctxt3);
      
      lblhelp = new JLabel("?");
      lblhelp.setToolTipText("Ricorda i primi due caratteri, degli otto, variano a seconda della categoria:\r\nFrutta FR  Verdura VE  Confezionati CO  Latticini LA  Farinacei FA  Uova UO");
      lblhelp.setForeground(Color.WHITE);
      lblhelp.setFont(new Font("Tahoma", Font.PLAIN, 19));
      lblhelp.setBounds(83, 114, 9, 25);
      add(lblhelp);
      
      Image iconz= new ImageIcon(this.getClass().getResource("/ricerca.png")).getImage();
      
      
      
      
    
     
	}
	 public JTextField getidprodotto() {
 		return txtidprodotto;
 	}
	 
	 public JTextField getData1() {
	 		return data1;
	 	}
	 public JTextField getData2() {
	 		return data2;
	 	}
	 public JTextField getData3() {
	 		return data3;
	 	}
	 public JTextField getTxt1() {
	 		return txt1;
	 	}
	 public JTextField getTxt2() {
	 		return txt2;
	 	}
	 public JTextField getTxt3() {
	 		return txt3;
	 	}
	 public JLabel getLbl1() {
	 		return lbl1;
	 	}
	 public JLabel getLbl2() {
	 		return lbl2;
	 	}
	 public JLabel getLbl3() {
	 		return lbl3;
	 	}
	 
	 public JLabel getLblcnome() {
	 		return lblcnome;
	 	}
	 public JLabel getLblcmarca() {
	 		return lblcmarca;
	 	}
	 public JLabel getLblcidprodotto() {
	 		return lblcidprodotto;
	 	}
	 public JLabel getLbldatadiscadenza() {
	 		return lblcdatadiscadenza;
	 	}
	 
	 public JLabel getlblcdata1() {
	 		return  lblcdata1;
	 	}
	 
	 public JLabel getlblcdata2() {
	 		return  lblcdata2;
	 	}
	 
	 public JLabel getlblcdata3() {
	 		return  lblcdata3;
	 	}
	 
	 public JLabel getlblctxt1() {
	 		return  lblctxt1;
	 	}
	 
	 public JLabel getlblctxt2() {
	 		return  lblctxt2;
	 	}
	 
	 public JLabel getlblctxt3() {
	 		return  lblctxt3;
	 	}
}
