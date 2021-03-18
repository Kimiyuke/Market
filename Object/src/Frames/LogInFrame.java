package Frames;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.Controller;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LogInFrame extends JFrame {

	private JPanel contentPane;
	private JTextField TextUsername;
	private JPasswordField pwdPassword;
	
	private Controller TheController;
	private JLabel lblErrore;

	/*/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInFrame frame = new LogInFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LogInFrame(Controller c) {
		TheController=c;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(149, 213, 178));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(176, 155, 181, 30);
		contentPane.add(panel);
		panel.setLayout(null);
		
		pwdPassword = new JPasswordField();
		
		pwdPassword.addKeyListener( new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER)
                {
    TheController.Controllo_Credenziali(TextUsername.getText().toString(),pwdPassword.getText().toString() );
                }

        }
        });
		pwdPassword.addFocusListener(new FocusAdapter() {
			
			public void focusGained(FocusEvent e) {
				if(pwdPassword.getText().equals("Password")) {
			pwdPassword.setEchoChar('●') ;
			pwdPassword.setText("");
			}
				else {
					pwdPassword.selectAll();
				}
			}			

			public void focusLost(FocusEvent e) {
				if(pwdPassword.getText().equals("")) {
					pwdPassword.setText("Password");
					pwdPassword.setEchoChar((char)0);
				}
			}
});
		pwdPassword.setText("Password");
		pwdPassword.setBounds(10, 11, 130, 19);
		panel.add(pwdPassword);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(176, 114, 181, 30);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		TextUsername = new JTextField();
		TextUsername.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER)
                {
    TheController.Controllo_Credenziali(TextUsername.getText().toString(),pwdPassword.getText().toString() );
                }

        }
        });
		TextUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(TextUsername.getText().equals("Username")) {
					TextUsername.setText(" ");
				}
				else
				{ TextUsername.selectAll();
			}
		}
			
			public void focusLost(FocusEvent e) {
				if(TextUsername.getText().equals(" ")) {
					TextUsername.setText("Username");
				}
			}
			});
		
		TextUsername.setBounds(10, 11, 127, 20);
		panel_1.add(TextUsername);
		TextUsername.setText("Username");
		TextUsername.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(27, 67, 50));
		panel_2.setBounds(173, 206, 184, 30);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LogIn");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.PLAIN, 11));
		lblNewLabel.setBounds(71, 11, 46, 14);
		panel_2.add(lblNewLabel);
		
		 lblErrore = new JLabel("");
		lblErrore.setForeground(new Color(255, 0, 0));
		lblErrore.setFont(new Font("Arial", Font.PLAIN, 11));
		lblErrore.setBounds(130, 171, 273, 14);
		contentPane.add(lblErrore);
		
		JLabel lblicon = new JLabel("");
		lblicon.setBounds(199, 0, 163, 109);
		contentPane.add(lblicon);
		Image icons= new ImageIcon(this.getClass().getResource("/home.png")).getImage();
		lblicon.setIcon(new ImageIcon(icons));
		
		
		panel_2.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				
				TheController.Controllo_Credenziali(TextUsername.getText().toString(),pwdPassword.getText().toString() );
				
			
			}});
		
	}
	
	public JLabel getlblErrore () {
		return lblErrore;
	}
}
