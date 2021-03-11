package Panels;

import javax.swing.JPanel;
import Controller.Controller;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
public class PanelAcquisti extends JPanel {
Controller TheController;
	
	public PanelAcquisti(Controller c) {
		setBackground(new Color(47, 79, 79));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBorder(new MatteBorder(3, 1, 4, 1, (Color) new Color(255, 255, 255)));
		panel.setBackground(new Color(47, 79, 79));
		panel.setBounds(0, 0, 192, 81);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Review Acquisti");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(0, 8, 192, 73);
		panel.add(lblNewLabel);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerDateModel(new Date(1615330800000L), null, null, Calendar.DAY_OF_YEAR));
		spinner.setBounds(281, 43, 115, 20);
		add(spinner);
		TheController=c;

	}
}
