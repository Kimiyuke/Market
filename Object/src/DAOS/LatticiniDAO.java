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


public class LatticiniDAO {
	public static void InsertFrutta(String nome, String marca, float prezzo, String datadiscadenza,int peso ,
			String datadimungitura,String datadiproduzione,
			String idprodotto, int disponibilitatotale) throws Exception {
		 try {
             Class.forName("org.postgresql.Driver");//load il driver            
             Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres","admin"); //connessione          
             PreparedStatement pst= con.prepareStatement("INSERT INTO LATTICINI VALUES(?,?,?::real,?::date,?,?::date,?::date,?,?)");

        		 pst.setString(1, nome);
            	 pst.setString(2, marca);
                 pst.setFloat(3, prezzo);
                 pst.setString(4, datadiscadenza);
                 pst.setInt(5,peso);
                 pst.setString(6, datadimungitura);
                 pst.setString(7,datadiproduzione);
                 pst.setString(8, idprodotto);
                 pst.setInt(9, disponibilitatotale);
                 pst.executeUpdate();



              }
              catch (SQLException x) {
          System.out.println("Inserimento frutta panel magazzinoo: " +x);

               }
}
}