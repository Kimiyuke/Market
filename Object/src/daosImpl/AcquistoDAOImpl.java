package daosImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import org.postgresql.util.PSQLException;

import Panels.PanelAggiuntaAcquisto;



public class AcquistoDAOImpl {
	
	
	
public  boolean acquistosingolo(String idprodotto, int quantita, String codicetessera, String data, int idacquisto, PanelAggiuntaAcquisto panelaggiuntaacquisto ) throws Exception {
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
            	  
            	  else if( e.getSQLState().equals("77777") ) {
          		  	panelaggiuntaacquisto.getlblcquantita().setVisible(true);
          		  	panelaggiuntaacquisto.getlblcquantita().setText("Attenzione, la quantita' inserita supera la disponibilita'"); // SQL STATE DETERMINATO DAL TRIGGER NONAPPENA SI INSERISCE UN ACQUISTO CON QUANTITA CHE ECCEDE LA DISPONIBILITA TOTALE
          	  }
            	  
            	  else if( e.getSQLState().equals("P0001") ) {
            		  	panelaggiuntaacquisto.getlblcidacquisto().setVisible(true);
            		  	panelaggiuntaacquisto.getlblcidacquisto().setText("Attenzione, l'acquisto è completo impossibile aggiungere altri prodotti"); //ERRORE SQL STATE DETERMINATO DA QUANDO SI PROVA AD AGGIUNGERE ALTRI PRODOTTI AD UN ID ACQUISTO CHE è STATO TERMINIATO
            	  }
            	  
            	  else if( e.getSQLState().equals("66666") ) {
          		  	panelaggiuntaacquisto.getlblcidacquisto().setVisible(true);
          		  	panelaggiuntaacquisto.getlblcidacquisto().setText("Attenzione, l'acquisto è completo impossibile aggiungere altri prodotti"); //ERRORE SQL STATE DETERMINATO DA QUANDO SI PROVA AD AGGIUNGERE ALTRI PRODOTTI AD UN ID ACQUISTO CHE è STATO TERMINIATO
          	  }
            	  
            	  
            	  
            	  else System.out.println("Review acquisti: " +e);
              
            	  return false;

               }
		return true;
		
	}

	public  boolean acquistototale(String idprodotto, int quantita, String codicetessera, String data, int idacquisto, PanelAggiuntaAcquisto panelaggiuntaacquisto) throws Exception {

		 
		 try {
             Class.forName("org.postgresql.Driver");//load il driver            
             Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione          
             PreparedStatement pst= con.prepareStatement("INSERT INTO ACQUISTO VALUES(?,?,'null','null',?,0, true, ?::date,?)");
            
             
        		
            	 pst.setString(1, codicetessera);
                 pst.setInt(2, quantita);
                 pst.setString(3, idprodotto);
                 pst.setString(4, data);
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
            	  
            	  else if( e.getSQLState().equals("77777") ) {
            		  	panelaggiuntaacquisto.getlblcquantita().setVisible(true);
            		  	panelaggiuntaacquisto.getlblcquantita().setText("Attenzione, la quantita' inserita supera la disponibilita'"); // SQL STATE DETERMINATO DAL TRIGGER NONAPPENA SI INSERISCE UN ACQUISTO CON QUANTITA CHE ECCEDE LA DISPONIBILITA TOTALE
            	  }
              	  
              	  else if( e.getSQLState().equals("P0001") ) {
              		  	panelaggiuntaacquisto.getlblcidacquisto().setVisible(true);
              		  	panelaggiuntaacquisto.getlblcidacquisto().setText("Attenzione, l'acquisto è completo impossibile aggiungere altri prodotti"); //ERRORE SQL STATE DETERMINATO DA QUANDO SI PROVA AD AGGIUNGERE ALTRI PRODOTTI AD UN ID ACQUISTO CHE è STATO TERMINIATO
              	  }
              	  
              	  else if( e.getSQLState().equals("66666") ) {
            		  	panelaggiuntaacquisto.getlblcidacquisto().setVisible(true);
            		  	panelaggiuntaacquisto.getlblcidacquisto().setText("Attenzione, l'acquisto è completo impossibile aggiungere altri prodotti"); //ERRORE SQL STATE DETERMINATO DA QUANDO SI PROVA AD AGGIUNGERE ALTRI PRODOTTI AD UN ID ACQUISTO CHE è STATO TERMINIATO
            	  }
            	  else System.out.println("Review acquisti: " +e);
      
          			return false;
               }
		
		return true;
	}

}
