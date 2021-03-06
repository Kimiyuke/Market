package Panels;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Classi.Cliente;
import net.proteanit.sql.DbUtils;
import Controller.Controller;
import DAOS.ClienteDAO;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import net.proteanit.sql.DbUtils;
import net.proteanit.sql.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel; 
public class PanelClienti extends JPanel {
	public static JTable tabella;
	Controller TheController;
	
	/**
	 * Create the panel.
	 */
	public PanelClienti(Controller c) {
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
      
      JLabel lblNewLabel = new JLabel("Ricerca Clienti");
      lblNewLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
      lblNewLabel.setForeground(new Color(255, 255, 255));
      lblNewLabel.setBounds(25, 11, 152, 62);
      panel.add(lblNewLabel);
      
      JLabel lblNewLabel_1 = new JLabel("Selezionare metodo di ricerca");
      lblNewLabel_1.setFont(new Font("Dialog", Font.ITALIC, 11));
      lblNewLabel_1.setForeground(new Color(255, 255, 255));
      lblNewLabel_1.setBounds(251, 22, 193, 23);
      add(lblNewLabel_1);
      
      JLabel lblcategoria = new JLabel("Selezionare categoria richiesta");
      lblcategoria.setForeground(new Color(255, 255, 255));
      lblcategoria.setFont(new Font("Dialog", Font.ITALIC, 11));
      lblcategoria.setBounds(251, 64, 215, 14);
      add(lblcategoria);
      
      JButton btncerca = new JButton("Cerca");
      btncerca.setBackground(new Color(165, 42, 42));
      btncerca.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent arg0) {
      	}
      });
      
      JComboBox ComboBox2 = new JComboBox();
      ComboBox2.setModel(new DefaultComboBoxModel(new String[] {"Frutta", "Verdura", "Farinacei", "Confezionati", "Latticini", "Uova"}));
      ComboBox2.setBounds(433, 61, 51, 22);
      add(ComboBox2);
      
      JLabel lblNewLabel_3 = new JLabel("ICON\r\n");
      lblNewLabel_3.setBounds(511, 110, 51, 41);
      add(lblNewLabel_3);
      
      JComboBox ComboBox1 = new JComboBox();
      ComboBox1.setModel(new DefaultComboBoxModel(new String[] {"Punti", "Pezzi acquistati"}));
      ComboBox1.setBounds(433, 23, 51, 22);
      add(ComboBox1);
      
      JScrollPane scrollPane = new JScrollPane();
      scrollPane.setBounds(0, 215, 643, 286);
      add(scrollPane);
      
      tabella = new JTable();
      tabella.setModel(new DefaultTableModel(
      	new Object[][] {
      		{null, null, null, null},
      	},
      	new String[] {
      		"Nome", "Cognome", "CodiceTessera", "CodiceFiscale"
      	}
      ));
      tabella.getColumnModel().getColumn(0).setResizable(false);
      scrollPane.setViewportView(tabella);
      btncerca.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		
      		{
      			DefaultTableModel model = (DefaultTableModel) tabella.getModel();
      			
      			int rowCount = model.getRowCount(); //Si tiene conto di quante righe ci fossero prima e poi le cancella tutte tramite il for
      			for (int i = rowCount - 1; i >= 0; i--) {
      			    model.removeRow(i);
      			}
      			
      			ArrayList<Cliente> cliente = new ArrayList<Cliente>();
      			
      			if ((ComboBox1.getSelectedItem().toString().equals("Punti")) && ((ComboBox2.getSelectedItem().toString().equals("Frutta")))) {
      				
      				cliente= TheController.getClientidao().SelectClientiPerPuntiFrutta();
                }


      			else if ((ComboBox1.getSelectedItem().toString().equals("Punti")) && ((ComboBox2.getSelectedItem().toString().equals("Verdura")))) {
                    cliente= TheController.getClientidao().SelectClientiPerPuntiVerdura();
                }
      			else if((ComboBox1.getSelectedItem().toString().equals("Punti")) && ((ComboBox2.getSelectedItem().toString().equals("Confenzionati")))) {
      				TheController.getClientidao();
					cliente= ClienteDAO.SelectClientiPerPuntiConfenzionati();
      			}
      			else if((ComboBox1.getSelectedItem().toString().equals("Punti")) && ((ComboBox2.getSelectedItem().toString().equals("Uova")))) {
      				TheController.getClientidao();
					cliente= ClienteDAO.SelectClientiPerPuntiUova();
      			}
      			else if((ComboBox1.getSelectedItem().toString().equals("Punti")) && ((ComboBox2.getSelectedItem().toString().equals("Latticini")))) {
      				cliente= TheController.getClientidao().SelectClientiPerPuntiLatticini();
      			}
      			else if((ComboBox1.getSelectedItem().toString().equals("Punti")) && ((ComboBox2.getSelectedItem().toString().equals("Farinacei")))) {
      				cliente= TheController.getClientidao().SelectClientiPerPuntiFarinacei();
      			}
      			else if((ComboBox1.getSelectedItem().toString().equals("Pezzi")) && ((ComboBox2.getSelectedItem().toString().equals("Frutta")))) {
      				cliente= TheController.getClientidao().SelectClientiPerPezziFrutta();
      			}
      			else if((ComboBox1.getSelectedItem().toString().equals("Pezzi")) && ((ComboBox2.getSelectedItem().toString().equals("Verdura")))) {
      				cliente= TheController.getClientidao().SelectClientiPerPezziVerdura();
      			}
      			else if((ComboBox1.getSelectedItem().toString().equals("Pezzi")) && ((ComboBox2.getSelectedItem().toString().equals("Uova")))) {
      				cliente= TheController.getClientidao().SelectClientiPerPezziUova();
      			}
      			else if((ComboBox1.getSelectedItem().toString().equals("Pezzi")) && ((ComboBox2.getSelectedItem().toString().equals("Latticini")))) {
      				cliente= TheController.getClientidao().SelectClientiPerPezziLatticini();
      			}
      			else if((ComboBox1.getSelectedItem().toString().equals("Pezzi")) && ((ComboBox2.getSelectedItem().toString().equals("Confenzionati")))) {
      				cliente= TheController.getClientidao().SelectClientiPerPezziConfenzionati();
      			}
      			else if((ComboBox1.getSelectedItem().toString().equals("Pezzi")) && ((ComboBox2.getSelectedItem().toString().equals("Farinacei")))) {
      				cliente= TheController.getClientidao().SelectClientiPerPezziFarinacei();
      			}
      			for(int i = 0; i < cliente.size();  i++){
                 
      		        	 Object[] rowdata = new Object[]{cliente.get(i).getNome(),cliente.get(i).getCognome(),cliente.get(i).getCodiceTessera(), cliente.get(i).getCF()};
      		        	 model.addRow(rowdata);
      			}
              
      	   
      		}
      		
      	} });
      btncerca.setBounds(544, 119, 89, 23);
      add(btncerca);
      
     
      
     
      
     
	}
	
	
	public JTable gettabella () {
		return tabella;
	}
}
