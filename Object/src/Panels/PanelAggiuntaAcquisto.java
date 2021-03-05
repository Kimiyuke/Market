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
public class PanelAggiuntaAcquisto extends JPanel {
	private JTextField txtidprodotto;
	private JTextField txtnome;
	private JTextField txtcodicetessera;
    Controller TheController;
    
	/**
	 * Create the panel.
	 */
	public PanelAggiuntaAcquisto (Controller c) {
		TheController=c;
		setBackground(new Color(47, 79, 79));
      setSize(643,501);
      setLayout(null);
      
      JPanel panel = new JPanel();
      panel.setBorder(new MatteBorder(4, 1, 4, 1, (Color) new Color(255, 255, 255)));
      panel.setToolTipText("");
      panel.setBackground(new Color(47, 79, 79));
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
      
      txtnome = new JTextField();
      txtnome.setBounds(257, 117, 86, 22);
      add(txtnome);
      txtnome.setColumns(10);
      
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
      lblhelp.setBounds(72, 120, 23, 41);
      add(lblhelp);
      lblhelp.setFont(new Font("Tahoma", Font.PLAIN, 19));
      lblhelp.setForeground(new Color(255, 255, 255));
      
      JPanel panel_1 = new JPanel();
      panel_1.setBounds(345, 37, 104, 20);
      add(panel_1);
      
      JLabel lblNewLabel_1 = new JLabel("Id acquisto\r\n");
      lblNewLabel_1.setForeground(new Color(255, 255, 255));
      lblNewLabel_1.setFont(new Font("Dialog", Font.ITALIC, 11));
      lblNewLabel_1.setBounds(281, 37, 76, 14);
      add(lblNewLabel_1);
      
      JButton btnNewButton = new JButton("Termina Acquisto\r\n");
      btnNewButton.setBounds(502, 249, 141, 32);
      add(btnNewButton);
      
      JPanel panel_2 = new JPanel();
      panel_2.setBounds(502, 312, 131, 32);
      add(panel_2);
      
      JLabel lblNewLabel_2 = new JLabel("Totale:");
      lblNewLabel_2.setForeground(new Color(255, 255, 255));
      lblNewLabel_2.setFont(new Font("Dialog", Font.ITALIC, 11));
      lblNewLabel_2.setBounds(427, 312, 76, 32);
      add(lblNewLabel_2);
      
      JPanel panel_3 = new JPanel();
      panel_3.setBounds(502, 355, 131, 32);
      add(panel_3);
      
      JLabel lblNewLabel_3 = new JLabel("Punti Acquisiti:");
      lblNewLabel_3.setForeground(new Color(255, 255, 255));
      lblNewLabel_3.setFont(new Font("Dialog", Font.ITALIC, 11));
      lblNewLabel_3.setBounds(402, 355, 119, 32);
      add(lblNewLabel_3);
      
      JButton btnNewButton_1 = new JButton("Aggiungi prodotto\r\n");
      btnNewButton_1.setBounds(0, 188, 119, 22);
      add(btnNewButton_1);
	}
}