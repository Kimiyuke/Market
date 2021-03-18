package Panels;

import javax.swing.JPanel;
import Controller.Controller;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JYearChooser;

import Classi.*;

import com.toedter.calendar.JMonthChooser;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class PanelReviewAcquisti extends JPanel {
Controller TheController;
private JTable tabella;
	
	public PanelReviewAcquisti(Controller c) {
		TheController=c;
		setBackground(new Color(45, 106, 79));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 192, 81);
		panel.setForeground(new Color(255, 255, 255));
		panel.setBorder(new MatteBorder(3, 1, 4, 1, (Color) new Color(255, 255, 255)));
		panel.setBackground(new Color(27, 67, 50));
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Review Acquisti");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(0, 8, 192, 73);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Cerca");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(474, 146, 89, 23);
		
		add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Seleziona il mese");
		lblNewLabel_1.setBounds(314, 31, 101, 23);
		lblNewLabel_1.setFont(new Font("Dialog", Font.ITALIC, 11));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Seleziona l'anno");
		lblNewLabel_2.setBounds(314, 67, 95, 14);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Dialog", Font.ITALIC, 11));
		add(lblNewLabel_2);
		
		JMonthChooser mese = new JMonthChooser();
		mese.setBounds(437, 34, 96, 20);
		add(mese);
		
		JYearChooser anno = new JYearChooser();
		anno.setBounds(447, 67, 48, 20);
		add(anno);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 191, 639, 226);
		add(scrollPane);
		
		tabella = new JTable();
		tabella.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Tess", "Punti", "Totale", "N.pzz", "N.FA", "N.FR", "N.VE", "N.UO", "N.CO", "N.LA", "Compl", "Data"
			}
		));
		scrollPane.setViewportView(tabella);
		tabella.setSelectionBackground(new Color(144, 238, 144));
	      tabella.getTableHeader().setOpaque(false);
	      tabella.getTableHeader().setBackground(new Color (116, 198, 157));
		
		
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
          DefaultTableModel model = (DefaultTableModel) tabella.getModel();
      			
      			int rowCount = model.getRowCount(); //Si tiene conto di quante righe ci fossero prima e poi le cancella tutte tramite il for
      			for (int i = rowCount - 1; i >= 0; i--) {
      			    model.removeRow(i);
      			}
      			
      			ArrayList<AcquistoTotale> acquisto = new ArrayList<AcquistoTotale>();
				try {
					acquisto=TheController.getAcquistototaledao().AcquistiPerData(mese.getMonth(), anno.getYear());
				} catch (Exception e1) {
					
				}
				for(int i = 0; i <acquisto.size();  i++){      //STAMPA DEI VALORI FETCHATI DALL'INTERROGAZIONE
					System.out.println("print");
		        	 Object[] rowdata = new Object[]{acquisto.get(i).getNId(),acquisto.get(i).getCodiceTessera(),acquisto.get(i).getTotalePunti(),acquisto.get(i).getPrezzoTotale(),acquisto.get(i).getNumProdotti(),acquisto.get(i).getNumProdottiFarinacei(),acquisto.get(i).getNumProdottiFrutta(),acquisto.get(i).getNumProdottiVerdura(),acquisto.get(i).getNumProdottiUova(),acquisto.get(i).getNumProdottiConfenzionati(),acquisto.get(i).getNumProdottiLatticini(),acquisto.get(i).isCompletato(),acquisto.get(i).getDataAcquisto()     };
		        	 model.addRow(rowdata);
			}
				
			}
		});
		
		

	}
}