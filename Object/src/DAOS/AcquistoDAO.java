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
	
	
	
public static void acquistosingolo(String idprodotto, int quantita, String codicetessera, String data, int idacquisto, PanelAggiuntaAcquisto panelaggiuntaacquisto ) throws Exception {
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
            	  if( exc.contains("check_codice_tessera") ) {
            		  panelaggiuntaacquisto.getlblcodicetessera().setVisible(true);
            		 panelaggiuntaacquisto.getlblcodicetessera().setText("attenzione, campo sbagliato"); //CONSTRAINT PER CODICE TESSERA
            	  }
            	  else if( exc.contains("fk_tessera_punti") ) {
            		  panelaggiuntaacquisto.getlblcodicetessera().setVisible(true);
            		  	panelaggiuntaacquisto.getlblcodicetessera().setText("attenzione, tessera inesistente"); //CONSTRAINT PER TESSERA PUNTI
            	  }
            	  else if( exc.contains("espressione_regolare_id_prodotto") ) {   //CONSTRAINT PER ID PRODOTTO + CONTROLLARE SE E POSSIBILE CAMBIARE IN FK CON NMAGAZZINO
            		  panelaggiuntaacquisto.getlblcheckidprodotto().setVisible(true);
            		  panelaggiuntaacquisto.getlblcheckidprodotto().setText("attenzione, codice prodotto errato");
            	  }
            	  else System.out.println("Review acquisti: " +e);
              
 //           		  if( exc.contains("NumberFormatException") )
         //   			  System.out.println("numero");
            		  
//            			panelaggiuntaacquisto.gettxtcodicetessera().setBorder(new LineBorder(Color.red,1)); TheController.checkcodicetessera();
               }
		
		
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

	public void acquistototale(String idprodotto, int quantita, String codicetessera, String data, int idacquisto) throws Exception {
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
              catch (SQLException x) {
          System.out.println("Inserimento acquisto panel aggiunta acquisto: " +x);
      
               }
		
		
	}

}
