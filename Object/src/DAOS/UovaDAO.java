package DAOS;
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



public class UovaDAO {

	


	public static boolean InsertUova(String nome, String marca, Float prezzo, String datadiscadenza, Integer quantita,
			String datadideposizione, String provenienzaallevamento, String idprodotto, Integer disponibilitatotale, PanelMagazzino panelmagazzino) throws Exception {
		try {
            Class.forName("org.postgresql.Driver");//load il driver            
            Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione          
            PreparedStatement pst= con.prepareStatement("INSERT INTO UOVA VALUES(?,?,?::real,?::date,?,?::date,?,?,?)");
            
       		 pst.setString(1, nome);
           	 pst.setString(2, marca);
                pst.setFloat(3, prezzo);
                pst.setString(4, datadiscadenza);
                pst.setInt(5, quantita);
                pst.setString(6, datadideposizione);
                pst.setString(7, provenienzaallevamento);
                pst.setString(8, idprodotto);
                pst.setInt(9, disponibilitatotale);
                pst.executeUpdate();
            
           
         
             }
		catch (SQLException e) {
         	System.out.println("Inserimento uova panel magazzino: " +e);
         	String exc= e.getMessage();
         	if( exc.contains("check_nome_lettere") ) {
         		panelmagazzino.getLblcnome().setVisible(true);
         		panelmagazzino.getLblcnome().setText("attenzione, campo sbagliato, inserire solo lettere"); //CONSTRAINT PER NOME non accetta numeri
         	}
         	else if( exc.contains("check_marca_lettere") ) {
         		panelmagazzino.getLblcmarca().setVisible(true);
         		panelmagazzino.getLblcmarca().setText("attenzione, campo sbagliato, inserire solo lettere"); //CONSTRAINT PER MARCA non accetta numeri
         	}
         	
         	else if( exc.contains("constraint_data_di_scadenza") ) {
         		panelmagazzino.getLbldatadiscadenza().setVisible(true);
         		panelmagazzino.getLbldatadiscadenza().setText("attenzione, data precede la raccolta"); //CONSTRAINT PER DATA DI SCADANZA
         	}
         	
         	else if( exc.contains("magazzino_pkey") ) {
         		panelmagazzino.getLblcidprodotto().setVisible(true);
         		panelmagazzino.getLblcidprodotto().setText("attenzione, prodotto gia' esistente"); //CONSTRAINT PER PK DI FRUTTA
         	}
         	
         	else if( exc.contains("check_id_prodotto")) {
         		panelmagazzino.getLblcidprodotto().setVisible(true);
         		panelmagazzino.getLblcidprodotto().setText("attenzione, ID non valido"); //CONSTRAINT PER L'ID PRODOTTO
         	}
         	
         	else if( exc.contains("check_provenienza_lettere")) {
         		panelmagazzino.getlblctxt2().setVisible(true);
         		panelmagazzino.getlblctxt2().setText("attenzione, inserire solo lettere"); //CONSTRAINT PER IL CAMPO INGREDIENTI
         	}
         	
 	       return false;
          }
		 
		 return true;
		
	}
}

