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



public class AcquistoDAO {
	
	
	
	
	public static void acquistosingolo(String idprodotto, Integer quantita, String codicetessera, String data ) throws Exception {
		int nid= nidcurrent(); //STORE IN NID IL MAX+1 
		
		
		 
		 try {
             Class.forName("org.postgresql.Driver");//load il driver            
             Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione          
             PreparedStatement pst= con.prepareStatement("INSERT INTO ACQUISTO VALUES(?,?,'null','null',?,0, false, ?::date,?)");
            
             
        		
            	 pst.setString(1, codicetessera);
                 pst.setInt(2, quantita);
                 pst.setString(3, idprodotto);
                 pst.setString(4, data);
                 pst.setInt(5, nid);
                 
                 
                 pst.executeUpdate();
            
            
          
              }
              catch (SQLException x) {
          System.out.println("Inserimento acquisto panel aggiunta acquisto: " +x);
      
               }
		
		
	}
//FUNZIONE CHE SI UTILIZZA PER INSERIMENTO AUTOMATICO DEL CODICE DI ACQUISTO COME SE FOSSE UN'ENUMERAZIONE
	public static int nidcurrent() throws Exception {
		int nid = 0;
		
		try {
			Class.forName("org.postgresql.Driver");//load il driver
			
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione
			
			Statement st= con.createStatement();//creo object di statement 
			ResultSet rs = null;
			
			rs = st.executeQuery("SELECT MAX(n_id)+1 FROM ACQUISTO ");
			 rs.next();
			 nid = rs.getInt(1);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		
		
		
		return  nid;
	}

	public static void acquistototale(String idprodotto, Integer quantita, String codicetessera, String data) throws Exception {
			int nid= nidcurrent();
		 
		 try {
             Class.forName("org.postgresql.Driver");//load il driver            
             Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione          
             PreparedStatement pst= con.prepareStatement("INSERT INTO ACQUISTO VALUES(?,?,'null','null',?,0, true, ?::date,?)");
            
             
        		
            	 pst.setString(1, codicetessera);
                 pst.setInt(2, quantita);
                 pst.setString(3, idprodotto);
                 pst.setString(4, data);
                 pst.setInt(5, nid);
                 
                 
                 pst.executeUpdate();
            
            
          
              }
              catch (SQLException x) {
          System.out.println("Inserimento acquisto panel aggiunta acquisto: " +x);
      
               }
		
		
	}

}
