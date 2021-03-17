package Panels;

import Controller.Controller;
import DAOS.MagazzinoDAO;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
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
private JTable table;
private JComboBox Combobox;
private JButton btncerca;
	 
	public PanelMagazzinoRicerca(Controller c) {
		TheController=c;
		setBackground(new Color(47, 79, 79));
		
		
		setSize(643,501);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(4, 1, 4, 1, (Color) new Color(255, 255, 255)));
		panel.setBackground(new Color(47, 79, 79));
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
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				 "Id Prodotto", "Disponibilità Totale","Nome","Marca","Prezzo"
			}
		));
		scrollPane.setViewportView(table);
		
		 Combobox = new JComboBox();
		Combobox.setModel(new DefaultComboBoxModel(new String[] {"Frutta", "Verdura", "Confezionati", "Latticini", "Farinacei", "Uova"}));
		Combobox.setBounds(517, 21, 92, 38);
		add(Combobox);
		
		 btncerca = new JButton("Cerca");
		btncerca.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
					DefaultTableModel model = (DefaultTableModel) table.getModel();
	      			
	      			int rowCount = model.getRowCount(); //Si tiene conto di quante righe ci fossero prima e poi le cancella tutte tramite il for
	      			for (int i = rowCount - 1; i >= 0; i--) {
	      			    model.removeRow(i);
	      			}
	      			
	      			ArrayList<Magazzino> magazzino = new ArrayList<Magazzino>();
	      			if ((Combobox.getSelectedItem().toString().equals("Frutta")) ) {
						magazzino= TheController.getMagazzinodao().SelectProdottiFrutta();
	                }
	      			else if ((Combobox.getSelectedItem().toString().equals("Farinacei")) ) {
	                    magazzino= TheController.getMagazzinodao().SelectProdottiFarinacei();
	                }
	      			else if ((Combobox.getSelectedItem().toString().equals("Verdura")) ) {
	                    magazzino= TheController.getMagazzinodao().SelectProdottiVerdura();
	                }
	      			else if ((Combobox.getSelectedItem().toString().equals("Confezionati")) ) {
	                    magazzino= TheController.getMagazzinodao().SelectProdottiConfezionati();
	                }
	      			else if ((Combobox.getSelectedItem().toString().equals("Latticini")) ) {
	                    magazzino= TheController.getMagazzinodao().SelectProdottiLatticini();
	                }
	      			else if ((Combobox.getSelectedItem().toString().equals("Uova")) ) {
	                    magazzino= TheController.getMagazzinodao().SelectProdottiUova();
	                }
	      			
	      			
	      			for(int i = 0; i <magazzino.size();  i++){
	                    
			        	 Object[] rowdata = new Object[]{magazzino.get(i).getIdProdotto(),magazzino.get(i).getDisponibilitaTotale(),magazzino.get(i).getNome(), magazzino.get(i).getMarca(), magazzino.get(i).getPrezzo()};
			        	 model.addRow(rowdata);
	    			}
			}
	
		
	});

		btncerca.setBounds(517, 82, 89, 23);
		add(btncerca);

		
	}
	
	public JComboBox getCombobox() {
		return this.Combobox;
		
	}
	
	public JButton getButton() {
		return this.btncerca;
	}
}