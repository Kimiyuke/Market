package DAOS;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.swing.border.LineBorder;

import org.postgresql.util.PSQLException;

import Classi.Cliente;
import Controller.Controller;
import Panels.PanelAggiuntaAcquisto;
import Panels.PanelMagazzino;



public class AcquistoDAO {
	
	
	
public static boolean acquistosingolo(String idprodotto, int quantita, String codicetessera, String data, int idacquisto, PanelAggiuntaAcquisto panelaggiuntaacquisto ) throws Exception {
//		int nid= nidcurrent(); //STORE IN NID IL MAX+1 
		
		
		 
		 try {
             Class.forName("org.postgresql.Driver");//load il driver            
             Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione          
             PreparedStatement pst= con.prepareStatement("INSERT INTO ACQUISTO VALUES(?,?,'null','null',?,0, false, ?::date,?)");
            
             
        		
            	 pst.setString(1, codicetessera);
                 pst.setInt(2, quantita);
                 pst.setString(3, idprodotto);
                 pst.setString(4, data);
//                 pst.setInt(5, nid);
                 pst.setInt(5, idacquisto);
                 
                 pst.executeUpdate();
            
            
          
              }
              catch (PSQLException e) {
            	  String exc= e.getMessage();
            	  if( exc.contains("check_codice_tessera_") ) {
            		  panelaggiuntaacquisto.getlblcodicetessera().setVisible(true);
            		  panelaggiuntaacquisto.getlblcodicetessera().setText("attenzione, campo sbagliato"); //CONSTRAINT PER CODICE TESSERA
            	  }
            	  else if( exc.contains("fk_tessera_punti") ) {
            		  	panelaggiuntaacquisto.getlblcodicetessera().setVisible(true);
            		  	panelaggiuntaacquisto.getlblcodicetessera().setText("attenzione, tessera inesistente"); //CONSTRAINT PER TESSERA PUNTI NON ESISTENTE
            	  }
            	  else if( exc.contains("check_id_prodotto") ) {   //CONSTRAINT PER ID PRODOTTO 
            		  panelaggiuntaacquisto.getlblcheckidprodotto().setVisible(true);
            		  panelaggiuntaacquisto.getlblcheckidprodotto().setText("attenzione, codice prodotto errato");
            		  panelaggiuntaacquisto.getlblcheckidprodotto().setText("attenzione, codice prodotto errato");
            	  }
            	    
            	  else if( exc.contains("fk_id_prodotto") ) {
            		  	panelaggiuntaacquisto.getlblcheckidprodotto().setVisible(true);
            		  	panelaggiuntaacquisto.getlblcheckidprodotto().setText("attenzione, prodotto non esistente"); //CONSTRAINT PER ID PRODOTTO NON ESISTENTE
            	  }
            	  
            	  else if( exc.contains("acquisto_pkey") ) {
            		  	panelaggiuntaacquisto.getlblcidacquisto().setVisible(true);
            		  	panelaggiuntaacquisto.getlblcidacquisto().setText("attenzione, valore duplicato"); //CONSTRAINT PER PK ACQUISTO_PKEY IDACQUISTO DUPLICATO OPPURE INSERIMENTO DI UNO STESSO PRODOTTO GIA PRESENTE NELL'ID ACQUISTO CORRENTE
            	  }
            	  
            	  else System.out.println("Review acquisti: " +e);
              
            	  return false;
 //           		  if( exc.contains("NumberFormatException") )
         //   			  System.out.println("numero");
            		  
//            			panelaggiuntaacquisto.gettxtcodicetessera().setBorder(new LineBorder(Color.red,1)); TheController.checkcodicetessera();
               }
		return true;
		
	}
//FUNZIONE CHE SI UTILIZZA PER INSERIMENTO AUTOMATICO DEL CODICE DI ACQUISTO COME SE FOSSE UN'ENUMERAZIONE
//	public static int nidcurrent() throws Exception {
//		int nid = 0;
//		
//		try {
//			Class.forName("org.postgresql.Driver");//load il driver
//			
//			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
//			
//			Statement st= con.createStatement();//creo object di statement 
//			ResultSet rs = null;
//			
//			rs = st.executeQuery("SELECT MAX(n_id)+1 FROM ACQUISTO ");
//			 rs.next();
//			 nid = rs.getInt(1);
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
//
//		
//		
//		
//		return  nid;
//	}

	public static boolean acquistototale(String idprodotto, int quantita, String codicetessera, String data, int idacquisto, PanelAggiuntaAcquisto panelaggiuntaacquisto) throws Exception {
//			int nid= nidcurrent();
		 
		 try {
             Class.forName("org.postgresql.Driver");//load il driver            
             Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione          
             PreparedStatement pst= con.prepareStatement("INSERT INTO ACQUISTO VALUES(?,?,'null','null',?,0, true, ?::date,?)");
            
             
        		
            	 pst.setString(1, codicetessera);
                 pst.setInt(2, quantita);
                 pst.setString(3, idprodotto);
                 pst.setString(4, data);
//                 pst.setInt(5, nid);
                 pst.setInt(5, idacquisto);
                 
                 pst.executeUpdate();
            
            
          
              }
              catch (PSQLException e) {
            	  String exc= e.getMessage();
            	  if( exc.contains("check_codice_tessera_") ) {
            		  panelaggiuntaacquisto.getlblcodicetessera().setVisible(true);
            		  panelaggiuntaacquisto.getlblcodicetessera().setText("attenzione, campo sbagliato"); //CONSTRAINT PER CODICE TESSERA
            	  }
            	  else if( exc.contains("fk_tessera_punti") ) {
            		  	panelaggiuntaacquisto.getlblcodicetessera().setVisible(true);
            		  	panelaggiuntaacquisto.getlblcodicetessera().setText("attenzione, tessera inesistente"); //CONSTRAINT PER TESSERA PUNTI NON ESISTENTE
            	  }
            	  else if( exc.contains("check_id_prodotto") ) {   //CONSTRAINT PER ID PRODOTTO 
            		  panelaggiuntaacquisto.getlblcheckidprodotto().setVisible(true);
            		  panelaggiuntaacquisto.getlblcheckidprodotto().setText("attenzione, codice prodotto errato");
            	  }
            	    
            	  else if( exc.contains("fk_id_prodotto") ) {
            		  	panelaggiuntaacquisto.getlblcodicetessera().setVisible(true);
            		  	panelaggiuntaacquisto.getlblcodicetessera().setText("attenzione, prodotto non esistente"); //CONSTRAINT PER ID PRODOTTO NON ESISTENTE
            	  }
            	  
            	  else if( exc.contains("acquisto_pkey") ) {
            		  	panelaggiuntaacquisto.getlblcidacquisto().setVisible(true);
            		  	panelaggiuntaacquisto.getlblcidacquisto().setText("attenzione, valore duplicato"); //CONSTRAINT PER PK ACQUISTO_PKEY IDACQUISTO DUPLICATO OPPURE INSERIMENTO DI UNO STESSO PRODOTTO GIA PRESENTE NELL'ID ACQUISTO CORRENTE
            	  }
            	  
            	  else System.out.println("Review acquisti: " +e);
      
          			return false;
               }
		
		return true;
	}

}
