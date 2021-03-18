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
import javax.swing.DefaultComboBoxModel;
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
	/**
	 * Create the panel.
	 */
	public PanelMagazzino(Controller c) {
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
      
      JLabel lblNewLabel = new JLabel("Aggiunta Prodotti");
      lblNewLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
      lblNewLabel.setForeground(new Color(255, 255, 255));
      lblNewLabel.setBounds(10, 11, 206, 62);
      panel.add(lblNewLabel);
      
      JLabel lblNewLabel_1 = new JLabel("Seleziona categoria");
      lblNewLabel_1.setFont(new Font("Dialog", Font.ITALIC, 15));
      lblNewLabel_1.setForeground(Color.WHITE);
      lblNewLabel_1.setBounds(216, 30, 164, 25);
      add(lblNewLabel_1);
      
      
      
      //IF PER LE COMBOBOX
      JComboBox comboBox = new JComboBox();
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
      comboBox.setBounds(367, 33, 68, 22);
      add(comboBox);
      
      JLabel lblidprodotto = new JLabel("Id Prodotto");
      lblidprodotto.setForeground(Color.WHITE);
      lblidprodotto.setFont(new Font("Dialog", Font.ITALIC, 11));
      lblidprodotto.setBounds(10, 120, 63, 14);
      add(lblidprodotto);
      
      txtidprodotto = new JTextField();
      txtidprodotto.setBounds(83, 117, 86, 20);
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
      
      JLabel lblmarca = new JLabel("Marca");
      lblmarca.setFont(new Font("Dialog", Font.ITALIC, 11));
      lblmarca.setForeground(Color.WHITE);
      lblmarca.setBounds(393, 120, 63, 14);
      add(lblmarca);
      
      txtmarca = new JTextField();
      txtmarca.setBounds(459, 115, 86, 25);
      add(txtmarca);
      txtmarca.setColumns(10);
      
      JLabel lbldatadiscadenza = new JLabel("Data Di Scadenza");
      lbldatadiscadenza.setFont(new Font("Dialog", Font.ITALIC, 11));
      lbldatadiscadenza.setForeground(Color.WHITE);
      lbldatadiscadenza.setBounds(3, 187, 93, 14);
      add(lbldatadiscadenza);
      
      JLabel lbldisponibilitatotale = new JLabel("Disponibilit\u00E0 totale");
      lbldisponibilitatotale.setFont(new Font("Dialog", Font.ITALIC, 11));
      lbldisponibilitatotale.setForeground(Color.WHITE);
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
      lbl1.setFont(new Font("Dialog", Font.ITALIC, 12));
      lbl1.setBounds(0, 251, 119, 14);
      add(lbl1);
      
      lbl2 = new JLabel(" a");
      lbl2.setForeground(new Color(255, 255, 255));
      lbl2.setFont(new Font("Dialog", Font.ITALIC, 11));
      lbl2.setBounds(0, 335, 119, 17);
      add(lbl2);
      
      lbl3 = new JLabel("a");
      lbl3.setForeground(new Color(255, 255, 255));
      lbl3.setFont(new Font("Dialog", Font.ITALIC, 11));
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
      panel_1.setBackground(new Color(27, 67, 50));
      panel_1.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		
      		if(comboBox.getSelectedItem().toString().equals("Frutta")){
      			try {	
					TheController.getFruttadao().InsertFrutta(txtnome.getText().toString(),txtmarca.getText().toString(),Float.valueOf(txtprezzo.getText()), 
											datachooser.getText().toString() , data1.getText().toString(),txtidprodotto.getText().toString(),
											Integer.valueOf(txtdisponibilitatotale.getText().toString()));
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
				 
				 
				 
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
      		}
      		else if(comboBox.getSelectedItem().toString().equals("Verdura")) {
      			try {
					TheController.getVerduradao().InsertVerdura(txtnome.getText().toString(),txtmarca.getText().toString(),Float.valueOf(txtprezzo.getText().toString()), 
							datachooser.getText().toString() , data1.getText().toString(),txtidprodotto.getText().toString(),
							Integer.valueOf(txtdisponibilitatotale.getText().toString()));
					
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
					
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
      	}
      		else if(comboBox.getSelectedItem().toString().equals("Farinacei")) {
      			try {
					TheController.getFarinaceidao().InsertFarinacei(txtnome.getText().toString(),txtmarca.getText().toString(),Float.valueOf(txtprezzo.getText().toString()), 
							datachooser.getText().toString() ,Integer.valueOf( txt1.getText().toString()), txt2.getText().toString(),   data3.getText().toString(),txtidprodotto.getText().toString(),
							Integer.valueOf(txtdisponibilitatotale.getText().toString()));
					
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
					
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
          	}
      		else if(comboBox.getSelectedItem().toString().equals("Confezionati")) {
      			try {
					TheController.getConfezionatidao().InsertConfezionati(txtnome.getText().toString(),txtmarca.getText().toString(),Float.valueOf(txtprezzo.getText().toString()), 
							datachooser.getText().toString() ,Integer.valueOf( txt1.getText().toString()), txt2.getText().toString(),   data3.getText().toString(),txtidprodotto.getText().toString(),
							Integer.valueOf(txtdisponibilitatotale.getText().toString()));
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
					 
				}  catch (Throwable e1) {
					
					e1.printStackTrace();
				}
      			
          	}
      		else if(comboBox.getSelectedItem().toString().equals("Latticini")) {
      			try {
					TheController.getLatticinidao().InsertLatticini(txtnome.getText().toString(),txtmarca.getText().toString(),Float.valueOf(txtprezzo.getText().toString()), 
							datachooser.getText().toString() ,Integer.valueOf( txt1.getText().toString()), data1.getText().toString(),   data2.getText().toString(),txtidprodotto.getText().toString(),
							Integer.valueOf(txtdisponibilitatotale.getText().toString()));
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
					 
				}  catch (Throwable e1) {
					
					e1.printStackTrace();
				}
          	}
      		else if(comboBox.getSelectedItem().toString().equals("Uova")) {
      			try {
					TheController.getUovadao().InsertUova(txtnome.getText().toString(),txtmarca.getText().toString(),Float.valueOf(txtprezzo.getText().toString()), 
							datachooser.getText().toString() ,Integer.valueOf( txt3.getText().toString()), data1.getText().toString(),txt2.getText().toString(), txtidprodotto.getText().toString(),
							Integer.valueOf(txtdisponibilitatotale.getText().toString()));
					
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
					 
				}  catch (Exception e1) {
					
					e1.printStackTrace();
				}
      			
          	}
      }
      	});
      panel_1.setBounds(566, 310, 67, 41);
      add(panel_1);
      panel_1.setLayout(null);
      
      JLabel lblaggiungi = new JLabel("\r\n");
      lblaggiungi.setFont(new Font("Dialog", Font.PLAIN, 11));
      lblaggiungi.setBounds(10, 0, 67, 41);
      panel_1.add(lblaggiungi);
      Image iconn= new ImageIcon(this.getClass().getResource("/add.png")).getImage();
		lblaggiungi.setIcon(new ImageIcon(iconn));
      
      JLabel lblprezzo = new JLabel("Prezzo");
      lblprezzo.setFont(new Font("Dialog", Font.ITALIC, 11));
      lblprezzo.setForeground(Color.WHITE);
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
}
