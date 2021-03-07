package Panels;

import Controller.Controller;


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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(530, 21, 79, 37);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Frutta", "Verdura", "Farinacei", "Uova", "Confenzionati", "Latticini"}));
		add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 162, 643, 339);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				 "Id Prodotto", "Nome","Marca","DisponibilitÓ Totale"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btncerca = new JButton("Cerca");
		btncerca.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
      			
      			int rowCount = model.getRowCount(); //Si tiene conto di quante righe ci fossero prima e poi le cancella tutte tramite il for
      			for (int i = rowCount - 1; i >= 0; i--) {
      			    model.removeRow(i);
      			}
      			
      			ArrayList<Magazzino> magazzino = new ArrayList<Magazzino>();
      			if ((comboBox.getSelectedItem().toString().equals("Frutta")) ) {
                    magazzino= TheController.getMagazzinodao().SelectProdottiFrutta();
                }
      			
      			for(int i = 0; i <magazzino.size();  i++){
                    
		        	 Object[] rowdata = new Object[]{magazzino.get(i).getIdProdotto(),magazzino.get(i).getDisponibilitaTotale(),magazzino.get(i).getNome(), magazzino.get(i).getMarca()};
		        	 model.addRow(rowdata);
			}
			}
		});
		btncerca.setBounds(524, 79, 85, 21);
		btncerca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		add(btncerca);

	}
}