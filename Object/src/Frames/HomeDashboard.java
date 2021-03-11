package Frames;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import Controller.Controller;
import Panels.PanelAggiuntaAcquisto;

import Panels.PanelClienti;
import Panels.PanelMagazzino;
import Panels.PanelMagazzinoRicerca;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.MatteBorder;


import net.proteanit.sql.DbUtils;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class HomeDashboard extends JFrame {

	private JPanel contentPane;
	  Controller TheController;
	 PanelMagazzino panelmagazzino;
	private PanelClienti panelclienti;
	private PanelAggiuntaAcquisto panelaggiuntaacquisto;
	private PanelMagazzinoRicerca panelmagazzinoricerca;
	 // Launch the application.
	  
	/*
	 
	 public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeDashboard frame = new HomeDashboard(TheController);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*
	 * Create the frame.
	 */
	public HomeDashboard(Controller controller) {
		TheController=controller;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 906, 562);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(47, 79, 79));
		panelMenu.setBounds(0, 11, 227, 501);
		contentPane.add(panelMenu);
		
		JPanel panelClienti = new JPanel();	
		panelClienti.setBounds(0, 165, 217, 49);
		panelClienti.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				 panelClienti.setBackground(new Color(112, 128, 144));
			}
		});
		panelMenu.setLayout(null);
		panelClienti.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		panelClienti.setBackground(new Color(47, 79, 79));
		panelMenu.add(panelClienti);
		panelClienti.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CLIENTI");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(68, 2, 139, 44);
		panelClienti.add(lblNewLabel);
		
		JLabel iconclienti = new JLabel("");
		iconclienti.setBounds(10, 5, 83, 41);
		panelClienti.add(iconclienti);
		Image icons= new ImageIcon(this.getClass().getResource("/Clients.png")).getImage();
		iconclienti.setIcon(new ImageIcon(icons));
		
		JPanel panelMagazzino = new JPanel();
		panelMagazzino.setBounds(0, 225, 217, 49);
		panelMagazzino.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.WHITE));
		panelMagazzino.setBackground(new Color(47, 79, 79));
		panelMenu.add(panelMagazzino);
		panelMagazzino.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("MAGAZZINO");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(78, 11, 153, 38);
		panelMagazzino.add(lblNewLabel_1);
		
		JLabel iconmagazzino = new JLabel("");
		iconmagazzino.setBounds(0, 0, 100, 49);
		panelMagazzino.add(iconmagazzino);
		Image iconss= new ImageIcon(this.getClass().getResource("/archivio.png")).getImage();
		iconmagazzino.setIcon(new ImageIcon(iconss));
		
		JPanel panelacquisti = new JPanel();
		panelacquisti.setBounds(0, 285, 217, 49);
		panelacquisti.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		panelacquisti.setBackground(new Color(47, 79, 79));
		panelMenu.add(panelacquisti);
		panelacquisti.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("ACQUISTI");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(47, 11, 181, 38);
		panelacquisti.add(lblNewLabel_2);
		
		JLabel iconacquisti = new JLabel("");
		iconacquisti.setBounds(0, 0, 96, 49);
		panelacquisti.add(iconacquisti);
		Image iconn= new ImageIcon(this.getClass().getResource("/acquisti.png")).getImage();
		iconacquisti.setIcon(new ImageIcon(iconn));
		
		JPanel panelLogout = new JPanel();
		panelLogout.setBounds(0, 449, 207, 41);
	
		panelLogout.setBorder(new LineBorder(new Color(255, 0, 0)));
		panelLogout.setBackground(new Color(47, 79, 79));
		panelMenu.add(panelLogout);
		panelLogout.setLayout(null);
		
		JLabel lbllogout = new JLabel("LOG OUT");
		lbllogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panelLogout.setBackground(new Color(112, 128, 144));

			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelLogout.setBackground(new Color(47, 79, 79));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				panelLogout.setBackground(new Color(60, 179, 113));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panelLogout.setBackground(new Color(112, 128, 144));
			}
		});
		lbllogout.setForeground(new Color(255, 255, 255));
		lbllogout.setFont(new Font("Dubai", Font.BOLD | Font.ITALIC, 17));
		lbllogout.setHorizontalAlignment(SwingConstants.CENTER);
		lbllogout.setBounds(45, 0, 197, 41);
		panelLogout.add(lbllogout);
		
		JLabel iconlogout = new JLabel("\r\n");
		iconlogout.setBounds(0, 0, 101, 41);
		panelLogout.add(iconlogout);
		Image iconz= new ImageIcon(this.getClass().getResource("/logout.png")).getImage();
		iconlogout.setIcon(new ImageIcon(iconz));
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 207, 143);
		panel.setBackground(new Color(47, 79, 79));
		panelMenu.add(panel);
		panel.setLayout(null);
		
		JLabel lblicon = new JLabel("");
		lblicon.setForeground(new Color(255, 255, 255));
		lblicon.setBounds(36, 0, 187, 160);
		panel.add(lblicon);
		Image iconsss= new ImageIcon(this.getClass().getResource("/homeicon.png")).getImage();
		lblicon.setIcon(new ImageIcon(iconsss));
		
		
		
		
		
		
		
		
		 panelmagazzino = new PanelMagazzino(TheController);
		panelmagazzino.setBounds(237, 11, 643, 501);
		contentPane.add(panelmagazzino);
		panelmagazzino.setLayout(null);
		
		panelmagazzino.setVisible(false);
		
		panelclienti = new PanelClienti(TheController);
		panelclienti.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		panelclienti.setLocation(237, 11);
		panelclienti.setBounds(237, 11, 643, 501);
		contentPane.add(panelclienti);
		panelclienti.setLayout(null);
		
		panelclienti.setVisible(false);
		
		panelaggiuntaacquisto = new PanelAggiuntaAcquisto(TheController);
		panelaggiuntaacquisto.setLocation(237, 11);
		panelaggiuntaacquisto.setBounds(237, 11, 643, 501);
		contentPane.add(panelaggiuntaacquisto);
		panelaggiuntaacquisto.setLayout(null);
		
		panelaggiuntaacquisto.setVisible(false);
		
		
	panelmagazzinoricerca = new PanelMagazzinoRicerca(TheController);
		panelmagazzinoricerca.setLocation(237, 11);
		panelmagazzinoricerca.setBounds(237, 11, 643, 501);
		contentPane.add(panelaggiuntaacquisto);
		panelmagazzinoricerca.setLayout(null);	

		
		
		
		 panelMagazzino.addMouseListener(new MouseAdapter() {     //action per il panel magazzino
			
			public void mouseClicked(MouseEvent e) {
				
				panelmagazzino.getLbl1().setVisible(false);
				panelmagazzino.getLbl2().setVisible(false);
				panelmagazzino.getLbl3().setVisible(false);
				
				panelmagazzino.getData1().setVisible(false);
				panelmagazzino.getData2().setVisible(false);
				panelmagazzino.getData3().setVisible(false);
				
				panelmagazzino.getTxt1().setVisible(false);
				panelmagazzino.getTxt2().setVisible(false);
				panelmagazzino.getTxt3().setVisible(false);
				
				//pannelli
				panelmagazzinoricerca.setVisible(false);
				
				panelaggiuntaacquisto.setVisible(false);
				panelclienti.setVisible(false);
				panelmagazzino.setVisible(true);
			
				
			
			}		 	@Override
		 	public void mouseEntered(MouseEvent e) {
				panelMagazzino.setBackground(new Color(112, 128, 144));

		 	}
		 	@Override
		 	public void mouseExited(MouseEvent e) {
		 		panelMagazzino.setBackground(new Color(47, 79, 79));
		 	}
		 	@Override
		 	public void mousePressed(MouseEvent e) {
		 		panelMagazzino.setBackground(new Color(60, 179, 113));
		 	}
		 	@Override
		 	public void mouseReleased(MouseEvent e) {
		 		panelMagazzino.setBackground(new Color(112, 128, 144));
		 	}
});
		
		 panelClienti.addMouseListener(new MouseAdapter() {                   //action per il panel clienti
				
				public void mouseClicked(MouseEvent e) {
					
					panelmagazzino.setVisible(false);
					panelaggiuntaacquisto.setVisible(false);
					panelmagazzinoricerca.setVisible(false);
			
					panelclienti.setVisible(true);
					
					
				}
		 	@Override
		 	public void mouseEntered(MouseEvent e) {
		 		panelClienti.setBackground(new Color(112, 128, 144));

		 	}
		 	@Override
		 	public void mouseExited(MouseEvent e) {
		 		panelClienti.setBackground(new Color(47, 79, 79));
		 	}
		 	@Override
		 	public void mousePressed(MouseEvent e) {
		 		panelClienti.setBackground(new Color(60, 179, 113));
		 	}
		 	@Override
		 	public void mouseReleased(MouseEvent e) {
		 		panelClienti.setBackground(new Color(112, 128, 144));
		 	}
			});
		
		 panelacquisti.addMouseListener(new MouseAdapter() {                  //action per il panel acquisti
				
				public void mouseClicked(MouseEvent e) {
					
					panelmagazzino.setVisible(false);
					panelclienti.setVisible(false);
					panelmagazzinoricerca.setVisible(false);
					
					panelaggiuntaacquisto.setVisible(true);
				}
		 	
		 	public void mouseEntered(MouseEvent e) {
		 		panelacquisti.setBackground(new Color(112, 128, 144));

		 		
		 	}
		 	@Override
		 	public void mouseExited(MouseEvent e) {
	
		 		panelacquisti.setBackground(new Color(47, 79, 79));
		 	}
		 	@Override
		 	public void mousePressed(MouseEvent e) {
		 		panelacquisti.setBackground(new Color(60, 179, 113));
		 	}
		 	@Override
		 	public void mouseReleased(MouseEvent e) {
		 		panelacquisti.setBackground(new Color(112, 128, 144));
		 	}
			});
			
		}
	}

