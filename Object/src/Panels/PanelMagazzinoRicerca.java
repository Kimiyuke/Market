package Panels;

import Controller.Controller;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import Classi.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class PanelMagazzinoRicerca extends JPanel {

Controller TheController;
private JTable tabella;
private JComboBox comboBox;
private JButton button;
	 
	public PanelMagazzinoRicerca(Controller c) {
		TheController=c;
		setBackground(new Color(45, 106, 79));
		
		
		setSize(643,501);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(4, 1, 4, 1, (Color) new Color(255, 255, 255)));
		panel.setBackground(new Color(27, 67, 50));
		panel.setBounds(0, 0, 219, 67);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ricerca Prodotti\r\n");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 199, 56);
		panel.add(lblNewLabel);
		
		JLabel lblselezionecategoria = new JLabel("Seleziona Categoria\r\n");
		lblselezionecategoria.setFont(new Font("Dialog", Font.ITALIC, 11));
		lblselezionecategoria.setForeground(new Color(255, 255, 255));
		lblselezionecategoria.setBounds(400, 29, 103, 20);
		add(lblselezionecategoria);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 162, 643, 339);
		add(scrollPane);
		
		tabella = new JTable();
		tabella.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				 "Id Prodotto", "Disponibilità Totale","Nome","Marca","Prezzo"
			}
		));
		scrollPane.setViewportView(tabella);
		tabella.setSelectionBackground(new Color(144, 238, 144));
	      tabella.getTableHeader().setOpaque(false);
	      tabella.getTableHeader().setBackground(new Color (116, 198, 157));
	      tabella.setFont(new Font("Dialog", Font.ITALIC, 12));
		
		 comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Frutta", "Verdura", "Confezionati", "Latticini", "Farinacei", "Uova"}));
		comboBox.setBounds(517, 21, 92, 38);
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
		
		 button = new JButton("Cerca");
		 button.setFont(new Font("Dialog",Font.ITALIC,13));
		 button.setBackground(new Color(149, 213, 178));//import java.awt.Color;
		 button.setForeground(Color.BLACK);
		 button.setFocusPainted(false);
		 button.setBorderPainted(false);
		 
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
					DefaultTableModel model = (DefaultTableModel) tabella.getModel();
	      			
	      			int rowCount = model.getRowCount(); //Si tiene conto di quante righe ci fossero prima e poi le cancella tutte tramite il for
	      			for (int i = rowCount - 1; i >= 0; i--) {
	      			    model.removeRow(i);
	      			}
	      			
	      			ArrayList<Magazzino> magazzino = new ArrayList<Magazzino>();
	      			if ((comboBox.getSelectedItem().toString().equals("Frutta")) ) {
						magazzino= TheController.getMagazzinodao().SelectProdottiFrutta();
	                }
	      			else if ((comboBox.getSelectedItem().toString().equals("Farinacei")) ) {
	                    magazzino= TheController.getMagazzinodao().SelectProdottiFarinacei();
	                }
	      			else if ((comboBox.getSelectedItem().toString().equals("Verdura")) ) {
	                    magazzino= TheController.getMagazzinodao().SelectProdottiVerdura();
	                }
	      			else if ((comboBox.getSelectedItem().toString().equals("Confezionati")) ) {
	                    magazzino= TheController.getMagazzinodao().SelectProdottiConfezionati();
	                }
	      			else if ((comboBox.getSelectedItem().toString().equals("Latticini")) ) {
	                    magazzino= TheController.getMagazzinodao().SelectProdottiLatticini();
	                }
	      			else if ((comboBox.getSelectedItem().toString().equals("Uova")) ) {
	                    magazzino= TheController.getMagazzinodao().SelectProdottiUova();
	                }
	      			
	      			
	      			for(int i = 0; i <magazzino.size();  i++){
	                    
			        	 Object[] rowdata = new Object[]{magazzino.get(i).getIdProdotto(),magazzino.get(i).getDisponibilitaTotale(),magazzino.get(i).getNome(), magazzino.get(i).getMarca(), magazzino.get(i).getPrezzo()};
			        	 model.addRow(rowdata);
	    			}
			}
	
		
	});

		button.setBounds(517, 83, 89, 23);
		add(button);

		
	}
	
	public JComboBox getCombobox() {
		return this.comboBox;
		
	}
	
	public JButton getButton() {
		return this.button;
	}
}