package daosImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import Classi.Cliente;
import Panels.PanelAggiuntaAcquisto;
import Panels.PanelMagazzino;


public class ConfezionatiDAOImpl {

	public  boolean InsertConfezionati(String nome, String marca, Float prezzo, String datadiscadenza, Integer peso,
			String ingredienti, String datadiproduzione, String idprodotto, Integer disponibilitatotale, PanelMagazzino panelmagazzino) throws Throwable {
		try {
            Class.forName("org.postgresql.Driver");//         
            Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione          
            PreparedStatement pst= con.prepareStatement("INSERT INTO CONFEZIONATI VALUES(?,?,?::real,?,?::date,?,?,?,?::date)");

       		 pst.setString(1, nome);
           	 pst.setString(2, marca);
                pst.setFloat(3, prezzo);
                pst.setString(4, idprodotto);
                pst.setString(5, datadiscadenza);
                pst.setString(6, ingredienti);
                pst.setInt(7, peso);
                pst.setInt(8, disponibilitatotale);
                pst.setString(9, datadiproduzione);
                
               
                pst.executeUpdate();



             }
		catch (SQLException e) {
         	
         	String exc= e.getMessage();
         	if( exc.contains("check_nome_lettere") ) {
         		panelmagazzino.getLblcnome().setVisible(true);
         		panelmagazzino.getLblcnome().setText("Attenzione, campo sbagliato, inserire solo lettere"); //CONSTRAINT PER NOME non accetta numeri
         	}
         	else if( exc.contains("check_marca_lettere") ) {
         		panelmagazzino.getLblcmarca().setVisible(true);
         		panelmagazzino.getLblcmarca().setText("Attenzione, campo sbagliato, inserire solo lettere"); //CONSTRAINT PER MARCA non accetta numeri
         	}
         	
         	else if( exc.contains("constraint_data_di_scadenza") ) {
         		panelmagazzino.getLbldatadiscadenza().setVisible(true);
         		panelmagazzino.getLbldatadiscadenza().setText("Attenzione, data precede la produzione"); //CONSTRAINT PER DATA DI SCADANZA
         	}
         	
         	else if( exc.contains("magazzino_pkey") ) {
         		panelmagazzino.getLblcidprodotto().setVisible(true);
         		panelmagazzino.getLblcidprodotto().setText("Attenzione, prodotto gia' esistente"); //CONSTRAINT PER PK DI FRUTTA
         	}
         	
         	else if( exc.contains("check_id_prodotto")) {
         		panelmagazzino.getLblcidprodotto().setVisible(true);
         		panelmagazzino.getLblcidprodotto().setText("Attenzione, ID non valido"); //CONSTRAINT PER L'ID PRODOTTO
         	}
         	
         	else if( exc.contains("check_ingredienti_lettere")) {
         		panelmagazzino.getlblctxt2().setVisible(true);
         		panelmagazzino.getlblctxt2().setText("Attenzione, solo lettere e virgole"); //CONSTRAINT PER IL CAMPO INGREDIENTI
         	}
         	
 	       return false;
          }
		 
		 return true;
		
	}
		
	}
	


