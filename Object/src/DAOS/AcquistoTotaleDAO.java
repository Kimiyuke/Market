package DAOS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import Classi.AcquistoTotale;
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

	public  ArrayList<AcquistoTotale> AcquistiPerData(int mese, int anno) throws Exception  {
		ArrayList<AcquistoTotale> acquisto = new ArrayList<AcquistoTotale>();
        AcquistoTotale A;
		mese=mese+1;  //PER EGUAGLIARE IL MESETE GETTATO DALLA COMPONENTE
		 try { 
			
	            Class.forName("org.postgresql.Driver");//load il driver            
	            Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione           
	            PreparedStatement pst= con.prepareStatement("Select * from acquisto_totale  WHERE EXTRACT(MONTH FROM data_acquisto)=? AND EXTRACT(year FROM data_acquisto)=?");
	            
	            pst.setInt(1, mese);
	            pst.setInt(2, anno);
	            
	            ResultSet rs=pst.executeQuery();
	            
	            System.out.println("ciao");
	            System.out.println(mese);
	            System.out.println(anno);
			 while (rs.next()) {//FETCHA RISULTATO IN ARRAYLIST CREANDO UN CLIENTE PER OGNI ISTANZA TROVATA
                 A= new AcquistoTotale(
                		 rs.getInt("n_id"),
                         rs.getString("codice_tessera"),
                        rs.getInt("totale_punti"),
                        rs.getFloat("prezzo_totale"),
                        
                        rs.getInt("num_prodotti"),
                        rs.getInt("num_prodotti_farinacei"),
                        rs.getInt("num_prodotti_frutta"),
                        rs.getInt("num_prodotti_verdura"),
                        rs.getInt("num_prodotti_uova"),
                        rs.getInt("num_prodotti_confezionati"),
                        rs.getInt("num_prodotti_latticini"),
                        rs.getBoolean("completato"),
                        rs.getDate("data_acquisto")
                        
                        
                         );
               
                 acquisto.add(A);
                 
             }



             }
		 catch (SQLException x) {
	          System.out.println("Review acquisti: " +x);
        return null;
              }
      return acquisto;

  }

	public float getguadagnomensile(int mese, int anno) throws Exception {
		float guadagno;
		mese=mese+1; //NORMALIZZA IL NUMERO DEL MESE CORRISPONDENTE ALLA COMBOBOX
		 try { 
				
	            Class.forName("org.postgresql.Driver");//load il driver            
	            Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione           
	            PreparedStatement pst= con.prepareStatement("Select SUM(prezzo_totale) from acquisto_totale  WHERE EXTRACT(MONTH FROM data_acquisto)=? AND EXTRACT(year FROM data_acquisto)=?");
	            
	            pst.setInt(1, mese);
	            pst.setInt(2, anno);
	            
	            ResultSet rs=pst.executeQuery();
	            rs.next();
	              guadagno= rs.getFloat(1);
	              System.out.print(guadagno);
                
          }
		 catch (SQLException x) {
	          System.out.println("Review acquisti: " +x);
     return (Integer) null;
           }
		return guadagno;
	}

	
		
		
		
		
	

}
