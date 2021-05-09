package Panels;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Classi.*;
import net.proteanit.sql.DbUtils;
import Controller.Controller;
import daosImpl.ClienteDAOImpl;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.util.*;
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
import javax.swing.JComponent;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer; 
public class PanelClienti extends JPanel {
	public static JTable tabella;
	Controller TheController;
	public static JTable tabellapunti;
	
	/**
	 * Create the panel.
	 */
	public PanelClienti(Controller c) {
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
      btncerca.setBackground(new Color(240, 240, 240));
      btncerca.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent arg0) {
      	}
      });
      
      JComboBox comboBox2 = new JComboBox();
      comboBox2.setModel(new DefaultComboBoxModel(new String[] {"Frutta", "Verdura", "Farinacei", "Confezionati", "Latticini", "Uova"}));
      comboBox2.setBounds(433, 61, 64, 22);
      add(comboBox2);
      comboBox2.setEditable(true);
      comboBox2.setBackground(new Color(149, 213, 178));
      comboBox2.setFont(new Font("Dialog", Font.ITALIC,13));
      
      comboBox2.setBorder(BorderFactory.createEmptyBorder());
                                                                                       
      comboBox2.setRenderer(new DefaultListCellRenderer(){          
          @Override 
          
          public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus)
          {                JComponent result = (JComponent)super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
          if (isSelected) 
              setForeground(Color.orange);

              result.setOpaque(false);
              return result;
          }});
      
      JComboBox comboBox = new JComboBox();
      comboBox.setModel(new DefaultComboBoxModel(new String[] {"Punti", "Pezzi"}));
      comboBox.setBounds(433, 23, 64, 22);
      add(comboBox);
      comboBox.setEditable(true);
      comboBox.setBackground(new Color(149, 213, 178));
      comboBox.setFont(new Font("Dialog", Font.ITALIC,13));
      
      comboBox.setBorder(BorderFactory.createEmptyBorder());
                                                                                       
      comboBox.setRenderer(new DefaultListCellRenderer(){          
          @Override 
          
          public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus)
          {                JComponent result = (JComponent)super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
          if (isSelected) 
              setForeground(Color.orange);

              result.setOpaque(false);
              return result;
          }});
      
      JScrollPane scrollPane = new JScrollPane();
      scrollPane.setBounds(0, 215, 504, 286);
      add(scrollPane);
      btncerca.setBounds(544, 119, 89, 23);
      add(btncerca);
      tabella = new JTable();
      tabella.setDoubleBuffered(true);
      tabella.setDragEnabled(true);
      tabella.setCellSelectionEnabled(true);
      tabella.setColumnSelectionAllowed(true);
      tabella.setFocusTraversalPolicyProvider(true);
      tabella.setSelectionBackground(new Color(144, 238, 144));
      tabella.getTableHeader().setOpaque(false);
      tabella.getTableHeader().setBackground(new Color (116, 198, 157));
      tabella.setFont(new Font("Dialog", Font.ITALIC, 12));
     
      tabella.setRowSelectionAllowed(true);
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
      
      JScrollPane scrollPane_1 = new JScrollPane();
      scrollPane_1.setBounds(501, 215, 142, 286);
      add(scrollPane_1);
      
      tabellapunti = new JTable();
      tabellapunti.getTableHeader().setOpaque(false);
      tabellapunti.getTableHeader().setBackground(new Color (116, 198, 157));
      tabellapunti.setFont(new Font("Dialog", Font.ITALIC, 12));
     
      tabellapunti.setModel(new DefaultTableModel(
      	new Object[][] {
      		{null, null},
      	},
      	new String[] {
      		"Punti", "N.pezzi"
      	}
      ));
      scrollPane_1.setViewportView(tabellapunti);
      
      btncerca.addMouseListener(new MouseAdapter() {
      	
      	public void mouseClicked(MouseEvent e) {
      		
      		{
      			DefaultTableModel model = (DefaultTableModel) tabella.getModel();
      			DefaultTableModel modell = (DefaultTableModel) tabellapunti.getModel();
      			
      			int rowCount = model.getRowCount(); //Si tiene conto di quante righe ci fossero prima e poi le cancella tutte tramite il for
      			for (int i = rowCount - 1; i >= 0; i--) {
      			    model.removeRow(i);
      			}
      			
      			int rowCountt = modell.getRowCount(); //Cancella righe per la tabella dei punti
      			for (int i = rowCount - 1; i >= 0; i--) {
      			    modell.removeRow(i);
      			}
      			
      			
      			ArrayList<TesseraPunti> tessera = new ArrayList<TesseraPunti>();
      			ArrayList<Cliente> cliente = new ArrayList<Cliente>();
      			
      			if ((comboBox.getSelectedItem().toString().equals("Punti")) && ((comboBox2.getSelectedItem().toString().equals("Frutta")))) {
                    cliente= TheController.getClientidao().SelectClientiPerPuntiFrutta(); //METODO PER RIEMPIRE LA PRIMA TABELLA MOSTRANDO IN MODO DECRESCENTE I CLIENTI CHE HANNO PIU PUNTI DELLA CATEGORIA SCELTA
                    try {                                                  
						tessera=TheController.getTesserapuntidao().SelectPuntiFrutta();        //METODO PER RIEMPIRE LA SECONDA TABELLA PER MOSTRARE PUNTI E N_PEZZI PER LA CATEGORIA FRUTTA
					} 	catch (Exception e1) {
						
							e1.printStackTrace();
						}
                    		for(int i = 0; i <tessera.size();  i++){
                        
                    				Object[] rowdata = new Object[]{tessera.get(i).getPuntiFrutta(), tessera.get(i).getNPezziFrutta()};
                    				modell.addRow(rowdata);
                    		}
      			}


      			else if ((comboBox.getSelectedItem().toString().equals("Punti")) && ((comboBox2.getSelectedItem().toString().equals("Verdura")))) {
                    cliente= TheController.getClientidao().SelectClientiPerPuntiVerdura(); //METODO PER RIEMPIRE LA PRIMA TABELLA MOSTRANDO IN MODO DECRESCENTE I CLIENTI CHE HANNO PIU PUNTI DELLA CATEGORIA SCELTA
                    try {                                                  
						tessera=TheController.getTesserapuntidao().SelectPuntiVerdura();        //METODO PER RIEMPIRE LA SECONDA TABELLA PER MOSTRARE PUNTI E N_PEZZI PER LA CATEGORIA VERDURA
					} 	catch (Exception e1) {
						
							e1.printStackTrace();
						}
                    		for(int i = 0; i <tessera.size();  i++){
                        
                    				Object[] rowdata = new Object[]{tessera.get(i).getPuntiVerdura(), tessera.get(i).getNPezziVerdura()};
                    				modell.addRow(rowdata);
                    		}
                }
      			else if((comboBox.getSelectedItem().toString().equals("Punti")) && ((comboBox2.getSelectedItem().toString().equals("Confezionati")))) {
      				
					cliente= TheController.getClientidao().SelectClientiPerPuntiConfezionati();//METODO PER RIEMPIRE LA PRIMA TABELLA MOSTRANDO IN MODO DECRESCENTE I CLIENTI CHE HANNO PIU PUNTI DELLA CATEGORIA SCELTA
					 try {                                                  
							tessera=TheController.getTesserapuntidao().SelectPuntiConfezionati();        //METODO PER RIEMPIRE LA SECONDA TABELLA PER MOSTRARE PUNTI E N_PEZZI PER LA CATEGORIA CONFEZIONATI
						} 	catch (Exception e1) {
							
								e1.printStackTrace();
							}
	                    		for(int i = 0; i <tessera.size();  i++){
	                        
	                    				Object[] rowdata = new Object[]{tessera.get(i).getPuntiConfenzionati(), tessera.get(i).getNPezziConfenzionati()};
	                    				modell.addRow(rowdata);
	                    		}
      			}
      			else if((comboBox.getSelectedItem().toString().equals("Punti")) && ((comboBox2.getSelectedItem().toString().equals("Uova")))) {
      				
					cliente= TheController.getClientidao().SelectClientiPerPuntiUova();//METODO PER RIEMPIRE LA PRIMA TABELLA MOSTRANDO IN MODO DECRESCENTE I CLIENTI CHE HANNO PIU PUNTI DELLA CATEGORIA SCELTA
					 try {                                                  
							tessera=TheController.getTesserapuntidao().SelectPuntiUova();        //METODO PER RIEMPIRE LA SECONDA TABELLA PER MOSTRARE PUNTI E N_PEZZI PER LA CATEGORIA UOVA
						} 	catch (Exception e1) {
							
								e1.printStackTrace();
							}
	                    		for(int i = 0; i <tessera.size();  i++){
	                        
	                    				Object[] rowdata = new Object[]{tessera.get(i).getPuntiUova(), tessera.get(i).getNPezziUova()};
	                    				modell.addRow(rowdata);
	                    		}
      			  }
      			else if((comboBox.getSelectedItem().toString().equals("Punti")) && ((comboBox2.getSelectedItem().toString().equals("Latticini")))) {
      				cliente= TheController.getClientidao().SelectClientiPerPuntiLatticini(); //METODO PER RIEMPIRE LA PRIMA TABELLA MOSTRANDO IN MODO DECRESCENTE I CLIENTI CHE HANNO PIU PUNTI DELLA CATEGORIA SCELTA
      				 try {                                                  
							tessera=TheController.getTesserapuntidao().SelectPuntiLatticini();        //METODO PER RIEMPIRE LA SECONDA TABELLA PER MOSTRARE PUNTI E N_PEZZI PER LA CATEGORIA LATTICINI
						} 	catch (Exception e1) {
							
								e1.printStackTrace();
							}
	                    		for(int i = 0; i <tessera.size();  i++){
	                        
	                    				Object[] rowdata = new Object[]{tessera.get(i).getPuntiLatticini(), tessera.get(i).getNPezziLatticini()};
	                    				modell.addRow(rowdata);
	                    		}
      			}
      			else if((comboBox.getSelectedItem().toString().equals("Punti")) && ((comboBox2.getSelectedItem().toString().equals("Farinacei")))) {
      				cliente= TheController.getClientidao().SelectClientiPerPuntiFarinacei();   //METODO PER RIEMPIRE LA PRIMA TABELLA MOSTRANDO IN MODO DECRESCENTE I CLIENTI CHE HANNO PIU PUNTI DELLA CATEGORIA SCELTA
      				
      				 try {                                                  
							tessera=TheController.getTesserapuntidao().SelectPuntiFarinacei();        //METODO PER RIEMPIRE LA SECONDA TABELLA PER MOSTRARE PUNTI E N_PEZZI PER LA CATEGORIA FARINACEI
						} 	catch (Exception e1) {
							
								e1.printStackTrace();
							}
	                    		for(int i = 0; i <tessera.size();  i++){
	                        
	                    				Object[] rowdata = new Object[]{tessera.get(i).getPuntiFarinacei(), tessera.get(i).getNPezziFarinacei()};
	                    				modell.addRow(rowdata);
	                    		}
      			}
      			
      			
      			else if((comboBox.getSelectedItem().toString().equals("Pezzi")) && ((comboBox2.getSelectedItem().toString().equals("Frutta")))) {
      				cliente= TheController.getClientidao().SelectClientiPerPezziFrutta();    //METODO PER RIEMPIRE LA PRIMA TABELLA MOSTRANDO IN MODO DECRESCENTE I CLIENTI CHE HANNO COMPRATO PIU PEZZI DELLA CATEGORIA SCELTA
      				
      				try {                                                  
						tessera=TheController.getTesserapuntidao().SelectPezziFrutta();        //METODO PER RIEMPIRE LA SECONDA TABELLA PER MOSTRARE PUNTI E N_PEZZI PER LA CATEGORIA FRUTTA
					} 	catch (Exception e1) {
						
							e1.printStackTrace();
						}
                    		for(int i = 0; i <tessera.size();  i++){
                        
                    				Object[] rowdata = new Object[]{tessera.get(i).getPuntiFrutta(), tessera.get(i).getNPezziFrutta()};
                    				modell.addRow(rowdata);
                    		}
      			}
      			else if((comboBox.getSelectedItem().toString().equals("Pezzi")) && ((comboBox2.getSelectedItem().toString().equals("Verdura")))) {
      				cliente= TheController.getClientidao().SelectClientiPerPezziVerdura();     //METODO PER RIEMPIRE LA PRIMA TABELLA MOSTRANDO IN MODO DECRESCENTE I CLIENTI CHE HANNO COMPRATO PIU PEZZI DELLA CATEGORIA SCELTA
      				
      				try {                                                  
						tessera=TheController.getTesserapuntidao().SelectPezziVerdura();        //METODO PER RIEMPIRE LA SECONDA TABELLA PER MOSTRARE PUNTI E N_PEZZI PER LA CATEGORIA VERDURA
					} 	catch (Exception e1) {
						
							e1.printStackTrace();
						}
                    		for(int i = 0; i <tessera.size();  i++){
                        
                    				Object[] rowdata = new Object[]{tessera.get(i).getPuntiVerdura(), tessera.get(i).getNPezziVerdura()};
                    				modell.addRow(rowdata);
                    		}
      			}
      			else if((comboBox.getSelectedItem().toString().equals("Pezzi")) && ((comboBox2.getSelectedItem().toString().equals("Uova")))) {
      				cliente= TheController.getClientidao().SelectClientiPerPezziUova();        //METODO PER RIEMPIRE LA PRIMA TABELLA MOSTRANDO IN MODO DECRESCENTE I CLIENTI CHE HANNO COMPRATO PIU PEZZI DELLA CATEGORIA SCELTA
      				

      				try {                                                  
						tessera=TheController.getTesserapuntidao().SelectPezziUova();        //METODO PER RIEMPIRE LA SECONDA TABELLA PER MOSTRARE PUNTI E N_PEZZI PER LA CATEGORIA UOVA
					} 	catch (Exception e1) {
						
							e1.printStackTrace();
						}
                    		for(int i = 0; i <tessera.size();  i++){
                        
                    				Object[] rowdata = new Object[]{tessera.get(i).getPuntiUova(), tessera.get(i).getNPezziUova()};
                    				modell.addRow(rowdata);
                    		}
      			}
      			else if((comboBox.getSelectedItem().toString().equals("Pezzi")) && ((comboBox2.getSelectedItem().toString().equals("Latticini")))) {
      				cliente= TheController.getClientidao().SelectClientiPerPezziLatticini();        //METODO PER RIEMPIRE LA PRIMA TABELLA MOSTRANDO IN MODO DECRESCENTE I CLIENTI CHE HANNO COMPRATO PIU PEZZI DELLA CATEGORIA SCELTA
      				
      				try {                                                  
						tessera=TheController.getTesserapuntidao().SelectPezziLatticini();        //METODO PER RIEMPIRE LA SECONDA TABELLA PER MOSTRARE PUNTI E N_PEZZI PER LA CATEGORIA LATTICINI
					} 	catch (Exception e1) {
						
							e1.printStackTrace();
						}
                    		for(int i = 0; i <tessera.size();  i++){
                        
                    				Object[] rowdata = new Object[]{tessera.get(i).getPuntiLatticini(), tessera.get(i).getNPezziLatticini()};
                    				modell.addRow(rowdata);
                    		}
      			}
      			else if((comboBox.getSelectedItem().toString().equals("Pezzi")) && ((comboBox2.getSelectedItem().toString().equals("Confezionati")))) {
      				cliente= TheController.getClientidao().SelectClientiPerPezziConfezionati();        //METODO PER RIEMPIRE LA PRIMA TABELLA MOSTRANDO IN MODO DECRESCENTE I CLIENTI CHE HANNO COMPRATO PIU PEZZI DELLA CATEGORIA SCELTA
      				
      				try {                                                  
						tessera=TheController.getTesserapuntidao().SelectPezziConfezionati();        //METODO PER RIEMPIRE LA SECONDA TABELLA PER MOSTRARE PUNTI E N_PEZZI PER LA CATEGORIA CONFEZIONATI 
					} 	catch (Exception e1) {
						
							e1.printStackTrace();
						}
                    		for(int i = 0; i <tessera.size();  i++){
                        
                    				Object[] rowdata = new Object[]{tessera.get(i).getPuntiConfenzionati(), tessera.get(i).getNPezziConfenzionati()};
                    				modell.addRow(rowdata);
                    		}
      			}
      			else if((comboBox.getSelectedItem().toString().equals("Pezzi")) && ((comboBox2.getSelectedItem().toString().equals("Farinacei")))) {
      				cliente= TheController.getClientidao().SelectClientiPerPezziFarinacei();      //METODO PER RIEMPIRE LA PRIMA TABELLA MOSTRANDO IN MODO DECRESCENTE I CLIENTI CHE HANNO COMPRATO PIU PEZZI DELLA CATEGORIA SCELTA
      				
      				try {                                                  
						tessera=TheController.getTesserapuntidao().SelectPezziFarinacei();        //METODO PER RIEMPIRE LA SECONDA TABELLA PER MOSTRARE PUNTI E N_PEZZI PER LA CATEGORIA FARINACEI
					} 	catch (Exception e1) {
						
							e1.printStackTrace();
						}
                    		for(int i = 0; i <tessera.size();  i++){
                        
                    				Object[] rowdata = new Object[]{tessera.get(i).getPuntiFarinacei(), tessera.get(i).getNPezziFarinacei()};
                    				modell.addRow(rowdata);
                    		}
      			}
      			
      			for(int i = 0; i <cliente.size();  i++){                       //FETCH PER RIEMPIRE LA TABELLA CLIENTI
                    
		        	 Object[] rowdata = new Object[]{cliente.get(i).getNome(),cliente.get(i).getCognome(),cliente.get(i).getCodiceTessera(), cliente.get(i).getCF()};
		        	 model.addRow(rowdata);
			}
      	   
      		}
      		
      	} });
     
      
     
      
     
      
     
	}
	
	
	public JTable gettabella () {
		return tabella;
	}
}
