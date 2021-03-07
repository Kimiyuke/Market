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


public class AcquistoTotaleDAO {

	public static int getprezzototale(Integer idacquisto) throws Exception {
     
		int prezzo=0;
		 try {
            Class.forName("org.postgresql.Driver");//load il driver            
            Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione           
            PreparedStatement pst= con.prepareStatement("SELECT PREZZO_TOTALE FROM ACQUISTO_TOTALE WHERE n_id= ?");
            
            pst.setInt(1, idacquisto);
            
            ResultSet rs=pst.executeQuery();
            rs.next();
		 prezzo= rs.getInt(1);
         
             }
             catch (SQLException x) {
         System.out.println("Inserimento acquisto panel aggiunta acquisto: " +x);
     
              }
		return prezzo;
	}

	public static int getpuntitotale(Integer idacquisto) throws Exception {
		int punti=0;
		 try {
           Class.forName("org.postgresql.Driver");//load il driver            
           Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione           
           PreparedStatement pst= con.prepareStatement("SELECT TOTALE_PUNTI FROM ACQUISTO_TOTALE WHERE n_id= ?");
           
           pst.setInt(1, idacquisto);
           
           ResultSet rs=pst.executeQuery();
           rs.next();
		 punti= rs.getInt(1);
        
            }
            catch (SQLException x) {
        System.out.println("Inserimento acquisto panel aggiunta acquisto: " +x);
    
             }
		return punti;
	}

}
