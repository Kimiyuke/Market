package Panels;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
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
      
      JButton btnaggiungiprodotto = new JButton("Aggiungi prodotto\r\n");
      
      btnaggiungiprodotto.setBounds(0, 254, 119, 22);
      add(btnaggiungiprodotto);
      
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
      cbx.setBounds(524, 207, 109, 23);
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
      //setting iniziale prezzo totale a falso
      lbltotale1.setVisible(false);
      paneltotale.setVisible(false);
      lbltotale.setVisible(false);
      
      //setting punti acquisiti a falso
      lblpunti1.setVisible(false);
      panelpunti.setVisible(false);
      lblpunti.setVisible(false);
      
      
      //FUNZIONE PER AGGIUNGERE UN ACQUISTO DI UN SINGOLO PRODOTTO
      btnaggiungiprodotto.addMouseListener(new MouseAdapter() {
        	
        	public void mouseClicked(MouseEvent e) {
        	if(cbx.isSelected()) { try {
				TheController.getAcquistodao().acquistototale(txtidprodotto.getText().toString(), Integer.valueOf(txtquantita.getText().toString()), 
						txtcodicetessera.getText().toString(), txtdata.getText().toString(), Integer.valueOf(txtidacquisto.getText().toString()));
				
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
        			catch (Exception e1) {
				
        					e1.printStackTrace();
        			}
        		
        		
        	}
        	else {
        		try {
					TheController.getAcquistodao().acquistosingolo(txtidprodotto.getText().toString(), Integer.valueOf(txtquantita.getText().toString()), 
							txtcodicetessera.getText().toString(), txtdata.getText().toString(), Integer.valueOf(txtidacquisto.getText().toString()));
					
					txtidprodotto.setText("");
					txtquantita.setText("");
					txtdata.setText("");
				
					} 
        				catch (Exception e1) {
					
        						e1.printStackTrace();
        				}
        		
        		}
        }
        	});
	}
}