package Frames;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import Controller.Controller;
import Panels.PanelAggiuntaAcquisto;
import Panels.PanelAggiuntaClienti;
import Panels.PanelClienti;
import Panels.PanelMagazzino;
import Panels.PanelMagazzinoRicerca;
import Panels.PanelReviewAcquisti;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;

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
	private PanelReviewAcquisti panelreviewacquisti;
	private PanelAggiuntaClienti panelaggiuntaclienti;
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
		setBounds(100, 100, 906, 634);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(149, 213, 178));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(45, 106, 79));
		panelMenu.setBounds(0, 11, 227, 573);
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
		panelClienti.setBorder(new LineBorder(new Color(153, 255, 153), 2, true));
		panelClienti.setBackground(new Color(27, 67, 50));
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
		panelMagazzino.setBounds(0, 286, 217, 49);
		panelMagazzino.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(153, 255, 153)));
		panelMagazzino.setBackground(new Color(27, 67, 50));
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
		panelacquisti.setBounds(0, 407, 217, 49);
		panelacquisti.setBorder(new LineBorder(new Color(153, 255, 153), 2, true));
		panelacquisti.setBackground(new Color(27, 67, 50));
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
		panelLogout.setBounds(10, 521, 207, 41);
	
		panelLogout.setBorder(new LineBorder(new Color(255, 0, 0)));
		panelLogout.setBackground(new Color(27, 67, 50));
		panelMenu.add(panelLogout);
		panelLogout.setLayout(null);
		
		JLabel iconlogout = new JLabel("\r\n");
		iconlogout.setBounds(0, 0, 101, 41);
		panelLogout.add(iconlogout);
		Image iconz= new ImageIcon(this.getClass().getResource("/logout.png")).getImage();
		iconlogout.setIcon(new ImageIcon(iconz));
		
		JLabel lbllogout = new JLabel("LOG OUT");
		lbllogout.setBounds(10, -1, 197, 41);
		panelLogout.add(lbllogout);                                              //ACTIONLISTENER LOGOUT PANEL
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
				panelLogout.setBackground(new Color(27, 67, 50));
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
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 207, 147);
		panel.setBackground(new Color(45, 106, 79));
		panelMenu.add(panel);
		panel.setOpaque(false);
		panel.setLayout(null);
		
		JLabel lblicon = new JLabel("");
		lblicon.setForeground(new Color(255, 255, 255));
		lblicon.setBounds(32, 0, 165, 132);
		panel.add(lblicon);
		Image iconsss= new ImageIcon(this.getClass().getResource("/markettt.png")).getImage();
		lblicon.setIcon(new ImageIcon(iconsss));
		
		JPanel panelprodotti = new JPanel();                             //ACTION LISTENER PANEL PRODOTTI
		panelprodotti.setVisible(false);
		panelprodotti.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelreviewacquisti.setVisible(false);
				panelmagazzino.setVisible(false);
				panelaggiuntaacquisto.setVisible(false);
				panelclienti.setVisible(false);
				panelaggiuntaclienti.setVisible(false);
				
				panelmagazzinoricerca.setVisible(true);
				
				
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panelprodotti.setBackground(new Color(112, 128, 144));
				panelprodotti.setVisible(true);

			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelprodotti.setBackground(new Color(27, 67, 50));
				panelprodotti.setVisible(false);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				panelprodotti.setBackground(new Color(60, 179, 113));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panelprodotti.setBackground(new Color(112, 128, 144));
			}
		});
	
		panelprodotti.setBorder(new MatteBorder(2, 2, 2, 1, (Color) new Color(153, 255, 153)));
		panelprodotti.setBackground(new Color(27, 67, 50));
		panelprodotti.setBounds(0, 335, 217, 49);
		panelMenu.add(panelprodotti);
		panelprodotti.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("PRODOTTI\r\n");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_3.setBounds(40, 11, 197, 38);
		panelprodotti.add(lblNewLabel_3);
		
		JPanel Panelreviewacquisti = new JPanel();
		Panelreviewacquisti.addMouseListener(new MouseAdapter() {                      //ACTIONLISTENER PANELREVIEW ACQUISTI
			@Override
			public void mouseEntered(MouseEvent e) {
				Panelreviewacquisti.setBackground(new Color(112, 128, 144));
				Panelreviewacquisti.setVisible(true);

			}
			@Override
			public void mouseExited(MouseEvent e) {
				Panelreviewacquisti.setBackground(new Color(27, 67, 50));
				Panelreviewacquisti.setVisible(false);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Panelreviewacquisti.setBackground(new Color(60, 179, 113));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Panelreviewacquisti.setBackground(new Color(112, 128, 144));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				                                                                          //PANELREVIEWACQUISTI
				panelmagazzino.setVisible(false);
				panelaggiuntaacquisto.setVisible(false);
				panelclienti.setVisible(false);
				panelmagazzinoricerca.setVisible(false);
				panelaggiuntaclienti.setVisible(false);
				
				panelreviewacquisti.setVisible(true);
				
				
				
			}
		});
		Panelreviewacquisti.setBorder(new MatteBorder(2, 1, 2, 1, (Color) new Color(153, 255, 153)));
		Panelreviewacquisti.setBackground(new Color(27, 67, 50));
		Panelreviewacquisti.setBounds(0, 453, 217, 50);
		panelMenu.add(Panelreviewacquisti);
		Panelreviewacquisti.setLayout(null);
		Panelreviewacquisti.setVisible(false);
		
		JLabel lblNewLabel_4 = new JLabel("REVIEW ACQUISTI\r\n");
		lblNewLabel_4.setBounds(54, 11, 153, 30);
		Panelreviewacquisti.add(lblNewLabel_4);
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		
		JPanel Panelaggiuntaclienti = new JPanel();
		Panelaggiuntaclienti.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				Panelaggiuntaclienti.setBackground(new Color(112, 128, 144));
			}
			@Override
			public void focusLost(FocusEvent e) {
				Panelaggiuntaclienti.setBackground(new Color(27, 67, 50));
			}
		});
		Panelaggiuntaclienti.addMouseListener(new MouseAdapter() {        //ACTIONLISTENER PER IL PANELAGGIUNTACLIENTI
			@Override
			public void mouseClicked(MouseEvent e) {
				panelreviewacquisti.setVisible(false);
				panelmagazzinoricerca.setVisible(false);
				panelaggiuntaacquisto.setVisible(false);
				panelclienti.setVisible(false);
				panelmagazzino.setVisible(false);
                
				panelaggiuntaclienti.setVisible(true);
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Panelaggiuntaclienti.setBackground(new Color(112, 128, 144));
                Panelaggiuntaclienti.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
                Panelaggiuntaclienti.setVisible(false);
                Panelaggiuntaclienti.setBackground(new Color(27, 67, 50));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Panelaggiuntaclienti.setBackground(new Color(60, 179, 113));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Panelaggiuntaclienti.setBackground(new Color(112, 128, 144));
			}
		});
		Panelaggiuntaclienti.setBorder(new MatteBorder(2, 1, 2, 1, (Color) new Color(153, 255, 153)));
		Panelaggiuntaclienti.setBackground(new Color(27, 67, 50));
		Panelaggiuntaclienti.setBounds(0, 213, 217, 50);
		panelMenu.add(Panelaggiuntaclienti);
		Panelaggiuntaclienti.setLayout(null);
		Panelaggiuntaclienti.setVisible(false);
		
		JLabel lblNewLabel_5 = new JLabel("AGGIUNTA CLIENTI");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_5.setBounds(59, 11, 148, 30);
		Panelaggiuntaclienti.add(lblNewLabel_5);
		
		JLabel lblsfondo = new JLabel("New label");
		lblsfondo.setBounds(0, 0, 227, 573);
		panelMenu.add(lblsfondo);
		
		
		Image background= new ImageIcon(this.getClass().getResource("/sfondo3.jpg")).getImage();
		lblsfondo.setIcon(new ImageIcon(background));
		
		
		
		
		
		
		
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
		contentPane.add(panelmagazzinoricerca);
		panelmagazzinoricerca.setLayout(null);
		panelmagazzinoricerca.setVisible(false);
		
		 panelreviewacquisti = new PanelReviewAcquisti(TheController);
		 panelreviewacquisti.setLocation(237, 11);
		 panelreviewacquisti.setBounds(237, 11, 643, 501);
		 contentPane.add(panelreviewacquisti);
		 panelreviewacquisti.setLayout(null);
		 panelreviewacquisti.setVisible(false);
			

		 	panelaggiuntaclienti = new PanelAggiuntaClienti(TheController);
	 	    panelaggiuntaclienti.setLocation(237, 11);
	 	    panelaggiuntaclienti.setBounds(237, 11, 643, 501);
			contentPane.add(panelaggiuntaclienti);
			panelaggiuntaclienti.setLayout(null);
			panelaggiuntaclienti.setVisible(false);
			
			
			
			
			
			JLabel lblicon1 = new JLabel("");
			lblicon1.setBounds(230, 513, 72, 71);
			contentPane.add(lblicon1);
			Image icon1= new ImageIcon(this.getClass().getResource("/kiwi.png")).getImage();
			lblicon1.setIcon(new ImageIcon(icon1));
			
			JLabel lblicon1_1 = new JLabel("");
			lblicon1_1.setBounds(314, 513, 72, 71);
			contentPane.add(lblicon1_1);
			Image icon2= new ImageIcon(this.getClass().getResource("/pizza.png")).getImage();
			lblicon1_1.setIcon(new ImageIcon(icon2));
			
			JLabel lblicon1_2 = new JLabel("");
			lblicon1_2.setBounds(396, 513, 72, 71);
			contentPane.add(lblicon1_2);
			Image icon3= new ImageIcon(this.getClass().getResource("/avocado.png")).getImage();
			lblicon1_2.setIcon(new ImageIcon(icon3));
			
			
			JLabel lblicon1_3 = new JLabel("");
			lblicon1_3.setBounds(487, 513, 72, 71);
			contentPane.add(lblicon1_3);
			Image icon4= new ImageIcon(this.getClass().getResource("/bananas.png")).getImage();
			lblicon1_3.setIcon(new ImageIcon(icon4));
			
			JLabel lblicon1_4 = new JLabel("");
			lblicon1_4.setBounds(581, 513, 72, 71);
			contentPane.add(lblicon1_4);
			Image icon5= new ImageIcon(this.getClass().getResource("/milk.png")).getImage();
			lblicon1_4.setIcon(new ImageIcon(icon5));
			
			JLabel lblicon1_5 = new JLabel("");
			lblicon1_5.setBounds(663, 513, 72, 71);
			contentPane.add(lblicon1_5);
			Image icon6= new ImageIcon(this.getClass().getResource("/soda.png")).getImage();
			lblicon1_5.setIcon(new ImageIcon(icon6));
			
			JLabel lblicon1_6 = new JLabel("");
			lblicon1_6.setBounds(736, 513, 72, 71);
			contentPane.add(lblicon1_6);
			Image icon7= new ImageIcon(this.getClass().getResource("/hotdog.png")).getImage();
			lblicon1_6.setIcon(new ImageIcon(icon7));
			
			JLabel lblicon1_7 = new JLabel("");
			lblicon1_7.setBounds(818, 513, 72, 71);
			Image icon8= new ImageIcon(this.getClass().getResource("/watermelon.png")).getImage();
			lblicon1_7.setIcon(new ImageIcon(icon8));
			contentPane.add(lblicon1_7);
			
			JLabel sfondo2 = new JLabel("New label");
			sfondo2.setBounds(0, 0, 890, 595);
			contentPane.add(sfondo2);
			Image sfondodue= new ImageIcon(this.getClass().getResource("/sfondo3.jpg")).getImage();
			sfondo2.setIcon(new ImageIcon(sfondodue));
			

		
		
		
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
				
				panelaggiuntaclienti.setVisible(false);
				panelreviewacquisti.setVisible(false);
				panelmagazzinoricerca.setVisible(false);
				panelaggiuntaacquisto.setVisible(false);
				panelclienti.setVisible(false);
				panelmagazzino.setVisible(true);
			
				
			
			}		 	@Override
		 	public void mouseEntered(MouseEvent e) {
				panelMagazzino.setBackground(new Color(112, 128, 144));
                panelprodotti.setVisible(true);
		 	}
		 	@Override
		 	public void mouseExited(MouseEvent e) {
		 		panelMagazzino.setBackground(new Color(27, 67, 50));
		 		 panelprodotti.setVisible(false);
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
					panelaggiuntaclienti.setVisible(false);
					panelreviewacquisti.setVisible(false);
					panelmagazzino.setVisible(false);
					panelaggiuntaacquisto.setVisible(false);
					panelmagazzinoricerca.setVisible(false);
			
					panelclienti.setVisible(true);
					
					
					
				}
		 	@Override
		 	public void mouseEntered(MouseEvent e) {
		 		panelClienti.setBackground(new Color(112, 128, 144));
                Panelaggiuntaclienti.setVisible(true);
		 	}
		 	@Override
		 	public void mouseExited(MouseEvent e) {
		 		panelClienti.setBackground(new Color(27, 67, 50));
                Panelaggiuntaclienti.setVisible(false);
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
					panelreviewacquisti.setVisible(false);
					panelmagazzino.setVisible(false);
					panelclienti.setVisible(false);
					panelmagazzinoricerca.setVisible(false);
					panelaggiuntaclienti.setVisible(false);
					
					panelaggiuntaacquisto.setVisible(true);
				}
		 	
		 	public void mouseEntered(MouseEvent e) {
		 		panelacquisti.setBackground(new Color(112, 128, 144));
		 		Panelreviewacquisti.setVisible(true);

		 		
		 	}
		 	@Override
		 	public void mouseExited(MouseEvent e) {
		 		Panelreviewacquisti.setVisible(false);
	
		 		panelacquisti.setBackground(new Color(27, 67, 50));
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

